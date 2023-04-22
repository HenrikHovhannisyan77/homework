package triangle;

import java.util.Scanner;

public class Triangle {
    int a;
    int b;
    int himq;
    int h;
    Triangle(int a,int b,int himq,int h){
        this.a=a;
        this.b=b;
        this.himq=himq;
        this.h=h;
    }
    static void makeres(){
        System.out.println("Nemuceq 0-ic mec tver");
        Scanner scanner=new Scanner(System.in);

        int himq = scanner.nextInt();
        int h = scanner.nextInt();

        if (  h<0 && himq<0 ){
            System.out.println("  duq mutqagreleq 0<= tiv");
        }

        System.out.println("Makeres="+ (himq*h)/2);

    }
   static void paragic(){
        System.out.println("Nemuceq 0-ic mec tver");
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int himq = scanner.nextInt();
        if( ((a+b<himq) &&(a+himq<b) && (himq+b<a)) && (a<=0 && b<=0 && himq<=0 )){
            System.out.println("  duq mutqagreleq 0<= tiv");
        }

      /*  else if ((b+c<a) && (a>0 && b>0 && c>0)){
            System.out.println("b+c-i gumary petq e lini poqr a-ic,kam duq mutqagreleq 0<= tiv");

        }*/else {
            System.out.println("Paragic ="+ (a+b+himq));
        }


    }

    public static void main(String[] args) {

        paragic();
        makeres();




    }

}
