package com.zoomcare.candidatechallenge.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    Employee supervisor;

    @OneToMany(mappedBy = "supervisor")
    Set<Employee> directReports;

    @OneToMany
    @JoinColumn(name = "employeeId")
    List<Property> properties;

    public Long getId() {
        return id;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public Set<Employee> getDirectReports() {
        return directReports;
    }
    
}
