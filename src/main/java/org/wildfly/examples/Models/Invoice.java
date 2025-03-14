package org.wildfly.examples.Models;

import java.sql.Date;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long TotalItems;

    @Column
    private Long Discount;

    @Column
    private Long TaxId;

    @Column
    private Long ItemId;

    @Column
    private Long TotalAmount;

    @Column(name = "cust_id")
    private Long custId;

    @Column
    private Date InvoiceDate;

    @Column
    private Long UserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTotalItems() {
        return TotalItems;
    }

    public void setTotalItems(Long TotalItems) {
        this.TotalItems = TotalItems;
    }

    public Long getDiscount() {
        return Discount;
    }

    public void setDiscount(Long Discount) {
        this.Discount = Discount;
    }

    public Long getTaxId() {
        return TaxId;
    }

    public void setTaxId(Long TaxId) {
        this.TaxId = TaxId;
    }

    public Long getItemId() {
        return ItemId;
    }

    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    public Long getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(Long TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long CustId) {
        this.custId = CustId;
    }

    public Date getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(Date InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }
}
