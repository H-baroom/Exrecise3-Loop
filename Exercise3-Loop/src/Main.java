import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
1.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that
number.
If the number is a multiple of 5, you need to print "Buzz" instead of that
number.
If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
instead of that number.
         */
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println("i = " + i);
            }
        }
                    /*
2.Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox Expected Output: Reverse
string: xof nworb kciuq ehT
         */

            char revears_char;
            String revears ="";
        System.out.println("please enter String to revers : ");
            String statmeant = input.nextLine();
            for (int j = 0; j < statmeant.length(); j++) {
                revears_char =statmeant.charAt(j);
                revears = revears_char + revears;
            }
        System.out.println(revears);
                    /*
3.Write a program to find the factorial value of any number entered
through the keyboard.
         */
        System.out.println("please enter the number to find the factorial of this number :  ");
        long sum_factorial=1;
        int factorial = input.nextInt();
        for (int d = 1; d <= factorial; d++) {
            sum_factorial = sum_factorial * d;
        }
        System.out.println("the factorial value of : "+factorial+" is equal : "+sum_factorial);

                    /*
4.Two numbers are entered through the keyboard. Write a program to find
the value of one number raised to the power of another. (Do not use Java 
built-in method) 
         */
        System.out.println("please enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("please enter the second number : ");
        int num2 = input.nextInt();
        int sum_of_power =num1;
        for (int l = 0; l < num2-1 ; l++) {
            sum_of_power = sum_of_power *num1;
        }
        System.out.println("the result of the first number ("+num1+") raised to the power of second number ("
                +num2+") is equal :"+ sum_of_power);
        

                    /*
5.Write a program that reads a set of integers, and then prints the sum of
the even and odd integers.
         */
        int even =0 ;
        int odd =0 ;
        int set_int =0;
        do{
            System.out.println("please enter the number, and 0 for quit : ");
            set_int = input.nextInt();
            if(set_int % 2 ==0){
                even += set_int;
            }else{
                odd += set_int;
            }
        }while(set_int != 0);
        System.out.println("the sum of odd number = " + odd);
        System.out.println("the sum of even number = " + even);
                    /*
6.Write a program that prompts the user to input a positive integer. It
should then output a message indicating whether the number is a prime
number.
        */

        boolean isprime = true;
        System.out.println("please enter the positive number ; ");
        int positive_int = input.nextInt();
        if (positive_int == 0 || positive_int == 1) {
            isprime = false;
        } else if (positive_int < 0) {
            System.out.println("this is not the positive number ; ");
            isprime = false;
        }else if (positive_int == 2) {
            isprime = true;
        }else {
            for (int c = 2; c < positive_int; c++) {
                if(positive_int % c == 0){
                    isprime = false;
                    break;
                }
            }
        }

        if(isprime){
            System.out.println("this is a prime number ");
        }else {
            System.out.println("this is not a prime number ");
        }


                    /*
7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
another for loop to print the days (Days 1 -7) for each week.
Expected Output:
Week 1
Day1
Day2
Day3
Day4
Day5
Day6
Day7
Week 2
Day1
Day2
...
         */
        System.out.println("please enter the number of weeks : ");
        int weeks = input.nextInt();
        for (int a = 1; a <= weeks ; a++) {
            System.out.println("week "+a);
            for (int b = 1; b <= 7; b++) {
                System.out.println("Day"+b);
            }

        }
                    /*
8.Write a program thats check if the word is a palindrome or not. hint: A
string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left.

         */

        boolean ispalindrome = true;
        input.nextLine();
        System.out.println("please enter word : ");
        String word = input.nextLine();
        if(word.length() % 2 == 0 && !word.isEmpty()) {
            int length_decrament =word.length()-1;
            for (int p = 0; p <= (int)word.length()/2; p++) {
                if (word.charAt(p) == word.charAt(length_decrament) ){
                    length_decrament--;
                }else{
                    ispalindrome = false;
                }
            }
        }else {
            System.out.println(" the length of the word is odd ");
            ispalindrome = false;
        }

        if (ispalindrome){
            System.out.println("the word "+word+" is a palindrome");
        }else {
            System.out.println("the word "+word+" is not a palindrome");
        }

    }
}