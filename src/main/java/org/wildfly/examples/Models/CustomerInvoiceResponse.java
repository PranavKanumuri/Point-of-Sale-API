package org.wildfly.examples.Models;

import java.util.List;

public class CustomerInvoiceResponse {
    private String firstName;
    private String lastName;
    private List<Invoice> invoice;

    public CustomerInvoiceResponse() {}

    public CustomerInvoiceResponse(String firstName, String lastName, List<Invoice> invoice) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.invoice = invoice;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Invoice> getInvoices() {
        return invoice;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoice = invoices;
    }
}
