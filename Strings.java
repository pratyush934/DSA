import java.io.IOException;
import java.util.*;

import javax.management.monitor.StringMonitor;

public class Strings {
    public static void declaration() {
        String name = new String("Toney");
        String name1 = "Pratyush";
        
        /* index -> str.charAt(i) */
        /* length -> str.length() */
        /* concatatination -> + */
        /* equality -> str.equals(str1) */
        /* substring -> substring(str, 0, 5) */
        /* substring for str-> str.substring(0,5) */
        /* compare -> str.compareTo(str1)
         * 0 : equal
         * - : str<str1
         * + : str1>str
         */
        /* comparetoIgnore Case */
        /* Character.toUpperCase(ch) */
    }

    public static boolean palindrome(String str) {
        int l = str.length();
        for(int i=0; i<l/2; i++) {
            if(str.charAt(i) != str.charAt(l-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean palindromeR(String str, int i, int l) {
        if(i == l) {
            return true ;
        }
        if(str.charAt(i) != str.charAt(l-i-1)) {
            return false;
        }
        return palindromeR(str, i+1, l);
    }

    public static float getShortesPath(String str) {
        int x = 0, y = 0;

        for(int i=0; i<str.length(); i++) {
            char dir = str.charAt(i);

            if(dir == 'S') y--;
            if(dir == 'N') y++;
            if(dir == 'W') x--;
            if(dir == 'E') x++;
        }
        return (float)Math.sqrt(x*x+y*y);
    }

    public static void largestString(String fruits[]) {
        String largest = fruits[0];

        for(int i=1; i<fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
     }

     public static void StringBuilder() {
        StringBuilder sb = new StringBuilder(" ");
        /* sb.toString() */
        /* sb.length() */

        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
     }

     public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i)==' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
        /* Agar string ko karna hua to str.toUpperCase() */
     }

     public static String toUpperCase2(String str) {
        /*
         * Given a string str, convert the first letter of each word in the string to uppercase. 
         */
        char ch[] = str.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for(int i=1; i<ch.length-1; i++) {
            if(ch[i] == ' ') {
                ch[i+1] = Character.toUpperCase(ch[i+1]);
            }
        }
        return new String(ch);
     }

     public static String compress(String str) {
        String newStr = "";

        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1) newStr += count.toString();

        

         }
         return newStr;
        }

        public static String modiFy(String str) {
            String ans = "";
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == ' ' && i < str.length()-1) i++;
                if(str.charAt(i) != ' ') ans += str.charAt(i);
            }
            return ans ;
            //return str.replaceAll("[ ]", "");
        }

        public static String toLowerCase(String str) {
            /*
             * Given a string S. The task is to convert characters of string to lowercase.
             */

            String ans = "";
            for(int i=0; i<str.length(); i++) {
                ans += Character.toLowerCase(str.charAt(i));
            }

            return ans;
        }

        public static String reverseString(String str) {
            /*
             * Given a String S , print the reverse of the string as output.
             */

             String ans = "";
            for(int i=str.length()-1; i>=0; i--) {
                ans += str.charAt(i);
            }

            return ans;
        }

        public static String reverseVowel(String str) {
            /*
             * Given a string consisting of lowercase english alphabets, reverse only the vowels present in it and print the resulting string.
             */

             String vow = "";
             String ans = "";
             for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                str.charAt(i) == 'u') vow += str.charAt(i);
             }

             int j = vow.length()-1;
             for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                str.charAt(i) == 'u') {
                    ans += vow.charAt(j);
                     j--;
                 } else {
                    ans += str.charAt(i);
                 }
             }

             return ans;
        }

        public static String concatenation(String str1, String str2) {
            String ans = new String(str1+str2);
            char ch[] = ans.toCharArray();
            int start = 0, end = ch.length-1;
            while(start <= end) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
            return new String(ch);
        }

        public static String delAlternate(String str) {
            String ans = "";
            for(int i=0; i<str.length(); i+=2) {
                ans += str.charAt(i);
            }

            return ans;
        }

        public static int camelCount(String str) {
            int count = 0;
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') count++;
            }

            return count;
        }

        public static String removeVowels(String str) {
            /* str.replaceAll("[kya kya replace karna hai]","kis se karna hai") */
            /* str.replace("target","kis chiz se karna hai") */
            return str.replaceAll("[aeiou]","");
        }

        public static boolean check(String str) {
            boolean ans = true;
            for(int i=0; i<str.length()-1; i++) {
                if(str.charAt(i) != str.charAt(i+1)) ans = false;

            }
            return ans;
        }

        public static String arrToStr(char[] arr) {
            String ans = "";
            for(int i=0; i<arr.length; i++) {
                ans += arr[i];
            }
            return ans;
        }

        public static int[] checkCheck(String str) {
            int u = 0, l = 0, n = 0, c = 0;
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if(ch >= 'A' && ch <= 'Z') u++;
                else if(ch >= 'a' && ch <= 'z') l++;
                else if(ch >= '0' && ch <= '9') n++;
                else c++;
            }
            int ans[] = {u, l, n, c};
            return ans;
        }

        public static String removeCharacters(String str) {
            String ans = "";
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) continue;
                else ans += ch;
            }
            return ans;
        }

        public static ArrayList<String> pattern(String str) {
            ArrayList<String> ans = new ArrayList<>();
            for(int i=0; i<str.length(); i++) {
                ans.add(str.substring(0, str.length()-i));
            }

            return ans;
        }

        public static List<String> splitString(String str) {
            List<String> list = new ArrayList<>();
            String s1 = "", s2 = "", s3 = "";
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if(ch >= 'A' && ch <= 'Z')  s1 += ch;
                else if(ch >= 'a' && ch <= 'z') s1 += ch;
                else if(ch >= '0' && ch <= '9') s2 += ch;
                else s3 += ch;
            }
            list.add(s1);
            list.add(s2);
            list.add(s3);
            if(list.size() == 0) list.add("-1");

            return list;
        }

        public static ArrayList<String> extractIntgers(String str) {
            /*
             * Given a string s, extract all the integers from str.
             */

             ArrayList<String> ans = new ArrayList<>();
             char[] arr = str.toCharArray();
             for(int i=0; i<arr.length; i++) {
                if(Character.isDigit(arr[i])) {
                    int j = i;
                    String aaa = "";
                    while(j<arr.length && Character.isDigit(arr[j])) {
                        aaa  += arr[j];
                        j++;
                    }

                    if(j == str.length()) {
                        ans.add(aaa);
                        break;
                    } else {
                        i = j;
                        ans.add(aaa);
                    }
                }
             }
             return ans;
        }

        public static String creatingTriangle(String str) {
            String ans = "";
            String ch = "";
            for(int i=0; i<str.length(); i++) {
                if(i > 0) ch+=".";
                ans += ch+str.substring(i, str.length()-1);
            }
            return ans;
        }

        public static String forntBack(String str) {
            StringBuilder ans = new StringBuilder();
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);

                if(ch >= 'A' && ch <= 'Z') {
                    ch = (char)(90+(ch-65+1)+1);
                    /* ch = (char)('Z'+'A'-ch) */

                }
                if(ch >= 'a' && ch <='z') {
                    ch = (char)(122+(ch-97+1)+1);
                    /* ch = (char)('z'+'a'-ch) */
                }
                ans.append(ch);
            }
            return ans.toString();
        }

        public static String reverseString2(String str) {
            StringBuilder ans = new StringBuilder();
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);

                if(ch == ' ') ch = ' ';
                if(ch >= 'A' && ch <= 'Z') ch = (char)('Z'+'A'-ch);
                if(ch >= 'a' && ch <= 'z') ch = (char)('z'+'a'-ch);

                ans.append(ch);
            }
            return ans.toString();
        }

        public static int convertFive(int num) {
            /*
             * You are given an integer N. You need to convert all zeroes of N to 5.
             */
            String str = Integer.toString(num);
            str = str.replaceAll("[0]", "5");
            return Integer.parseInt(str);
        }

        public static long product(int arr[], int mod) {
            /*
             * This is a functional problem. Your task is to return the product of array elements under a given modulo.
             */
            int n = arr.length;
            long ans = (long)1;
            for(int i=0; i<n; i++) {
                ans = ans*arr[i]%mod;
            }
            return ans;
        }

     public static int lastIndex(String str) {
            return str.lastIndexOf("1");
        }

     public static char maxFreq(String str) {
        /*
         * Given a string str. 
         * The task is to find the maximum occurring character in the string str.
         *  If more than one character occurs the maximum number of time then print the lexicographically smaller character.
         */

        int freq[] = new int[26];
        Arrays.fill(freq, 0);
        for(int i=0; i<str.length(); i++) {
            freq[str.charAt(i)-'a']++;
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0; i<freq.length; i++) {
            if(freq[i] > max) {
                max = freq[i];
                ans = i;
            }
        }
        return (char)(97+ans);
     }

    
    public static String removeConsecutive(String str) {
        /*
         * Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.
         */
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) != str.charAt(i-1)) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static int checkCheckCheck(String str1, String str2) {

        String n1 = "", n2 = "";
        n1 += str1.charAt(str1.length()-1);
        n2 += str2.charAt(str2.length()-1);

        int n11 = Integer.parseInt(n1);
        int n22 = Integer.parseInt(n2);
        
        return (n11 * n22) % 2 == 0 ? 1 : 0;
    }

    public static String addAleternatively(String str1, String str2) {
        /*
         * Given two strings S1 and S2 as input, 
         * the task is to merge them alternatively i.e. 
         * the first character of S1 then the first character of S2 and so on till the strings end.
         */

        StringBuilder sb = new StringBuilder();
        int i=0, j=0;
        while(i < str1.length() && j < str2.length()) {
           sb.append(str1.charAt(i));
           sb.append(str2.charAt(j));
           i++;
           j++;
        }

        if(i < str1.length()) {
            sb.append(str1.substring(i));
        }
        if(j < str2.length()) {
            sb.append(str2.substring(j));
        }
        return sb.toString();

    }

    public static int justCount(String str) {
        /*
         * Given a string of length N, made up of only uppercase characters 'R' and 'G', 
         * where 'R' stands for Red and 'G' stands for Green.
         * Find out the minimum number of characters you need to change to make the whole string of the same colour.
         * 
         */

        int n = str.length();
        int countR = 0, countG = 0;
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == 'R') countR++;
            else countG++;
        }
        int ans = Math.min(countR, countG);
        return ans;
    }

    public static String convetIt(String str) {
        /*
         * Given a string S, 
         * the task is to change the complete string to Uppercase or Lowercase depending upon the case for the first character.
         */

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        return sb.toString();
    }

    public static int modx(String str) {
        /*
         * Given a big positive number x represented as string, find value of x % 11 or x mod 11. Output is expected as an integer.
         */

        int remainder = 0;
        for(int i=0; i<str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            remainder = ((remainder*10)+digit) % 11;
        }
        return remainder;
    }

    public static boolean findSubSequence(String str1, String str2) {
        /*
         * Given two strings A and B, find if A is a subsequence of B.
         */

        boolean ans = false;
        int j=0;
        for(int i=0; i<str2.length() && j <str1.length(); i++) {
            if(str1.charAt(j) == str2.charAt(i)) j++;
        }
        if(j == str1.length()) ans = true;
        return ans;
    }

    public static String getFirstLetter(String str) {
        /*
         * Given a string S, the task is to create a string with the first letter of every word in the string.
         */

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length() ) {
                i++;
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeCharacters(String str1, String str2) {
        /*
         * Given two strings string1 and string2, 
         * remove those characters from first string(string1)
         *  which are present in second string(string2). 
         * Both the strings are different and contain only lowercase characters.
         */

        StringBuilder sb = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();

        for(int i=0; i<str2.length(); i++) {
            list.add(str2.charAt(i));
        }
        for(int i=0; i<str1.length(); i++) {
            if(!list.contains(str1.charAt(i))) {
                sb.append(str1.charAt(i));
            }
        }
        list.clear();
        return sb.toString();
    }

    public static int getPair(String str) {
        /*
         * Given a binary string S. 
         * The task is to count the number of substrings that start and end with 1. 
         * For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
         */

        int n = 0;//ans = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '1') n++;
            // if(str.charAt(i) == '1') {
            //     ans = ans +n;
            //     n++;
            // }
            // return ans;
        }
        return n*(n-1) / 2;



    }

    public static String removeCommonChar(String str1, String str2) {
        /*
         * Given two strings s1 and s2.
         *  Modify both the strings such that all the common 
         * characters of s1 and s2 are to be removed and the uncommon characters of s1 and s2 are to be concatenated.
            Note: If all characters are removed print -1.
         */

         StringBuilder sb = new StringBuilder();
         ArrayList<Character> list1 = new ArrayList<>();
         ArrayList<Character> list2 = new ArrayList<>();

         for(int i=0; i<str1.length(); i++) {
            list1.add(str1.charAt(i));
         }
         for(int i=0; i<str2.length(); i++) {
            list2.add(str2.charAt(i));
         }
         for(int i=0; i<str1.length(); i++) {
            if(!list1.contains(str1.charAt(i))) {
                sb.append(str1.charAt(i));
            }
         }
         for(int i=0; i<str2.length(); i++) {
            if(!list2.contains(str2.charAt(i))) {
                sb.append(str2.charAt(i));
            }
         }
         if(sb.length() == 0) sb.append(-1);
         list1.clear();
         list2.clear();

         return sb.toString();
    }

    public static String returnRoman(int n) {
        /*
         * Given an integer n, your task is to complete the function convertToRoman which prints the corresponding roman number of n. Various symbols and their values are given below
Note:- There are a few exceptions for some numbers like 4 in roman is IV,9 in roman is IX, similarly, 40 is XL while 90 is XC. Similarly, 400 is CD while 900 is CM

I 1
V 5
X 10
L 50
C 100
D 500
M 1000
         */
        String roman = "";
	    int value[] = {
	        1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
	    };
	    String romanvalue[] = {
	        "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"
	    };
	    
	    for(int i=0; i<value.length; i++) {
	        while(value[i] <= n) {
	            roman += romanvalue[i];
	            n -= value[i];
	        }
	        if(n == 0) break;
	    }
	    return roman;
    }

    public static int getMax(String S) throws IOException {
        /*
         * Given a alphanumeric string S, extract maximum numeric value from S.
         */
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            if(Character.isDigit(c)) {
                sb.append(c);
            } else {
                if(sb.length() > 0) {
                    int num = Integer.parseInt(sb.toString());
                    list.add(num);
                    sb.setLength(0);
                }
            }
        }
        
        if(sb.length() > 0) {
            int num = Integer.parseInt(sb.toString());
            list.add(num);
        }
        if(list.size() == 0) return -1;
        else return Collections.max(list);
    }


    public static long removeCommon(long N) {
        /*
         * Given an integer N represented in the form of a string, remove consecutive repeated digits from it.
         */

        String str = Long.toString(N);
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i-1) != str.charAt(i)) {
                sb.append(str.charAt(i));
            } else {
                continue;
            }
        }
        return Long.parseLong(sb.toString());
    }

    public static int countcharacters(String str, int N) {
        /*
         * Given a string S. 
         * Count the characters that have ‘N’ number of occurrences.
         *  If a character appears consecutively it is counted as 1 occurrence.
         */

        int freq[] = new int[26];
        Arrays.fill(freq, 0);
        char arr[] = str.toCharArray();
        freq[arr[0]-'a']++;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]) freq[arr[i]-'a']++;
        }
        int count = 0;
        for(int i=0; i<freq.length; i++) {
            if(freq[i] == N) count++;
        }
        return count;
    }

    public static int maxLen(String str) {

        /*
         * Given string s that is appended with a number at last. 
         * The task is to check whether the length of string excluding that number is equal to that number.
         */

        int len = 0;
        int num = 0;
        for(int i=0; i<str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                len++;
            }
            if(Character.isDigit(str.charAt(i))) {
                num = (num*10)+(str.charAt(i)-'0');
            }
        }
        if(len == num) return 1;
        return 0;
    }

    public static String odd2Even(String str) {
        /*
         * Given an odd number in the form of string, 
         * the task is to make largest even number possible from 
         * the given number provided one is allowed to do only one swap operation, 
         * if no such number is possible then return the input string itself.
         */

        char arr[] = str.toCharArray();
        int n = arr.length;
        int index = n-1;
        for(int i=0; i<n-1; i++) {
            if(arr[i] % 2 == 0) {
                index = i;
                if(arr[i] < arr[n-1]) {
                    break;
                }
            }
        }
        char temp = arr[n-1];
        arr[n-1] = arr[index];
        arr[index] = temp;
        return String.valueOf(arr);
    }

    public static int remainderWith7(String str) {
        /* ISKO HAMESHA YAAD RAKHEN  */
        /*
         * Given a number as string(n) , find the remainder of the number when it is divided by 7
         */
        int temp = 0;
        for(int i=0; i<str.length(); i++) {
            temp = (temp*10) +(str.charAt(i)-'0');
            temp = temp % 7;
        }
        return temp;
    }

    public static String dialPad(String str) {
        /*
         * You are given a string S of lowercase alphabet characters and
         *  the task is to find its matching decimal representation as on the shown keypad. 
         * Output the decimal representation corresponding to the string.
         *  For ex: if you are given amazon then its corresponding decimal representation will be 262966.
         */

        StringBuilder sb = new StringBuilder();
        char arr[] = str.toCharArray();
        for(int i=0; i<arr.length; i++) {
            char ch = arr[i];
            if(ch == 'a' || ch == 'b' || ch == 'c') sb.append(2);
            else if(ch == 'd' || ch == 'e' || ch == 'f') sb.append(3);
            else if(ch == 'g' || ch == 'h' || ch == 'i') sb.append(4);
            else if(ch == 'j' || ch == 'k' || ch == 'l') sb.append(5);
            else if(ch == 'm' || ch == 'n' || ch == 'o') sb.append(6);
            else if(ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') sb.append(7);
            else if(ch == 't' || ch == 'u' || ch == 'v') sb.append(8);
            else sb.append(9);
        }
        return sb.toString();
    }

    public static String removeConsonents(String str) {
        /*
         * Given a string S, remove all consonants and print the modified string that contains vowels only.
         */

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) sb.append(ch);
        }
        return sb.toString();
    }

    public static int getMaxSubstring(String str) {
        /*
         * Given a function that takes a binary string.
         *  The task is to return the longest size of contiguous substring containing only ‘1’.
         */
        int count = 0;
        int max = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '1') {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return count;
    }

    public static int checkDivisibilty(String str) {
        /*
         * Given a number N. Check whether it is divisble by 4.
         */

        int num = 0;
        for(int i=0; i<str.length(); i++) {
            num = (num*10)+(str.charAt(i)-'0');
            num = num % 4;
        }
        return num == 0 ? 1 : 0;
    }

    public static int minimizeValue(String str, int K) {
        /*
         * Given a string of lowercase alphabets and a number k, the task is to find the minimum value of the string after removal of ‘k’ characters. 
The value of a string is defined as the sum of squares of the count of each distinct character.
For example consider the string “geeks”, here frequencies of characters are g -> 1, e -> 2, k -> 1, s -> 1 and value of the string is 12 + 22 + 12 + 12 = 7
 
         */

        int freq[] = new int[26];
        Arrays.fill(freq, 0);
        for(int i=0; i<str.length(); i++) {
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0; i<K; i++) {
            int max = 0, index = 0;
            for(int j=0; j<26; j++) {
                if(freq[i] > max) {
                    max = freq[i];
                    index = i;
                }
            }
            freq[index]--;
        }
        long sum = (long)0;
        for(int i=0; i<26; i++) {
            sum += (freq[i]*freq[i]);
        }
        return (int)sum;
    } 

    public static int anagram1(String str1, String str2) {
        /*
         * Given two strings S1 and S2 . Print "1" if both strings are anagrams otherwise print "0" .

Note: An anagram of a string is another string with exactly the same quantity of each character in it, in any order.
         */

        int ans = 0;
        if(str1.length()  != str2.length()) {
            ans = 0;
        } else {
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2)) ans = 1;
            else ans = 0;
        }

        return ans;
    }

    public static int countPenaltyGoals(String str) {

        /*
         * Given a string S contains 0's, 1's, and 2's, the task is to find the number of goals on the penalty.

 '1' stands for "goal".
 '0' stands for "no goal".
 '2' stands for a foul which gives a penalty.
         */

         int count = 0;
         for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i) == '2' && str.charAt(i+1) == '1') count++;
         }
         return count;
    }

    public static boolean solveUtil(int n, int d) {
        if(n == 0 && d == 0) {
            return true;
        }
        while(n > 0) {
            int r = n % 10;
            if(r == d) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static Vector<Integer> solve(int n, int d) {
        /*
         * Given two integer number n and d.
         *  The task is to find the number between 0 to n which contain the specific digit d.
         */

         Vector<Integer> list = new Vector<>();
         for(int i=0; i<=n; i++) {
            if(solveUtil(i, d)) {
                list.add(i);
            }
         }
         if(list.size() == 0) list.add(-1);

         return list;
        
    }

    public static int lastIndex1(String str, char ch) {

        /*
         * Given a string S  and a character X, 
         * the task is to find the last index (0 based indexing) of X in string S. \
         * If no index found then the answer will be -1.


         */
        int ans = -1;
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) == ch) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static String snakeSnake(String str) {
        /*
         * Given a Sentence S of length N containing only english alphabet characters, 
         * your task is to write a program that converts the given sentence to Snake Case sentence.
         *  Snake case is the practice of writing compound words or phrases in which the elements are separated
         *  with one underscore character (_) and no spaces, and the first letter of each word written in lowercase.
         *  For ease keep all the characters in lowercase.
Note: The given sentence will not start with a Whitespace.
         */

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') ch = Character.toLowerCase(ch);
            else if(ch == ' ') ch = '_';
            sb.append(ch);
        }
        return sb.toString();

    }

    public static int checkDivisibilty11(String str) {
        /*
         * Given a number S. Check whether it is divisble by 11 or not.
         */
        long num = (long)0;
        for(int i=0; i<str.length(); i++) {
            num = (num*10)+(str.charAt(i)-'0');
            num = num % 11;
        }
        return (int)num == 0 ? 1 : 0;
     }

     public static String removeSpecialChar(String str) {
        /*
         * Given a string S, remove all the characters other than the alphabets.
         */
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') sb.append(ch);
            else if(ch >= 'a' && ch <= 'z') sb.append(ch);
        }
        if(sb.length() == 0) sb.append(-1);
        return sb.toString();
     }

     public static String stonePaper(String str) {
        /*
         * The RPS world championship is here. Here two players A and B play the game. You need to determine who wins.
Both players can choose moves from the set {R,P,S}.
The game is a draw if both players choose the same item.
The winning rules of RPS are given below:

Rock crushes scissor
Scissor cuts paper
Paper envelops rock
         */

        StringBuilder sb = new StringBuilder();

        char arr[] = str.toCharArray();
        if(arr[0] == arr[1]) sb.append("DRAW");
        else if(arr[0] == 'R' && arr[1] == 'S') sb.append("A");
        else if(arr[0] == 'S' && arr[1] == 'R') sb.append("B");
        else if(arr[0] == 'S' && arr[1] == 'P') sb.append("A");
        else if(arr[0] == 'P' && arr[1] == 'S') sb.append("B");
        else if(arr[0] == 'P' && arr[1] == 'R') sb.append("A");
        else if(arr[0] == 'R' && arr[1] == 'P') sb.append("B");

        return sb.toString();
     }

     public static long finDiff(long n) {
        /*
         * Pappu is confused between 6 & 9.
         *  He works in the billing department of abc company and 
         * his work is to return the remaining amount to the customers. 
         * If the actual remaining amount is given we need to find 
         * the maximum possible extra amount given by the pappu to the customers.
         */

         long pappu = (long)0;
         long num = n;
         while(num > 0) {
            long r = num % 10;
            if(r == 6) r = 9;
            pappu = (pappu*10)+r;
            num /= 10;
         }
         StringBuilder sb = new StringBuilder(Long.toString(pappu));
         sb.reverse();

         pappu = Long.parseLong(sb.toString());
         return pappu - n;
     }

     public static long findDiff1(long n) {
        /*
         * Technique 2
         */
        String temp = ""+n;
        temp = temp.replaceAll("6", "9");
        return Long.parseLong(temp)-n;
     }

     public static String magicalString(String str) {
        /*
         * You are given a string S, convert it into a magical string.
A string can be made into a magical string if the alphabets are swapped in the given manner: a->z or z->a, b->y or y->b, and so on.  
         */

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                sb.append((char)('a'+'z'-ch));
            }
        }
        return sb.toString();
     }

     public static void triangle(String str) {
        /*
         * Given string str of a constant length, print a triangle out of it. 
         * The triangle should start with the first character of the string and 
         * keep growing downwards by adding one character from the string.
The spaces on the left side of the triangle should be replaced with a dot character. 
         */

        int n = str.length();
        for(int i=1; i<=n; i++) {
            for(int k= n-i; k>0; k--) {
                System.out.print('.');
            }
            System.out.println(str.substring(0, i));
        }
     }

     public static ArrayList<Integer> countcount(String str) {
        /*
         * Given a string containing multiple words, count the characters in each word and display them.
         */

        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' ') count++;
            else if(ch == ' ' || i == str.length()-1) {
                ans.add(count);
                count = 0;
            }
        }
        return ans;
     }

     public static long findMaxx(String str) {
        /*
         * Given a string S of digits(0-9).
         * Find the maximum value that can be obtained from the string by putting either '*' or '+' 
         * operators in between the digits while traversing from left to right of the string and picking up a single digit at a time.
         */

        long ans = (long)(str.charAt(0)-'0');
        for(int i=1; i<str.length(); i++) {
            long ll = (long)(str.charAt(i)-'0');
            long num = Math.max(ll*ans,ll+ans);
            ans = num;
        }
        return ans;
     }

     public static int checkperfectSquare(String str) {
        /*
         * You are given a string S.
         *  Your task is to determine if the sum of ASCII values of all character
         *  results in a perfect square or not. If it is a perfect square then the answer is 1, otherwise 0.
         */
        int num = 0;
        for(int i=0; i<str.length(); i++) {
            num = (int)(num+str.charAt(i));
        }
        return Math.pow((int)Math.sqrt(num), 2) == num ? 1 : 0 ;
     }

     public static boolean checkFreq(String str) {
        /*
         * Given a string S, find whether it fulfills the following criteria. 
When split from the middle, the string should give two halves having the same 
characters and same frequency of each character. 
If the number of characters in the string is odd, ignore the middle character.


         */
        int freq[] = new int[26];
        int i =0;
        int n = str.length()-1;
        while(i < n) {
            freq[str.charAt(i)-'a']++;
            freq[str.charAt(n)-'a']--;
            i++;
            n--;
        }
        for(int j=0; j<26; j++) {
            if(freq[i] != 0) {
                return false;
            }
        }
        return true;
     }

     public static String shortestPath(String str) {
        /*
         * A person wants to go from origin to a particular location, 
         * he can move in only 4 directions(i.e East, West, North, South) but his friend gave
         *  him a long route, help a person to find minimum Moves so that he can reach to the destination.

Note: You need to print the lexicographically sorted string. Assume the string will have only ‘E’ ‘N’ ‘S’ ‘W’ characters.
         */

        int x = 0;
        int y = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'N') y++;
            else if(ch == 'S') y--;
            else if(ch == 'E') x++;
            else if(ch == 'W') x--;
        }
        StringBuilder sb = new StringBuilder();
        while(x != 0 || y != 0) {
            if(x > 0) {
                sb.append('E');
                x--;
            } else if(x < 0) {
                sb.append('W');
                x++;
            } else if(y > 0) {
                sb.append('N');
                y--;
            } else {
                sb.append('S');
                y++;
            }
        }
        char arr[] = (sb.toString()).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
     }

     public static String goodString(String str) {
        /*
         * Given a string s of length N, you have to tell whether it is good or not.
         *  A good string is one where the distance between every two adjacent character is exactly 1. 
         * Here distance is defined by minimum distance between two 
         * character when alphabets from 'a' to 'z' are put in cyclic manner. 
         * For example distance between 'a' to 'c' is 2 and distance between 
         * 'a' to 'y' is also 2. The task is to print "YES" or "NO" (without quotes) 
         * depending on whether the given string is Good or not.
         */
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)) return "NO";
        }
        return "YES";
     }

     public static long findSum(long N) {
        /*
         * Given a number N. You can perform an operation on it 
         * multiple times, in which you can change digit 5 to 6 and vice versa.
You have to return the sum of the maximum number and the minimum
 number which can be obtained by performing such operations.
         */

         String str = String.valueOf(N);
         String str1 = new String(str);

         str = str.replaceAll("5", "6");
         str1 = str1.replaceAll("6", "5");

         return (long)(Long.parseLong(str)+Long.parseLong(str1));
     }

    public static void main(String args[]) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int j = scan.nextInt();
        double e = scan.nextDouble();
       
        //Scanner sc = new Scanner(System.in);
        scan.nextLine();
        String s1 = scan.nextLine();
        
        System.out.println(i+j);
        System.out.println(d+e);
        System.out.println(s.concat(s1));
        
    }
}



