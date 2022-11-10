package com.bootcamp.hr.entity;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private float salary;
    private int departmentId;
    private String departmentName;
    private String jobId;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String email, float salary, int departmentId, String departmentName, String jobId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.jobId = jobId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public int hashCode() {
        return this.id * 31;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee))
            return false;
        
        Employee otherEmployee = (Employee)obj;
        return this.id == otherEmployee.getId()
        			   && this.email.equals(otherEmployee.getEmail());
    }

    @Override
    public String toString() {
        return String.format("id=%s, firstName=%s, lastName=%s, email=%s, salary=%s, departmentId=%s, departmentName=%s, jobId=%s", 
        					 this.id, 
        					 this.firstName, 
        					 this.lastName, 
        					 this.email, 
        					 this.salary, 
        					 this.departmentId,
        					 this.departmentName,
        					 this.jobId);
    }
}
