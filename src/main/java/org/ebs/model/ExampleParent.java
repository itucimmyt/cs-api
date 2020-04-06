package org.ebs.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.ebs.util.Auditable;

/**
 * Class mapping to a DB entity
 */
@Entity @Table(name = "parent", schema = "ex")
public class ExampleParent extends Auditable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column
    private String name;

    @Column(name = "stock_code")
    private String stockCode;

    /**
     * In this example, ExampleParent is the owning entity of the relationship,
     * so it is configured to manage their children's persistence
     */
    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private Set<ExampleChild> children;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public Set<ExampleChild> getChildren() {
        return children;
    }

    public void setChildren(Set<ExampleChild> children) {
        this.children = children;
    }

}