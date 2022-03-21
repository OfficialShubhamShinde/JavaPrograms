package core_and_Advance_javaPrograms;

import java.util.Locale;

public class string {
    public static void main(String[] args) {
//        float b = 5.2028f;
//        System.out.printf("Hey print f is %5.4f", b);

//        Methods1 (.length)

        String st = "     SHubham    ";
        int length = st.length();
        System.out.println(st);

//        method 2 (.lower case)

        String lstring = st.toLowerCase();
        System.out.println(lstring);

//        method 3 (.toUpperCase)

        String uppercase = st.toUpperCase();
        System.out.println(uppercase);

//        method 4 (.trim)

        String trim = st.trim();
        System.out.println(trim);

//        method 5 (.substring)

        String substring = "shubham";
        System.out.println(substring.substring(3));

//        method 6 (.replace)

        String replace = substring.replace('s', 'k');
        System.out.println(replace);

//        method 7 (.startswith)


        System.out.println(substring.startsWith("shu"));

//        method 8 (.endswith)


        System.out.println(substring.endsWith("am"));

//        method 9 (.char at)

        System.out.println(substring.charAt(4));

//        method 10 (.index of)

        System.out.println(substring.indexOf("h", 1));


//        method 11 (.index of)

        System.out.println(substring.indexOf("shu"));

//        method 12 (.last index)

        System.out.println(substring.lastIndexOf("h"));

//        method 13 (.equal)

        System.out.println(substring.equals("shubham"));


//        Method 14 (equalsIgnoreCase)


        System.out.println(substring.equalsIgnoreCase("Shubham"));

    }
}
