package model;

/**
 * User.java
 * This is a model class represents a User entity
 * @author Ramesh Fadatare;
 *
 */
public class User {
    protected int id;
    protected String Name;
    protected String Email;
    protected String Address;
    protected int  Phone;
    public User(int id, String name, String email, String address) {}

    public User(String name, String email, String country, int phone) {
        super();
        this.Name = name;
        this.Email= email;
        this.Address = country;
        this.Phone = phone;
    }

    public User(int id, String name, String email, String address, int phone) {
        super();
        this.id = id;
        this.Name = name;
        this.Email = email;
        this.Address = address;
        this.Phone = phone;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String country) {
        this.Address = country;
    }
    public int getPhone() {
        return Phone;
    }
    public void setPhone(String country) {
        this.Phone = Integer.parseInt(country);
    }
}