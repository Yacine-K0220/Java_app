/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Cheikhou_yk
 */
public class Student {
     private int id;
    private String prenom;
    private String nom;
    private String email;
    private String username;
    private String password;
    private int age;
    private boolean sexe;

    public Student(int id, String prenom, String nom, String email, String username, String password, int age, boolean sexe) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.username = username;
        this.password = password;
        this.age = age;
        this.sexe = sexe;
    }
    
    public Student(String prenom, String nom, String email, String username, String password, int age, boolean sexe) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.username = username;
        this.password = password;
        this.age = age;
        this.sexe = sexe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSexe() {
        return sexe;
    }

    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }
    
    
}

