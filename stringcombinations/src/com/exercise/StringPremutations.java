package com.exercise;

import java.util.ArrayList;

public class StringPremutations {

    static ArrayList<String> strPremutations(String text, String answer) {
        ArrayList<String> output = new ArrayList<>();

        // stores individual combinations in return value
        if (text.length() == 0) {
            System.out.print(answer + " ");
            output.add(answer);
        }

        for (int i = 0; i < text.length(); i++) {
            // first character of the string
            char firstChar = text.charAt(i);

            // Rest of the text after excluding the first character
            String restOfText = text.substring(0, i) + text.substring(i + 1);

            // recursive call
            output.addAll(strPremutations(restOfText, answer + firstChar));
        }

        return output;
    }
}
