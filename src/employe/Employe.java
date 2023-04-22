package employe;

import employeHajord.EmployeHajord;

class Employe1 {
    String name;
    String yearOfJoining;
    int salary;
    int workingHours;
    String adress;
    Employe1(String name,String yearOfJoining,int salary,int workingHours,String adress){
        this.name=name;
        this.yearOfJoining=yearOfJoining;
        this.salary=workingHours;
        this.adress=adress;
    }
}
class Employe2 {
    String name2;
    String yearOfJoining2;
    int salary2;
    int workingHours2;
    String adress2;
    Employe2(String name2,String yearOfJoining2,int salary2,int workingHours2,String adress2){
        this.name2=name2;
        this.yearOfJoining2=yearOfJoining2;
        this.salary2=workingHours2;
        this.adress2=adress2;
    }
 }
class Employe3 {
    String name3;
    String yearOfJoining3;
    int salary3;
    int workingHours3;
    String adress3;

    Employe3(String name3, String yearOfJoining3, int salary3, int workingHours3, String adress3) {
        this.name3 = name3;
        this.yearOfJoining3 = yearOfJoining3;
        this.salary3 = workingHours3;
        this.adress3 = adress3;
    }
}

public class Employe {


    public static void main(String[] args) {
        Employe1 employe1 = new Employe1("Henrik","2020",200,8,"Shinararner");
        Employe2 employe2 = new Employe2("Aram","2020",200,8,"Shinararner");
        Employe3 employe3 = new Employe3("Aram","2020",200,8,"Shinararner");
        System.out.println(employe1);
        System.out.println(employe2);
        System.out.println(employe3);

    }
}
