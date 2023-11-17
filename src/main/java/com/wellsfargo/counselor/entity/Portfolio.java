// Portfolio.java
package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioId;

    @Column(nullable = false)
    private String name;

    // Other attributes and relationships as needed

    protected Portfolio() {
    }

    public Portfolio(String name) {
        this.name = name;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
