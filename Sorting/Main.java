package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line;
        while ((line = br.readLine()) != null & n > 0) {
            list.add(Integer.parseInt(line));
            n-=1;
        }
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
