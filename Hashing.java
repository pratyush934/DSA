import java.util.*;

public class Hashing {

    public static void creatingHashMap() {

        /* Create */
        HashMap<String, Integer> hm = new HashMap<>();

        /* Insert O(1) */
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 50);

        System.out.println(hm);

        /* Get O(1) */
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        /* Contains Key O(1) */

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        /* Remove O(1) */
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        /* Size O(1) */
        System.out.println(hm.size());

        /* IsEmpty O(1) */
        System.out.println(hm.isEmpty());

        /* Clear */
        hm.clear();
        System.out.println(hm.isEmpty());
    }

    public static void iterationSet() {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        /* Iterate */
        /* Set<dataType> variable = hm.keySet() */
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key=" +k+ ",value="+hm.get(k));
        }
        

    }

    public static void linkedHash() {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("China", 120);
        lhm.put("US", 123);
        lhm.put("Indonesia", 130);

        System.out.println(lhm);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 150);
        tm.put("China", 120);
        tm.put("US", 123);
        tm.put("Indonesia", 130);

        System.out.println(tm);
    }

    public static void majorityElement() {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if(map.get(key) > arr.length/3) {
                System.out.println(key);
            }
        }
    }

    public static void majorityElement1() {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            /* Shortcut for if-else condition in map */
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        
       /*  Set<Integer> keySet = map.keySet(); */
       /* Sortcut as replacing keySet variable with actual function */
        for (Integer key : map.keySet()) {
            if(map.get(key) > arr.length/3) {
                System.out.println(key);
            }
        }
    }

    public static boolean isAnangram() { /* O(n) */
        
        String s = "race";
        String t = "care";

        if(s.length() != t.length())
        System.out.println("Sorry");

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            /* char ch = s.charAt(i); */
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            if(map.get(ch) != null) {
                if(map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch)-1);
                }
            } else {
                return false;
            }
        }

       if(map.isEmpty()) {
        System.out.println("True");
       } else {
        System.out.println("Sorry");
       }
       return map.isEmpty();
    }

    public static void hashSet() {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(1);

        /* Printing Set */
        System.out.println(set);
        /* Clearing Set */
        set.clear();
        /* Checking whether set is Empty or Not */
        System.out.println(set.isEmpty());
        /* Geting size */
        System.out.println(set.size());
        /* Removing */
        set.remove(2);
        
    }

    public static void iterators() {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        /* Technique 1 */
        Iterator it = cities.iterator();
        while(it.hasNext()) {
            System.out.println(it.next()+"\n\n");
        }

        /* Technique 2 */
        for (String city : cities) {
            System.out.println(city);
        }
    }

    public static void linkedHashset() {

        /* Random Printing */
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities+"\n\n");

        /* As It is */
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs+"\n\n");

        /* SOrted Order */
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts+"\n\n");

        /* FUNCTION SAARE SAME HOTE HAI   */
    }

    public static void countingDistinct() {
        int num[] = {4, 3, 2, 5, 6, 77, 3, 4, 2, 1};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<num.length; i++) {
            set.add(num[i]);
        }

        System.out.println(set.size());
    }

    public static void union_intersection() {

        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        /* Union */
        for(int i=0; i<arr1.length; i++) {
             set.add(arr1[i]);
             
        }
        

        for(int i=0; i<arr2.length; i++) {
            set.add(arr2[i]);
            
        }
       System.out.println(set);
        System.out.println("Union = "+set.size());

        /* Intersection */
        set.clear();

        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        int count = 0;
        for(int i=0; i<arr2.length; i++) {
            if(set.contains(arr2[i])) {
                count++;
                int x = arr2[i];
                System.out.print("["+x+" ");
                set.remove(x);
            }
        }
        System.out.println("]\nIntersection = "+ count);

    }
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }
        for (String key  : tickets.keySet()) {
            if(!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }
    public static void journey() {

        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai"," Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi","Goa");

        String start = getStart(tickets);
        System.out.print(start);

        for (String key  : tickets.keySet()) {
            System.out.print(" --> " + tickets.get(start));
            start = tickets.get(start);
        }
    }

    public static void largestSubarray() {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        HashMap<Integer, Integer> map = new HashMap<>();
        /* (Sum, idx) */

        int sum = 0;
        int len = 0;

        for(int j=0; j<arr.length; j++) {
            sum += arr[j];
            if(map.containsKey(sum)) {
                len = Math.max(len, j-map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        System.out.println("Ans : "+len);
    }

    public static void subArray() {
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        /* (Sum, Count) */
        map.put(0,1);

        int sum = 0;
        int ans = 0;

        for(int j=0; j<arr.length; j++) {
            sum += arr[j]; /* Sum(j) */
            if(map.containsKey(sum-k)) {
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);
    }

    public static void main(String args[]) {
     subArray();
    }
}