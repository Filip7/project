/**
 *Created by Filip Milković
 *Program does nothing useful, it is just for testing and learning Java so I could work on Android and Minecraft in the future
 *Dates working on program: 03.01.2014 ;
 *Licence: *NONE*
 */
/*
public  class bestClass {
    public static void main(String[] args){
//    testing types of numbers
        int number= 0b110011;
        number-=100;
        System.out.println("Number from binary system to decimal is: " + number);
//    text output
        System.out.println("Yayyy");
        System.out.println("Yayyy");
        System.out.println("I need to learn to code something new xD, this is getting boring");
        System.out.println("Arghhhhh I need to learn and concentrate ");
//    if | else if | else statement
        if(number<0){                                                                                   //No need for brackets, but it is easier to read and edit in the future coding
            System.out.println("Hello world!");
            number+= 0x69;
            System.out.println(number);
        }
        else if(number==0){
            System.out.println("Hello Croatia!");
        }
        else{
            System.out.println("Hello Samobor!");
        }
    }
}
*/


public class bestClass {
    public static void main(String[] args) {

        int[][] arrayOfInts = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
        };
        int searchfor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

        search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length;
                 j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}
