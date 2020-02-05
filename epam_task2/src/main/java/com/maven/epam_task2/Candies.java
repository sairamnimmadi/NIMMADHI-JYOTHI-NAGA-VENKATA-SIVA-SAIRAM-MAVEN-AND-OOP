package com.maven.epam_task2;


public class Candies extends Sweet{
    //inheritance
    String name;
    int cost;
    int sweetness;
    int weigth;
    Candies(String name,int cost,int sweetness,int weigth){
        super(name,cost,sweetness,weigth);
    }
}