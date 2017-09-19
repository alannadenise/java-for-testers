package com.javafortesters.chap009arrays;

public class Chap009Methods {

    public static void print2DPrintArray(int [][]multi){
        for(int[] outer : multi){
            if(outer==null){
                System.out.print("null");
            }else{
                for(int inner : outer){
                    System.out.print(inner + ",");
                }
            }
            System.out.println("");
        }
    }
}
