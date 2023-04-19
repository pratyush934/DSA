import java.net.SocketTimeoutException;
import java.util.*;

import javax.print.attribute.standard.PrinterInfo;
import javax.print.event.PrintEvent;
import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.crypto.KeySelectorResult;
import java.util.Scanner;
import java.util.function.BinaryOperator;
        /*  LINEAR SEARCH */
// public class Revision{
//     public static int search(int numbers[] , int key){
//         int n = numbers.length;
//         for(int i =0;i<n;i++){
//             if(key==numbers[i]){
//                 return i;
//             }


//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16};
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your key : ");
//         int key = sc.nextInt();
//         int index = search(numbers, key);
//         if(index == -1){
//             System.out.println("Sorry");
//         } else {
//             System.out.println("Your Index is " +index);
//         }
        


//     }
// }
/* MAXIMUM AND MINIMUM */
// public class Revision{
//     public static int max_min(int numbers[]){
//         int n = numbers.length;
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         for(int i =0;i<n;i++){
//             if(max < numbers[i]){
//                 max = numbers[i];
//             }
//             if(min > numbers[i]){
//                 min = numbers[i];
//             }
//         }
//         System.out.println("Max Number is :" + max);
//         return min;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,16,18};
//         int min = max_min(numbers);
//         System.out.println("Min number is : " + min);

    
//     }
// }
/* BINARY SEARCH */
// public class Revision{
//     public static int  binarySearch(int numbers[] , int key){
//         int start =0 , end = numbers.length - 1;

//         while(start <= end ){
//             int mid = (start + end)/2;
//             if(numbers[mid] == key){
//                 return mid;
//             }
//             if(numbers[mid]<key){
//                 start = mid + 1;
//             } else {
//                 end = mid -1;
//             }
           

//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16};
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your key : ");
//         int key = sc.nextInt();
//         int index = binarySearch(numbers, key);
//         if(index == -1){
//             System.out.println("Sorry");
//         } else {
//             System.out.println("Your Index is : " + index);
//         }

//     }
// }
/* REVERSE OF ARRAY */
// public class Revision{
//     public static void reverse(int numbers[]){
//         int first = 0 , last = numbers.length - 1;
//         while(first < last){
//             int temp = numbers[first];
//             numbers[first] = numbers[last];
//             numbers[last] = temp;
//             first++;
//             last--;

//         }
        

//                                                     /* BHAIYA PRINT KE LIYE BHI LOOP LAGANA PADTA HAI; */
//                                                     /* KRIPYA KARKE YAAD RAKHE */
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16,18};
        
//         reverse(numbers);
//         for(int i =0;i<numbers.length;i++){
//             System.out.print(numbers[i]  + " ");
//         }
    
//     }
// }
/* PAIRS */
// public class Revision{
//     public static void pairs(int numbers[]){
//         int n = numbers.length;
//         int tp = 0;
//         for(int i =0;i<n;i++){
//             int curr = numbers[i];
//             for(int j =i+1;j<n;j++){
//                 System.out.println("(" + curr + " , " + numbers[j] + ")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total pairs : " + tp);

//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16,18};
//         pairs(numbers);
//     }
// }
/*  */
// public class Revision{
//     public static void subArrays(int numbers[]){
//         int ts = 0;
//         int n = numbers.length;
//         for(int i =0;i<n;i++){
//             int start = i;
//             for(int j =i;j<n;j++){
//                 int end =j;
//                 for(int k = start ; k<=end ; k++){
//                     System.out.print(numbers[k]+" ");
//                     ts++;
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Total SubArrays : " + ts);
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};
//         subArrays(numbers);
//     }
// }
/* MAX SUM OF SUBARRAY */
// public class Revision{
//     public static void maxSubArray(int numbers[]){
//         int n = numbers.length;
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         for(int i =0;i<n;i++){
//             int start = i;
//             for(int j=i;j<n;j++){
//                 int end = j;
//                 currSum = 0;
//                 for(int k = start;k<=end;k++){
//                     currSum += currSum + numbers[k];
//                 }
//                 System.out.println(currSum);
//                 if(currSum > maxSum){
//                    maxSum = currSum;

//                 }
               
//             }
//            System.out.println();
           
//         }
//         System.out.println("Max Sum : " + maxSum);
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};
//         maxSubArray(numbers);
//     }
// }

// public class Revision{
//     public static void kadan(int numbers[]){
//         int n = numbers.length;
//         int cs = 0;
//         int ms = Integer.MIN_VALUE;

//         for(int i =0;i<n;i++){
//             cs += numbers[i];
//             if(cs<0){
//                 cs = 0;                              /* REVOLTUNIARY ALGORITHM */
//             }
        
//             ms = Math.max(ms,cs);
//         }
//         System.out.println("Max : " + ms);
        
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};
//         kadan(numbers);

//     }
// }

/* TRAPPED WATER WALA PROBLEM */
// public class Revision{
//     public static int trappedWater(int height[]) {
//         int n = height.length;
//         //leftmax
//         int leftmax[] = new int[n];
//         leftmax[0] = height[0];
//         for(int i =1;i<n;i++){
//             leftmax[i] = Math.max(height[i] , leftmax[i-1]);
//         }
//         //rightmax
//         int rightmax[] = new int[n];
//         rightmax[n-1] = height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightmax[i] = Math.max(height[i] , rightmax[i+1]);
//         }
//         int trappedWater = 0;
//         for(int i=0;i<n;i++){
//             //sorting minimum bar among big one;
//             int waterLevel = Math.min(leftmax[i], rightmax[i]);
//             // trapped water = waterLevel - height[i];
//             trappedWater += waterLevel - height[i];
//         }
//         return trappedWater;

//     }
//     public static void main(String args[]){
//         int height[]= {4,2,0,6,3,2,5};
//         System.out.println(trappedWater(height));
//     }
// }

// SHORTEST PATH

// public class Revision{
//         public static float getShortestPath(String chr){
//                 int x =0,y=0;
//                 for(int i=0;i<chr.length();i++){
//                         char dir = chr.charAt(i);
//                         if(dir == 'N'){
//                                 y++;
//                         } else if(dir == 'S'){
//                                 y--;
//                         } else if(dir == 'W'){
//                                 x--;
//                         } else {
//                                 x++;
//                         }
//                 }
//                 int X2 = x*x;
//                 int Y2 = y*y;

//                 return (float)Math.sqrt(X2+Y2);
//         }
//         public static void main(String args[]){
//                 String chr = "NSEW";

//                 System.out.println(getShortestPath(chr));

//         }
// }

/* PRINTING SUBSTRING */

// public class Placement{
//         public static String subString(String name,int si,int ei){
//                 String name1 = "";
//                 for(int i=0;i<ei;i++){
//                         name1 += name.charAt(i);
//                 }
//                 return name1;
//         }
//         public static void main(String args[]){
//                 String name = "Chutiye";
//                 System.out.println(name.substring(0,4));
//                 System.out.println(subString(name, 0, 7));


//         }
// }