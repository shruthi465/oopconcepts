//polymorhism @Override
class Animal
{
   	public void move()
	{
     	 System.out.println("Animals can move");
   	}
}
class Cat extends Animal 
{
  	 public void move() 
 	{
      	System.out.println("cats can walk and run");
   	}
}

//@OVERLOADING
class Addition
{
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
}

//INHERITANCE

class Faculty
{  
	float salary=30000;  
}  
class Science extends Faculty
{ 
	float bonous=2000;
	
} 


//ABSTRACTION

abstract class TwoWheeler {
public abstract void run();
}
class Honda extends TwoWheeler{
public void run(){
System.out.println("\nbike is Running..");
}
}

//ENCAPSULATION

class EncapTest {
private String name;
public String getName() {
return name;
}
public void setName(String newName) {
name = newName;
}
}
class EpamCode {
public static void main(String[] args) {
System.out.println("***polymorphism  Override***");
Animal a = new Animal();   
     	 Animal b = new Cat();   
      a.move();   // runs the method in Animal class
      b.move();   // runs the method in cat class
System.out.println("***polymorphism  Overload***");
Addition obj=new Addition();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);


System.out.println("***Encapsulation***");
EncapTest encap = new EncapTest();
encap.setName("Shruthi");
System.out.println("Name : " + encap.getName() );


System.out.println("***Abstraction***");
TwoWheeler test = new Honda();
test.run();


System.out.println("***Inheritance***");
Science obj1=new Science(); 
 System.out.println("Salary is:"+obj1.salary);  
 System.out.println("Bonous is:"+obj1.bonous);  

}
}
