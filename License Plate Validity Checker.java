import java.util.*;

class TestClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();r
        char letter = ' ';
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letter = c;
                break;
            }
        }
        if (letter == ' ') {
            System.out.println("invalid");
            return;
        }
        String vowels = "AEIOUY";
        if (vowels.indexOf(Character.toUpperCase(letter)) != -1) {
            System.out.println("invalid");
            return;
        }
        List<Integer> digits = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(Character.getNumericValue(c));
            }
        }
        int[][] positions = {{0,1}, {1,2}, {3,4}};
        for (int[] pos : positions) {
            if (pos[1] < digits.size()) {
                int sum = digits.get(pos[0]) + digits.get(pos[1]);
                if (sum % 2 != 0) {
                    System.out.println("invalid");
                    return;
                }
            }
        }
        System.out.println("valid");
    }
}
