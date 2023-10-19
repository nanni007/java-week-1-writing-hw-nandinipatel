package homework_week_5;

import com.sun.jdi.Value;

/**
 * 7. Write a Java Program to print the sum of two numbers.
 * Test data: 74 + 36
 * Expected Output: 110
 */
public class Programme_7_SumOfTwoNumbers {
    public static void main(String[] args) {
        //The two integers are Value1 and Value2
        int value1 = 74;
        int value2 = 36;
        int sum = value1 + value2;
        //Concatenation
        System.out.println("The the sum of: " + value1 + " and " + value2  + " is: " + sum);
    }
}
