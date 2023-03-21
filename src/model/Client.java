package model;

import java.util.Date;
import java.util.List;

public class Client {

    private String id;
    private String name;
    private Date registerDate;
    private String email;
    private String address;
    private String phone;

    private Status status;

    private List<Package> packages;

    public Client(String id, String name, Date registerDate, String email, String address, String phone, Status status) {
        this.id = id;
        this.name = name;
        this.registerDate = registerDate;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.status = status;
    }

    public void addPackage(Package p){
        packages.add(p);
    }

    public Client(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
