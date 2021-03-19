package org.ebs.util;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class FilterInput implements Serializable {
    private static final long serialVersionUID = 6538156970169234991L;

    private String col;
    private String val;
    private FilterMod mod = FilterMod.EQ;

}