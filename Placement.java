import java.net.SocketTimeoutException;
import java.util.*; /* IMPORTANT */
import java.util.ArrayList; /* IMPORTANT */
import java.util.LinkedList; /* IMPORTANT */

import javax.naming.PartialResultException;
import javax.print.attribute.standard.PrinterInfo;
import javax.print.event.PrintEvent;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.text.AbstractDocument.LeafElement;
import javax.xml.crypto.KeySelectorResult;
import java.util.Scanner;
import java.io.FileReader;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.ref.Cleaner;
import java.lang.reflect.Field;
import java.util.Arrays; /* IMPORTANT */
import java.util.Collections; /* IMPORTANT */


        /* 1 */
        // System.out.println("Hello World");
        // System.out.println("*****************");
        // System.out.println("**I am Pratyush**");
        // System.out.println("*****************");

        // System.out.println("My Placement Journey has just began");
        // System.out.println("I have to work Hard in order to get good placement");
        // System.out.println("I Hope best for my upcoming time");



        /* 2 */
        // Scanner sc = new Scanner(System.in);
        // System.out.println("***************");
        // System.out.println("******SUM******");
        // System.out.println("***************");
        // System.out.print("Enter your No. Here : ");


        // int n = sc.nextInt();
        // int sum = 0;


        // for(int i=1;i<=n;i++){

        //     sum = sum + i;
            
        // }
        // System.out.println(sum);

        /* Lecture 2 */

       // public class Placement {

            // public static void main(String args[]) {
               
                //Scanner sc = new Scanner(System.in);
                // String input = sc.next();
                // String input = sc.nextLine();
                // int number = sc.nextInt();
                // System.out.println("*************" );
                // System.out.println("*****SUM*****");
                // System.out.println("*************");

                // System.out.print("Enter No. a : ");

                // int a = sc.nextInt();

                // System.out.print("Enter No. b : ");

                // int b = sc.nextInt();

                // int sum = a + b ;
                // System.out.print("Sum of a and b is :  ");
                // System.out.println(sum);

                // Scanner sc = new Scanner(System.in);

                // System.out.println("***********");
                // System.out.println("**PRODUCT**");
                // System.out.println("***********");

                // System.out.print("Enter No. : ");

                // int a = sc.nextInt();

                // System.out.print(" Enter No. : ");

                // int b = sc.nextInt();

                // int product = a * b ;
                // System.out.print("Product of No. is :  ");
                // System.out.println(product);

            //     Scanner sc = new Scanner(System.in);

            //     System.out.println("**********");
            //     System.out.println("***AREA***");
            //     System.out.println("**********");

            //     System.out.print(" Enter Radius : ");
            //     float radius = sc.nextFloat();

            //     double Area = 3.14 * radius * radius ;
            //     System.out.print("Area is : ");
            //     System.out.println(Area);

            // }


            /* LECTURE 3  */

            // public class Placement{
            //     public static void main(String args[]){
            //        int A = 10;

            //        A += 10; // A = A +10
            //        System.out.println(A);
            //     }
            // }

            /* LECTURE 4 */
                /* 
            public class Placement{
                public static void main(String args[]){

                    Scanner sc = new Scanner(System.in);

                    System.out.println("************* ");
                    System.out.println("****CHECK**** ");
                    System.out.println("************* ");
                    System.out.print(" Enter Your Age : ");
                    int age = sc.nextInt();
                    if(age >= 18 && age <= 25){
                        System.out.println("Focus on Career");

                    } else if (age >= 13 && age <= 17) {
                        System.out.println("Be Concious");
                    
                    }else { 
                        System.out.println("Enjoy Your Life");
                    }
                }
            }
            */
            /* 
            public class Placement{
                public static void main(String args[]){

                    Scanner sc = new Scanner(System.in);
                    System.out.println("*************");
                    System.out.println("****CHECK****");
                    System.out.println("*************");
                    System.out.print("Enter No. a : ");
                    int a = sc.nextInt();
                    System.out.print("Enter No. b : ");
                    int b = sc.nextInt();

                    if(a>=b){
                        System.out.println( "Largest No. : a " + (a));
                    } else {
                        System.out.println("Largest No. : b " + (b));
                    }
                }
            }
            */
            /* 
            public class Placement{
                public static void main(String args[]){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("*************");
                    System.out.println("****CHECK****");
                    System.out.println("*************");
                    System.out.print("Enter Your No. : ");
                    int Number = sc.nextInt();
                    if(Number % 2 != 0){
                        System.out.println("Odd");


                    } else {
                        System.out.println("Even");
                    }
                }
            }
            */
            /* 
            public class Placement{
                public static void main(String args[]){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("*************");
                    System.out.println("****CHECK****");
                    System.out.println("*************");
                    System.out.println("Enter Your Income : ");
                    double Income = sc.nextDouble();
                    int tax;
                    if(Income <= 500000){
                        tax = 0;
                    } else if(Income >= 500000 && Income <=1000000){
                        tax = (int) (Income * 0.2);
                    } else {
                        tax = (int) (Income * 0.3);
                    }
                    System.out.print("Your Tax is : " + tax);
                } 
            }
            */
            /* 
            public class Placement{
                public static void main(String args[]){

                    Scanner sc = new Scanner(System.in);
                    System.out.println("*************");
                    System.out.println("**THEEK HAI**");
                    System.out.println("*************");
                    System.out.print("Enter A : ");
                    int A = sc.nextInt();
                    System.out.print("Enter B : ");
                    int B = sc.nextInt();
                    System.out.print("Enter C : ");
                    int C = sc.nextInt();

                    if(A>= B && A>= C ){
                        System.out.println("Largest No : " + A);
                    } else if(B>=C){
                        System.out.println("Largest No. : " + B);
                    } else {[]
                        System.out.println("Largest No. : " + C);
                    }
                }
            }
*/
/* 
 public class Placement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number) {
            case 1 : System.out.println("samosa");
            break;
            case 2 : System.out.println("burger");
            break;
            case 3 : System.out.println("mango shake");
            break;
            default : System.out.println("Wake Up");
        }

    }
 }
 */
/* 
public class Placement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("**************");
        System.out.println("**CALCULATOR**");
        System.out.println("**************");
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter Operator : ");
        char operators = sc.next().charAt(0);

        switch(operators) {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a % b);
            break;
            default : System.out.println("Not so Advance");

        }


    }
} */

/* LECTURE 5 *//* LoopS */ 
/*"**********************************" */
/* "**********************************" */
/* " *********************************** " */
// public class Placement{
//     public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your No. : ");
        // int n = sc.nextInt();
        // int sum = 0;

        // int i = 1;
        // while(i<=n){

        //     sum = sum + i;
           
        //     i++;
        // }
        // System.out.println(sum);

        // int n = 10899;
        // while( n>0) {
        //     int lastdigit = n % 10;
        //     System.out.print(lastdigit);
        //     n = n / 10; //n/ = 10
        // }
        //     System.out.println();
            /* Important */
        // int n = 10899;
        // int rev = 0;
        // while(n>0){
        //     int lastdigit = n % 10;
        //     rev = (rev*10) + lastdigit;
        //     n = n/10;

        // }
        // System.out.println(rev);
            /* Break */
        // for(int i = 1 ; i <= 5 ; i++){
        //     if(i == 3){
        //         break;
        //     }
        //     System.out.println("Hello World");
        // }
            /* Break */
    //    Scanner sc = new Scanner(System.in);
      
    //    do{
    //     System.out.println("Enter Your No. : ");
    //     int n = sc.nextInt();

    //     if( n % 10 == 0) {
    //         break;
    //     }
    //     System.out.println(n);
    //    } while(true);


    //  Scanner sc = new Scanner(System.in);
    //  System.out.print("Enter Your No. : ");
    //  int n = sc.nextInt();

    //  for(int i =2 ; i<n ; i++){
    //     if( n % i == 0){                                /* GALAT LOGIC */
    //         System.out.println("Not Prime");
    //         break;
            
    //     } else if(n % i !=0){
    //         System.out.println("Prime");
    //         break;
            
    //     }
    //  }
    
    /* Lecture 6 */
              // NESTED LOOPS
    // public class Practice{
    //     public static void main(String args[]){
    //         for(int line = 1;line <=4 ; line++){
    //             /*one line */
    //             for(int star = 1 ; star<=line ; star++){
    //                 System.out.print("*");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }

    // public class Placement{
    //     public static void main(String args[]){
    //         for(int line = 1 ; line<=4 ; line++){
    //             for(int star =1 ; star<= 5 - line; star++){
    //                 System.out.print("*");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }


    // public class Placement{
    //     public static void main(String args[]){
    //         int n = 5;
    //         for(int i = 1; i<= n ; i++){
    //             for(int j = 1; j<=i ; j++){
    //                 System.out.print(j);
    //             }
    //             System.out.println();
    //         }
    //     }
    // }



    // public class Placement{
    //     public static void main(String args[]){
    //         int n = 4;
    //         char ch = 'A';
    //         for(int i = 1; i<=n ; i++){
    //             for(int j = 1; j<=i ; j++){
    //                 System.out.print(ch);
    //                 ch++;
    //             }
    //             System.out.println();
    //         }
    //     }
    // }

        /* LECTURE 7 */ /* "************************************" */
                        /* " ***********************************" */
                        /* " ************************************" */
                        /* "**************************************" */
                            
        /* 1 */
        // public class Placement{

        //     public static int printSum(int a , int b){
               
        //         int sum = a + b;
        //         return sum;
                

        //     }

        //     public static void printHello(){
        //       System.out.println("*************");
        //       System.out.println("*************");
        //       System.out.println("*************");
        //       System.out.println("*************");
        //         return ;

        //     }
        //     public static void printSwap(int a , int b){
        //         int temp = a;
        //         a = b;
        //         b = temp;
        //         System.out.println("a = " + a);
        //         System.out.println("b = " + b);


                
        //     }


            
        //     public static void main(String args[]){

        //         //printHello();

        //         Scanner sc = new Scanner(System.in);
        //         System.out.print("Enter No. a : ");
        //         int a = sc.nextInt();
        //         System.out.print("Enter No. b : ");
                // int b = sc.nextInt();
                
                // printSwap(a,b);
       // }
  //  }

  /* 2 */ /* Product */
