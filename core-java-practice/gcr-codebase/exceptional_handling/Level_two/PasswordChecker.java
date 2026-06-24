public class PasswordChecker {

    static void checkPassword(String password) {

        try {

            if(password == null)
                throw new Exception("Password is null");

            if(password.length() < 8)
                throw new Exception(
                        "Password must be at least 8 characters");

            if(!Character.isUpperCase(password.charAt(0)))
                throw new Exception(
                        "First character must be uppercase");

            if(!Character.isDigit(
                    password.charAt(password.length()-1)))
                throw new Exception(
                        "Last character must be a digit");

            if(!(password.contains("@") ||
                 password.contains("#") ||
                 password.contains("$") ||
                 password.contains("%") ||
                 password.contains("&") ||
                 password.contains("*")))
                throw new Exception(
                        "Password must contain special character");

            System.out.println("Strong Password");

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        checkPassword("Admin@123");
    }
}