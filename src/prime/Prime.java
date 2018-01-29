
package prime;

//import java.util.Scanner;

/**
 *
 * @author brandonletier
 */
public class Prime {

//    public static void main(String[] args) {
//        
//        Scanner sc = new Scanner(System.in);
//        
//        int n = -1;
//        while(n != 0){
//        System.out.print("Enter a number : ");
//        n = sc.nextInt();
//        System.out.println( String.valueOf( isPrimeNumber(n) ) );  
//        System.out.println();
//        }
//    }
    
    public boolean isPrimeNumber(int number) {
        // 1 is not a prime.
        if (number == 1) {
            return false;
        }
        
        // Check for the only even prime number.
        if (number == 2) {
            return true;
        }
        
       // Check if Number is a multiply of 2
        if (number % 2 == 0) {
            return false;
        }
        
        // Only need to check up untill the square root of number.
        int sqRoot = (int) (Math.sqrt(number) + 1);
        
        // Check if number is a multiply of odd integers.
        for (int i = 3; i < sqRoot; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        
        // All conditions are met. Number is a prime
        return true;
    }
}