//   public class Placement{

//     public static void calculateProduct(int a , int b){
//         int product = a * b;
//         System.out.println("Your Product is : " + product);
//     }
    

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value a = ");
//         int a = sc.nextInt();
//         System.out.print("Enter value b = ");
//         int b = sc.nextInt();

//         calculateProduct(a, b);

//     }
//   }

/* 3  */ /* Product Technique 2 */
// public class Placement{

//     public static int calculateProduct(int a ,int b){
//         int product = a * b;
//         return product;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a : ");
//         int a = sc.nextInt();
//         System.out.print("Enter b : ");
//         int b = sc.nextInt();

//         int prod = calculateProduct(a,b);
//         System.out.println("Your Product is : " + prod);

//     }
// }
/* 4  */ /* Factorial */
// public class Placement{

//     public static void printFactorial(int n){
//         int factorial = 1;
//         if(n<=0){
//             System.out.println("Invalid no.");
//             return;
//         } else {
//             for(int i = 1 ; i<=n ; i++){
//                 factorial = factorial * i;
//             }
//             System.out.println(factorial);
//         }
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your No. : ");
//         int n = sc.nextInt();


//         printFactorial(n);

//     }
// }
/* 5 */ /* Bionmial Coefficient */
// public class Placement{
//     public static int factorial(int n){
//         int f = 1;
//         if(n < 0){
//             System.out.println("Invalid No.");
//         } else {
//             for(int i = 1 ;i<=n ; i++){
//                 f = f * i;

//             }
            
//         }
//         return f;
//     }
//     public static int binCoeff(int n, int r){
//         int n_fact = factorial(n);
//         int r_fact = factorial(r);
//         int nmr_fact = factorial(n-r);

//         int bCo = n_fact/(r_fact *nmr_fact);
        
//         return bCo;

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         System.out.print("Enter r : ");
//         int r = sc.nextInt();
//         int end = binCoeff(n,r);
//         System.out.println("Result : " + end);

//     }
// }
/* 6 */ /* KUCH BHI */
// public class Placement{
//     public static int sum(int a , int b ){
//         return a + b;
//     }
//     public static int sum(int a , int b , int c ){
//         return a+ b+ c;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println(sum(3,5));
//         System.out.println(sum(3,6,7));

//     }
// }
/* 8 */
// public class Placement{
//     public static int sum(int a , int b){
//         return a + b;
//     }
//     public static float sum(float a , float b){
//         return a + b;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(3,5));
//         System.out.println(sum(6.31f,8.25f));

//     }
// }
            
/* 9 */

// public class Placement{

//     public static boolean isPrime(int n){

//         /* corner case */
//         if(n ==2){
//             return true;
//         }
//         boolean isPrime = true;
//         for(int i = 2;i<=n-1; i++) {
//             if(n % i ==0){
//                 isPrime = false;
//                 break;
//             }
            
//         }
//         return isPrime;
//     }
//     public static void main(String args[]){
//         System.out.println(isPrime(2));
//     }
// }

/* 10 */ /* *******IMPORTANT********** */
// public class Placement{
//     public static boolean isPrime(int n){
//        boolean isPrime = true;
//         for(int i =2; i<=n-1 ; i++){
//             if(n % i == 0){
//                 isPrime = false;
//                 break;
//             } 
//         }
//         return isPrime ;
//     }
//     public static void priesInRange(int n) {
//         for(int i =2;i<=n;i++){
//             if(isPrime(i)){
//                 System.out.println(i + " ");
//             }
//         }
//     }
//     public static void main(String args[]){
//         priesInRange(100);

//     }
// }
/* BINARY TO DECIAL */ /* ***************** */
/*********IMPORTANT*********** */
// public class Placement{
//     public static void binToDec(int binNum){
//         int myNum = binNum;
//         int pow = 0;
//         int decNum = 0;

//         while(binNum > 0) {
//             int lastDigit = binNum % 10;
//             decNum = decNum + (lastDigit *(int) Math.pow(2,pow));

//             pow++;
//             binNum = binNum/10;
//         }
//         System.out.println("decimal of " + myNum +" = " + decNum);
//     }
//     public static void decToBin(int n){
//         int myNum = n;
//         int pow = 0;
//         int binNum = 0;

//         while(n > 0) {
//             int rem = n % 2;
//             binNum = binNum + (rem * (int)Math.pow(10, pow));
//             pow++;
//             n = n/2;
//         }
//         System.out.println("binary form of " + myNum + " = " + binNum);
//     }
//     public static void main(String args[]){
//        // binToDec(101);
//        decToBin(5);
//     }
// }


/* LECTURE  */ /* PATTERN */
/* ***************************************** */
/* ***************************************** */
/* ***************************************** */


// public class Placement{


    /* Question 1 */
    // public static void hollow_rectangle(int totRows, int totCols){
    //     for(int i =1 ; i<=totRows ; i++){
    //         for(int j =1; j<=totCols ; j++){
    //             if(i==1 || j ==1 || i == totRows || j == totCols){
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    /* Question 2 */
    // public static void inverted_rotated_half_pyramid(int n){
       
    //     for(int i =1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j =1; j<=i ; j++){
    //             System.out.print("*");
                
    //         }
    //         System.out.println();
    //     }
    // }
    /* Question 3*/
    //public static void inverted_half_pyramid(int n){
        /* Technique 1 */
    //     for(int i =n; i>=1 ;i--){
    //         for(int j = 1 ;j<=i ;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }
    /* Technique 2 */
//     for(int i =1;i<=n;i++){
//         for(int j =1;j<=n-i+1;j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }
// public static void floyd_triangle(int n){
//     int s = 1;
//     for(int i =1;i<=n;i++){
//         for(int j =1;j<=i;j++){
//             System.out.print(s +" ");
//             s++;
//         }
//         System.out.println();
//     }
// }
/* Question 5 */
// public static void Triangle_0_1(int n){
//     for(int i = 1; i<=n ; i++){
//         for(int j = 1; j<=i ; j++){
//             if((i+j) % 2 ==0){
//                 System.out.print("1");
//             } else {
//                 System.out.print("0");
//             }
//         }
//         System.out.println();
//     }

// }
/* Question 6 */
// public static void Butterfly_pattern(int n){
//     for(int i =1;i<=n;i++){
//         for(int j = 1;j<=i;j++){
//             System.out.print(" * ");
//         }
//         for(int j =1;j<=2*(n-i) ; j++){
//             System.out.print("   ");
//         }
//         for(int j =1;j<=i;j++){
//             System.out.print(" * ");
//         }
//         System.out.println();
//     }
//     for(int i =n;i>=1;i--){
//         for(int j = 1;j<=i;j++){
//             System.out.print(" * ");
//         }
//         for(int j =1;j<=2*(n-i) ; j++){
//             System.out.print("   ");
//         }
//         for(int j =1;j<=i;j++){
//             System.out.print(" * ");
//         }
//         System.out.println();
//     }
// }
/* Question 7 */
// public static void rhombus(int n){
//     for(int i =1;i<=n;i++){
//         for(int j =1;j<=n-i;j++){
//             System.out.print("   ");
//         }
//         for(int j =1;j<=n ;j++){
//             System.out.print(" * ");
//         }
//         System.out.println();
//     }
// }
/* Question 7 */
// public static void hollow_rhombus(int n){
//     for(int i =1;i<=n;i++){
//         for(int j =1;j<=(n-i);j++){
//             System.out.print(" ");
//         }
        
//         for(int j =1;j<=n;j++){
//             if(i ==1||i==n||j==1||j==n){
//                 System.out.print("*");
//             } else {
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//         }
//     }
/* Question 8 */
// public static void diamond(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print("   ");
    
//         }
//         for(int j=1;j<=2*i-1;j++){
//             System.out.print(" * ");
//         }
//         System.out.println();
//     }
//     for(int i=n;i>=1;i--){
//         for(int j=1;j<=n-i;j++){
//             System.out.print("   ");
    
//         }
//         for(int j=1;j<=2*i-1;j++){
//             System.out.print(" * ");
//         }
//         System.out.println();
//     }
// }

    // public static void main(String args[]){
        //hollow_rectangle(8 ,8);
        //inverted_rotated_half_pyramid(5);
        //inverted_half_pyramid(5);
        // floyd_triangle(5);
        // Triangle_0_1(5);
        // Butterfly_pattern(5);
        // rhombus(5);
        // hollow_rhombus(5);
        // diamond(5);

    // }
// }

/* LECTURE 9 */ /* DATA STRUCTURE */ /* ARRAYS */
/* ****************************** */
/* ****************************** */
/* ****************************** */
 /* Important */ /* */
//  public class Placement{
//     public static void main(String args[]){
//         // int marks[] = new int[50];

//         // int numbers[] = {1,2,3}; 

//         // int moreNumbers[] = {4,5,6};

//         // string fruits[] = {"apple" , "mango" , "orange"};



//     }
//  }
// public class Placement{
//     public static void main(String args[]){

//         int marks[] = new int[10];
//         Scanner sc = new Scanner(System.in);

//         System.out.println(marks.length);
//         // System.out.print("Phy marks : ");
//         //  marks[0] = sc.nextInt();
//         // System.out.print("Chem marks : ");
//         //  marks[1] = sc.nextInt();
//         // System.out.print("Math marks : ");
//         //  marks[2] = sc.nextInt();

