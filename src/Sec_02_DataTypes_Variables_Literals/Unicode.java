package Sec_02_DataTypes_Variables_Literals;

public class Unicode {

    public static void main(String[] args) {
        char x =0x03c8;

        /*ramji@BEAST:~/RAMJI/Repos/abdulbari-java-course$ echo $LANG
        en_US.UTF-8
        ramji@BEAST:~/RAMJI/Repos/abdulbari-java-course$*/
        //for(char c='\u0B85'; c<='\u0B94';c++){
        for(char c=0x0370; c<=0x03ff;c++){
            System.out.print(c+" ");

        }
    }
}
