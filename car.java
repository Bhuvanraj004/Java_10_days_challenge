import java.util.Scanner;
class car{
    String Accountname;
    int salary;


     car(String Accountname){
        this.Accountname=Accountname;
        this.salary=12534;
     }
     void display(){
        System.out.println("Accountname: "+Accountname);
        System.out.println("salary:" +salary);

     }
    public static void main(String args[]){
    car mycar=new car("bhuvan");
    mycar.display();
    
    
        }
}