//         //  System.out.println(marks[0]);
//         //  System.out.println(marks[1]);
//         //  System.out.println(marks[2]);
//         //  marks[2] = marks[2]+ 10;
//         //  System.out.println(marks[2]);

//         //  int percentage = (marks[0] + marks[1] + marks[2])/3 ;
//         //  System.out.println(percentage+"%");

//     }
// }
/* ARRAY ME ADD YA PRINT YA SCAN SABME LOOPS KI JARURAT */

// 
/* LINEAR SEARCH */ /* **************** */
                    /* **************** */

// public class Placement{
//     public static int linearSearch(int numbers[] , int key){
//         for(int i =0;i<numbers.length;i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16,18};
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your Choice : ");
//         int key = sc.nextInt();
//         int index = linearSearch(numbers, key);
//         if(index == -1){
//             System.out.println("Sorry Not available");
//         } else {
//             System.out.println("Index is : " + index);
            

//         }
        

    // }
// }

// public class Placement{
//     public static int largestNumber(int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;


//         for(int i =0;i<numbers.length;i++){
//             if(largest < numbers[i]){
//                 largest = numbers[i];
//             }
//             if(smallest> numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("Largest is : " + largest);
//         return smallest;
//     }
//     public static void main(String args[]){
//         int numbers[] = {1,2,6,3,5};

//         System.out.println("Smallest :  "  + largestNumber(numbers));
//     }
// }
//* BINARY SEARCH (ALWAYS BETTER THAN LINEAR SEARCH) */
// public class Placement{
//     public static int binearySearch(int numbers[] , int key){
//         int start = 0, end = numbers.length-1;

//         while(start<=end){
//             int mid  = (start + end) /2;

//             if(numbers[mid] == key){
//                 return mid;
//             }
//             if(numbers[mid] < key) {
//                 start = mid +1;
//             } else {
//                 end = mid -1;

//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16,18,20};
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your key : ");
//         int key = sc.nextInt();

//         System.out.println("index : " + binearySearch(numbers, key));

//     }
// }

/*  REVERSE OF ARRAY */
// public class Placement{
   
//     public static void rev(int numbers[]){
//         int first = 0, last = numbers.length-1;

//         while(first < last){
//             // swap
//             int s = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = s;

//             first++;
//             last--;
//         }
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14};

//         rev(numbers);

//         for(int i =0;i<numbers.length;i++){
//             System.out.print(numbers[i] + " ");
//         }
//         System.out.println();
//     }
// }
        /* PAIRS  */ /* VERY IMPORTANT */
// public class Placement{
//     public static void printPairs(int numbers[]){
//         int tp = 0;
//         for(int i =0;i<numbers.length;i++){
//             int curr = numbers[i];
//             for(int j = i+1;j<numbers.length;j++){
//                 System.out.print("(" + curr + "," + numbers[j] + ") " );
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs : " + tp);
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};
//         printPairs(numbers);


//     }
// }

 /* SUBARRAYS */ /* IMPORTANT */
//  public class Placement{
//     public static void subArrays(int numbers[]){
//         int ts = 0;
//         for(int i =0;i<numbers.length;i++){
//             int start = i;
//             for(int j =i;j<numbers.length;j++){
//                 int end = j;
//                 for(int k=start;k<=end;k++){
//                     System.out.print(numbers[k]+" ");
//                     ts++;
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Total No. : " + ts);

//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};
//         subArrays(numbers);

//     }
//  }

/* Technique 1 */ /* Max Subarray */ 
// public class Placement{
//         public static void maxsubArrays(int numbers[]){

//             int currSum = 0;
//             int maxSum = Integer.MIN_VALUE;

//             for(int i =0;i<numbers.length;i++){
//                 int start = i;
//                 for(int j =i;j<numbers.length;j++){
//                     int end = j;
//                     currSum = 0;
//                     for(int k=start;k<=end;k++){
//                         currSum += numbers[k];
//                     }
//                     System.out.println(currSum);
//                     if(maxSum < currSum){
//                         maxSum = currSum;
//                     }
//                 }
                
//             }
//             System.out.println("max Sum : " + maxSum);
    
//         }
//         public static void main(String args[]){
//             int numbers[] = {2,4,6,8,10};
//             maxsubArrays(numbers);
    
//         }
//      }
/* IMPORTANT */ /* ********************* */ /* TECHNIQUE 2 */
                /* ********************* */


// public class Placement{
//     public static void maxSubArrays(int numbers[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0];

//         for(int i=0;i<numbers.length;i++){
//             int start =i;
//             for(int j =i;j<numbers.length;j++){
//                 int end = j;
//                 currSum = start == 0 ? prefix[end]: prefix[end] - prefix[start - 1];
//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("max Sum = " + maxSum);
//     }

//     public static void main(String args[]){
//         int numbers[] = {1,-2,6,-1,3};

//         maxSubArrays(numbers);
//     }
// }

/*  KADAN ALGORITHM */
// public class Placement{
//     public static void kadan(int numbers[]){
//         int ms = Integer.MIN_VALUE; 
//         int cs = 0;
//         for(int i =0;i<numbers.length;i++){
//             cs = cs + numbers[i];
//             if(cs < 0){
//                 cs =0;
//             }
//             ms = Math.max(cs,ms);
//         }
//         System.out.println("Answer : " + ms);


//     }
//     public static void main(String args[]){
//         int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
//         kadan(numbers);
//     }
// }
/**TRAPPED WATER PROBLEM IMPORTANT **/
/* ******************************* */
/* ******************************* */
/* ******************************* */
/* ******************************* */
 

// public class Placement{
//     public static int trappedRainwater(int height[]){
//         int n = height.length;
//         //calculate left max baundary array;
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i =1;i<n;i++){
//             leftMax[i] = Math.max(height[i] , leftMax[i-1]);
//         }
//         //calculate right max boundary array;
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i =n-2;i>=0;i--){
//             rightMax[i] = Math.max(height[i] , rightMax[i+1]);

//         }
//         int trappedWater = 0;

//         //loop
//         for(int i =0;i<n;i++){
//             //waterlevel = min(leftMax , rightMax);
//            int  waterLevel = Math.min(leftMax[i] , rightMax[i]);
//             //trapped water = waterlevel - height[i];
//             trappedWater += waterLevel - height[i]; 
//         }
        
        
//         return trappedWater;

//     }
//     public static void main(String args[]){
//         int height[] = {4,2,0,6,3,2,5};
//         System.out.println(trappedRainwater(height));

//     }
// }

//* ***** BUY AND SELL STOCKS ***** */ 
// public class Placement{
//     public static int buyAndSellStocks(int prices[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0;i<prices.length;i++){
//             if(buyPrice < prices[i]){
//                 int profit = prices[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit , profit);

//             } else {
//                 buyPrice = prices[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String args[]){
//         int prices[] = {7,1,5,3,6,4};

//         System.out.println(buyAndSellStocks(prices));

//     }
// }

/* BUBBLE SORT  */ /* DATA STRUCUTURE 2 */
/* ************************************** */
/* ************************************** */
/* ************************************** */

// bubble sort;
// public class Placement{
//     public static void bubbleSort(int arr[]){
//         for(int turn=0;turn<arr.length - 1 ; turn++){
//             for(int j=0;j<arr.length-1-turn; j++){
//                 if(arr[j] > arr[j + 1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;

//                 }
//             }
//         }
//     }
//     // Selection Sort;
//     public static void selectionSort(int arr[]){
        
//         for(int i=0; i<arr.length-1;i++){
//             int minPos = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[minPos] > arr[j]){
//                     minPos = j;
//                 }
//                 int temp = arr[minPos];
//                 arr[minPos] = arr[i];
//                 arr[i] = temp;

//             }
//         }
//     }
//     // Insetrion sort;
//     public static void insertionSort(int arr[]){
//         for(int i =1;i<arr.length;i++){
//             int curr = arr[i];
//             int prev = i-1;

        
        
//         while(prev >=0 && arr[prev] > curr){
//             arr[prev+1] = arr[prev];
//             prev--;
//         }
//         arr[prev+1] = curr;
//     }
//     }
//     public static void printArr(int arr[]){
//         for(int i =0; i<arr.length;i++){
//         System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){

//         int arr[] = {5,4,1,3,2};
//         //bubbleSort(arr);
//       // selectionSort(arr); 
//       insertionSort(arr);
//         printArr(arr);

//     }
// }


public class Placement{
    public static void printArr(Integer arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void countinSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            largest = Math.max(largest , arr[i]);
        }
        int count[] = new int[largest + 1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        int j=0;
        
    }
    public static void main(String args[]){
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr);
        printArr(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);

    }
}
    
    /* COUNTING SORTING */
    // public class Placement{
    //     public static void countingSort(int arr[]){
    //         int largest = Integer.MIN_VALUE;
    //         for(int i =0;i<arr.length; i++){
    //             largest = Math.max(largest , arr[i]);
    //         }
    //         int count[] = new int[largest + 1];
    //         for(int i =0;i<arr.length;i++){
    //             count[arr[i]]++;
    //         }
    //         //sorting
    //         int j = 0;
    //         for(int i=0;i<count.length;i++){
    //             while(count[i] > 0) {
    //                 arr[j] = i;
    //                 j++;
    //                 count[i]--;
    //             }
    //         }
        

            

    //     }
    //     public static void Print(int arr[]){
    //         for(int i =0;i<arr.length;i++){
    //             System.out.print(arr[i]+ " ");
    //         }
    //         System.out.println();
    //     }
    //     public static void main(String args[]){
    //         int arr[] = {5,4,1,3,2};
    //         countingSort(arr);
    //         Print(arr);
    //     }
    // }

    /* LECTURE 11 */ /* ************************ */
    /* ***************************************** */
    /* ******* 2D ARRAYS ******* */
