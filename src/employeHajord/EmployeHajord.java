package employeHajord;

public class EmployeHajord {
    public int a=7;
class NestedAdress{
    static  String name = "Hendo";
    static String adress = "Yereevan";
    static String streed = "Shinararner";
}

        public   void getSalary(int salary,int workingHours){

        }
        public int AdSalary(int salary) {

            if (salary < 1100) {
                salary += 10;

            }
            return salary;
    }
    public int addWork(int salary,int workingHours){

            if(workingHours>6){
                salary+=5;
            }
        return salary;
    }

    public static void main(String[] args) {
            EmployeHajord hajord = new EmployeHajord();
            hajord.getSalary(200,7);
        System.out.println( "Salary=" + hajord.addWork(700,7));
        System.out.println("Salary=" + hajord.AdSalary(500));



    }
}
