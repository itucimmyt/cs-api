package org.ebs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.ebs.util.Auditable;

/**
 * Class mapping to a DB entity
 */
@Entity @Table(name = "child", schema = "ex")
public class ExampleChild extends Auditable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne @JoinColumn(name = "parent_id")
    private ExampleParent parent;

    @Column(name = "a_number")
    private int aNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ExampleParent getParent() {
        return parent;
    }

    public void setParent(ExampleParent parent) {
        this.parent = parent;
    }

    public int getaNumber() {
        return aNumber;
    }

    public void setaNumber(int aNumber) {
        this.aNumber = aNumber;
    }
}