/* DECLARATION  */

    // public class Placement{

    //     public static boolean search(int matrix[][] , int key){
            
    //         for(int i=0;i<matrix.length;i++){
    //             for(int j=0;j<matrix[0].length;j++){
    //                 if(matrix[i][j] == key){
    //                     System.out.println("found at cell (" + i +","+j+")");
    //                     return true;
    //                 }
    //             }
    //         }
    //         System.out.println("key not found");
    //         return false;
    //     }
    //     public static void main(String args[]){
    //         int matrix[][] = new int[3][3];
    //         int n = matrix.length,m=matrix[0].length;

    //         Scanner sc = new Scanner(System.in);
    //         for(int i=0;i<n;i++){
    //             for(int j=0;j<m;j++){
    //                 matrix[i][j] = sc.nextInt();
    //             }
    //         }
    //         //output
    //         for(int i=0;i<n;i++){
    //             for(int j=0;j<m;j++){
    //                 System.out.print(matrix[i][j] + " ");
    //             }
    //             System.out.println();

    //         }
    //         search(matrix, 5);
    //     }
    // }


//   public class Placement{
//     public static void printSpiral(int matrix[][]){
//         int startRow =0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length -1;

//         while(startRow<=endRow && startCol<=endCol){
//             //top
//             for(int j=startCol;j<=endCol;j++){
//                 System.out.print(matrix[startRow][j]+" ");
//             }
//             //right
//             for(int i=startRow +1;i<=endRow;i++){
//                 System.out.print(matrix[i][endCol]+" ");
//             }
//             //bottom
//             for(int j=endCol-1;j>=startCol;j--){
//                 System.out.print(matrix[endRow][j]+" ");
//             }
//             //left
//             for(int i=endRow-1;i>=startRow;i--){
//                 System.out.print(matrix[i][startCol]+" ");
//             }
//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;
//         }

//     }
//     public static void main(String args[]){
//         int matrix[][] = {  {1,2,3,4},
//                             {5,6,7,8},
//                             {9,10,11,12},
//                             {13,14,15,16} };
       
// printSpiral(matrix);
//   }
// }
/* STAIRCASE SEARCH */
// public class Placement{
//     public static boolean staircaseSearch(int matrix[][] , int key){
//         int row =0,col = matrix[0].length-1;

//         while(row<matrix.length && col>=0){
//             if(matrix[row][col] == key){
//                 System.out.println("found key at (" + row + "," + col +")");
//                 return true;
//             } else if(key<matrix[row][col]){
//                 col--;
//             } else {
//                 row++;
//             }
//         } 
//         System.out.println("key Not Found");
//         return false;
//     }
//     public static void main(String args[]){
//         int matrix[][] = {  {10,20,30,40},
//                             {15,25,35,45},
//                             {27,29,37,48},
//                             {32,33,39,50} };
//         int key = 330;
//         staircaseSearch(matrix, key);
//     }
// }
    /* STRINGS  */ /******************* */ 
                /* ********************** */
                /************************ */
// public class Placement{

//     public static void main(String args[]){
//         // char arr[] = {'a','b','c','d'};
//         // String str = "abcd";
//         // String str2 = new String("xyz");

//         // //Strings are IMMUTABLE;
//         // Scanner sc = new Scanner(System.in);
//         // String name = sc.nextLine();
//         // System.out.println(name);
//         // //length of string
//         // System.out.println(name.length());

//         //concatenation
//         // String firstName = "Pratyush";
//         // String lastName = "Bond";
//         // String fullName = firstName + " " + lastName;
//         // System.out.println(fullName.charAt(1));

//     }
// }
        /* PALINDROME */
// public class Placement{
//      //Palindrome 

//     public static boolean palindrom(String str){
//         int n = str.length();
//         for(int i=0;i<n/2;i++){
//             if(str.charAt(i) != str.charAt(n-1-i)){
//                 return false;
//             }
//         }

//         return true;
//     }
   
//     public static void main(String args[]){
//         String str = "fuckcuf";
//         System.out.println(palindrom(str));


//     }
// }
/* SHORTEST PATH */
// public class Placement{
//     public static float getShortestPath(String path){
//         int x =0,y=0;
//         for(int i=0;i<path.length();i++){
//             char dir = path.charAt(i);
//             if(dir == 'S'){
//                 y--;
//             } else if(dir == 'N'){
//                 y++;
//             } else if(dir == 'W'){
//                 x--;
//             } else {
//                 x++;
//             }
//         }
//         int X2 = x*x;
//         int Y2 = y*y;

//         return (float)Math.sqrt(X2+Y2);
//     }
//     public static void main(String args[]){
//         String path = "WNEENESENNN" ;

//         System.out.println(getShortestPath(path));

//     }
// }
/* SUBSTRING */
// public class Placement{
//     public static String subString(String str , int si , int ei){
//         String subString = "";
//         for(int i=0;i<ei;i++){
//             subString += str.charAt(i);

//         }
//         return subString;
//     }
//     public static void main(String args[]){
//         String str = "Hello World";

//         System.out.println(str.substring(0,5));

//         System.out.println(subString(str, 0, 11));

//     }
// }
/* LARGEST FRUITS */
// public class Placement{
//     public static void main(String args[]){
//         String fruits[] = {"apple" , "mango" , "banana"};

//         String largest = fruits[0];
//         for(int i=1;i<fruits.length;i++){
//             if(largest.compareTo(fruits[i]) < 0) {
//                 largest = fruits[i];
//             }
//         }

//         System.out.println(largest);

//     }
// }

/* STRINGS ARE IMMMUTABLE BUT WHY? */
/* STRINGS BUILDER */
//  public class Placement{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("");
//         for(char ch ='a'; ch<='z' ;ch++ ){
//             sb.append(ch);
//         }
//         System.out.println(sb +" ");
//     }
//  }

// public class Placement{
//     public static String toUpperCase(String str){
//         StringBuiler sb = new StringBuilder("");


//     }
//     public static void main(String args[]){
//         String str = "hi, i am pratyush";

//     }
// }


/* BIT MANPULATION */ /* ******************** */
                      /* ********************** */
                      /************************* */
                      /************************* */

// public class Placement{
//     public static void oddOreven(int n){
//         int bitMask = 1;
//         if((n & bitMask )== 0){
//             System.out.println("Even No.");

//         } else {
//             System.out.println("Odd No.");
//         }
//     }

//     public static void main(String args[]){
//         oddOreven(5);
//         oddOreven(8);
//         oddOreven(10);
//         oddOreven(13);
       
//     }
// }

/* OPERATIONS */

// public class Placement{
//                          /* getIthBit */
//     public static int getIthBit(int n , int i){
//         int bitMask = 1<<i;
//         if((n & bitMask) ==0){
//             return 0;
//         } else {
//             return 1;
//         }
//     }

//                         /* setIthBit */
//     public static int setIthBit(int n,int i){
//         int bitMask = 1<<i;
//         return n|bitMask;
//     }
//                     /* clearIthBit */
//     public static int clearIthBit(int n,int i){
//         int bitMask = ~(1<<i);
//         return n & bitMask;
//     }

//                  /* UpdateIthBit */ 
//     public static int updateIthBit(int n,int i,int newBit){
//         if(newBit == 0){
//             return clearIthBit(n, i);
//         } else {
//             return setIthBit(n, i);
//         }
//     }
//     public static int clearIbits(int n,int i){
//         int bitMask = (~0)<<i;
//         return n & bitMask;
//     }
//     public static int clearIBits(int n,int i,int j){
//         int a=((~0)<<(j+1));
//         int b = (1<<i)-1;
//         int bitMask = a|b;
//         return n & bitMask;
//     }
//     public static boolean isPowerOfTwo(int n){
//         return (n&(n-1)) == 0;
//     }
//     public static int countSetBits(int n){
//         int count =0;
//         while(n>0){
//             if((n&1) !=0) {
//                 count++;
//             }
//             n=n>>1;
//         }
//         return count;
//     }
//     public static int fastExpo(int a,int n){
//         int ans =1;
//         while(n>0){
//             if((n&1)!= 0){
//                 ans = ans *a;
//             }
//             a = a*a;
//             n = n>>1;
//         }
//         return ans;
//     }


//     public static void main(String args[]) {
//     //    System.out.println(getIthBit(10, 3));
//     //     System.out.println(setIthBit(10, 2));

//     //    System.out.println(clearIthBit(10, 3));
//     //   System.out.println(updateIthBit(10, 3, 5));
//     //  System.out.println(clearIbits(10, 3));
//     //  System.out.println(clearIBits(10, 2, 4));
//     // System.out.println(isPowerOfTwo(8));
//     // System.out.println(countSetBits(15));
//     // System.out.println(fastExpo(3, 5));


//     }
// }
// */

/* ****************** */
/* ****************** */
/* ****************** */ 
/* LECTURE 14 */
/* OOPS */ /* OBJECT ORIENTED PROGRAMMING */

// public class Placement{
//     public static void main(String args[]){
//         Pen p1 = new Pen(); //created a pen object called p1
//         p1.setColor("Blue");
//         System.out.println(p1.getColor());
//         p1.setTip(5);
//         System.out.println(p1.getTip());
//         p1.color = "Yellow";
//         System.out.println(p1.getColor());

       
        

//     }

// }

// class Pen {
//     //prop + function
//     String color;
//     int tip;
//     String getColor(){
//         return this.color;
//     }

//     int getTip() {
//         return this.tip;
//     }

//     void setColor(String newColor){
//         this.color = newColor;
//     }

//     void setTip(int tip){
//         this.tip = tip;
//     }
// }
/* TYPES OF CONSTRUCTOR */
// public class Placement{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         Student s2 = new Student("Pratyush");
//         Student s3 = new Student(123);
//         Student s4 = new Student("Chomu",145);
//         System.out.println(s2.name);
//         System.out.println(s3.roll);
//         System.out.print(s4.name+" ");
//         System.out.print(s4.roll);



