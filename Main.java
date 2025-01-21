import java.util.*;

class Person{
	static int age = 15;
	static float height;
	String name;
	
	Person(){
		height = 4.1f;
		name = "Sabarish";
	}
	
	public void increaseAge(){
		age++;
	}
	
	public void increaseHeight(){
		height++;
	}
	

}


public class Main {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
		//-----------------------------------------
		Person p1 = new Person();
		System.out.println(Person.age);
		System.out.println(Person.height);
		
		Person.increaseAge();
		Person.increaseHeight();
		
		System.out.println(Person.age);
		System.out.println(Person.height);
		System.out.println("-".repeat(30));
		//-------------------------------------------
		
		Person p2 = new Person();
		System.out.println(p2.age);
		System.out.println(p2.height);
		
        inp.close();
    }
}