package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExampleParentTO implements Serializable{
    private static final long serialVersionUID = 6741462145350804418L;
    
    @JsonProperty("exampleParentDbId")
    private long id;
    private String name;
    private String stockCode;
    private Set<ExampleChildTO> children;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

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

    public Set<ExampleChildTO> getChildren() {
        return children;
    }

    public void setChildren(Set<ExampleChildTO> children) {
        this.children = children;
    }

   
}