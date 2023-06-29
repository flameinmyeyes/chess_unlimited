package com.example.chess_unlimited.pictures;
public class Test {


    public static void main(String[] args) {

        double x = 3.0;
        double y = 297.0;
        int valueX = (int) x;
        int valueY = (int) y;

        System.out.println(Integer.toString(valueY).length());


        System.out.println(String.valueOf(y).charAt(1));

//        if (Integer.toString(valueY).length()>1){
//            char[] dst=new char[Integer.toString(valueY).length() - 1];
//            Integer.toString(valueY).getChars(1,Integer.toString(valueY).length(), dst,0);
//            System.out.println(dst);
//            if (Integer.parseInt(String.valueOf(dst))>50){
//                return String.valueOf(y).charAt(1)+ "00";
//            }
//        }

    }
}

