package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person extends BaseEntity implements Serializable {

    private long id;

    private String fullName;

    private Address address;

    private List<Account> accountList = new ArrayList();

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public Person(String fullName, Address address) {
        this.fullName = fullName;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }


}
