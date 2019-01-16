package com;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(isZhishu(a)){
            System.out.println("这是个质数，无法分解质因数");
        }
        else{
            for (int i=2;i<a;){
                int k=0;
                if (a%i==0)
                {
                    System.out.print(i+" ");
                    a/=i;
                    k=1;
                }
                if(k==0)
                    i++;
            }
            System.out.println(a);
        }
    }
    public static boolean isZhishu(int a){
        for (int i=2;i<Math.sqrt(a);i++){
            if (a%i==0)
                return false;
        }
        return true;
    }
}
