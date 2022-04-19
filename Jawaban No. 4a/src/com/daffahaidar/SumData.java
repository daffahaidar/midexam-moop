package com.daffahaidar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SumData implements Word {

    public int simpleparse(String[] words) {
        int[] num = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            num[i] = Integer.parseInt(words[i]);
        }
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public int stringbuilder(String[] words) {
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            StringBuilder num = new StringBuilder();
            for (char index : word) {
                if (Character.isDigit(index)) {
                    num.append(index);
                }
            }
            result += Integer.parseInt(num.toString());

        }
        return result;
    }

    public double regex(String[] words) {
        double result = 0;
        for (int i = 0; i < words.length; i++) {
            Pattern pattern = Pattern.compile("-?\\d+\\.?\\d*");

            Matcher num = pattern.matcher(words[i]);
            while (num.find()) {
                result += Double.parseDouble(num.group());
            }
        }
        return result;
    }

    // overloading
    public double regex(String words) {
        double result = 0;
        Pattern pattern = Pattern.compile("-?\\d+\\.?\\d*");
        Matcher num = pattern.matcher(words);
        while (num.find()) {
            result += Double.parseDouble(num.group());
        }
        return result;
    }

    @Override
    public int simpleparse() {
        return 0;
    }

    public int stringbuilder() {
        return 0;
    }

    public double regex() {
        return 0;
    }

}