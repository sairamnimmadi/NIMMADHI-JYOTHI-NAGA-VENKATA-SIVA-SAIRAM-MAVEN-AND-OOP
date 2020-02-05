package com.maven.epam_task2;

public class Chocolate extends Sweet{
    //inheritance
    String name;
    int cost;
    int sweetness;
    int weigth;
    Chocolate(String name,int cost,int sweetness,int weigth){
        super(name,cost,sweetness,weigth);
    }
}