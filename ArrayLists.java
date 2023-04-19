
import java.util.*;
public class ArrayLists {

    public static void introDuction() {
        /* Java Collection FrameWork */
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<String> ans1 = new ArrayList<>();
        ArrayList<Boolean> ans3 = new ArrayList<>();
        ArrayList<Float> ans4 = new ArrayList<>();

        

    }

    public static void operation() {
        ArrayList<Integer> list = new ArrayList<>();

        /* add function */
        list.add(1);
        list.add(2);
        list.add(3);

        /* get function */

        int element = list.get(2); /* 2nd index */

        /* remover function */

        list.remove(2); /* 2nd index */

        /* set element at Index */

        list.set(2, 10); /* index, storing element */

        /* contains element */

        list.contains(1); /* 1 is element not index */

        /* adding in index */

        list.add(1, 9);

        /* size */

        list.size();

        /* Sorting element */ /* ascending */
        Collections.sort(list); /* class */ /* ye use karna hai */
        /* Collection is interface */

        /* In Array -> Arrays.sort(arr) */

        /* sorting element */ /* descending */
        Collections.sort(list, Collections.reverseOrder());

        /* Compartor hai Collections.reverseOrder() */


    }

    public static ArrayList<Integer> maX(ArrayList<Integer> list) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++) {
            if(max < list.get(i)) max = list.get(i);
        }
        /* max = Math.max(max, list.get(i)) */
        ans.add(max);
        return ans;
    }

    public static void swaP(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void multiDimensional() {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4); list2.add(5); list2.add(6);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(7); list3.add(8); list3.add(9);

        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }

            System.out.println();
        }
    }

    public static void multiDimensional1() {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        /* nested Loops */
        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> cuArrayList = mainList.get(i);
            for(int j=0; j<cuArrayList.size(); j++) {
                System.out.println(cuArrayList.get(j));
            }
            System.out.println();
        }

    }

    public static int storeWater(ArrayList<Integer> height) {

        int maxWater = 0;
        /* bruteForce */ /* O(n*n) */
        for(int i=0; i<height.size(); i++) {
            for(int j=i+1; j<height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht*width;
                maxWater = Math.max(maxWater, currWater);
            }

        }
        return maxWater;
    }

    public static int storeWater1(ArrayList<Integer> height) {

        int maxWater = 0;
        /* 2-Pointer's approach */ /* O(n) */
        int lp = 0, rp = height.size()-1;

        while(lp < rp) {
            /* calculate water area */
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            /* upadat */
            if(height.get(lp) < height.get(rp)) lp++;
            else rp--;
        }

        return maxWater;
    }

    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        /* Sortes ArrayList */
        /* Brute Force */
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i)+list.get(j) == target) return true;
            }
        }

        return false;

    }

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size()-1;

        while(lp != rp) {
            /* case 1 */
            if(list.get(lp)+list.get(rp) == target ) return true;
            if(list.get(lp)+list.get(rp) < target ) lp++;
            if(list.get(lp)+list.get(rp) > target) rp--;
         }

         return false;
    }

    public static boolean pivotedArrayListSum(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)) { /* condition */
                bp = i;
                break;
            }
        }

        int lp = bp+1; /* smallest */
        int rp = bp; /* largest */

        while(lp != rp) {
            if(list.get(lp) + list.get(rp) == target) return true;
            else if(list.get(lp) + list.get(rp) < target) lp = (lp+1) % n;
            else rp = (n+rp-1) % n;
        }

        return false;
    }

    public static boolean isMonotonic(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) > list.get(i+1)) inc = false;
            if(list.get(i) < list.get(i+1)) dec = false;
        }
        return dec || inc;
    }

    public static ArrayList<Integer> loneLy(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=1; i<list.size()-1; i++) {
            if(list.get(i-1)+1 < list.get(i) && list.get(i)+1 < list.get(i+1)) {
                ans.add(i);
            }
        }

        /* corner case */
        /* 0th position ko check nahi kiya hai */
        /* n-1th position ko bhi check nahi kiya hai */
        if(list.size() == 1) {
            ans.add(list.get(0));
        } 

        if(list.size() > 1) {
        if(list.get(0)+1 < list.get(1)) {
            ans.add(list.get(0));
        }
        if(list.get(list.size()-1) > list.get(list.size()-2)+1) {
            ans.add(list.get(list.size()-1));
        }
    }

    if(ans.size() == 0) ans.add(-1);

    return ans;


    }


    public static int frequentNumber(ArrayList<Integer> list, int key) {
        /* IMPORTANT */
        int freq[] = new int[1000];
        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) == key) {
                freq[list.get(i+1)-1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<1000; i++) {
            if(freq[i] > max) {
                max = freq[i];
                ans = i+1;
            }
        }
        return ans;

    }

    public static void main1() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        //list.add(2);
        list.add(2);

        System.out.println(isMonotonic(list));
    }


    
    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        /*1, 8, 6, 2, 5, 4, 8, 3, 7 */
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        main1();

    }
}