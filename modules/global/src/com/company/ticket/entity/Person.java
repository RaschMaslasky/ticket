package com.company.ticket.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s (%s)|firstName,lastName,inn")
@Table(name = "TICKET_PERSON")
@Entity(name = "ticket_Person")
public class Person extends StandardEntity {
    private static final long serialVersionUID = -8790494461680623621L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    protected String firstName;

    @Column(name = "SECURITY_LEVEL")
    protected String securityLevel;

    @Column(name = "LAST_NAME")
    protected String lastName;

    @NotNull
    @Column(name = "INN", nullable = false)
    protected String inn;

    @Column(name = "JOB")
    protected String job;

    @Column(name = "DEPARTMENT")
    protected String department;

    @Column(name = "ORGANIZATION")
    protected String organization;

    public SecurityLevel getSecurityLevel() {
        return securityLevel == null ? null : SecurityLevel.fromId(securityLevel);
    }

    public void setSecurityLevel(SecurityLevel securityLevel) {
        this.securityLevel = securityLevel == null ? null : securityLevel.getId();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}