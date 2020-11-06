package com.example.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Person {
    @Expose
    @SerializedName("name") // defines a global name
    private String mName;
    @Expose
    @SerializedName("age")
    private int age;
    @Expose
    @SerializedName("id")
    private String emailId;
    @Expose
    @SerializedName("family")
    private List<family> families;
    @Expose(serialize = false)
    @SerializedName("address")
    private Address address;

    private transient String password;// transient keyword makes it non-serializable

    public Person(String mName, int age, String emailId, List<family> families, Address address, String password) {
        this.mName = mName;
        this.age = age;
        this.emailId = emailId;
        this.families = families;
        this.address = address;
        this.password = password;
    }

    public Person(String mName, int age, String emailId, List<family> families, Address address) {
        this.mName = mName;
        this.age = age;
        this.emailId = emailId;
        this.families = families;
        this.address = address;
    }

    public Person(String mName, int age, String emailId, Address address) {
        this.mName = mName;
        this.age = age;
        this.emailId = emailId;
        this.address = address;
    }

    public List<family> getFamilies() {
        return families;
    }

    public Address getAddress() {
        return address;
    }

    public Person(String name, int age, String emailId) {
        this.mName = name;
        this.age = age;
        this.emailId = emailId;
    }

    public String getName() {
        return mName;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }
}
