package actionsWithNumbers;

import java.util.Scanner;

public class ActionsWithNumbers {
    int a;
    int b;
    ActionsWithNumbers(int a,int b){
        this.a=a;
        this.b=b;
    }
    static void sum(){
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("sum ="+ (a+b));
    }
    static void difference(){
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("difference ="+ (a-b));
    }
    static void product(){
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("product ="+ (a*b));
    }

    public static void main(String[] args) {
        sum();
        difference();
        product();
    }
}

