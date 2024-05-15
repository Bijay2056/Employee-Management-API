package com.tsdotinc.employeemanagement.api.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="employee_db")
public class Employee  implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    //    @ManyToOne
//    @JoinColumn(name = "department_id")
    private Department department;

    //    @ManyToOne
//    @JoinColumn(name = "post_id")
    private Post post;

    private String address;
    private String contact;
    private String email;





    public Employee(Long id, String name, Department department, Post post, String address, String contact, String email) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.post = post;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
