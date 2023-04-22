package rectangle;

import java.util.Scanner;

public class Rectangle {
    private int length;
    private int breadth;
    public int getLength(){
      return this.length;
    }
    public int getBreadth(){
        return this.breadth;
    }
    public int setLength(int newLength){
        return breadth=newLength;
    }
    public int setBreadth(int newBreadth){
        return breadth=newBreadth;
    }

    static int reactangleS(){
        Scanner scanner = new Scanner(System.in);
        int length=scanner.nextInt();
        int breadth=scanner.nextInt();
        return  length*breadth;

    }
    static int rectangleP(){
        Scanner scanner = new Scanner(System.in);
        int length=scanner.nextInt();
        int breadth=scanner.nextInt();
        return ((length*2)+(breadth*2));
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.getBreadth();
        rectangle.getLength();
        System.out.println("Breadth=" +rectangle.setBreadth(7));
        System.out.println("Length=" + rectangle.setLength(8));
        System.out.println("P=" + rectangleP());
        System.out.println("S=" + reactangleS());
    }
}
