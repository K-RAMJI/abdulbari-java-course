package Sec_02_DataTypes_Variables_Literals;

public class Variables {

    public static void main(String[] args) {
        //Valid
        int x;
        int X;

        //Invalid
        //int roll number; //java: ';' expected

        //Valid
        int roll_number$student;

        //Invalid
        //int 1x;

        //Valid
        int _x;

        //Invalid use of class name
        int Integer=10;
        int System=10;
        int Scanner=10;
        int Byte=10;
        int Float=10;

        //Valid
        int rollNumberOfStudents;//camelCase
        float averageMarksOfClass;
    }
}