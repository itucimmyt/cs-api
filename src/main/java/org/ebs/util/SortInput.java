package org.ebs.util;

import java.io.Serializable;

public class SortInput implements Serializable{
    private static final long serialVersionUID = 4838089516639101382L;

    private String col;
    private SortMod mod = SortMod.ASC;

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public SortMod getMod() {
        return mod;
    }

    public void setMod(SortMod mod) {
        this.mod = mod;
    }

    @Override
    public String toString() {
        return "SortInput [col=" + col + ", mod=" + mod + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((col == null) ? 0 : col.hashCode());
        result = prime * result + ((mod == null) ? 0 : mod.hashCode());
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
        SortInput other = (SortInput) obj;
        if (col == null) {
            if (other.col != null)
                return false;
        } else if (!col.equals(other.col))
            return false;
        if (mod != other.mod)
            return false;
        return true;
    }
}