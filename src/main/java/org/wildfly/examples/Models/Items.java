package org.wildfly.examples.Models;

import jakarta.persistence.Entity;
import java.sql.Date;
import jakarta.persistence.*;

@Entity
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String LookupCode;

    @Column
    private String ItemName;

    @Column
    private Long Cost;

    @Column
    private Long Price;

    @Column
    private Long Quantity;

    @Column
    private Date EntryDate;

    @Column
    private Long TaxID;

    @Column
    private Boolean isDiscount;

    @Column
    private Long DeptID;

    @Column
    private Long CateID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLookupCode() {
        return LookupCode;
    }

    public void setLookupCode(String LookupCode) {
        this.LookupCode = LookupCode;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public Long getCost() {
        return Cost;
    }

    public void setCost(Long Cost) {
        this.Cost = Cost;
    }

    public Long getPrice() {
        return Price;
    }

    public void setPrice(Long Price) {
        this.Price = Price;
    }

    public Long getQuantity() {
        return Quantity;
    }

    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    public Date getEntryDate() {
        return EntryDate;
    }

    public void setEntryDate(Date EntryDate) {
        this.EntryDate = EntryDate;
    }

    public Long getTaxID() {
        return TaxID;
    }

    public void setTaxID(Long TaxID) {
        this.TaxID = TaxID;
    }

    public Boolean getisDiscount() {
        return isDiscount;
    }

    public void setisDiscount(Boolean isDiscount) {
        this.isDiscount = isDiscount;
    }

    public Long getDeptID() {
        return DeptID;
    }

    public void setDeptID(Long DeptID) {
        this.DeptID = DeptID;
    }

    public Long getCateID() {
        return CateID;
    }

    public void setCateID(Long CateID) {
        this.CateID = CateID;
    }

}