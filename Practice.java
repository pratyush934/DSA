import java.util.*;


/* Questions Lect 2  */

/* Question 1 */ /* 

public class Practice{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. a : ");
        float a = sc.nextFloat();
        System.out.print("Enter No. b : ");
        float b = sc.nextFloat();
        System.out.print("Enter No. c : ");
        float c = sc.nextFloat();

        double Average = (a + b + c) / 3 ;

        System.out.println("Your Average : " + Average);


    }
}
*/

/* Question 2  */
/* 

public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of square : ");
        float a = sc.nextFloat();
        double Area = a*a;
        System.out.println("Area of Square : " + Area );
    }
}
*/

/* Question 3 */
/* 
public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of Pencil : ");
        float Pencil = sc.nextFloat();
        System.out.print("Enter the cost of Pen : ");
        float Pen = sc.nextFloat();
        System.out.print("Enter the cost of Eraser : ");
        float Eraser = sc.nextFloat();
        

        double Sum = (Pencil + Pen + Eraser ) ;
        System.out.println("Total : " + (Sum + 0.18 * Sum ));

    }
}
*/
/* 
public class Practice{
    public static void main(String args[]){
        byte b =  4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

       double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);


    }
}
*/

/* Question 5 */
// public class Practice{
//     public static void main(String args[]){
//         int $ = 24;
//         System.out.println($);
//     }

// }
/* LECTURE 4 */
/* 
public class Placement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("***********");
        System.out.println("***CHECK***");
        System.out.println("***********");
        System.out.print("Enter Your No. : ");
        int Number = sc.nextInt();
        if(Number > 0){
            System.out.println("Number is Positive");
        } else {
            System.out.println("No. is Negative");
        }
    
    }
}
*/

/* Question 2 */
/* 
 public class (Placement{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("***********");
        System.out.println("***CHECK***");
        System.out.println("***********");
        System.out.println("Enter your Temp : ");
        double Temp = sc.nextDouble();
        if(Temp >= 100){
            System.out.println("You Have Fever");
        } else {
            System.out.println("You do not have fever");
        }
    }
 } */

 /* Question 3  */
 /* 
 public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("**********");
        System.out.println("***WEEK***");
        System.out.println("**********");
        System.out.print("Enter Week No. : ");
        int Week = sc.nextInt();
        switch(Week) {
            case 1 : System.out.println("Sunday");
            break;
            case 2 : System.out.println("Monday");
            break;
            case 3 : System.out.println("Tuesday");
            break;
            case 4 : System.out.println("Wednesday");
            break;
            case 5 : System.out.println("Thursday");
            break;
            case 6 : System.out.println("Friday");
            break;
            case 7 : System.out.println("Saturday");
            break;
            default : System.out.println("There are only Seven days in week");

        }
    }
 }
 */ /* Question 5  */
 /* 
public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("***************");
        System.out.println("***LEAP YEAR***");
        System.out.println("***************");
        System.out.print("Enter Year : ");
        long Year = sc.nextLong();

        boolean x = Year % 4 == 0;
        boolean y = Year % 100 != 0;
        boolean z = Year % 100 == 0 && Year %  400 == 0 ;

        if ( x && (y || z)){
            System.out.println(Year + " is leap Year ");
        } else {
            System.out.println(Year + " is not a leap Year ");
        }


    }
}
*/ /* Lecture 5 */ 

/* Question 1 */
/* 
public class Practice{
    public  static void main(String args[]){
        for( int i = 0; i<5 ; i++){
            System.out.println("Hello");
            i+=2;
        }
    }
}*/
/*Question 2 */
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your No. : ");
//         int n = sc.nextInt();
//         for(int i = 1)

//     }
// }

/* Question 3 */

// public class Practice{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your No. : ");
//         int n = sc.nextInt();
//         int factorial = 1;

//         for(int i = 1 ; i<= n ; i++){
//             factorial = factorial * i;

//         }
//         System.out.println("Factorial is : " + factorial);
//     }
// }

/* Question 4 */
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your No. : ");
//         int n = sc.nextInt();
//         int table;
        
//         for(int i = 1 ; i<=10 ; i++){
//             table = n*i;
//             System.out.println(table);
//         }
//     }
// }

/* Question 5 */
// public class Practice{
//     public static void main(String args[]){
//         for(int i = 0; i<=5 ; i++){
//             System.out.println("i = " + i);
//         }
//     }
// }
/* Practice Problems for functions /* Lecture FUNCTIONS */ 

/* Question 1 */
// public class Practice{
//     public static float isAverage(int a,int b,int c){
//         float average = (a+b+c)/3;
        
//         System.out.println("Your Average : " + average);
//         return average;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter No. a : ");
//         int a = sc.nextInt();
//         System.out.print("Enter No. b : ");
//         int b = sc.nextInt();
//         System.out.print("Enter No. c : ");
//         int c = sc.nextInt();

//             isAverage(a,b,c);


//     }
// }

/* Question 2 */
// public class Practice{

//     public static boolean isEven(int n){
//         boolean isEven = true;
//         if(n % 2 != 0){
//             isEven = false;
            

//         } else {
//             isEven = true;
//         }
//         System.out.println(isEven);
//         return isEven;
//     }


//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your No. : ");
//         int n = sc.nextInt();

//         isEven(n);

//     }
// }

/* Question 3 */ /* Important */
/*************************************/
/************************************/
// public class Practice{

