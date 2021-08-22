package com.project2.main.model;
import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable<U> {

	//Feel free to use the commented code below.  If any is still commented by final product, delete the commented ones
	
//    @CreatedBy
//    protected U createdBy;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date ticketdate;

//    @LastModifiedBy
//    protected U lastModifiedBy;

//    @LastModifiedDate
//    @Temporal(TemporalType.TIMESTAMP)
//    protected Date lastModifiedDate;

}