//     }
// }
// class Student{
//     String name;
//     int roll;

//     Student(){
//         System.out.println("Constructor is called");
//     }
//     Student(String name) {
//         this.name = name;  //parameterized Constructor
//     }
//     Student(int roll){
//         this.roll = roll;
//     }
//     Student(String name , int roll){
//         this.name = name;
//         this.roll = roll;
//     }

// }

/* COPY CONSTRUCTOR */

// public class Placement{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name = "Pratyush";
//         s1.roll = 456;
//         s1.password = "abcd";
//         s1.marks[0] = 1;
//         s1.marks[1] = 2;
//         s1.marks[2] = 3;

//         Student s2 = new Student(s1);
//         s2.password = "xyz";
//         s1.marks[2] = 100;
//         for(int i=0;i<3;i++){
//             System.out.println(s2.marks[i]);
//         }

       


//     }
// }
// class Student{
//     String name;
//     int roll;
//     String password;
//     int marks[];
    

//     //copy constructor
//     Student(Student s1){
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.marks = s1.marks;
        
//     }

//     Student(){
//         marks = new int[3];
//         System.out.println("Hey,I am not getting anything");
//     }
//     Student(String name){
//         marks = new int[3];
//         this.name = name;
//     }
//     Student(int roll){
//         marks = new int[3];
//         this.roll = roll;
//     }
// }

/* SHALLOW AND DEEP COPY */

// public class Placement{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name = "Pratyush";
//         s1.roll = 123;
//         s1.password = "ass";
//         s1.marks[0] = 100;
//         s1.marks[1] = 80;
//         s1.marks[2] = 90;

//         Student s2 = new Student(s1);
//             for(int i=0;i<3;i++){
//                 System.out.println(s2.marks[i]);
//             }
            

//         }

//     }

// class Student{
//     String name;
//     int roll;
//     String password;
//     int marks[];
   
//     Student(){
//         System.out.println("Hey,I am not getting anything");
//     }
//     Student(Student s1){
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.marks = s1.marks;


//     }
//     Student(String name){
//         marks = new int[3];
//         this.name = name;

//     }
//     Student(int roll){
//         marks = new int[3];
//         this.roll = roll;
//     }
    
//     }


/* INSTRUCTOR */
// public class Placement{
//     public static void main(String args[]){
//         Fish shark = new Fish();
//         shark.eat();
        
//     }
// }

// class Animal{
//     String color;


//     void eat(){
//         System.out.println("Eats");

//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }
// //Derived class
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("Swims");
//     }
// }

/* MULTIPLE LEVEL INHERITENCE */
// public class Placement{
//     public static void main(String args[]){
//         Dog dobby = new Dog();
//         dobby.eat();
//         dobby.legs = 4;
//         System.out.println(dobby.legs);
//     }
// }

// class Animals{
//     String color;

//     void eat(){
//         System.out.println("tasty");
//     }
//     void breathe(){
//         System.out.println("Oxygen");
//     }
//     void see(){
//         System.out.println("Eyes");
//     }
// }

// class Mammals extends Animals{
//     int legs;

// }
// class Dog extends Mammals{
//     String breed;
// }

/* HIERARCHIAL INHERITANCE */

// public class Placement{
//     public static void main(String args[]){
//         Fish shark = new Fish();
//         shark.eyes = 2;
//         System.out.println(shark.eyes);
//         shark.swim();

//         Birds eagle = new Birds();
//         eagle.eyes = 2;
//         System.out.println(eagle.eyes);
//         eagle.fly();

//         Mammals dog = new Mammals();
//         dog.legs = 4;
//         System.out.println(dog.legs);
//         dog.walk();
//         dog.eyes = 2;
//         System.out.println(dog.eyes);
//         dog.breath();


//     }
// }

// class Animals{
//     String color;
//     int eyes;

//     void eat(){
//         System.out.println("Tasty");
//     }
//     void breath(){
//         System.out.println("Fresh Air");
//     }
//     void see(){
//         System.out.println("Through Eyes");
//     }
// }
// class Birds extends Animals{
//     int wings;

//     void fly(){
//         System.out.println("Through Wings");
//     }
// }
// class Mammals extends Animals{
//     int legs;

//     void walk(){
//         System.out.println("Through legs");
//     }
// }
// class Fish extends Animals{
//     int fins;

//     void swim(){
//         System.out.println("Through fins");

//     }
// }

/* HYBRID CLASS */
/* WRITTEN BY OWN */

// public class Placement{
//     public static void main(String args[]){

//         Shark s1 = new Shark();
//         s1.food();
//         s1.gills = 5;
//         System.out.println(s1.gills);

//         Peacock p1 = new Peacock();
//         p1.choch = 1;
//         System.out.println(p1.choch);
//         p1.dance();



//     }
// }

// class Animals{
//     String color;
//     int eyes;
//     int tongue;

//     void see(){
//         System.out.println("through eyes");
//     }
//     void breath(){
//         System.out.println("fresh air");
//     }
//     void eat(){
//         System.out.println("Tasty");
//     }
// }
// class Fish extends Animals{
//     int fins;

//     void swim(){
//         System.out.println("in water");
//     }
// } 
// class Shark extends Fish{
//     int gills;

//     void food(){
//         System.out.println("Non Vegeterian");
//     }
// }
// class Tuna extends Fish{
//     int chills;

//     void food(){
//         System.out.println("vegeterian");
//     }
// }
// class Birds extends Animals{
//     int wings;

//     void fly(){
//         System.out.println("in Sky");
//     }
// }
// class Peacock extends Birds{
//     int choch;

//     void dance(){
//         System.out.println("very beautiful");
//     }
// }
// class Mammals extends Animals{
//     int legs;

//     void walk(){
//         System.out.println("walks");
//     }
// }
// class Dog extends Mammals{

//     void honesty(){
//         System.out.println("very Honest");
//     }
// }
// class Cat extends Mammals{

//     void naughty(){
//         System.out.println("very Naughty");
//     }
// }
// class Human extends Mammals{

//     void virtue(){
//         System.out.println("Biggest Idiots");
//     }
// }

// public class Placement{
//     public static void main(String args[]){
//         Calculator calc = new Calculator();
//         System.out.println(calc.sum(1,2));
//         System.out.println(calc.sum((float)2.5,(float)1.5));
//         System.out.println(calc.sum(1,2,3));



//     }
// }
// class Calculator{

//     int sum(int a,int b){
//         return a+b;
//     }
//     float sum(float a,float b){
//         return a+b;
//     }
//     int sum(int a,int b,int c){
//         return a+b+c;
//     }

// }
/* ABSTRACTS */

// public class Placement{
//     public static void main(String args[]){
//         Horse h1 = new Horse();
//         h1.eat();
//         h1.walk();

//         Chicken c1 = new Chicken();
//         c1.eat();
//         c1.walk();

//         // Animal a1 = new Animal();  /* CANNOT CREATE OBJECT */
//          //a1.eat();                 /*  BECAUSE ABSTRACT CLASS */
                                       

//     }
// }
// abstract class Animal {
//     void eat(){
//         System.out.println("Eat through mouth..");
//     }
//     abstract void walk();
// }

// class Horse extends Animal{
//     void walk(){
//         System.out.println("Through 4 legs..");
//     }
// }
// class Chicken extends Animal{
//     void walk(){
//         System.out.println("Through 2 legs..");
//     }
// }

/* INTERESTING CONCEPT */

// public class Placement{
//     public static void main(String args[]){
//         Mustang myHorse = new Mustang();
//         //Animal -> Horse -> Mustang

//     }
// }
// abstract class Animal{
//     String color;

//     Animal(){
//         System.out.println("Animal constructor is created..");
//     }
//     void eat(){
//         System.out.println("Through mouth..");
//     }
//     abstract void walk();

// }

// class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse consrtuctor is called...");
//     }
//     void changeColor(){
//         color = "dark brown";
//     }
//     void walk(){
//         System.out.println("Through 4 legs..");
//     }
// }
// class Mustang extends Horse{
//     Mustang(){
//         System.out.println("Constructor is called");
//     }

// }

/* INTERFACES */ /* BLUEPRINT OF CLASSES */

// public class Placement{
//     public static void main(String args[]){
//         Queen q = new Queen();
//         q.moves();

//         King k = new King();
//         k.moves();

//         Pawn p = new Pawn();
//         p.moves();

//         Rook r = new Rook();
//         r.moves();


//     }
// }

// interface ChessPlayer {
//     void moves();

// }

// class Queen implements ChessPlayer {
//    public void moves(){
//         System.out.println("up,down,left,right,diagonal(in all directions) \n");
//     }
// }

// class Rook implements ChessPlayer{
//     public void moves(){    /* PUBLIC NAHI KIYA TO DEFUALT HO JAYEGA */
//         System.out.println("up,down,left,right \n");
//     }
// }
// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right,diagonal(in 1 steps) \n");
//     }
// }
// class Pawn implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left right \n");
//     }
// }
/* STATIC WORD */
// public class Placement{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.schoolName = "JMV";
//         System.out.println(s1.schoolName);

//         Student s2 = new Student();
//         s2.schoolName ="PPP";
//         System.out.println(s2.schoolName);

//         Student s3 = new Student();
//         s3.schoolName = "XYZ";
//         System.out.println(s3.schoolName);
//     }
// }

// class Student {
//     int returnPercentage(int math , int phy , int chem){
//         return (math+phy+chem)/3;

//     }
//     String name;
//     int roll;

//     static String schoolName;

//     void setName(String name){
//         this.name = name;
//     }
//     String getName(){
//         return this.name;
//     }
// }

/* SUPER KEYWORD */
// public class Placement{
//     public static void main(String args[]){
//         Horse h = new Horse();
//         System.out.println(h.color);

