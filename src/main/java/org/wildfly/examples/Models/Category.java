package org.wildfly.examples.Models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String CategoryName;

    @Column
    private Long DeptId;

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public String getCateogryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public Long getDeptId() {
        return DeptId;
    }

    public void setDeptId(Long DeptId) {
        this.DeptId = DeptId;
    }
}
