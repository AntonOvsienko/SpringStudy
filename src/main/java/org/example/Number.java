package org.example;

public class Number {

    public static void main(String[] args) {

        if (args == null) {
            main(new String[]{"A", "B", "Z", "AA", "AZ", "BA", "ZZ", "AAA" });
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.print(int2str(str2int(args[i])) + " ==> "
                        + str2int(args[i]) + " ==> "
                        + int2str(str2int(args[i])));
            }
        }
    }

    public static int str2int(String number) {
        char[] charnumber = number.toCharArray();
        int sum = 0;
        for (int i = 0; i < charnumber.length; i++) {
            sum += Math.pow(26, charnumber.length - i - 1) * (((int) charnumber[i]) - 64);
        }
        return sum;
    }

    public static String int2str(int number) {
        String symbol = "";
        while (true) {
            if (number % 26 == 0) {
                symbol += "Z";
                Character ch = symbol.charAt(0);
                number = (number - 26) / 26;
                if (ch.equals('Z')) {
                    if (number < 26) {
                        break;
                    }
                } else {
                    if (number <= 26) {
                        break;
                    }
                }
            } else {
                int index = number % 26 + 64;
                symbol += (char) (index) + "";
                Character ch = symbol.charAt(0);
                if (number <= 26) {
                    break;
                } else {
                    number = (number) / 26;
                }
            }
        }
        return new StringBuilder(symbol).reverse().toString();
    }

    public static String rightColumn(String number) {
        return int2str(str2int(number) + 1);
    }
}
