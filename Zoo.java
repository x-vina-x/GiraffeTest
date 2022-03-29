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


public class Zoo{
   
    public static int calculation(int count, int price) {
        int total;
        total = count * price;
        return total;
    }
    public static void main(String[] args) {

        System.out.println("Input order, in the input of Flavour Type then the amount. ex: RR 3");
        try (Scanner sc = new Scanner(System.in)) {
			Flavour rockyRoad = new Flavour("Rocky Road", 8);

            Flavour cookiesCream = new Flavour("Cookies & Cream", 10);

            Flavour netflixChill = new Flavour("Netflix & Chill", 12);
    
            String typeInput = sc.next();
            int typeCount = Integer.parseInt(sc.next());
            int total = calculation(typeCount, rockyRoad.getFlavourPrice());

            System.out.println("Your total for "+ typeCount+ " " + typeInput+ " is: " + total);
            System.exit(0);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
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
