package com.springapp.spring_boot_demo_startup;

public class App_Modal {

    int id;
    String username;
    String department;

    public App_Modal(int id, String username,String department){
        this.id = id;
        this.username = username;
        this.department= department;
        System.out.println("Data : "+id+" "+" "+username+" "+department);
    }

    // Getter
    public int getId() {
        return id;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
    }

    // Getter
    public String getUsername() {
        return username;
    }

    // Setter
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter
    public String getDepartment() {
        return department;
    }

    // Setter
    public void setDepartment(String department) {
        this.department = department;
    }


//    // Main method
//    public static void main(String[] args) {
//
//        App_Modal user = new App_Modal();
//
//        // Entering details
//        user.setId(101);
//        user.setUsername("Ranjith");
//        user.setDepartment("Automation Testing");
//
//        // Getting details
//        System.out.println("ID: " + user.getId());
//        System.out.println("Username: " + user.getUsername());
//        System.out.println("Department: " + user.getDepartment());
}