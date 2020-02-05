package com.maven.epam_task2;

import java.util.*;
public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
		// List of objects of the sweet class
		
        List<Sweet> gift = new ArrayList<Sweet>();
        
        Sweet sweet1=new Chocolate("Dark Choclate",2,70,10);
        gift.add(sweet1);
        Sweet sweet2=new Chocolate("White Choclate",1,65,20);
        gift.add(sweet2);
        Sweet sweet3=new Candies("Cramel",4,55,10);
        gift.add(sweet3);
        Sweet sweet4=new Candies("Candy buttons",8,45,16);
        gift.add(sweet4);
        Sweet sweet5=new Jalebi("Jalebi",5,80,15);
        gift.add(sweet5);
        Sweet sweet6 = new Rasmalai("Rasmalai",6,85,18);
        gift.add(sweet6);
        Sweet sweet7 =new Candies("Gummies",3,45,10);
        gift.add(sweet7);
        Sweet sweet8 =new Candies("Candy canes",7,60,14);
        gift.add(sweet8);
        Sweet sweet9=new Chocolate("Milk Choclate",9,35,22);
        gift.add(sweet9);
        Sweet sweet10=new Chocolate("Hershely",10,75,11);
        gift.add(sweet10);
        List<Sweet> chocolate=new ArrayList<Sweet>();
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Chocolate){
                chocolate.add(gift.get(i));
            }
        }
        
        
        //sorted by weight of chocolates
        System.out.println("1)Enter 1 for sort chocolate by weight\n2)Enter 2 for sort chocolate by cost\n3)Enter 3 for sort chocolate by sweetness\n4)EXIT\n");
        
        
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        System.out.println();
        while(true) {
        
        if(choice ==1) {
	        System.out.println("Chocolates are sorted by their weights");
	        System.out.println();
	        Collections.sort(chocolate,new Sortbyweigth());
	        for(int i=0;i<chocolate.size();i++){
	        	System.out.println(chocolate.get(i).name+" cost is "+chocolate.get(i).cost+" weigth of chocolate is "+chocolate.get(i).weigth+" gms and its sweetness is "+chocolate.get(i).sweetness);
	        }
	        System.out.println("\n1)Enter 1 for sort chocolate by weight\n2)Enter 2 for sort chocolate by cost\n3)Enter 3 for sort chocolate by sweetness\n4)EXIT\n");
	        choice = in.nextInt();
        }
        
        
        if(choice == 2) {
	        System.out.println();
	        System.out.println("Chocolates are sorted by their cost");
	        System.out.println();
	        Collections.sort(chocolate,new Sortbycost());
	        for(int i=0;i<chocolate.size();i++){
	        	System.out.println(chocolate.get(i).name+" cost is "+chocolate.get(i).cost+" weigth of chocolate is "+chocolate.get(i).weigth+" gms and its sweetness is "+chocolate.get(i).sweetness);
	        }
	        System.out.println();
	        System.out.println("\n1)Enter 1 for sort chocolate by weight\n2)Enter 2 for sort chocolate by cost\n3)Enter 3 for sort chocolate by sweetness\n4)EXIT\n");
	        choice = in.nextInt();
        }
        
        if(choice == 3) {
	        System.out.println();
	        System.out.println("Chocolates are sorted by their sweetness");
	        System.out.println();
	        Collections.sort(chocolate,new Sortbysweetness());
	        for(int i=0;i<chocolate.size();i++){
	        	System.out.println(chocolate.get(i).name+" cost is "+chocolate.get(i).cost+" weigth of chocolate is "+chocolate.get(i).weigth+" gms and its sweetness is "+chocolate.get(i).sweetness);
	        }
	        System.out.println();
	        System.out.println("\n1)Enter 1 for sort chocolate by weight\n2)Enter 2 for sort chocolate by cost\n3)Enter 3 for sort chocolate by sweetness\n4)EXIT\n");
	        choice = in.nextInt();
        }
        
        if(choice == 4) break;
        }
        
        int net_weigth=0;
        for(int i=0;i<gift.size();i++){
            net_weigth+=gift.get(i).weigth;
        }
        System.out.println();
        System.out.println("Total weigth of gift is "+net_weigth+" gm");
        //Calculates the total no of candy
        int count_candies=0;
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof Candies){
                count_candies++;
            }
        }
        System.out.println();
        System.out.println("No of Candies in the gift are "+count_candies);
        
        System.out.println();
        
        System.out.println("Do you want to list the candies Enter your choice Yes or No");
        
        System.out.println();
        
        in.nextLine();
        
        String candie_choice = in.nextLine();
        
        if(candie_choice.equals("yes") || candie_choice.equals("YES")) {
        	
        	List<Sweet> candies=new ArrayList<Sweet>();
            for(int i=0;i<gift.size();i++){
                if(gift.get(i) instanceof Candies){
                    candies.add(gift.get(i));
                }
            }
        	System.out.println();
        	System.out.println("Enter minimum range");
        	int min  = in.nextInt();
        	System.out.println("Enter maximum range");
        	int max = in.nextInt();
        	System.out.println("To which choice of the candy the ranges hass to apply");
        	System.out.println("\n1)weight\n2)cost\n3)sweetness");
        	int can_choi = in.nextInt();
	        	if(can_choi == 1) {
	        		Collections.sort(candies,new Sortbyweigth());
	        		for(int i=0;i<candies.size();i++) {
	        			if(candies.get(i).weigth>=min && candies.get(i).weigth<=max) {
	        				System.out.println(candies.get(i).name+" cost is "+candies.get(i).cost+" weigth of chocolate is "+candies.get(i).weigth+" gms and its sweetness is "+candies.get(i).sweetness);
	        			}
	        			//else System.out.println("No candies in that range");
	        		}
	        	}
	        	if(can_choi == 2) {
	        		Collections.sort(candies,new Sortbycost());
	        		for(int i=0;i<candies.size();i++) {
	        			if(candies.get(i).cost>min && candies.get(i).cost<max) {
	        				System.out.println(candies.get(i).name+" cost is "+candies.get(i).cost+" weigth of chocolate is "+candies.get(i).weigth+" gms and its sweetness is "+candies.get(i).sweetness);
	        			}
	        			//else System.out.println("No candies in that range");
	        		}
	        	}
	        	if(can_choi == 3) {
	        		Collections.sort(candies,new Sortbysweetness());
	        		for(int i=0;i<candies.size();i++) {
	        			if(candies.get(i).sweetness>min && candies.get(i).sweetness<max) {
	        				System.out.println(candies.get(i).name+" cost is "+candies.get(i).cost+" weigth of chocolate is "+candies.get(i).weigth+" gms and its sweetness is "+candies.get(i).sweetness);
	        			}
	        			//else System.out.println("No candies in that range");
	        		}
	        	}
        
        }
    }
}
