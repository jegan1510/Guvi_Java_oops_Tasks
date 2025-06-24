package JavaPrograms;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine().toLowerCase();
        String reversed = "";

        int i = original.length() - 1;
        while (i >= 0) {
            reversed += original.charAt(i);
            i--;
        }

        if (original.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

