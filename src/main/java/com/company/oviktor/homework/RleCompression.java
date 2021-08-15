package com.company.oviktor.homework;

public class RleCompression {

    public String encode(String input) {
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < input.length(); i++) {
            int count = 1;
            while (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;

            }

            result.append(input.charAt(i)).append(count);


        }
        return result.toString();
    }

    public static void main(String[] args) {

        RleCompression rle = new RleCompression();
        System.out.println(rle.encode("AAbbM"));
    }
}