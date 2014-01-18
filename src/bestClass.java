/**
 *Created by Filip Milković
 *Program does nothing useful yet, it is just for testing and learning Java so I could work on Android and other stuff in the future
 *I'm learning C in school so I will not update this project in a while
 *Dates working on program: 03.01.2014 ; 13.01.2014 ; 14.01.2014 ; 18.01.2014 ;
 *Licence: *NONE*
 */
import java.util.Scanner;

public  class bestClass  {
    public static void main(String[] args){

//    testing types of numbers
        int i, n, number;

//get user input for number
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        number=reader.nextInt();

        System.out.println("Number is: " + number);

//get user input for n
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of repeats: ");
        n=read.nextInt();


//    if | else if | else statement
        if(number<0){
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

//    For statement
        for(i=1;i<=n;i++){
            System.out.println("I can print this how many times you want, and I know, it is lame...");
        }
    }
}
//examples from "http://docs.oracle.com/javase/tutorial/index.html"

