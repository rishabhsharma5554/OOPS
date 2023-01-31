package OOPS.Encapsulation;
//Encapsulation is one of the fundamental concepts of object-oriented 
//programming and it is used to create a secure and flexible code. 
//It is the process of hiding the internal state and behavior of an object and exposing only a public interface that can be used to interact with the object. This allows the implementation details of an object to be hidden from the outside world and prevents direct access to the object's data, making the code more robust and maintainable.

//Encapsulation is implemented in Java using the private,
//protected, and public access modifiers.

//The private access modifier is used to restrict access to the members of a class to the class itself. These members can't be accessed from outside the class.
//The protected access modifier allows access to the members of a class to the class itself and its subclasses.
//The public access modifier allows access to the members of a class from anywhere.
class Account {
	private double balance;
	private String name;
	
	public Account()
	{
		
	}

	public Account(double balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class EncapsulationExample {
	public static void main(String[] args) {
		Account accountOfRishabh = new Account();
		accountOfRishabh.setBalance(500);
		accountOfRishabh.setName("Rishabh");
		

		System.out.println("Account Holder Name : "+accountOfRishabh.getName());
		System.out.println("Balance : "+accountOfRishabh.getBalance());
	}
	
}
