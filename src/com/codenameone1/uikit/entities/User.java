/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codenameone1.uikit.entities;


import java.util.Date;

public class User {

    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProfilePic(String ProfilePic) {
        this.ProfilePic = ProfilePic;
    }

    public String getProfilePic() {
        return ProfilePic;
    }
    String username;
    String email;
    String password;
    String gender;
    String address;
    String name;
    String lastName;
    String bio;
    String phone_number;
    String Role;
    Date Birthday;
    String ProfilePic;

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;

    }

    public User() {

    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public User(int id, String username, String email, String password, String gender, String address, String name, String lastName, String phone_number,String bio, String Role, Date Birthday, String ProfilePic) {
        this.username = username;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.name = name;
        this.lastName = lastName;
        this.phone_number = phone_number;
        this.Role = Role;
        this.id = id;
        this.bio = bio;
        this.Birthday = Birthday;
        this.password = password;
        this.ProfilePic = ProfilePic;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", gender=" + gender + ", address=" + address + ", name=" + name + ", lastName=" + lastName + ", bio=" + bio + ", phone_number=" + phone_number + ", Role=" + Role + ", Birthday=" + Birthday + ", ProfilePic=" + ProfilePic + '}';
    }

  

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBio() {
        return bio;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

}
