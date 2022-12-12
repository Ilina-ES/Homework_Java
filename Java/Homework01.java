/**
Java: знакомство и как пользоваться базовым API 
Урок 1. Знакомство с языком программирования Java
 */
import java.util.Scanner;

public class Homework01{
    public static void main(String[] args) {
        //primeNumbers();
        //calculator();
        factorial();
    }
    
/**
1. Вывести все простые числа от 1 до 1000
 */
public static void primeNumbers() {
    for (int j = 1; j <= 1000; j++) {
        boolean simple = false;

        for (int i = 2; i * i <= j; i++) {
            simple = (j % i == 0);
            if (simple) {
                break;
            }
        }
        if (!simple) {
            System.out.print(j + " ");
        }
    }
}

/**
2. Реализовать простой калькулятор
 */
public static void calculator() {
    double num1;
    double num2;
    double ans;
    char op;
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    num1 = reader.nextDouble();
    num2 = reader.nextDouble();
    System.out.print("\nEnter an operator (+, -, *, /): ");
    op = reader.next().charAt(0);
    switch(op) {
        case '+': ans = num1 + num2;
        break;
        case '-': ans = num1 - num2;
        break;
        case '*': ans = num1 * num2;
        break;
        case '/': ans = num1 / num2;
        break;
        default:  System.out.printf("Error! Enter correct operator");
        return;
      }
    System.out.print("\nThe result is given as follows:\n");
    System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
}

/**
3. Вычислить n! (произведение чисел от 1 до n)
 */
public static void factorial() {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите число n: ");
    int num = in.nextInt();
    int result = 1;
    for (int i = 1; i <= num; i++) {
        result = result * i;
    }
    System.out.print("\nФакториал от n равен: ");
    System.out.println(result);
}
}