//     public static boolean isPalindrome(int number){
//         int palindrome = number;
//         int reverse = 0;

//         while(palindrome != 0){
//             int remainder = palindrome % 10;
//             reverse = reverse*10 + remainder;
//             palindrome = palindrome / 10;
//         }
//         if(number == reverse){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your No. : ");
//         int palindrome = sc.nextInt();

//         if(isPalindrome(palindrome)) {
//             System.out.println("Yes " +  palindrome  + " is Palindrome");
//         } else {
//             System.out.println("No " +  palindrome  + " is not Palindrome");
//         }

//     }
// }
    
/* Question 5 */ /* Important */
/************************************* */
/************************************* */

// public class Practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your No. : ");
//         int number = sc.nextInt();
//         int sum = 0;
//         int lastdigit;

//         while(number !=0){
//             lastdigit = number % 10;
//             sum = sum + lastdigit;
//             number = number /10;

//         }
//         System.out.println("Your Sum is : " + sum);
//     }
// }

/* ARRAYS ARRAYS ARRAYS ARRAYS */
/* QUESTION 1 */
// public class Practice{
//     public static boolean Assignment1(int numbers[]){
//         int n = numbers.length;
//         for(int i=0;i<n;i++){
//                 int start = numbers[i];
//             for(int j=i+1;j<n;j++){
//                 int end = numbers[j];
//                 if(start == end){
//                    return true;
                    
//                 }
                
                
//             }
//         }
       
        
//         return false;
//     }
//     public static void main(String args[]){
//         int numbers[] = {1,1,2,1,3};
//        System.out.println(Assignment1(numbers));
//     }
// }
/* QUESTION 3 */
// public class Practice{
//     public static int Stock(int prices[]){
//         int maxProfit = 0;
//         int buyPrice = Integer.MAX_VALUE;
//         int n = prices.length;

//         for(int i=0;i<n;i++ ){
//             if(buyPrice<prices[i]){
//                 int profit = prices[i] - buyPrice;
//                 maxProfit = Math.max(profit , maxProfit);
//             } else {
//                 buyPrice = prices[i];
//             }
//         }
        
//         return maxProfit;



//     }
//     public static void main(String args[]){
//         int prices[] = {7,6,4,3,1};
//      System.out.println("Max Profit : " + Stock(prices));


//     }
// }

/* QUESTION 4 TRAPPED WATER */
// public class Practice{
    
//     public static int trappedWater(int height[]){
//         int trappedWater = 0;
//         int n = height.length;
//         //leftMax;
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i =1;i<n;i++) {
//             leftMax[i] = Math.max(height[i] , leftMax[i-1]);
//         }
//         //rightMax
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightMax[i] = Math.max(height[i] , rightMax[i+1]);
//         }
//         for(int i=0;i<n;i++){
//             //selecting minimum;
//             int waterlevel = Math.min(leftMax[i] , rightMax[i]);
//             //adding volumel
//             trappedWater += waterlevel - height[i];
//         }
//         return trappedWater;
//     }
//     public static void main(String args[]){
//         int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
//         System.out.println(trappedWater(height));
//     }
// }

/* QUESTION 5 */

// public class Pracitce{
//     public static void triplets(int numbers[]){
//         int n = numbers.length;
//         for(int i = 0;i<n-2;i++){
//             for(int j =i+1;j<n-1;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(numbers[i] + numbers[j] + numbers[k]){
//                         System.out.println("("+numbers[i]+","+numbers[j]+","+numbers[k] +")");
//                     }
//                 }
//             }
//         }
//     }
//     public static void main(String args[]){
//         int numbers[] = {-1,0,1,2,-1,-4};



//     }
// }

/* 2D ARRAYS */ /* ***************** */

/* Question 1 */

// public class Practice{
//     public static int search(int array[][]){
//         int count = 0;
//         for(int i=0;i<array.length;i++){
//             for(int j=i;j<array[0].length;j++){
//                 if(array[i][j] == 7 ){
//                     count++;
//                 }
//             }
           
//         }
//         System.out.println(count);
//         return count;

//     }
//     public static void main(String args[]){
//         int[][]array = {{4,7,8},{8,8,7},{79,78,71}};
//         search(array);

//     }
// }
/* SUM PROBLEM */
// public class Practice{
//     public static int sum(int numbers[][]){
//         int sum =0;
//         for(int j=0;j<numbers[0].length;j++){
//             sum += numbers[1][j];

//         }
//         System.out.println("Sum is : " + sum);
//         return sum;
//     }
//     public static void main(String args[]){
//         int numbers[][] = {{1,4,9},{11,4,3},{2,2,3}};

//         sum(numbers);

//     }
// }

/* Question 3 */
/* TRANSPOSE */

// public class Practice{
//     public static void transpose(int numbers[][] , int transpose[][]){
//         //creating transpose;
//         for(int i=0;i<transpose.length;i++){
//             for(int j=0;j<transpose[0].length;j++){
//                 transpose[i][j] = numbers[j][i];
//             }
//         }
//         //printing transpose;
//         for(int i=0;i<transpose.length;i++){
//             for(int j=0;j<transpose[0].length;j++){
//                 System.out.print(transpose[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int numbers[][] = {{1,2,3},{4,5,6}};
//         int transpose[][] =  new int[3][2];

//         transpose(numbers, transpose);


//     }
// }

