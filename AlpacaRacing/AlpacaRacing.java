package AlpacaRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlpacaRacing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        long d = Long.parseLong(s[1]);
        long k = Long.parseLong(s[2]);
        long x = Long.parseLong(s[3]);
        List<Long> alpacaSpeeds = new ArrayList<>();
        String line;
        long counter = n+1;
        while ((line = br.readLine()) != null && counter > 0) {
                long a = Long.parseLong(line);
                alpacaSpeeds.add(a);
                counter--;
        }
        long p = alpacaSpeeds.get(n);
        boolean canWin = true;
        long count = 0;
        for (int j = 0; j < alpacaSpeeds.size()-1; j++) {
            double alpacaSpeed = Double.valueOf(alpacaSpeeds.get(j));
            while (alpacaSpeed >= p && count <= k) {
                alpacaSpeed = alpacaSpeed * (100-x)/100;
                alpacaSpeed = Math.floor(alpacaSpeed);
                count++;
            }
            if (count > k) {
                canWin = false;
                break;
            }
        }
        if (canWin) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
