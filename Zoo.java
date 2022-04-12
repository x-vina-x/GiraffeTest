/*
Add support for daily promos.

Build a calculator that incorporates the deals:
    - rocky road buy 2 get 3rd one free
    - cookies and cream buy 2 get 3rd one 1/2 off


Rock road - 8 zdr
cookies and cream - 10 zdr
netflix and chill - 12 zdr

*/

import java.util.Scanner;
import java.util.Objects;


public class Zoo{
    static double total;
   
    //Calculation method to gather total price and subtract discount
    public static double calculation(int count, int price, double discount) {
        
        total = count * price - discount;
        return total;
    }
    
    //Deal method to calculate the amount of discount necessary for ice cream flavour.
    private static double deal(String typeInput, int typeCount) {
        double discount = 0;
        int count = 0;
        for(int i=1; i<=typeCount; i++){
            if(i%3==0){
                count = count +1;
            }
        }
        if("RR".equals(typeInput)){      
            discount = count * 8.00;

        } else if("CC".equals(typeInput)){
            discount = count *(10.00 * 0.50);
        }
        return discount;
    }
    public static void main(String[] args) {

        System.out.println("Input order: ");
        //Asking format is FlavourType then the amount. Example: RR 5
        
        try (Scanner sc = new Scanner(System.in)) {

            //Setting up the database of available flavours
            Flavour[] typeFlavours = new Flavour[3];

            typeFlavours[0] = new Flavour("RR", 8);
			
            typeFlavours[1] = new Flavour("CC", 10);

            typeFlavours[2] = new Flavour("NC", 12);
            
            //Reading for user input
            String typeInput = sc.next();
            int typeCount = Integer.parseInt(sc.next());

            //Main process in gathering appropriate flavour type, the price, any discount, overall calculation
            for(int i = 0; i<typeFlavours.length; i++){
                if(Objects.equals(typeInput, typeFlavours[i].getFlavourType())){
                    double discount = deal(typeInput, typeCount);
                    calculation(typeCount, typeFlavours[i].getFlavourPrice(), discount);
                }
            }
            System.out.println("Your total for "+ typeCount+ " " + typeInput+ " is: " + total);
            System.exit(0);

		} catch (NumberFormatException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
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
