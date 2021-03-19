package org.ebs.util;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter
public abstract class Auditable implements Serializable{
    private static final long serialVersionUID = 4025893569744465561L;

    @Column(name = "creator_id")
    @CreatedBy
    @ToString.Exclude
    private Integer createdBy;

    @CreatedDate
    @Column(name = "creation_timestamp")
    @ToString.Exclude
    private Date createdOn;

    @Column(name = "modifier_id")
    @LastModifiedBy
    @ToString.Exclude
    private Integer updatedBy;

    @LastModifiedDate
    @Column(name = "modification_timestamp")
    @ToString.Exclude
    private Date updatedOn;

    @Column(name = "is_void")
    @ToString.Exclude
    private boolean deleted = false;
}
