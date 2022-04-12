# GiraffeTest
 Added support for daily promos. Deals are:
    - For cookies and cream, Buy 2 get 3rd one half priced
    - For Rocky Road, Buy 2 get 3rd one free

Assumptions made:
    - There is a never ending stock of ice cream, all orders can be accepted. Stock doesn't need to be checked or taken into account
    - Cashier/operator is fully trained in how to use the calculator 
    - The only available given currency in this world is ZDR.
    - Flavour names have different naming conventions for the calculator.
        - Cookies & Cream is CC
        - Rocky Road is RC
        - Netflix & Chill is NC (great name for an ice cream btw)

How to run:
The program is written in java. After compiling the program, the terminal will prompt you for your order. THe order format needs to be in the format of Flavour Type and then the amount. 
Example: CC 5 is an order for 5 Cookies & Cream, which should return 45, as 4 of the ice creams are at full price (10.00) and one at half priced (5.00).
System is set to immediately exit after one order. However future iterations could wait for the system to be asked to close rather than immediately exiting. 
