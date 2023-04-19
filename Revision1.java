import java.util.*;

public class Revision1 {

    /* 2D Matrix HomeWork */
    public static void q1(int matrix[][]) {
        int count = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
    public static void q2(int matrix[][]) {
        int sum = 0;
        //for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                sum += matrix[1][j];
            }
       // }
        System.out.println(sum);
    }

    public static void q3(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        /* printing matrix */
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int transpose[][] = new int[cols][rows];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println();
        for(int i=0; i<cols; i++) {
            for(int j=0; j<rows; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void q4(int arr[]) {
        for(int turn = 0; turn<arr.length; turn++) {
            for(int i=0; i<arr.length-1-turn; i++) {
                if(arr[i] < arr[i+1]) {
                    /* swapping */
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void q5(int arr[]) {
        for(int i=0; i<arr.length; i++) {
           int maxPose = i;
           for(int j=i+1; j<arr.length; j++) {
            if(arr[maxPose] < arr[j]) maxPose = j;
           }
           /* swapping */
           int temp = arr[maxPose]; 
           arr[maxPose] = arr[i];
           arr[i] = temp;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void q6(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            /* insertion */
            arr[prev+1] = curr;
            
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static boolean q7(int arr[], int key) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                count++;
            }
        }
        if(count >= 2) return true;

        return false;
    }

    public static boolean q8(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int lowerCase(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a' ||
               str.charAt(i) == 'e' ||
               str.charAt(i) == 'i' ||
               str.charAt(i) == 'o' ||
               str.charAt(i) == 'u') count++;
        }
        return count;
    }

    public static void q8() {
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1)+" "+str.equals(str2));
    }

    public static void q9() {
        String str = "ApnaCollege".replace("l", "");
        System.out.println(str);
    }

    public static boolean anagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
           char[] st11 = str1.toCharArray();
           char[] st22 = str2.toCharArray();

           Arrays.sort(st11);
           Arrays.sort(st22);

           if(Arrays.equals(st11,st22)) return true;
           else return false;

        } else return false;
            
        
    }

    public static void qqq() {
        String str = "apvhckeinfj";
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
      
        // int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // System.out.println(anagram("earth", "heart"));
        qqq();
        
    }
}