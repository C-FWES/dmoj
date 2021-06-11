package SnowCalls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = n;
        String line;
        String[] phoneNumbers = new String[n];
        int i = 0;
        while ((line = br.readLine()) != null && count > 0) {
            phoneNumbers[i] = line;
            i+=1;
            count-=1;
        }
        Map<Character, String> numberMappings = new HashMap<>();
        creatMap(numberMappings);
        for (String phoneNumber : phoneNumbers) {
            String newString = phoneNumber.replace("-", "").substring(0, 10);
            newString = convert(newString, numberMappings);
            String converted = newString.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
            System.out.println(converted);
        }
    }


    public static String convert(String phoneNumber, Map<Character, String> numberMappings) {
        String converted = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (numberMappings.containsKey(phoneNumber.charAt(i))) {
                sb.append(numberMappings.get(phoneNumber.charAt(i)));
                continue;
            }
            sb.append(phoneNumber.charAt(i));
        }
        return new String(sb);
    }

    private static void creatMap(Map<Character, String> numberMappings) {
        numberMappings.put('A', "2");
        numberMappings.put('B', "2");
        numberMappings.put('C', "2");
        numberMappings.put('D', "3");
        numberMappings.put('E', "3");
        numberMappings.put('F', "3");
        numberMappings.put('G', "4");
        numberMappings.put('H', "4");
        numberMappings.put('I', "4");
        numberMappings.put('J', "5");
        numberMappings.put('K', "5");
        numberMappings.put('L', "5");
        numberMappings.put('M', "6");
        numberMappings.put('N', "6");
        numberMappings.put('O', "6");
        numberMappings.put('P', "7");
        numberMappings.put('Q', "7");
        numberMappings.put('R', "7");
        numberMappings.put('S', "7");
        numberMappings.put('T', "8");
        numberMappings.put('U', "8");
        numberMappings.put('V', "8");
        numberMappings.put('W', "9");
        numberMappings.put('X', "9");
        numberMappings.put('Y', "9");
        numberMappings.put('Z', "9");
    }
}