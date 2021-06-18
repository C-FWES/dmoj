package Zeroes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            BigInteger x = BigInteger.valueOf(i);
            factorial = factorial.multiply(x);
        }
        int zeroes = 0;

        String factorialString = String.valueOf(factorial);

        for (int i = 0; i < factorialString.length(); i++) {
            if (factorialString.charAt(i) == '0') {
              zeroes+=1;
            }
        }

        System.out.println(zeroes);
    }
}
