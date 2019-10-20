package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int n;
        int sum;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i = 0; i < n; i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum + " ");
        }
    }
}