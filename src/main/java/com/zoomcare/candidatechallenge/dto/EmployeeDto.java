package com.zoomcare.candidatechallenge.dto;

import java.util.List;
import java.util.Set;

public class EmployeeDto {

    Long id;

    Set<EmployeeDto> directReports;

    List<PropertyDto> properties;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<EmployeeDto> getDirectReports() {
        return directReports;
    }

    public void setDirectReports(Set<EmployeeDto> directReports) {
        this.directReports = directReports;
    }

    public List<PropertyDto> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyDto> properties) {
        this.properties = properties;
    }
    
}
