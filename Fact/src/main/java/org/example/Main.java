package org.example;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Factorial f=new Factorial();
        int n=sc.nextInt();
        List<Long> l=f.getFactorials(n);
        System.out.println(l);
    }
}