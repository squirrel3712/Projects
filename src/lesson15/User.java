package lesson15;

public class User {
    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public class Query {
        public void prinToLog() {
            System.out.print("Login = " + login + "\n" + "Password = " + password);
            System.out.println();
        }
    }

    public void createQuery() {
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

        User user = (User) o;

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
        User user = new User("squirrel", "3712a");
        user.createQuery();
        Query query1 = user.new Query();
        query1.prinToLog();
        Query query2 = new User("ann", "good123").new Query();
        query2.prinToLog();
    }
}
