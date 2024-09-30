package review_ques;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NthP {
    public static void main(String[] args) {

        int r = 2;
        int base = 2;

        for (int i = 1; i < 4; i++) {
            r = r * base;
        }
        System.out.println(r);

    }

}
