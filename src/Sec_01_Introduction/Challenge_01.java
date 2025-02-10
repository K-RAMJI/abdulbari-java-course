package Sec_01_Introduction;
import java.lang.*;
import java.util.*;

public class Challenge_01
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter which technology you are learning : ");
        String Tech_Name=sc.nextLine();

        System.out.println(name+", Welcome to "+Tech_Name+" !!!");


    }
}