//     }
// }
// class Animal{
//     String color;
//     Animal(){
//         System.out.println("Animal constructor is called");
//     }
// }
// class Horse extends Animal{
//     Horse(){
//         super.color = "brown";
//         System.out.println("Horse constructor is called");
//     }
// }
 

/* QUESTION 1 */

// public class Placement{
//     public static void main(String ars[]){
//         Student s1 = new Student();
//         s1.name = "Aman";
//         s1.marks = 45;
//         System.out.println(s1.name +"\n"+s1.marks );

//     }
// }
// class Student{
//     String name;
//     int marks;

// }

/*  QUESTION 3  */
/* Class can not be private because in the case if we did so we will 
 * not be able to create object
*/

/* QUESTION 4  */



/* RECURSION */ /* ********************** */
               /* *********************** */
               /* ************************ */

/* Print numbers from n to 1 */ /* Question */
// public class Placement{
//     public static void printDec(int n){
//         if(n==1){
//             System.err.println(1);
//             return;
//         }
//         System.out.print(n+" ");
//         printDec(n-1);
//     }
//     public static void main(String args[]){
//         int n = 10;
//         printDec(n);
//     }   
// }

/* PRINT NO. IN INCREASING ORDER */

// public class Placement{
//     public static void printInc(int n){
//         if(n==1){
//             System.out.print(n+" ");
//             return ;
//         }
//         printInc(n-1);
//         System.out.print(n+" ");
        
        
        
//     }
//     public static void main(String args[]){
//         int n = 10;
//         printInc(n);
//     }
//}

/* PRINT FACTORIAL  */
// public class Placement{
//     public static int fact(int n){
//         if(n==0){
//             return 1;
//         }
//        int fnm1 = fact(n-1);
//        int fn = n * fact(n-1);
//        return fn;

//     }
//     public static void main(String args[]){
//       System.out.println( fact(5));
//     }
// }
/* Factorial */
// public class Placement{
//     public static int sum(int n){

//         if(n==1){
//             return 1;
//         }
//         int a = sum(n-1);
//         int b = n + sum(n-1);
//         return b;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(10));
        
//     }
// }
/* FIBONACCI SERIES */

// public class Placement{
//     public static long fibo(int n){
//         if(n==0 || n==1){
//             return n;
//         }
       
//         long s = fibo(n-1);
//         long s1 = fibo(n-2);
//         long sum = s+s1;
//         return sum;
//     }
//     public static void main(String args[]){
//         // System.out.println(fibo(25));
//         // System.out.println(fibo(26));
//         // System.out.println(fibo(27));
//         // System.out.println(fibo(28));
//         System.out.println(fibo(50));

//     }
// }

/* SORTED ARRAY */

// public class Placement{
//     public static boolean isSorted(int arr[],int i){
//         if(i == arr.length-1){
//             return true;
//         }
//         if(arr[i] > arr[i+1]){
//             return false;
//         }
//         return isSorted(arr, i+1);
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,64,5};
//         System.out.println(isSorted(arr, 0));

//     }
// }

/* FIRST OCCURANCE */

// public class Placement{
//     public static int firstOccurance(int arr[],int key,int i){
//         if(i == arr.length-1){
//             return -1;
//         }
//         if(arr[i]==key){
//             return i;
//         }
//         return firstOccurance(arr, key, i+1);
//     }
//     public static void main(String args[]){
//         int arr[] = {8,3,6,9,5,10,2,5,3};

//         System.out.println(firstOccurance(arr, 10, 0));
//     }
// }

/* LAST OCCURANCE */
// public class Placement{
//     public static int lastOccurence(int arr[],int i,int key){
//         if(i== arr.length){
//             return -1;
//         }
//         int isFound = lastOccurence(arr, i+1, key);
//         if(isFound == -1 && arr[i]==key){
//             return i;
//         }                                                                                                                                

//         return isFound;
        

//     }
//     public static void main(String args[]){
//         int arr[] = {8,3,6,9,5,10,2,5,3};
//         System.out.println(lastOccurence(arr, 0, 5));
//     }
// }

/* EXPONENTIAL OF X */
// public class Placement{
    // public static int power(int x,int n){
        // if(n==0){
        //     return 1;
        // }
        // int xnm1 = power(x,n-1);
        // int xn = x* xnm1;
        // return xn;

        // return x * power(x, n-1);
            /* optimized */
        // public static int optemizedPower(int a,int n){
         //     if(n==0){
         //         return 1;
         //     }

        //     int half = optemizedPower(a, n/2);
        //     int halfPowerSq = half * half;

        //     //n is odd
        //     if(n % 2 != 0){
        //         halfPowerSq = a * halfPowerSq;
        //     }
        //     return halfPowerSq;
        // }



    
//     public static void main(String args[]){
//         System.out.println(optemizedPower(2, 10));
//     }
// }


/* IMPORTANT */ /* ******************** */
                /* ******************** */

// public class Placement{
//     public static int tilingProblem(int n){

//         if(n==0||n==1){
//             return 1;
//         }

//         //kaam
//         //vertical choice
//         int fnm1 = tilingProblem(n-1);

//         //horizontal choice
//         int fnm2 = tilingProblem(n-2);

//         int totWays = fnm1 + fnm2;
//         return totWays;
//     }

//     public static void main(String args[]){
//         System.out.println(tilingProblem(3));

//     }
// }

/* REMOVING DUPLICATES IN STRING */
// public class Placement{
//     public static void removeDuplicates(String str, int idx,StringBuilder newStr, boolean map[]){
//         if(idx == str.length()){
//             System.out.println(newStr);
//             return;
//         }

//         //kaam
//         char currChar = str.charAt(idx);
//         if(map[currChar - 'a'] == true){
//             //duplicate
//             removeDuplicates(str, idx+1, newStr, map);
//         } else {
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, idx+1, newStr.append(currChar), map);
//         }
//     }
//     public static void main(String args[]){

//         String str = "appnnacollege";
//         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);


//     }
//}

/* PAIRING */
// public class Placement{
//     public static int friendsPairing(int n){
//         if(n==1||n==2){
//             return n;
//         }
//         //choice
//         //single
//         int fnm1 = friendsPairing(n-1);

//         //pair
//         int fnm2 = friendsPairing(n-2);
//         int pairWays = (n-1)* fnm2;

//         //totWays
//         int totWays = fnm1 + pairWays;
//         return totWays;

//         // return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
//         // 1 line me ho gaya
//     }
//     public static void main(String args[]){
//         System.out.println(friendsPairing(3));

//     }
// }

/* BINARY PROBLEMS */
// public class Placement{
//     public static void printBinaryStrings(int n,int lastPlace,String str){
//        //base case
//        if(n==0){
//         System.out.println(str);
//         return ;
//        }
//         //kaam
//         printBinaryStrings(n-1, 0, str+"0");
//         if(lastPlace == 0){
           
//             printBinaryStrings(n-1, 1, str+"1");
//         } 
//     }
//     public static void main(String args[]){
//        printBinaryStrings(3, 0, "");
//     }
// }
/* ********************************** */
/* ********************************** */
/* ********************************** */


// public class Placement{
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void mergeSort(int arr[],int si,int ei) {
//         if(si >= ei){
//             return;
//         }
//         //kaam
//         int mid = si + (ei-si)/2;
//         mergeSort(arr,si,mid); //left part
//         mergeSort(arr, mid+1, ei); //right part
//         merge(arr,si,mid,ei);
//     }
//     public static void merge(int arr[],int si,int mid,int ei){
//         int temp[] = new int[ei-si+1];
//         int i = si; //idx for 1st sorted part
//         int j = mid+1; //idx for 2nd sorted part
//         int k=0; //idx for temp;

//         while(i<=mid && j<=ei){
//             if(arr[i] < arr[j]){
//                 temp[k] = arr[i];
//                 i++;
//             } else {
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }

//         // for leftover elements of 1st sorted part
//         while(i<=mid){
//             temp[k++] = arr[i++];
//         }

//         // for leftover elements of 2nd sorted part
//         while(j<= ei){
//             temp[k++] = arr[j++];
//         }
        
//         // copy temp to original array
//         for(k=0,i=si;k<temp.length;k++,i++){
//             arr[i] = temp[k];
//         }


//     }
//     public static void main(String args[]){

//         int arr[] = {6,3,9,5,2,-2,8};
//         mergeSort(arr, 0, arr.length-1);
//         printArr(arr);

//     }
// }
/* QUICK SORT */

// public class Placement{
//     public static void printArr(int arr[]){
//                 for(int i=0;i<arr.length;i++){
//                     System.out.print(arr[i]+" ");
//                 }
//                 System.out.println();
//             }
    
//     public static void quickSort(int arr[],int si,int ei){
//         if(si >= ei){
//             return;
//         }

//        int pIdx =  partition(arr,si,ei);
//        quickSort(arr, si, pIdx-1);//left
//        quickSort(arr, pIdx+1, ei);//right

//     }
//     public static int partition(int arr[],int si,int ei){
//         int pivot = arr[ei];
//         int i = si-1;//to make place for els smaller than pivot

//         for(int j=si;j<ei;j++){
//             if(arr[j] <= pivot){
//                 i++;
//                 //swap
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         i++;
//         int temp = arr[ei];
//         arr[ei] = arr[i];
//         arr[i] = temp;
//         return i;


//     }
//     public static void main(String args[]){
//         int arr[] = {6,3,9,8,2,5,-7};
//         quickSort(arr, 0, arr.length-1);
//         printArr(arr);

//     }
// }
/* ROTATED SORTED ARRAY */

// public class Placement{
//     public static int search(int arr[],int tar,int si,int ei){
//         if(si > ei){
//             return -1;
//         }

//         //kaam
//         int mid = si + (ei-si)/2;

