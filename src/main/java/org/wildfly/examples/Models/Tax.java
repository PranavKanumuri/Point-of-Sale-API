package org.wildfly.examples.Models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
public class Tax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String TaxName;

    @Column
    private Double Perc;

    public Long getid() {
        return id;
    }

    public void getid(Long id) {
        this.id = id;
    }

    public String getTaxName() {
        return TaxName;
    }

    public void setTaxName(String TaxName) {
        this.TaxName = TaxName;
    }

    public Double getPerc() {
        return Perc;
    }

    public void setPerc(Double Perc) {
        this.Perc = Perc;
    }
}
