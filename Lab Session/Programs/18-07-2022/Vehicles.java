/*
@Author: Sahaya Reshma A
Title: Abstract class
Quiz: Create an abstract class with a method
*/

abstract class Vehicle
{
	abstract void name();
	int milage(int a)
	{
		return a;
	}
}
class Bike extends Vehicle
{
	int milage(int a)
	{
		return a;
	}
	void name()
	{
		System.out.println("This is the first Subclass");
		System.out.println("Vehicle name: Bike");
	}
}
class Car extends Vehicle
{
	int milage(int a)
	{
		return a;
	}
	void name()
	{
		System.out.println("This is the second Subclass");
		System.out.println("Vehicle name: Car");
	}
}
public class Vehicles
{
	public static void main(String args[])
	{
		Bike b= new Bike();
		Car c= new Car();
		b.name();
		System.out.println("Milage of the Bike is " + b.milage(50) + " KMPL");
		c.name();
		System.out.println("Milage of the Car is " + c.milage(25) + " KMPL");
	}
}
