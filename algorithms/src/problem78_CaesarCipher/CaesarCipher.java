package problem78_CaesarCipher;

public class CaesarCipher {

    public static void main(String[] args) {
        System.out.println(caesarCipher("zvyA-'aBc", 3));
    }

    private static String caesarCipher(String s, int k) {
        k = k % 26;
        StringBuilder secret  = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(currentChar >= 'a' && currentChar <= 'z') {
                char newChar = (char) ((currentChar - 'a' + k) % 26 + 'a');
                secret.append(newChar);
            } else if(currentChar >= 'A' && currentChar <= 'Z') {
                char newChar = (char) ((currentChar - 'A' + k) % 26 + 'A');
                secret.append(newChar);
            } else {
                secret.append(s.charAt(i));
            }
        }
        return secret.toString();
    }

}
