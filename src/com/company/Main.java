package com.company;

public class Main {

    public static void main(String[] args) {
        double s, sum;
        s=10;
        sum=0;
        for(int i=1; i<=7; i++){
            sum=sum+s;
            s=s+s*0.1;

        }
        System.out.printf("За 7 дней пробег составит "+"%.2f",sum);
        System.out.print(" км" );
    }
}
