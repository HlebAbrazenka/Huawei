package HomeWork;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        System.out.println(word1 + " " + word2);


        //-----------------------------------------//
        int len1 = word1.length();
        int len2 = word2.length();
        System.out.println( "Number of letters: " + len1 + " num.");
        System.out.println( "Number of letters: " + len2 + " num.");


        //----------------------------------------------//
        System.out.println("First word = " + word1);
        System.out.println("Second word = " + word2);
        String word3 = (word1.substring(0, word1.length()/2)) +
                (word2.substring(word2.length()/2, word2.length()));
        System.out.println(word3);



        //------------------------------------------------//
                int x = 10;
                int y = 5;

                System.out.println(x+y);
                System.out.println(x-y);
                System.out.println(x*y);
                System.out.println(x/y);

        //------------------------------------------------//
        double dollar, euro;
        double amountEuro;
        int choice;
        amountEuro = scanner.nextFloat();
        dollar = amountEuro * 1.09;



        System.out.println("Amount of convert: " + amountEuro);
        System.out.println("Euro = " + dollar + " Dollar");

        //-------------------------------------------------//


            }
        }