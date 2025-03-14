package org.wildfly.examples.Models;

public class InvoiceCustomerDTO {
    
    private Invoice invoice;
    private Customers customers;

    public Invoice getInvoice(){
        return invoice;
    }

    public void setInvoice (Invoice invoice){
        this.invoice=invoice;
    }

    public Customers getCustomers(){
        return customers;
    }

    public void setCustomer (Customers customers){
        this.customers=customers;
    }

}
