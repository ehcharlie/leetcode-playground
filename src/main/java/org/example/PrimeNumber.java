package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//Prints out the letters of the string that do not appear a prime number of times
//If all numbers are prime, prints "MARY"
public class PrimeNumber {


    public static void primeNumber() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        //The number of test cases
        int t = Integer.parseInt(br.readLine().trim());

        for (int t_i = 0; t_i < t; t_i++) {
            String string = br.readLine();
            String output = Remove(string);
            System.out.println(output);
        }

        wr.close();
        br.close();
    }

    private static String Remove(String string) {
        int[] characterFrequency = new int[26];

        //Characters have numeric values in ASCCI/Unicode
        //For example, 'a' = 97, 'b' = 98. 'c' = 99
        //So character - a, where character = a = 97-97 = 0 I.E index 0
        //Then, it increments the number at the index
        for (char character : string.toCharArray()) {
            characterFrequency[character - 'a']++;
        }

        String result = "";

        for (char character : string.toCharArray()) {
            int frequency = characterFrequency[character - 'a'];
            if (!isPrime(frequency)) {
                result += character;
            }
        }

        if (result.isEmpty()) {
            return "MARY";
        }

        return result;
    }

    private static boolean isPrime(int n) {

        //1 is not a prime number, as it doesn't have 2 divisors
        if (n <= 1) {
            return false;
        }

        //2 is the only even prime number, as it is divisible by 1 and itself
        if (n == 2) {
            return true;
        }

        //If a number is divisible by 2, it is not divisible by only 1 and itself
        if (n % 2 == 0) {
            return false;
        }

        //check only odd numbers up to the square root of n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; //Found a divisor other than 1 and itself, not prime
            }
        }

        return true;
    }
}