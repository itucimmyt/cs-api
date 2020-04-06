package org.ebs.util;

import java.io.Serializable;

public class FilterInput implements Serializable {
    private static final long serialVersionUID = 6538156970169234991L;

    private String col;
    private String val;
    private FilterMod mod = FilterMod.EQ;

    public FilterInput(){}

    public FilterInput(String col, String val) {
        this.col = col;
        this.val = val;
    }
    
    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public FilterMod getMod() {
        return mod;
    }

    public void setMod(FilterMod mod) {
        this.mod = mod;
    }

    @Override
    public String toString() {
        return "FilterInput [col=" + col + ", mod=" + mod + ", val=" + val + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((col == null) ? 0 : col.hashCode());
        result = prime * result + ((mod == null) ? 0 : mod.hashCode());
        result = prime * result + ((val == null) ? 0 : val.hashCode());
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
        FilterInput other = (FilterInput) obj;
        if (col == null) {
            if (other.col != null)
                return false;
        } else if (!col.equals(other.col))
            return false;
        if (mod != other.mod)
            return false;
        if (val == null) {
            if (other.val != null)
                return false;
        } else if (!val.equals(other.val))
            return false;
        return true;
    }

}