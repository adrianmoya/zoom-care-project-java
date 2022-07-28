package com.zoomcare.candidatechallenge.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(PropertyId.class)
public class Property {
    
    @Id
    Long employeeId;

    @Id
    String key;

    String value;

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    
}
