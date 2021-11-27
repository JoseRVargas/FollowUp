/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javabeans;

/**
 *
 * @author luizr
 */
public class User {
    //atributos
    private int IdUser;
    private String nameUser;
    private String password;
    private String nameComplete;
    private String phone;
    private String email;
    
    //getters e setters
    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int IdUser) {
        this.IdUser = IdUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameComplete() {
        return nameComplete;
    }

    public void setNameComplete(String nameComplete) {
        this.nameComplete = nameComplete;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //metodos_funcionalidades
}
