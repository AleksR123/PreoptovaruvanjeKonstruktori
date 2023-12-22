
public class Student {
	
	int id;
	String ime;
	int starost;
   Student(int i, String n){ //konstruktor so 2 parametri
		id=i;
		ime=n;
   }
	Student(int i, String n, int a){ //konstruktor so 3 parametri
		id=i;
		ime=n;
		starost= a;
	  }
	 void display() { //metod
		System.out.println(id + " " + ime + " " + starost);
	  }
	public static void main (String args[]) {
		
		Student s1= new Student(111, "Petar"); //objekt s1
		Student s2= new Student(222, "Marko", 25); //objekt s2
		s1.display();
		s2.display();
	}
}
