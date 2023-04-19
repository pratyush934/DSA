import java.util.*;


public class Exercise {
    
    public static void Example1() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a;
        for( ; ; ) {
            a = sc.nextInt();
            if(a > 0) {
                 sum += a;
            }
            if(a < 0){
                continue;
            }
            if(a == 0) {
                break;
            }
            
        }
        System.out.println(sum);
    }

    public static int Example2(int n) {
        int sum = 0;
        if(n != 0) {
            int r = n % 10;
            sum = r + Example2(n/10);
        } else {
            return 0;
        }
        return sum;
    }

    public static void Example3(int n) {
        int i,j;
        for(i=2; i<n; i++) {
            for(j=2; j<i; j++) {
                if(i % j == 0 ) {
                    break;
                }
            }
            if(i == j) {
                System.out.println(i);
            }
        }
    }

    public static int Example4(int n) {
        if(n == 0 || n ==1) return n;
        return Example4(n-2)+Example4(n-1);
    }
    public static void main(String args[]) {
       for(int i=0; i<=10; i++) {
        System.out.print(Example4(i)+" ");
       }
    }
}