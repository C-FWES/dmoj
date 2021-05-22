package KoalaKonundrum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KoalaKonundrum {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.next());
//        String s = sc.next();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        br.close();
        int oddLetters = 0;
        char[] c = s.toCharArray();
        Map<Character, Integer> letterCount = new HashMap<>();
        for (char c1 : c) {
            if (letterCount.containsKey(c1)) {
                letterCount.put(c1, letterCount.get(c1)+1);
            }
            else {
                letterCount.put(c1, 1);
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : letterCount.entrySet()) {
            if (characterIntegerEntry.getValue() % 2 != 0) {
                oddLetters++;
            }
        }

        System.out.println(Math.max(1, oddLetters));
    }
}
