/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Homework09 {

    public static void main(String[] args) {
        int targetDivisors = 100; // Target number of divisors
        int triangleNumber = findTriangleNumberWithDivisors(targetDivisors);
        System.out.println("The first triangle number to have over " + targetDivisors + " divisors is: " + triangleNumber);
    }

    private static int findTriangleNumberWithDivisors(int targetDivisors) {
        int n = 1;
        while (true) {
            int triangleNumber = n * (n + 1) / 2; // Calculate triangle number
            int divisors = countDivisors(triangleNumber); // Count divisors of the triangle number
            if (divisors > targetDivisors) {
                return triangleNumber;
            }
            n++; // Increment n to find the next triangle number
        }
    }

    private static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // Check if i is a divisor of num
                if (i == num / i) {
                    count++; // If the divisor is sqrt(num), count it once
                } else {
                    count += 2; // Otherwise, count both divisor and quotient
                }
            }
        }
        return count; // Return the total count of divisors
    }
}