//         //case Found
//         if(arr[mid] == tar){
//             return mid;
//         }
//         //mid on L1
//         if(arr[si] <= arr[mid]){
           
//                 //case a : left
//                 if(arr[si] <= tar && tar <=arr[mid]){
//                     return search(arr, tar, si, mid-1);
//                 } else {
//                     //case b : mid right
//                     return search(arr, tar, mid+1, ei);
//                 }
//             }

//             //mid on L2
//             else {
//                 //case c : right
//                 if(arr[mid] <=tar && tar <= arr[ei]){
//                     return search(arr, tar, si, mid-1);

//                 } else {
//                     //case d : left
//                     return search(arr, tar, si, mid-1);
//                 }
//             }
//         }
    
//     public static void main(String args[]){
//         int arr[] = {4,5,6,7,0,1,2};
//         int target = 3; //output -> 4
//        int tarIdx = search(arr, target, 0, arr.length-1);
//        System.out.println(tarIdx);
//     }
// }

// public class Placement{
//     public static void print(int n){
//         for(int i=1;i<=n;i++){
//             System.out.println(i);
//         }
//     }
//     public static void nestedLoop1(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.println(j);
//             }
//         }
//     }
//     public static void main(String args[]){
//        // print(5);
//         nestedLoop1(5);
//     }
// }
/* TIME COMPLEXITY */ /* ************************** */
                     /* *************************** */


                     /* BINARY SEARCH */
// public class Placement{
//     public static int binarySearch(int arr[],int key){
//         int start = 0;
//         int end = arr.length-1;

//         while(start <= end){
//             int mid = (start+end)/2;

//             if(arr[mid]==key){
//                 return mid;
//             } else if(arr[mid] < key){
//                 start = mid + 1;
//             } else if(arr[mid] > key){
//                 end = mid -1;
//             }
            
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5,6,7};
//         System.out.println(binarySearch(arr, 7));
//     }
// }

/*  SUM OF N */
// public class Placement{
//     public static int sum(int n){
//         if(n==0){
//             return 0;   /* TC O(n) and space comp O(n) */
//         }
//         return n + sum(n-1);
//     }
//     public static void main(String args[]){
//         System.out.println(sum(10));

//     }
// }
        
/* FIBONACCI */
// public class Placement{
//     public static int fibo(int n){
//         if(n ==0||n==1){
//             return n;
//         }
//         // int fnm2 = fibo(n-2);
//         // int fnm1 = fibo(n-1);
//         // int sum = fnm2 + fnm1;
//         // return sum;

//         return fibo(n-2)+fibo(n-1);

//     }
//     public static void main(String args[]){
//         System.out.println(fibo(5));

//     }
// }

// public class Placement{
//     public static int power(int a,int n){
//         if(n == 0){
//             return 1;
//         }
//         return a * power(a,n-1);
//     }
    
//     public static void main(String args[]){
//         System.out.println(power(2, 10));

//     }
// }

// public class Placement{
//     public static int power2(int a,int n){
//         if(n == 0){
//             return 1;
//         }

//         int halfPowerSq = power2(a, n/2)*power2(a, n/2);
//         if(n%2 !=0){
//             return a*halfPowerSq;

//         }
//         return halfPowerSq;
//     }
//     public static void main(String args[]){
//         System.out.println(power2(2, 10));

//     }
// }

// public class Placement{
//     public static int power3(int a,int n){
//         if(n==0){
//             return 1;
//         }
//         int hp = power3(a,n/2);
//         int hps = hp*hp;
//         if(n%2!=0){       //a is odd
//             return a*hps;
//         }
//         return hps;
//     }
//     public static void main(String args[]){
//         System.out.println(power3(2, 10));

//     }
// }

/* BACKTRACKING KI SURUAAT */
/* *********************** */
/* *********************** */

        /* BACKTRAKING OF ARRAYS */
// public class Placement{
//     public static void changeArr(int arr[],int i,int val){
//         //base case
//         if(i==arr.length){
//             printArr(arr);
//             return;
//         }

//         //recursion
//          arr[i] = val;
//         changeArr(arr, i+1, val+1);
//         arr[i] = arr[i]-2;



//     }
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[] = new int[5];
//         changeArr(arr, 0, 1);
//         printArr(arr);

//     }
// }

/* SUBSETS WALI PROBLEM */
// public class Placement{
//     public static void findSubsets(String str,String ans,int i){
//         //base case
//         if(i==str.length()){
//             if(ans.length()==0){
//                 System.out.println("##");
//             } else {
//                 System.out.println(ans);
//             }
//             return ;
//         }

//         //If choice is Yes /* AGAR AANA CHAHTA HO */
//         findSubsets(str, ans+str.charAt(i), i+1);
//         //If choice is No /* AGAR NA ANNA CHAHTA HO */
//         findSubsets(str, ans, i+1);

//     }

//     public static void main(String args[]){
//         String str = "abc";
//         findSubsets(str, "", 0);


//     }
// }


/* PERMUTATIONS */ /* DRY RUN JARUR KARE */

// public class Placement{
//     public static void findPermutation(String str,String ans){
//         //base case
//         if(str.length()==0){
//             System.out.println(ans);
//             return;

//         }

//         //recursion
//         for(int i=0;i<str.length();i++){
//             char curr = str.charAt(i);
//             //"abcde" => "ab"+"de" = "abde"
//             String NewStr = str.substring(0, i)+ str.substring(i+1);
//            findPermutation(NewStr, ans+curr);
//         }
//     }
//     public static void main(String args[]){
//         String str = "abc";
//        findPermutation(str, "");


//     }
// }

/* QUEEN KO BAITHANE KE TARIKE */


// public class Placement{
//     public static void nQueens(char board[][] , int row){
//         if(row == board.length){
//             printBoard(board);
//             return ;
//         }
           
                
            
        
//         for(int j=0;j<board.length;j++){
//             board[row][j] = 'Q';
//             nQueens(board, row+1); //function call
//             board[row][j] = 'x';
//         }

//     }
    
//     public static void printBoard(char board[][]){
//         System.out.println("-------CHESS BOARD--------");
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int n=3;
//         char board[][] = new char[n][n];
//         //intialize
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 board[i][j] = 'x';

//             }
//         }
//         nQueens(board, 0);


//     }
// }

/* SANDAAR JABARJAST JINDABAAD */


// public class Placement{
//     public static boolean isSafe(char board[][],int row,int col){
//         //=>vertical up
//         for(int i=row-1;i>=0;i--){
//             if(board[i][col] == 'Q'){
//             return false;
//         }
//     }

//         //=>diagonal left up
//         for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }

//         //=>diagonal right up
//         for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
                

//      return true;
        
    
//     }
//     public static void nQueens(char board[][],int row){
//         if(row == board.length){
//            printBoard(board);
//             return;

//         }
//         for(int j=0;j<board.length;j++){
//             if(isSafe(board , row , j)){
//             board[row][j]='Q';
//             nQueens(board, row+1); // =>function call
//             board[row][j]='.'; //=>replacement
//             }
//         }
//     }
//     public static void printBoard(char board[][]){
//         //int ts =0;
//         System.out.println("-----CHESS BOARD-----");
//        for(int i=0;i<board.length;i++){
//         for(int j=0;j<board.length;j++){
//             System.out.print(board[i][j] +" ");
//         }
//         System.out.println();
//        // ts++;

//        }
//        //System.out.println(ts);
//     }
    
//     public static void main(String args[]){
//         int n=5;
//         char board[][] = new char[n][n];

//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 board[i][j]='.';
//             }
//         }
//         nQueens(board, 0);

//     }
// }
/* GRID WAYS */
// public class Placement{
//     public static int gridWays(int i,int j,int n,int m){
//         //base case
//         if(i==n-1 && j==m-1){
//             return 1;
//         } else if(i==n||j==n){
//             return 0;
//         }

//         int w1 = gridWays(i+1, j, n, m);
//         int w2 = gridWays(i, j+1, n, m);
//         return w1+w2;
//     }
//     public static void main(String args[]){
//         int n=3,m=3;
//         System.out.println(gridWays(0, 0, n, m));
//     }
// }

/* ARRAY LISTS */
/* **************************** */
/* **************************** */
/* ***************************** */

// // public class Placement{
// //     public static void main(String args[]){
// //        // String | Boolean | Float  Bhi likh sakte hai

// //        //ClassName ObjectName = new ClassName();
// //         ArrayList<Integer> list = new ArrayList<>();
// //         ArrayList<String> list2 = new ArrayList<>();
// //         ArrayList<Float> list3 = new ArrayList<>();
// //         //add
// //         list.add(1);  //O(1)
// //         list.add(2);
// //         list.add(3);
// //         list.add(4);
// //         list.add(5);
// //         System.out.println(list);

// //         list.add(1,9); //O(n)

// //         System.out.println(list);

// //         System.out.println(list.size());


// //         //get
// //         // int element = list.get(2);
// //         // System.out.println(element);

// //         //System.out.println(list.get(2));

// //         //remove
// //         // list.remove(2);
// //         // System.out.println(list);

// //         //set element at Index
// //         // list.set(2,10);
// //         // System.out.println(list);

// //         //contains
// //         // System.out.println(list.contains(1));
// //         // System.out.println(list.contains(3));


       


// //     }
// // }
// /* PRINTING ARRAYlIST */
// // public class Placement{
// //     public static void main(String args[]){

// //         //ClassName ObjectName = new ClassName();
// //         ArrayList<Integer> list = new ArrayList<>();

// //         list.add(1);
// //         list.add(2);
// //         list.add(3);
// //         list.add(4);
// //         list.add(5);
// //         list.add(6);

// //         //list.size() => For size of ArrayList<>
// //         for(int i=0;i<list.size();i++){
// //             System.out.print(list.get(i)+" ");
// //         }
// //         System.out.println("\n");
// //         System.out.println(list.size());
// //     }
// // }

