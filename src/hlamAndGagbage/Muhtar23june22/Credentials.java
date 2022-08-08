package hlamAndGagbage.Muhtar23june22;

public class Credentials {

    private String username, password;

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
        if (isStrongPassWord(password))
            this.password = password;
        else {
            System.err.println("Your password is shit!!   " + password);
            System.exit(1);
        }
    }

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    private boolean isStrongPassWord(String password) {

        if (password.length() < 8) return false;
        int countLetter = 0, countDigit = 0, countSpecial = 0;

        for (int i = 0; i < password.length(); i++) {

            if (Character.isLetter(password.charAt(i))) countLetter++;
            else if (Character.isDigit(password.charAt(i))) countDigit++;
            else if (password.charAt(i) != ' ') countSpecial++;

        }
        if (countDigit < 1 || countLetter < 1 || countSpecial < 1) {

            System.err.println("countLetter = " + countLetter);
            System.err.println("countDigit = " + countDigit);
            System.err.println("countSpecial = " + countSpecial);

            return false;


        }
        return true;
    }




    public String toString() {
        return "Credentials{" +
                "username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                '}';
    }

}



