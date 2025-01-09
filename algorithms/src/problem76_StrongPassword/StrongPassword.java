package problem76_StrongPassword;

public class StrongPassword {

    public static void main(String[] args) {
        System.out.println(minimumNumber(3, "Ab1"));
        System.out.println(minimumNumber(11, "#HackerRank"));
    }

    private static int minimumNumber(int n, String password) {
        int minLength = 6;
        String numbers = "0123456789";
        String lowerCaseCharacters = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "!@#$%^&*()-+";

        int passCheckCount = 0;
        boolean hasNumber = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialCharacter = false;

        for(int i = 0; i < n; i++) {
            char value = password.charAt(i);
            if(numbers.indexOf(value) >= 0 && !hasNumber) {
                passCheckCount++;
                hasNumber = true;
            }

            if(lowerCaseCharacters.indexOf(value) >= 0 && !hasLowerCase) {
                passCheckCount++;
                hasLowerCase = true;
            }

            if(upperCaseCharacters.indexOf(value) >= 0 && !hasUpperCase) {
                passCheckCount++;
                hasUpperCase = true;
            }

            if(specialCharacters.indexOf(value) >= 0 && !hasSpecialCharacter) {
                passCheckCount ++;
                hasSpecialCharacter = true;
            }
        }

        int remainingLength = Math.max(0, minLength - n);
        return Math.max(4 - passCheckCount, remainingLength);
    }

}
