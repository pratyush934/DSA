import java.util.*;


public class Array {

    public static int linearSearch(int arr[], int key) {

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    } 
    
    public static int largestValue(int arr[]) {
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int binarySearch(int arr[], int key) {
        /* arr must be sorted */
        Arrays.sort(arr);
        int start = 0, end = arr.length;

        while(start <= end) {
            int mid = (start + end) / 2;
            
            /* comparision */
            if(arr[mid] == key) {
                return mid;
            }
            if(arr[mid] > key) {
                end = mid-1;
            }
            if(arr[mid] < key) {
                start = mid+1;
            }

        }
        return -1;
    }

    public static void reverseArray(int arr[]) {
        int first = 0, last = arr.length;

        while(first < last) {
            /* swapping */
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static void pairsinArrays(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void subArrays(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=1; j<arr.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void kadanes(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<arr.length; i++) {
            cs += arr[i];
            if(cs < 0) cs = 0;
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);

    }

    public static int trappedRainWater(int arr[]) {
        int n = arr.length;
        int leftMax[] = new int[n];
        /* calculate left max boundary */
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
        /* calculate right max boundary */
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        /* loop */
        for(int i=0; i<n; i++) {
            int waterLevel = Math.max(leftMax[i], rightMax[i]);

            trappedWater += waterLevel - arr[i];
        }

        return trappedWater;

    }

    public static int buyAndSellstocks(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }

    public static void bubbleSort(int arr[]) {
        for(int turn = 0; turn<arr.length; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    /* swapping */
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            /* swapping */
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length-1; i++) {
            int curr = i;
            int prev = i-1;
            while(prev >= 0 && arr[prev] > arr[curr] ) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            /* insetrion */
            arr[prev+1] = arr[curr];
        }
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }
        /* sorting */
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length;
        int endCol = matrix[0].length;

        while(startRow <= endRow && startCol <= endCol) {
            /* top */
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            /* endCol */
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][startCol]+" ");
            }
            /* lastRow */
            for(int j=endCol-1; j>=startCol; j--) {
                System.out.print(matrix[endRow][j]+" ");
            }
            /* firstCol */
            for(int i=endRow-1; i>=startRow+1; i--) {
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();

    }

    public static int diagonalSum(int matrix[][]) {
        /* primary diagonal i==j */
        /* secondary diagonal n-1 */

        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
            /* pd */
            sum += matrix[i][i];
            /* sd */
            if(i != matrix.length-1)
            sum += matrix[i][matrix.length-1];
        }
        return sum;
    }

    public static boolean searchMatrix(int matrix[][], int key) {
        int row = 0;
        int col = matrix.length-1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.println(row + col);
                return true;
            }
            else if(key < matrix[row][col]) {
                col--;
            } 
            else {
                row++;
            }
        }
        return false;
    }
    public static void rotateArray(int arr[], int d, int n) { /* O(n) and O(1) */

        d = d % n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

   public static void reverse(int arr[], int start, int end) {

        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
   }

    public static void rotateArray1(int arr[], int d, int n) { /* O(n) && O(n) */
        int temp[] = new int[n];
        int k = 0;
        for(int i=d; i<n; i++) {
            temp[k] = arr[i];
            k++;
        }
        for(int i=0; i<d; i++) {
            temp[k] = arr[i];
            k++;
        } 
        for(int i=0; i<n; i++) {
            arr[i] = temp[i];
            
        }

    }

    public static void rotateArray2(int arr[], int d, int n) {
        int p = 1;
        while(p <= d) {
            int last = arr[0];
            for(int i=0; i<n-1; i++) {
                arr[i] = arr[i+1];
            } /* O(n*d) */
            arr[n-1] = last;
            p++;
        }
    }

    public static int transitionPoint(int arr[], int n) {
        
        Arrays.sort(arr);
        int start = 0, end = n-1;
        if(arr[n-1] == 0) return -1;
        while(start <= end) {
            int mid = end + (start - end) / 2;
            if(mid == 0 && arr[mid] == 1) return mid;
            if(mid == 0 && arr[mid] == 0) return mid;
            if(arr[mid] == 1 && arr[mid-1] == 0) return mid;
            if(arr[mid] == 1) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }


    public static void waveForm(int arr[]) {
        /* Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).

          In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5]..... */

          for(int i=0; i<arr.length-1; ) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i+=2;
          }
    }

    public static String longestCommon(String arr[] ) {
        /*
         * Given a array of N strings, find the longest common prefix among all strings present in the array.
         */
        String str = arr[0];
        for(int i=1; i<arr.length; i++) {
            while(arr[i].indexOf(str) != 0) {
                str = str.substring(0,str.length()-1);
            }
        }
        if(str.length() == 0) str = "-1";

        return str;

    }

    public static int rotationK(int arr[], int n) {
        int start = 0, end = n-1;
        while(start <= end) {
            int mid = end + (start - end) / 2;
            int prev = (mid - 1 + n) % n; /* boundary cross na kar jaaye */
            int next = (mid + 1) % n;

            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]) return mid;
            if(arr[mid] <= arr[end]) end = mid -1;
            if(arr[mid] >= arr[start]) start = mid+1;
        }
        return 0;
    }

    public static int secondLargest(int arr[]) {
        Arrays.sort(arr);
        for(int i=arr.length-1; i>0; i--) {
            if(arr[i] != arr[i-1]) {

             return arr[i-1];
            }
        }
        return -1;
    }

    public static ArrayList<Integer> valueEqualToIndex(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == i+1) ans.add(i+1);
        }

        return ans;
    }
        
    public static long sumSeries(int n) {
        long n2 = n;
        return n2*(n2+1) / 2;
    }

    public static int palinArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            if(!palindrome(arr[i])) return 0;
        }
        return 1;
    }

    public static boolean palindrome(int x) {
        int sum = 0;
        int temp = x;
        while(x > 0) {
            int r = x % 10;
            sum = (sum*10) + r;
            x /= 10;
        }
        if(sum == temp) return true;

        return false;
    }

    public static int[] findIndex(int arr[], int key) {
        int ans[] = {-1,-1};
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                ans[0] = i;
                break;
            }
        }
        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] == key) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }

    public static int[] getMoreLess(int arr[], int X) {
        int ans[] = {0, 0};
        int lc = 0, hc = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] <= X) lc++;
            if(arr[i] >= X) hc++;
        }
        ans[0] = lc;
        ans[1] = hc;
        return ans;
    }

    public static long[] findElements(long[] arr, long n) {
        /* 
         * Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.
         */

         long ans[] = new long[(int)(n-2)];
         Arrays.sort(arr);
         for(int i=0; i<n-2; i++) {
            ans[i] = arr[i];
         }
         return ans;
    }

    public static String avg(int arr[]) {
        /*
         * For a given array of price of items,you have to calculate the average of all prices upto 2 decimal places.
         */

         double sum = 0;
         for(int i=0; i<arr.length; i++) {
            sum += arr[i];
         }
         float avg = (float)(sum/arr.length);
         return String.format("%0.2f", avg);
    }

    public static boolean fascinating(int n) {
        /* 
         * Given a number N. Your task is to check whether it is fascinating or not.
         * 
         
         Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3,
          and when both these products are concatenated with the original number, 
          then it results in all digits from 1 to 9 present exactly once.
         */
         String s = n+""+2*n+""+3*n;
         char[] c = s.toCharArray();
         Arrays.sort(c);
         String ans = new String(c);
         return ans.equals("123456789") ? true : false;
    }

    public static void reverseinSets(ArrayList<Integer> arr, int k) {
        /* 
         * Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.
         */
        int n = arr.size();
        for(int i=0; i<n; i+=k) {
            if(i+k<n) reverseinSetsUtil(arr, i, i+k);
            else reverseinSetsUtil(arr, i, n);
        }
    }
    
    public static void reverseinSetsUtil(ArrayList<Integer> arr1, int x1, int x2) {
        int start = x1, end = x2-1;
        while(start <= end) {
            int temp = arr1.get(start);
            arr1.set(start, arr1.get(end));
            arr1.set(end, temp);
            start++;
            end--;

        }
    }

    public static boolean tripletSum(int arr[]) {
        /*
         * Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero
         */
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n-2; i++) {
            int lp = i+1, rp = n-1;
            while(lp < rp) {
                int sum = arr[i]+arr[lp]+arr[rp];
                if(sum == 0) return true;
                else if(sum > 0) rp--;
                else lp++;
            }
        }
        return false;
    }

    public static void cyclicArray(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
        }
    }

    public static boolean pythagoreanTriplet(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n; i++) arr[i] = arr[i]*arr[i];

        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=i+2; k<n; k++) {
                    if(arr[i]+arr[j] == arr[k]) return true;
                }
            }
        }
        return false;
    }

    public static int minDist(int arr[], int x, int y) {
        /*
         * You are given an array A, of N elements.
         * Find minimum index based distance between two elements of the array, x and y such that (x!=y).
         */

        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        int f = -1, s = -1;
        for(int i=0; i<n; i++) {
            if(arr[i] == x) f = i;
            if(arr[i] == y) s = i;

            if(f != -1 && s != -1) {
                ans = Math.min(Math.abs(f-s),ans);
            }

           
        }
        if(ans == Integer.MAX_VALUE) return -1;
        else 
        return ans;
    }

    public static ArrayList<Integer> find1(int arr[], int x) {
        /*
         * Given a sorted array arr containing n elements with possibly duplicate elements,
         * the task is to find indexes of first and last occurrences of an element x in the given array.
         */
        /*
         * It is given to solve in O(logN) but we can still solve with single loop.
         */

        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(arr[i] == x) {
                ans.add(i);
                break;
            }
        }
        for(int i=n-1; i>=0; i--) {
            if(arr[i] == x) {
                ans.add(i);
                break;
            }
        }
        if(ans.size() == 0) {
            ans.add(-1);
            ans.add(-1);
        }
        return ans;
    }

    public static void zigZag(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            if(i % 2 == 0 && arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            if(i % 2 != 0 && arr[i] < arr[i+1]) {
                int temp1 = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp1;
            }
        }
    }

    public static int lastIndex(String str) {
        char arr[] = str.toCharArray();
        int ans = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == '1') {
                ans = i;
            }
        }
        return ans;
    }

    public static int[] minand2ndmin(int arr[]) {
        int ans[] = {-1, -1};
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            if(arr[i] == arr[i+1]) {
                ans[0] = -1;
                ans[1] = -1;
            } else {
                ans[0] = arr[i];
                ans[1] = arr[i+1];
                return ans;
            }
        }
        return ans;
    }
    public static int maxmizeSum(int arr[]) {
        /*
         * Given an array A of N integers. 
         * Your task is to write a program to find the maximum value of ∑arr[i]*i, where i = 0, 1, 2,., n 1.
         * Since output could be large, hence module 109+7 and then print answer.
         */

        long mod =  1000000007;
        long sum = 0;
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0; i<n; i++) {
            sum = (sum + (long)arr[i]*i) % mod;
        }
        return (int)sum;

    }

    public static int closetTomin(int arr[], int target) {
        int val = Math.abs(arr[0]-target), ans = arr[0];
        for(int i=1; i<arr.length; i++) {
            int temp = 0;
            temp = Math.abs(arr[i] - temp);
            if(temp <= val) {
                val = temp;
                ans = arr[i];
            }
        }
        return ans;
    }

    public static int maxDays(int arr[]) {
        /*
         * Given an array arr[] of size N representing the size of candles which reduce by 1 unit each day.
         *  The room is illuminated using the given N candles. Find the maximum number of days the room is without darkness.

 
         */

        int max = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void sortIt(int arr[]) {
        /*
         * Given an array A of positive integers. 
         * Your task is to sort them in such a way that the first part of the
         *  array contains odd numbers sorted in descending order, 
         * rest portion contains even numbers sorted in ascending order.
         */
        int n = arr.length;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0; i<n; i++) {
            if(arr[i] % 2 == 0) {
                list1.add(arr[i]);
            } else {
                list2.add(arr[i]);
            }
        }
        /* Sorting list1 in ascending order */
        Collections.sort(list1);
        /* Sorting list2 in descending order */
        Collections.sort(list2, Collections.reverseOrder());

        /*  Adding list2 in arr[]  */
        for(int i=0; i<list2.size(); i++) {
            arr[i] = list2.get(i);
        }
        /* Adding list1 in arr[] */
        for(int i=list2.size(); i<n; i++) {
            arr[i] = list1.get(i-list2.size());
        }
    }

    public static int calculateFine(int arr[], int fine[], int date) {
        /*
         * Given an array of penalties fine[],
         *  an array of car numbers car[], and also the date.
         *  The task is to find the total fine which will be collected on the given date. 
         * Fine is collected from odd-numbered cars on even dates and vice versa.
         */
        int n = arr.length;
        int sum = 0;
        if(date % 2 == 0) {
            for(int i=0; i<n; i++) {
                if(arr[i] % 2 != 0) {
                    sum += fine[i];
                }
            }
        } else {
            for(int i=0 ; i<n; i++) {
                if(arr[i] % 2 == 0) {
                    sum += fine[i];
                }
            }
        }
        return sum;
    }

    public static void nextGreatest(int arr[]) {
        /*
         * You are given an array Arr of size N. 
         * Replace every element with the next greatest element (greatest element on its right side) in the array. 
         * Also, since there is no element next to the last element, replace it with -1.
         * 
         * SANDAAR JABARJAST JINDABAAAAD!!!!!!!!!
         */
        int n = arr.length;
        int temp = 0, gtr = -1;
        for(int i=n-1; i>=0; i--) {
            temp = arr[i];
            arr[i] = gtr;
            gtr = Math.max(gtr,temp);
        }
    }

    public static int minProduct(int arr[]) {
        /*
         * Given an array of N positive integers. 
         * You need to write a program to print the minimum product of k integers of the given array.
         */
        int n = arr.length;
        long ans = 1;
        long mod = 1000000007;
        for(int i=0; i<n; i++) {
            ans = (ans*(long)arr[i]) % mod ;
        }
        return (int)ans;
    }

    public static int typeArray(int arr[]) {
        /*
* You are given an array of size N having no duplicate elements. The array can be categorized into the following:
1.  Ascending
2.  Descending
3.  Descending Rotated
4.  Ascending Rotated
Your task is to return which type of array it is and the maximum element of that array.
         */

         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
         int type = 0;
         int n = arr.length;
         for(int i=0; i<n; i++) {
            min = Math.min(arr[i],min);
            max = Math.max(arr[i], max);
         }
         if(min == arr[0] && max == arr[(int)n-1]) type = 1;
         else if(min == arr[(int)n-1] && max == arr[0]) type = 2;
         else if(arr[0] < arr[(int)n-1]) type = 3;
         else type = 4;

         return type;
    }

    public static void reArrange(int arr[]) {
        /*
         * Given an array Arr[], write a program that segregates even and odd numbers. 
         * The program should put all even numbers first in sorted order, and then odd numbers in sorted order.
         */

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int n = arr.length;

        for(int i=0; i<n; i++) {
            if(arr[i] % 2 == 0) {
                list1.add(arr[i]);
            } else {
                list2.add(arr[i]);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);

        for(int i=0; i<list1.size(); i++) {
            arr[i] = list1.get(i);
        }
        for(int i=list1.size(); i<n; i++) {
            arr[i] = list2.get(i-list1.size());
        }

    }

    public static int totalCount(int arr[], int k) {
        /*
         * Given an array Arr of N positive integers and a number 
         * K where K is used as a threshold value to divide each 
         * element of the array into sum of different numbers. 
         * Find the sum of count of the numbers in which array elements are divided.
         */
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] % k == 0) count += arr[i]/k;
            else count+= arr[i]/k + 1;
        }
        return count;
        
    }

    public static void nexTgreatest(int arr[]) {
        int n = arr.length;
        int gtr = -1, temp = 0;
        for(int i=n-1; i>=0; i--) {
            temp = arr[i];
            arr[i] = gtr;
            gtr = Math.max(gtr,temp);
        }
    } 

    public static int greatestProfit(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-1]*arr[n-2];
    }

    public static ArrayList<Integer> arranged(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0; i<n; i++) {
            if(arr[i] > 0) {
                list1.add(arr[i]);
            } else if(arr[i] < 0) {
                list2.add(arr[i]);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int i=0, j=0;
        while(i < list1.size()) {
            ans.add(list1.get(i));
            ans.add(list2.get(j));
            i++;
            j++;
        }
        return ans;
    }

    public static void reverseSubset(int arr[], int l, int r) {
        /*
         * Provided an array Arr of N integers, you need to reverse a subarray of that array. 
         * The range of this subarray is given by L and R.
         */
        reverseinSetsUtil(arr, l, r);
    }
    public static void reverseinSetsUtil(int arr[], int x1, int x2) {
        int start = x1-1, end = x2-1;
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int findDuplicates(int arr[]) {
        /*
         * Given a sorted array A[] having 10 elements which contain
         *  6 different numbers in which only 1 number is repeated five times.
         *  Your task is to find the duplicate number using two comparisons only.
         */

         if(arr[0] == arr[4]) {
            return arr[4];
         }else return arr[6];
    }

    public static int duplicateSum(int arr[]) {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<n; i++) {
            hs.add(arr[i]);
        }
        int sum = 0;
        for (Integer item : hs) {
            sum += item;
        }
        return sum;
    }

    public static int countingK(int arr[], int k) {
        /*
         * Given an array A[]  of n elements. 
         * Your task is to complete the Function num which returns 
         * an integer denoting the total number of times digit k appears in the whole array.
         */

        int count = 0;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            while(arr[i] > 0) {
                int r = arr[i] % 10;
                if(r == k) count++;
                arr[i] /= 10;

            }
        }
        return count;
    }

    public static int factroialN(int n, int arr[]) {
        Arrays.fill(arr, -1);
        if(n == 0 || n == 1) return n;
        if(arr[n] != -1) {
            return arr[n];
        }
        return arr[n] = factroialN(n-2,arr)+factroialN(n-1,arr);
    }

    public static boolean checkArray(int arr[], int index) {
        if(arr.length == 1 || index == 1) return false;
        return arr[index-1] > arr[index-2] ? true : checkArray(arr, index-1);
    }

    public static ArrayList<Integer> lastDuplicate(int arr[]) {
        /*
         * Given a sorted array with duplicate elements and 
         * we have to find the index of the last duplicate element 
         * and return the index of it and also return the duplicate element.
         */
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=arr.length-1; i>0; i--) {
            if(arr[i] == arr[i-1]) {
                ans.add(i);
                ans.add(arr[i]);
                break;

            }
        }
        if(ans.size() == 0) ans.add(-1);
        return ans;
    }

    public static int fibonacciii(int dp[], int n) {
        Arrays.fill(dp, -1);
        if(n == 0 || n == 1) return n;
        if(dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = fibonacciii(dp, n-2)+fibonacciii(dp, n-1);
        
    }

    public static int[] getDigitDiff1AndLessK(int arr[], int k) {
        /*
         * Given an array arr of size n.
         *  Print all the numbers less than k and should be such that 
         * the difference between every adjacent digit should be 1 in the array.
         * 
         * arr[] = {7, 98, 56, 43, 45, 23, 12, 8} k = 54
           Output: 43 45 23 12
         */

        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = false;
        for(int i=0; i<n; i++) {
            if(arr[i] > 9 && arr[i] < k) {
                int curr = arr[i];
                while(curr > 9) {
                    int diff = Math.abs(curr % 10 - (curr/10) % 10);
                    if(diff == 1) {
                        curr /= 10;
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if(flag) list.add(arr[i]);
            }
            
        }
        int ans[] = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static int minDiff(int arr[], int k) {
        // SAMAJH ME NAHI AAYA
        /*
         * Given an array of n integers and a positive number k. 
         * We are allowed to take any k integers from the given array. 
         * The task is to find the minimum possible value of the difference between maximum and minimum of k numbers.
         */
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int i=0, j=k-1;
        int n = arr.length;
        while(i < n && j < n) {
            ans = Math.min(ans, Math.abs(arr[i]-arr[j]));
        }
        return ans;
    }

    public static int lenOfLongSubArray(int arr[]) {
        /*
         * Given an array containing n numbers. 
         * The problem is to find the length of the longest contiguous subarray such 
         * that every element in the subarray is strictly greater than its previous element in the same subarray.
         */
        int n = arr.length;
        int len = 1;
        int maxD = 1;
        for(int i=0; i<n-1; i++) {
            if(arr[i] < arr[i+1]) len++;
            else len = 1;
            maxD = Math.max(maxD, len);
        }
        return maxD;
    }

    public static ArrayList<Integer> countArray(int arr[], int x) {
        /*
         * You are given an integer 'n' which denote the number of elements in an array a[ ] and an integer 'x'. 
         * You have to calculate the average of element a[i] and x and find out if that number exist in array or not.
         *  Do it for all the elements of array and store the count result in another array for each index i.
         */
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            int avg = (int)Math.floor((arr[i]+x)/2);
            int count = 0;
            for(int j=0; j<arr.length; j++) {
                if(avg == arr[j]) count++;
            }
            list.add(count);
        }
        return list;
    } 

    public static int minProductArray(int arr[]) {
        int ans = 1;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++) {
            ans = arr[i]*arr[i+1];
            break;
        }
        return ans;
    }

    public static int sumOfDistinct(int arr[]) {
        /*
         * Given an array, arr[] of N elements such that 
         * every element of the array is an integer in the range 1 to n,
         *  the task is to find the sum of all the distinct elements of the array.
         */

        int ans = 0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                ans += arr[i];
            }
        }
        ans += arr[arr.length-1];
        return ans;
    }

    public static int minUnsortedSubarray(int arr[]) {
        /*
         * Given an array of n distinct elements. 
         * Find the length of shortest unordered (neither increasing nor decreasing) sub array in given array.

 
         */

        for(int i=0; i<arr.length; i++) {
            if(arr[i+1] < arr[i] && arr[i+1] < arr[i+2] ||
            arr[i] < arr[i+1] && arr[i+1] > arr[i+2]) return 3;
        }
        return 0;
    }

    public static void main(String args[]) {
        
        int arr[] = {1, 5, 6, 2, 6};
        rotateArray2(arr, 2, arr.length);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
       
        
    }
}
