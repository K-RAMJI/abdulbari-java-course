package Sec_02_DataTypes_Variables_Literals;

public class IntegerToBinary {
    public static void main(String[] args) {
        //toHexString(int)
        //toOctalString(int)
        //toBinaryString(int)

        int number1=10; //stored in 2s compliment form
        int number2=-10; //stored in 2s compliment form
        System.out.println(Integer.toBinaryString(number1));
        System.out.println(Integer.toBinaryString(number2));
    }
}
