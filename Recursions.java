import java.util.*;


public class Recursions {
    
    public static void intorduction() {
        /* Recursion is based on faith */
        /* base case is necessary */
        /* topdown */
    }
   
    public static boolean checkArray(int arr[], int index) {
        if(arr.length == 1 || index == 1) return false;
        return arr[index-1] >= arr[index-2] ? true : checkArray(arr, index-1);
    }

    public static void printDecreasing(int n) {
        if(n == 0) {
           
            return ;
        }
        System.out.println(n);
        printDecreasing(n-1);

    }
    
    public static void printIncreasing(int n) {
        if(n == 0) return;
        printIncreasing(n-1);
        System.out.println(n);
    }

    public static int factroial(int n) {
        if(n == 1 ) return n;
        return n*factroial(n-1);
    }

    public static int fibonacci(int n) {
        if(n == 0 || n == 1) return n;
        return fibonacci(n-2)+fibonacci(n-1);
    }

    public static int fiboWithDP(int n, int arr[]) {
        Arrays.fill(arr, -1);
        if(n == 1 || n == 0) return n;
        if(arr[n] != -1) {
            return arr[n];
        }
       return arr[n] = fiboWithDP(n-2, arr) + fiboWithDP(n-1, arr);
    }
    
    public static int sumOfN(int n) {
        if(n == 0) return 0;
        return n+sumOfN(n-1);
    }

    

    public static boolean isSorted(int arr[], int index) {
        if(index == arr.length-1) return true;
        if(arr[index] >= arr[index+1]) {
            return false;
        }
        return isSorted(arr, index+1);
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length-1) return -1;
        if(arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i+1);
        /* 1st compare ur self
         * look forward
         */
    }

    public static int lastOccurence(int arr[], int key, int i) {
        /*
         * look forward
         * compare ur self
         */
        if(i == arr.length) return -1;
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound != -1) {
            return isFound;
        }

        // check with self
        if(arr[i] == key) 
            return i;
        else return isFound;
        
    }

    public static int lastOccurence1(int arr[], int key, int i) {

        if(i == arr.length) return -1;

        int isFound = lastOccurence1(arr, key, i+1);

        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int expo(int x, int n) {
        if(n == 0) return 1;
        return x*expo(x, n-1);
    }

    public static int powerOptimized(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPower = powerOptimized(x, n/2);
        int halfPowerSq = halfPower*halfPower;

        //n is odd
        if(n % 2 != 0) {
            halfPowerSq = x * halfPower;
        }
        return halfPower;
    }

    public static int tilingProblem(int n) { //2 * n
        /*
         * Given "2 * n" board and titles of size "2 * 1", count the no. of
         * ways to tile the given board using the 2 * 1 ties.
         * (A tile can either be placed horizontally or vertically)
         * No tile is also a way...
         */

         /*
          *           choice
                    /      \
                    /        \
                vertical-->(n-1)   horizontal-->2*(n-2)
          */

        // base case
        if(n == 0 || n == 1) return 1;

        // kaam
        /* vertical */
        int fnm1 = tilingProblem(n-1);
        /* horizontal */
        int fnm2 = tilingProblem(n-2);
        
        int totWays = fnm1 + fnm2;

        return totWays;

        
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        /*
         * 
         */
        
        //  base
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        //  kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            /* duplicate */
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendsPair(int n) {
        /*
         * Given n friends, each one can remain single or can be 
         * paired up with some other freidn. Each friend can be paired 
         * only once. Find out the total number of ways in which friends
         * can remain single or can be paired up.
         */
         

         /* base case 
          * n == 1 or n == 2 --> ways n
          */

        if(n == 1 || n == 2) return n;

        //   /*choice */
        // // single
        // int fnm1 = friendsPair(n-1);
        // // pair
        // int fnm2 = friendsPair(n-2);
        // int pairWays = (n-1)*fnm2;

        // int totWays = fnm1 + pairWays;
        // return totWays;

        return  friendsPair(n-1) + n-1*friendsPair(n-2);


    }

    public static void printBinStrings(int n, int lastPlace, String str) {

        // base case
        if(n == 0) {
            System.out.println(str);
            return;
        }
        //kaam
        printBinStrings(n-1, 0, str+"0");

        if(lastPlace == 0) {
            printBinStrings(n-1, 1, str+"1");
        }

    }


    public static void main(String args[]) {
       
        
    }
}
