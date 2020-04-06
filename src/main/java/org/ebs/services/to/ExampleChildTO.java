package org.ebs.services.to;

import java.io.Serializable;

public class ExampleChildTO implements Serializable{

    private static final long serialVersionUID = -8565859776524871620L;

    private long id;
    private int aNumber;

    //this field does not exists in the persistence layer (DB)
    //but is generated at runtime by the server in Converter Class
    private String customField;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getaNumber() {
        return aNumber;
    }

    public void setaNumber(int aNumber) {
        this.aNumber = aNumber;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    
}