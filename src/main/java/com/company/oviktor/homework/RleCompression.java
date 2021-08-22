package com.company.oviktor.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RleCompression {

    private static Logger log = LoggerFactory.getLogger(RleCompression.class);

    public String encode(String input) {
        if (input == null || input.isEmpty())
            return "";

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
        if (output == null || output.isEmpty())
            return "";

        StringBuilder resultOut = new StringBuilder();

        for (int i = 0; i < output.length(); i++) {

            if (!Character.isDigit(output.charAt(i))) {
                char c = output.charAt(i);
                StringBuilder count = new StringBuilder();
                while (i + 1 <= output.length() - 1 && Character.isDigit(output.charAt(i + 1))) {
                    count.append(output.charAt(i + 1));
                    i++;
                }
                resultOut.append(String.valueOf(c).repeat(Integer.parseInt(count.toString())));
            }
        }
        return resultOut.toString();
    }

    public static void main(String[] args) {

        RleCompression rle = new RleCompression();
        log.info("Output encode method is: " + rle.encode("66666668888844552222231"));
        log.info("Output decode method is: " + rle.decode("A9B5J3l6v20"));
    }
}