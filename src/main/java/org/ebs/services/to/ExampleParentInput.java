package org.ebs.services.to;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class ExampleParentInput implements Serializable{
    private static final long serialVersionUID = -8541028545537524062L;
    
    @NotBlank
    private String name;
    @NotBlank
    private String stockCode;
    @NotEmpty
    private int[] children;

    public static long getSerialversionuid() {
        return serialVersionUID;
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

    public int[] getChildren() {
        return children;
    }

    public void setChildren(int[] children) {
        this.children = children;
    }
}