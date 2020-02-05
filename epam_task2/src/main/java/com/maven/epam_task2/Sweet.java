package com.maven.epam_task2;

import java.util.Comparator;

public class Sweet { 
	    String name; 
	    int cost;
	    int sweetness;
	    int weigth;
	    Sweet(String name,int cost,int sweetness,int weigth){
	        this.name=name;
	        this.cost=cost;
	        this.sweetness = sweetness;
	        this.weigth=weigth;
	    }
}
class Sortbyweigth implements Comparator<Sweet> { 
    public int compare(Sweet a, Sweet b){ 
        return a.weigth - b.weigth; 
    } 
}
//sort by using the cost of the sweets
class Sortbycost implements Comparator<Sweet> { 
    public int compare(Sweet a, Sweet b){ 
        return a.cost - b.cost; 
    } 
}
class Sortbysweetness implements Comparator<Sweet> { 
    public int compare(Sweet a, Sweet b){ 
        return a.sweetness - b.sweetness; 
    } 
}