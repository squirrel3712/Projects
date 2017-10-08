package com.company;

public class User {
    private String password;
    private String login;
    private Bin bin;

    public User() {
        password = "";
        login = "";
    }

    public User(String password, String login, Bin bin) {
        this.password = password;
        this.login = login;
        this.bin = bin;
    }

    public Bin getBin() {
        return bin;
    }

    public void setBin(Bin bin) {
        this.bin = bin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return bin != null ? bin.equals(user.bin) : user.bin == null;
    }

    @Override
    public int hashCode() {
        int result = password != null ? password.hashCode() : 0;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (bin != null ? bin.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "shop.User{" +
                "password='" + password + '\'' +
                ", login='" + login + '\'' +
                ", bin=" + bin +
                '}';
    }
}
