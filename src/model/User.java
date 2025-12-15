/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Cheikhou_yk
 */
public class User {
    private int id;
    private String prenom;
    private String nom;
    private String email;
    private String sexe;
    private String password;
    private int age;
    
    
    public User() {
    }

    

    public User(int id, String prenom, String nom, String email, String sexe, String password, int age) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.sexe = sexe;
        this.password = password;
        this.age = age;
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

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
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

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", sexe=" + sexe + ", password=" + password + ", age=" + age + '}';
    }
    
    
    
}
