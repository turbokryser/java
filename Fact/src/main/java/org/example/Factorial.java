package org.example;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

    public static List<Long> getFactorials(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        List<Long> factorials = new ArrayList<>();
        factorials.add(1L); // 0! = 1

        for (int i = 1; i < n; i++) {
            factorials.add(factorials.get(i - 1) * i);
        }

        return factorials;
    }

    public static void main(String[] args) {
        try {
            List<Long> factorials = getFactorials(10);
            System.out.println(factorials);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}