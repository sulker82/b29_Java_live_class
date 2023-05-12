package Week11;

public class week11_classNotes {

    /*
    Week 11
Day30 - OOP Inheritance Continue
Day31 - Method Overriding
__________________________________________________________________

Inheritance
Overriding

Review:
	Morning - Java
	Afternoon - Soft Skills

- Git classes next week
- OOP Replit - Take your time, they can be time consuming
__________________________________________________________________

Inheritance

    allows a class to inherit/pass information into a different class

    	What is inherited:
    		accessible variables
    		accessible methods

    	What is not inherited:
    		constructor
    		private variables/methods

Constructors in Inheritance
	constructor is not inherited, but the child class constructor must always call the parent class constructor
		-> using super() the parent constructor is called

    	-> the default constructor always called super() in the first line


class Computer

class Mac extends Computer{

	public Mac(){
		super(); // calls the constructor in the Computer class
	}
}

__________________________________________________________________

Method Overriding

	change the implementation(code) of a method that is inherited from a super class
		-> another way to phrase it: after inheriting a method we can change how it works

	use of overriding: create method implementation that is more specific for the sub class

	@Override
		annotation that helps make sure you override the method correctly
		using the annotation is optional, but recommended to use

Method Overriding rules

	method needs to be inherits
	method signature should be the same
		method signature: name + parameters
	access modifier should be the same or more visible

	return type should be same
		*** or covariant: sub class of that return type (we can talk about later)
__________________________________________________________________

IQ: Can you have more than one direct parent?
    NO, java does not allow multi-inheritance ( multiple parents at the same time )

IQ: What is the difference between this and super

    this: reference to the instance of the current class
        -> used to differentiate local variables and instance variables
        -> used to access the instance members of the current class

    super: reference to the instance of the parent class
        -> used to access the instance members in the parent class

IQ: What is the difference between this() and super()

    this(): call a constructor in the same class
        -> Based on the argument given you could call any constructor

    super(): call the constructor from the parent class
        -> default constructor always uses super() on the first line
            -> In order to make an object of the child class we have to call the parent class constructor

IQ: What is the difference between method overloading and overriding

    overloading: have a method with the same name, different parameters
        -> happens in the same class

    overriding: changing the implementation of a method that came from the super class
        -> happens between the super and sub class

IQ: How can you override static methods?
	static methods cannot be overridden, it is possible to declare a method with the same name in the sub class, but this is called method hiding, not overriding.

	------------------------------------------------------------------------

access modifiers with inheritance

	private: cannot be inherited

	default: can only be inherited within the same package

	protected: can inherit the fields to the subclass no matter if its in the same package or not

	public: can inherit anywhere in the project

__________________________________________________________________

Types of inheritance

	Single inheritance: one class to another class

		class Planet{
		}

		class Mars extends Planet{
		}

	Multi level: one class is the direct parent of one class and acts like the grandparent of another

		class Animal {
		}

		class Dog extends Animal{
		}

		class Husky extends Dog {
		}

	Hierarchical: the same class is the direct parent of many sub classes. Those sub classes being like siblings

		class Book {
		}

		class AudioBook extends Book {
		}

		class EBook extends Book {
		}

		class TextBook extends Book{
		}

     */
}