// // public class Placement{
// //     public static void main(String args[]){
// //         //ClassName ObjectName = new ClassName;
// //         ArrayList<Integer> list = new ArrayList<>();
// //         list.add(1);
// //         list.add(2);
// //         list.add(3);
// //         list.add(4);
// //         list.add(5);
// //         list.add(6);

// //         // Using (list.size() && list.get()) 
// //         // set function or get Function
// //         // Trying to print => In reverse format
// //         // O(n)
// //         for(int i= list.size()-1;i>=0;i--){
// //             System.out.print(list.get(i)+" ");
// //         }
// //         System.out.println();
// //         System.out.println(list.size());

// //     }
// // }

// /* FINDING MAX IN ARRAYLIST */
// // public class Placement{
// //     public static void main(String args[]){
// //         //ClassName ObjectName = new ClassName();
// //         ArrayList<Integer> list = new ArrayList<>();
// //         list.add(10);
// //         list.add(21);
// //         list.add(134);
// //         list.add(4);
// //         list.add(51);
// //         list.add(16);

// //         for(int i=0;i<list.size();i++){
// //             System.out.print(list.get(i)+" ");
// //         }
// //         System.out.println();

// //         System.out.println("Size of ArrayList: "+ list.size());

// //         int largest = Integer.MIN_VALUE;
// //         for(int i=0;i<list.size();i++){
// //             if(list.get(i)>largest){
// //                 largest = list.get(i);
// //             }
// //             //largest = Math.max(list.get(i),largest);
// //         }
// //         System.out.println("Largest No. :  " + largest);

// //     }
// // }

// /* SWAPING TWO NO. */
// // public class Placement{
// //     public static void swap(ArrayList<Integer> list,int idx1,int idx2){
// //         int temp = list.get(idx1);
// //         list.set(idx1 , list.get(idx2));
// //         list.set(idx2 , temp);
// //     }
// //     public static void main(String args[]){
// //         //ClassName ObjectName = new ClassName();
// //         ArrayList<Integer> list = new ArrayList<>();
// //         list.add(2);
// //         list.add(5);
// //         list.add(9);
// //         list.add(3);
// //         list.add(6);


// //         //printing=>list
// //         System.out.println(list+"\n");
// //         //swap=> indx1=>indx2
// //         swap(list, 1, 3);
// //         System.out.println(list+"\n");
// //         //sorting => ascending order
// //         Collections.sort(list);
// //         System.out.println(list+"\n");
// //         //sorting => decending order
// //         Collections.sort(list,Collections.reverseOrder());
// //         System.out.println(list+"\n");
// //     }
// // }


// /* 2D ARRAYLIST */
// // public class Placement{
// //     public static void main(String args[]){
// //         // list=>list=>list......
// //         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
// //         //1
// //         ArrayList<Integer> list = new ArrayList<>();
// //         list.add(1);list.add(2);list.add(3);list.add(4);
// //         mainList.add(list);
// //         //2
// //         ArrayList<Integer> list2 = new ArrayList<>();
// //         list2.add(5); list2.add(6);list2.add(7);list2.add(8);
// //         mainList.add(list2);
// //         //3
// //         ArrayList<Integer> list3 = new ArrayList<>();
// //         list3.add(9);list3.add(1);list3.add(2);list3.add(3);
// //         mainList.add(list3);
// //         //4
// //         ArrayList<Integer> list4 = new ArrayList<>();
// //         list4.add(4);list4.add(5);list4.add(6);list4.add(7);
// //         mainList.add(list4);


// //         //printKarna khela hai bahut bada
// //         for(int i=0;i<mainList.size();i++){
// //             ArrayList<Integer> currList = mainList.get(i);
// //             for(int j=0;j<currList.size();j++){
// //                 System.out.print(currList.get(j)+" ");
// //             }
// //             System.out.println();
// //         }
// //         System.out.println(mainList);
// //     }
// // }

// // public class Placement{
// //     public static void main(String args[]){
// //         //list1=>list2=>list3=>........
// //         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
// //         ArrayList<Integer> list1 = new ArrayList<>();
// //         ArrayList<Integer> list2 = new ArrayList<>();
// //         ArrayList<Integer> list3 = new ArrayList<>();

// //         //getting elements inside list
// //         for(int i=1;i<=5;i++){
// //             list1.add(i*1);
// //             list2.add(i*2);
// //             list3.add(i*3);
// //         }
// //         //adding lists in mainList
// //         mainList.add(list1);
// //         mainList.add(list2);
// //         mainList.add(list3);
// //         //removing elements
// //         list2.remove(3);
// //         list3.remove(2);
// //         list1.remove(4);


// //         System.out.println(mainList+"\n");
// //         //printing=>nestedArrayList

// //         for(int i=0;i<mainList.size();i++){
// //             ArrayList<Integer> currList = mainList.get(i);
// //             for(int j=0;j<currList.size();j++){
// //                 System.out.print(currList.get(j)+" ");
// //             }
// //             System.out.println();

// //         }
       
// //     }
// // }

// // public class Placement{

// //     public static int storeWater(ArrayList<Integer> height){
// //         int maxWater = 0;
// //         //bruteforce - O(n^2)
// //         for(int i=0;i<height.size();i++){
// //             for(int j=i+1;j<height.size();j++){
// //                 int ht = Math.min(height.get(i),height.get(j));
// //                 int width = j-1;
// //                 int currWater = ht*width;
// //                 maxWater = Math.max(maxWater,currWater);

// //             }
// //         }
// //         return maxWater;
// //     }
// //     public static int optimzedStore(ArrayList<Integer> height){
// //         int maxWater = 0;
// //         int lp =0;
// //         int rp = height.size()-1;

// //         while(lp<rp){
// //             //calculate water area
// //             int ht = Math.min(height.get(lp),height.get(rp));
// //             int width = rp - lp;
// //             int currWater = ht*width;
// //             maxWater = Math.max(maxWater,currWater);

// //             //updater ptr
// //             if(height.get(lp)<height.get(rp)) {
// //                 lp++;
// //             } else {
// //                 rp--;
// //             }
// //         }
// //         return maxWater;
// //     }
    
    
// //     public static void main(String args[]){
// //         ArrayList<Integer> height = new ArrayList<>();
// //         //1,8,6,2,5,4,8,3,7
// //         height.add(1);
// //         height.add(8);
// //         height.add(6);
// //         height.add(2);
// //         height.add(5);
// //         height.add(4);
// //         height.add(8);
// //         height.add(3);
// //         height.add(7);

// //       System.out.println("Max WaterStored : "+storeWater(height));
// //       System.out.println("Max WaterStored2 : "+optimzedStore(height));

// //     }
// // }

// // public class Placement{
// //     //brute force
// //     public static boolean pairSum1(ArrayList<Integer> list,int target){
        
// //         for(int i=0;i<list.size();i++){
// //             for(int j=i+1;j<list.size();j++){
// //                 if(list.get(i)+list.get(j)==target){
// //                     return true;
// //                 }
// //             }
// //         }
// //         return false;
// //     }
// //     public static boolean pairSum2(ArrayList<Integer> list,int target){
// //         int lp =0;
// //         int rp = list.size()-1;
// //         //loop
// //         while(lp<rp){
// //             //case1
// //             if(list.get(lp)+list.get(rp)==target){
// //                 return true;
// //                 //case2
// //             } else if(list.get(lp)+list.get(rp)<target){
// //                 lp++;
// //                 //case3
// //             } else if(list.get(lp)+list.get(rp)>target){
// //                 rp--;
// //             }
// //         }
// //         return false;
// //     }
// //     public static void main(String args[]){
// //         //ArrayList
// //         ArrayList<Integer> list = new ArrayList<>();
// //         //1,2,3,4,5,6
// //         list.add(1);
// //         list.add(2);
// //         list.add(3);
// //         list.add(4);
// //         list.add(5);
// //         list.add(6);
// //         int target = 10;
// //        // System.out.println(pairSum1(list, 50));
// //        System.out.println(pairSum1(list, 10));
// //     }
// // }

// /* ARE CHECK KARIYE */
// // public class Placement{

// //     public static int pairSum2(ArrayList<Integer> list,int target){
// //         int bp = -1;
// //         int n = list.size();
// //         for(int i=0;i<list.size();i++){
// //             if(list.get(i) > list.get(i+1)){
// //                 bp = i;
// //                 break;
// //             }
// //         }
// //         int lp = bp+1;//smallest
// //         int rp = bp;

// //         while(lp != rp){
// //             //case1
// //             if(list.get(lp)+ list.get(rp) == target){
// //                 return 1;
// //             } 
// //             //case 2
// //             if(list.get(lp)+list.get(rp) < target){
// //                 lp = (lp+1) % n;
// //             }
// //             //case3
// //             if(list.get(lp)+list.get(rp) > target){
// //                 lp = (n+rp-1) % n;
// //             }
// //         }
// //         return 0;
// //     }
// //     public static void main(String args[]){
// //         ArrayList<Integer> list = new ArrayList<>();
// //         //11,15,6,8,9,10 -> Sorted & Rotated
// //         list.add(11);
// //         list.add(15);
// //         list.add(6);
// //         list.add(8);
// //         list.add(9);
// //         list.add(10);
// //         int target = 16;

// //         System.out.println(pairSum2(list, 16));

     
// //     }
// // }

/* *************************** */
/* ************************** */
/*  LINKED LIST THROUGH JCF  */
/* **************************/

public class Placement {
    private Node getMid()

    public Node mergeSort(Node head){
        if(head == null || head.next!=null){
            return head;
        }
        //find mid
        Node mid = getMid();

        //left & right MS
        Node reightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft , newRight);
    }
    public static void main(String args[]){
        //create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0 ->1 ->2
        System.out.println(ll);
       
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
}

  