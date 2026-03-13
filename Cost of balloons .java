import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
           int color1=sc.nextInt();
           int color2=sc.nextInt();
           int n=sc.nextInt();
           int p1q=0; int p2q=0;
           for(int i=0;i<n;i++)
           {
               int p1=sc.nextInt();
               int p2=sc.nextInt();
               if(p1==1) p1q++;
               if(p2==1) p2q++;
           }
           int costA = color1*p1q + color2*p2q;
           int costB = color2*p1q + color1*p2q;
           System.out.println(Math.min(costA, costB));
           t--;
        }
    }
}
