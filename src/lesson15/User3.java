package lesson15;

public class User3 {
    private static String login, password;

    public static void initial(String l, String p){
       login = l;
       password = p;
    }

    public static class Query {
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

        User3 user = (User3) o;

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
        User3.initial("ann", "123");
        Query q1 = new Query();
        q1.prinToLog();
    }
}
