package org.wildfly.examples.Controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.wildfly.examples.Models.Items;
import org.wildfly.examples.Models.Customers;
import org.wildfly.examples.Models.Tax;
import org.wildfly.examples.Models.Department;
import org.wildfly.examples.Models.Category;
import org.wildfly.examples.Models.CustomerInvoiceResponse;
import org.wildfly.examples.Models.Invoice;
import org.wildfly.examples.Models.InvoiceCustomerDTO;

import ch.qos.logback.classic.Logger;

import org.wildfly.examples.Repo.CustomerRepo;
import org.wildfly.examples.Repo.DepartmentRepo;
import org.wildfly.examples.Repo.CategoryRepo;
import org.wildfly.examples.Repo.InvoiceRepo;
import org.wildfly.examples.Repo.ItemRepo;
import org.wildfly.examples.Repo.TaxRepo;

@RestController
public class ApiControllers {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(ApiControllers.class);

    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping(value = "/welcome")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping(value = "/customers")
    public List<Customers> getUsers() {
        return customerRepo.findAll();
    }

    @GetMapping("/getcustomer/{customerId}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable Long customerId) {
        Customers customer = customerRepo.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + customerId));
        
        return ResponseEntity.ok(customer);
    }

    @PostMapping(value = "/savecustomers")
    public String saveUsers(@RequestBody Customers customers) {
        customerRepo.save(customers);
        return "saved.....";
    }

    @Autowired
    private ItemRepo itemRepo;

    @GetMapping(value = "/items")
    public List<Items> getItems() {
        return itemRepo.findAll();
    }

    @GetMapping("/getitem/{itemId}")
    public ResponseEntity<Items> getItemById(@PathVariable Long itemId) {
        Items item = itemRepo.findById(itemId)
                .orElseThrow(() -> new RuntimeException("Item not found with id: " + itemId));
        
        return ResponseEntity.ok(item);
    }

    @PostMapping(value = "saveitems")
    public String saveItems(@RequestBody Items items) {
        itemRepo.save(items);
        return "saved.....";
    }

    @Autowired
    private TaxRepo taxRepo;

    @GetMapping(value = "tax")
    public List<Tax> getTax() {
        return taxRepo.findAll();
    }

    @GetMapping("/gettax/{taxId}")
    public ResponseEntity<Tax> getTaxById(@PathVariable Long taxId) {
        Tax tax = taxRepo.findById(taxId)
                .orElseThrow(() -> new RuntimeException("Tax not found with id: " + taxId));
        
        return ResponseEntity.ok(tax);
    }

    @PostMapping(value = "savetax")
    public String saveTax(@RequestBody Tax tax) {
        taxRepo.save(tax);
        return "saved.....";
    }

    @Autowired
    private DepartmentRepo departmentRepo;

    @GetMapping(value = "dept")
    public List<Department> getDepartment() {
        return departmentRepo.findAll();
    }

    @GetMapping("/getdept/{deptId}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long deptId) {
        Department department = departmentRepo.findById(deptId)
                .orElseThrow(() -> new RuntimeException("Department not found with id: " + deptId));
        
        return ResponseEntity.ok(department);
    }

    @PostMapping(value = "savedept")
    public String saveDepartment(@RequestBody Department department) {
        departmentRepo.save(department);
        return "saved.....";
    }

    @Autowired
    private CategoryRepo categoryRepo;

    @GetMapping(value = "cate")
    public List<Category> getCategory() {
        return categoryRepo.findAll();
        }

        @GetMapping("/getcate/{cateId}")
        public ResponseEntity<Category> getCategoryById(@PathVariable Long categoryId) {
            Category category = categoryRepo.findById(categoryId)
                    .orElseThrow(() -> new RuntimeException("Category not found with id: " + categoryId));
            
            return ResponseEntity.ok(category);
        }

    @PostMapping(value = "savecate")
    public String saveCategory(@RequestBody Category category) {
        categoryRepo.save(category);
        return "saved.....";
    }

    @Autowired
    private InvoiceRepo invoiceRepo;

    @GetMapping(value = "invoice")
    public List<Invoice> getInvoice() {
        return invoiceRepo.findAll();
    }

    @GetMapping("/getinvoice/{invoiceId}")
    public ResponseEntity<Invoice> getInvoiceById(@PathVariable Long invoiceId) {
        Invoice invoice = invoiceRepo.findById(invoiceId)
                .orElseThrow(() -> new RuntimeException("Invoice not found with id: " + invoiceId));
        
        return ResponseEntity.ok(invoice);
    }

    @PostMapping(value = "saveinvoice")
    public String saveInvoice(@RequestBody Invoice invoice) {
        invoiceRepo.save(invoice);
        return "saved.....";
    }

    @GetMapping("/invoice/{custId}")
    public ResponseEntity<CustomerInvoiceResponse> getInvoicesByCustId(@PathVariable Long custId) {
        List<Invoice> invoices = invoiceRepo.findByCustId(custId);
        Customers customers = customerRepo.findById(custId).orElse(null);

        if (customers == null) {
            return ResponseEntity.notFound().build();
        }

        CustomerInvoiceResponse response = new CustomerInvoiceResponse(customers.getFirstName(), customers.getLastName(), invoices);

        logger.info("Found {} invoices for custId {}", invoices.size(), custId);
        return ResponseEntity.ok(response);
    }

    @PostMapping(value = "saveinvoicecustomer")
    public String saveInvoiceCustomer(@RequestBody InvoiceCustomerDTO invoiceCustomerDTO) {
        // Save customer
        Customers customer = invoiceCustomerDTO.getCustomers();
        customerRepo.save(customer);

        // Save invoice
        Invoice invoice = invoiceCustomerDTO.getInvoice();
        invoice.setCustId(customer.getId());
        invoiceRepo.save(invoice);

        return "Customer and Invoice saved.....";
    }
}