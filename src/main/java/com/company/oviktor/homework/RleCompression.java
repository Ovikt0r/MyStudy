package com.company.oviktor.homework;

public class RleCompression {

    public String encode(String input) {
        StringBuilder resultIn = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int count = 1;
            while (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;
            }
            resultIn.append(input.charAt(i)).append(count);
        }
        return resultIn.toString();
    }

    public String decode(String output) {
        StringBuilder resultOut = new StringBuilder();

        for (int i = 0; i < output.length(); i += 2) {
            if (Character.isAlphabetic(output.charAt(i)) && Character.isDigit(output.charAt(i + 1))) {
                char c = output.charAt(i);
                resultOut.append(String.valueOf(c).repeat(output.charAt(i + 1) - '0'));
            } else {
                System.out.println("The string has incorrect sequences of characters !");
            }
        }
        return resultOut.toString();
    }

    public String decode2 (String output) {
        StringBuilder resultOut = new StringBuilder();

        for (int i = 0; i < output.length(); i += 2) {
            if (Character.isAlphabetic(output.charAt(i)) && Character.isDigit(output.charAt(i + 1))) {
                char c = output.charAt(i);
                resultOut.append(String.valueOf(c).repeat(output.charAt(i + 1) - '0'));
            } else {
                System.out.println("The string has incorrect sequences of characters !");
            }
        }
        return resultOut.toString();
    }

    public static void main(String[] args) {

        RleCompression rle = new RleCompression();
        System.out.println(rle.encode("AAAAAAAAAAAAAAAbbM"));
        System.out.println(rle.decode("A15B5J3l6v1"));
    }
}