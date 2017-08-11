package lesson15;

public class User2 {
    private String login, password;

    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        class Query {
            public void prinToLog() {
                System.out.print("Login = " + login + "\n" + "Password = " + password);
                System.out.println();
            }
        }
        Query q = new Query();
        q.prinToLog();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User2 user = (User2) o;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        User2 user = new User2("squirrel", "3712a");
        user.createQuery();
    }
}
