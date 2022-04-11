/*
Add support for daily promos.

Build a calculator that incorporates the deals:
    - rocky road buy 2 get 3rd one free
    - cookies and cream buy 2 get 3rd one 1/2 off


Rock road - 8 zdr
cookies and cream - 10 zdr
netflix and chill - 12 zdr

could add in history of purchases?

*/

import java.util.Scanner;
import java.io.*;
import java.util.Objects;


public class Zoo{
    static double total;
   
    public static double calculation(int count, int price, double discount) {
        
        total = count * price - discount;
        return total;
    }
    public static void main(String[] args) {

        System.out.println("Input order: ");
        try (Scanner sc = new Scanner(System.in)) {

            Flavour[] typeFlavours = new Flavour[3];

            typeFlavours[0] = new Flavour("RR", 8);
			
            typeFlavours[1] = new Flavour("CC", 10);

            typeFlavours[2] = new Flavour("NC", 12);
            
    
            String typeInput = sc.next();
            int typeCount = Integer.parseInt(sc.next());

            for(int i = 0; i<typeFlavours.length; i++){
                if(Objects.equals(typeInput, typeFlavours[i].getFlavourType())){
                    double discount = deal(typeInput, typeCount);
                    calculation(typeCount, typeFlavours[i].getFlavourPrice(), discount);

                }
            }
            System.out.println("Your total for "+ typeCount+ " " + typeInput+ " is: " + total);

            System.exit(0);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    private static double deal(String typeInput, int typeCount) {
        double discount = 0;
        if("RR".equals(typeInput)){
            discount = (typeCount%2)*8;

        }else if("CC".equals(typeInput)){
            discount = (typeCount%2)*(10*0.5);
        }
        return discount;
    }
    
}


class Flavour{
    private String flavourType;
    private int flavourPrice;

    Flavour(String flavourType, int flavourPrice){
        this.flavourType = flavourType;
        this.flavourPrice = flavourPrice;
    }

    public String getFlavourType(){
        return flavourType;
    }

    public int getFlavourPrice(){
        return flavourPrice;
    }
}
