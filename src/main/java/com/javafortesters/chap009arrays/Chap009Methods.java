package com.javafortesters.chap009arrays;

public class Chap009Methods {

    public void print2DPrintArray(int [][]multi){
        for(int[] outer : multi){
            if(outer==null){
                System.out.println("null");
            }else{
                for(int inner : outer){
                    System.out.println(inner + ",");
                }
            }
            System.out.println("");
        }
    }
}
