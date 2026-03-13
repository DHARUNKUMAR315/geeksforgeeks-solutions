import java.util.*;
class TestClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            List<Integer> evenList = new ArrayList<>();
            List<Integer> oddList = new ArrayList<>();
            for(int x : arr) {
                if(Integer.bitCount(x) % 2 == 0) {
                    evenList.add(x);
                } else {
                    oddList.add(x);
                }
            }
            Collections.sort(evenList);
            Collections.sort(oddList);
            evenList.addAll(oddList);
            for(int i=0; i<evenList.size(); i++) {
                System.out.print(evenList.get(i));
                if(i < evenList.size()-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
