package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int x=p.product(3,4);
//
        int z=p.product(3,4,5);
//
//        double y=p.product(3.5,4.5);
    }
}

class Product{
    public int product(int x, int y){
        return x;
    }
    public int product(int x, int y, int z) {
        return z;
    }
//
//    public double product(double x, double y) {
//        return y;
//    }
}