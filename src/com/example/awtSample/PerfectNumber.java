package com.example.awtSample;

public class PerfectNumber {

    public boolean PerfectNumber(int number){

        int temp = 0;
        for(int i=1;i<=number/2;i++){
            if(number%i == 0){
                temp += i;
            }
        }
        if(temp == number){
            System.out.println("These integer number is a perfect number");
            return true;
        } else {
            System.out.println("These integer number is not a perfect number");
            return false;
        }
    }

    public static void main(String a[]){
        PerfectNumber ipn = new PerfectNumber();
        System.out.println("These integer number is a : "+ipn.PerfectNumber(28));
    }
}
