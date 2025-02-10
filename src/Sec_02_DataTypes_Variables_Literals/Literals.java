package Sec_02_DataTypes_Variables_Literals;

public class Literals {

    /*   Literals will also have data types.
       Any value of the decimal point is by default a double literal. It is not float
       Any value without decimal point is by default an integer.
       byte,short, int takes integer literals
       long - L or l
       float - F or f
       double - D or d
       char - ''
       boolean - true/false*/
    public static void main(String[] args) {

        //The below 3 datatypes take integer literals.
     /*byte b=15;
     short s=15;
     int i=15;
     System.out.println(b);
     System.out.println(s);
     System.out.println(i);*/

        //literals in different number system
        byte b1 = 10;      //decimal
        byte b2 = 0b1010;  //binary
        byte b3 = 012;     //octal
        byte b4 = 0XA;     //hexadecimal
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);


        long l1 = 125; //assigning int to long and it is valid.
        long l2 = 999999999999999999L;

        //int i = 125L; //long type literal cannot be assigned to integer

        //float f =12.55; //invalid assignment of double literal to float
        double d=12.55;

        long l=999_999_999_999L; //using underscore to separate large figures. Underscore not allowed after the last digit.
        //float f=872_949_999_._55f; //invalid usage of underscore after and before the decimal point.
        float f=872_949_999.55f;
    }
}
