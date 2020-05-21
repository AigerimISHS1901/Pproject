package sample;

import java.io.Serializable;

public class User implements Serializable {
    private String firstname;
    private String surname;
    private String loginname;
    private String password;
    private String email;

    public User(String firstname, String surname, String loginname, String password, String email) {
        this.firstname = firstname;
        this.surname = surname;
        this.loginname = loginname;
        this.password = password;
        this.email = email;
    }

    public User(Long idusers, String firstname, String surname, String password, String email) {}

    public User() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
