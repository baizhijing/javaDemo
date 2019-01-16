package com;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        char c=a>=90?'A':a<60?'C':'B';
        System.out.println(c);
    }
}
