package com.company.oviktor.homework;

public class RunLengthEncoding {

    public void encode (String str) {
        int counter = 1;
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            while (i < str.length() - 1  && str.charAt(i) == str.charAt(i+1) ) {
                counter++;
                i++;
            }
            output.append(str.charAt(i)).append(counter);

        }
        System.out.println("Input string is : " + str);
        System.out.println("Output string is : " + output);
        System.out.println("Difference is : " + (str.length() - output.length()));

    }

    public static void main(String[] args) {
        new RunLengthEncoding().encode("AAAAbbCCCCCCppphffHydLLLLLLLBBBc");
    }
}
