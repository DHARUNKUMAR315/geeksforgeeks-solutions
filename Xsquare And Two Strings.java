import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            boolean[] present = new boolean[26];
            for (char c : s1.toCharArray()) {
                present[c - 'a'] = true;
            }
            boolean found = false;
            for (char c : s2.toCharArray()) {
                if (present[c - 'a']) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "Yes" : "No");
        }
    }
}
