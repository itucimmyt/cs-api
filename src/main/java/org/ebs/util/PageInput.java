package org.ebs.util;

import java.io.Serializable;

public class PageInput implements Serializable {
    private static final long serialVersionUID = 2237035358831275209L;
    
    private int number;
    private int size;

    public PageInput() {} 
    
    public PageInput(int page, int size) {
        this.number = page;
        this.size = size;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + number;
        result = prime * result + size;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PageInput other = (PageInput) obj;
        if (number != other.number)
            return false;
        if (size != other.size)
            return false;
        return true;
    }

}