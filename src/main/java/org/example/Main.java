package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);  
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        int op, flag = 0;
        double num1, num2;
        System.out.println("------------Calculator--------------");
		do{
			System.out.println("Choices of Operations:");
            System.out.println("");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
			System.out.println("");
            System.out.print("Enter your choice(number): ");
            op = scan.nextInt();
            if(op == 5) flag = 1;
            else
            {
                switch(op)
                {
                    case 1:
                        System.out.println("You Chose Addition!!");
                        System.out.print("Enter Operand 1: ");
                        num1 = scan.nextDouble();
                        System.out.print("Enter Operand 2: ");
                        num2 = scan.nextDouble();
                        Addition(num1, num2);   
                    break;

                    case 2:
                        System.out.println("You Chose Subtraction!!");
                        System.out.print("Enter Operand 1: ");
                        num1 = scan.nextDouble();
                        System.out.print("Enter Operand 2: ");
                        num2 = scan.nextDouble();
                        Subtraction(num1, num2);   
                    break;

                    case 3:
                        System.out.println("You Chose Multiplication!!");
                        System.out.print("Enter Operand 1: ");
                        num1 = scan.nextDouble();
                        System.out.print("Enter Operand 2: ");
                        num2 = scan.nextDouble();
                        Multiplication(num1, num2);   
                    break;

                    case 4:
                        System.out.println("You Chose Division!!");
                        System.out.print("Enter Operand 1: ");
                        num1 = scan.nextDouble();
                        System.out.print("Enter Operand 2: ");
                        num2 = scan.nextDouble();
                        Division(num1, num2);   
                    break;
                }
            }
        }while(flag == 0);
    }

    public static double Addition(double n1, double n2)
    {
        double res = n1 + n2;
        System.out.println("");
        System.out.println("Result is: " + res);
        System.out.println("");
        
        logger.info("[ADDITION OPERATION] [SUCCESS] " + n1 + "+" + n2);
        logger.info("[ADDITION OPERATION] [RESULT] " + res);

        return res;
    }

    public static double Subtraction(double n1, double n2)
    {
        double res = n1 - n2;
        System.out.println("");
        System.out.println("Result is: " + res);
        System.out.println("");
        
        logger.info("[SUBTRACTION OPERATION] [SUCCESS] " + n1 + "-" + n2);
        logger.info("[SUBTRACTION OPERATION] [RESULT] " + res);

        return res;
    }

    public static double Multiplication(double n1, double n2)
    {
        double res = n1 * n2;
        System.out.println("");
        System.out.println("Result is: " + res);
        System.out.println("");
        
        logger.info("[MULTIPLICATION OPERATION] [SUCCESS] " + n1 + "*" + n2);
        logger.info("[MULTIPLICATION OPERATION] [RESULT] " + res);

        return res;
    }

    public static double Division(double n1, double n2)
    {
        double res = n1 / n2;
        System.out.println("");
        System.out.println("Result is: " + res);
        System.out.println("");
        
        logger.info("[DIVISION OPERATION] [SUCCESS] " + n1 + "/" + n2);
        logger.info("[DIVISION OPERATION] [RESULT] " + res);

        return res;
    }
}