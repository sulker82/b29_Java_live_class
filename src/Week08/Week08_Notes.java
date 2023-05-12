package Week08;

public class Week08_Notes {

    /*
    Week 8
Day21 - Multi Dimensional Array
Day22 - Wrapper Classes, ArrayList Intro
Day23 - ArrayList Continue
__________________________________________________________________
multidimensional array
wrapper class
ArrayList
Collections
7 more week of java - shift in topics we will learn. OOP, more concept ideas
Reminder: For the next two weeks the live review is on Saturday because of the holidays
	Saturday, April 8: Live Review
	Sunday, April 9: OFF: Easter
	Saturday, April 15: Live Review
	Sunday, April 16: OFF: Orthodox Easter
* at the end of class ask me to talk about the discord test server
__________________________________________________________________
multidimensional array
        Allows the array to hold other arrays. The element of a multidimensional array is a single array
        1D single array
                int [] a = { 1, 2, 3};
        2D array
                int [][] arr = {
                        {1, 2, 3},
                        {4, 5, 6}
                }
                arr[1] -> {4, 5, 6}
                arr[1] = { 10, 30 10};
                        To access the elements we will still use indexes. In this case the elements are other arrays
        Print the multidimensional arrays:
                Arrays.deepToString(arr);
declaring 2D array
	datatType [][] arrayName = new dataType[x][z];
		where x is how many elements the 2D array has - number of arrays
		where z is the size of each inner array
			-> is optional to define. If it is not defined then the inner arrays sizes do not matter, they can be different
	datatType [][] arrayName = { arrayName1, arrayName2, etc}
	dataType [][] arrayName = { {element, element, element, etc}, {element, element, element, etc}, {element, element, element, etc} };
	[5][2]
		size of 2d is 5
		the size of each inner 1d is 2
	[5][]
		size of 2d is 5
		the size of each inner 1d array doesn't need to be the same
__________________________________________________________________
wrapper class
	object representation of primitive datatypes
	Wrapper classes are defined in the java.lang
	primitive -> Wrapper classes
		byte -> Byte
		short -> Short
		int -> Integer
		long -> Long
		float -> Float
		double -> Double
		char -> Character
		boolean -> Boolean
Why do we need it?
	1) ArrayList and other other collection types DO NOT WORK with primitive types
		-> arrays work with primitive and object types
	2) Wrapper classes have some useful methods & information
		Ex: parse methods, MAX_VALUE
How to make wrapper class object
	classNme varName = value;
Converting types * Both are automatic
    Autoboxing: converts the primitive datatype to the wrapper class object
    Unboxing: converts the wrapper class object to a primitive datatype
What is the different between parse method and valueOf methods
	parse methods return the primitive datatypes
		Ex: parseInt(), parseDouble()
	valueOf methods return the wrapper class objects
		Ex: Integer.valueOf(), Double.valueOf(), String.valueOf()

__________________________________________________________________
	"5" + 10 = 510
	parseInt("5") + 10 = 15
	valueOf("5") + 10 = 15
__________________________________________________________________ come back 12:29

ArrayList

	ArrayList is a class. It is part of the collection framework
	ArrayList is a data structure that is Array based meaning internal uses Arrays
	allows duplicates, has indexes, are order is maintained
	    the size is flexible
    	able to be printed normally
    	only works with Object types
        primitives do not work
When to use ArrayList vs Array
	ArrayList:
		- dynamic size
		- allows manipulation of data: adding, removing, checking for elements
		- only object types
	Array:
		- takes less memory
		- only need to read data, not manipulate it much
		- works for both primitive and object types
	ArrayList uses more computer memory compared to array.
    Array by itself is faster. when we have fixed set of data.
Creating ArrayList
	new ArrayList() -> empty ArrayList
	new ArrayList(other list) -> new ArrayList with values from the given list
	Convert Array to ArrayList
        Using the Arrays utility class
        Array.asList(arr) method -> give you an ArrayList
        	-> actually gives a collection type but we will learn this later on
	ArrayList<type> name = new ArrayList<>( Arrays.asList() );
Bulk operations
    the arguments of these methods are collection types
    addAll ( collection type ): adds all the elements from the parameter list to our ArrayList
    removeAll( collection type ): removes every occurrence of every element from our parameter list
    containsAll( collection type ): checks if the ArrayList contains every element from the collection type parameter. returns boolean
    retainAll(collection type): keep all matching elements from the argument. The rest are removed
__________________________________________________________________
Collections
    This class is a utility for collections
        located in the java.util package
        ArrayList is a collection, so we ccan use these methods with ArrayList
    Methods
        Collections.sort(collection type): sort the given collection
            void method
        Collections.reverse(collection type): reverse the order of the elements in given collection
            void method
        Collections.max(collection type): returns the biggest elements in the collection
            returns int
        Collections.min(collection type): returns the smallest elements in the collection
            returns int
        Collections.swap(collection type, index1, index2): swap the elements in the collection based on the defined indices. The element in index1 is put into the index2 and vice versa
            return void
     */
}
