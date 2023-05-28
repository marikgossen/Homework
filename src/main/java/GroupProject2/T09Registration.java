package GroupProject2;

public class T09Registration {
    public static void main(String[] args) {
        Registration user = new Registration();
        user.setEmail("marik@yahoo.com");
        user.setUserName("MarikG");
        user.setPassword("pass123");
    }
}

class Registration {
    private String email, userName, password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            System.out.println("Valid email");
        } else {
            System.out.println("This email is invalid, only @yahoo.com is accepted");
        }
    }

    public void setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Valid username");
        } else {
            System.out.println("This username is invalid because it isn't supposed to be empty or contain less than 6 characters");
        }
    }

    public void setPassword(String password) {
        if (password != null && password.length() > 6 && !password.contains(userName)) {
            System.out.println("Valid password");
        } else {
            System.out.println("This password is invalid because it contains less than 6 characters, or contains the username");
        }
    }
}