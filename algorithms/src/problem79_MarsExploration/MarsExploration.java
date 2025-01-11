package problem79_MarsExploration;

public class MarsExploration {

    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSPSSQSSOR"));
        System.out.println(marsExploration("SOSSOT"));
    }

    private static int marsExploration(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            if(i % 3 == 0 && s.charAt(i) != 'S'
                    || i % 3 == 1 && s.charAt(i) != 'O'
                    || i % 3 == 2 && s.charAt(i) != 'S') {
                count++;
            }
        }

        return count;
    }

}
