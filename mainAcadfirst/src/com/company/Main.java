package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


       /* System.out.println("Hello, MA!");*/


       int sideA;
       int sideB;

        sideA=10;
        sideB=20;

        int square =sideA*sideB;

        System.out.println(sideA*sideB);

        System.out.println("Square of rectangle = " + square);

        System.out.println("Square"+ " "+" = " +square);//concat...

        CalcReqsquare(sideA, sideB);

    }

    public static void CalcReqsquare( int sideA, int sideB) {

//        int sideA = 10;
//        int sideB = 20;
        int x = 30;
        int y = 20;

        if (x<y){

            System.out.println("x<y -> true");
        }
        else
            if (x==y) {

                System.out.println("ravno");


            }

//        int z=0, q=20;
//        while (z<10) {
//
//            System.out.println("yeah,  "+z);
//
//            z++;
//        }

        for ( int w=0; w<10; w++) {
            System.out.println("iteration" +w);

        }



       // System.out.println(sideA * sideB);

        //int square =sideA*sideB;




        //System.out.println("Square of rectangle = " + square);

    }



    }



