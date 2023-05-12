package Week02;

public class Week02Notes {

    /*
        Week 2
	Day04 - Primitive Castings, Concatenation
	Day05 - Operators
	Day06 - If Statements Intro

Office Hours will be starting next week. These are optional, for extra practice and review. The material/tasks will be same in both sessions offered. The sessions will be recorded and upload.
	when: Wednesdays
		session 1: 11am-2pm EST
		session 2: 7pm-10pm EST

	I will share tasks for these sessions along with the weekly schedule
__________________________________________________________________

String
char
Concatenation
Primitive Type Casting
Operators
	arithmetic
	unary
	shorthand
	relational
	logical
Operator precedence
If statements
If else statements
__________________________________________________________________

char: primitive datatype that holds a single character
	 char letter = 'a';

ASCII
	every character has a number related to it

String
	holds a sequence of characters
	non primitive/ object

	Q: What is the difference between "A" and 'A'
		"A" is a String type
		'A' is a char type
		the datatypes are different

Concatenation:

	operator +

	used to combine something with a String -> the result is a String

		String + String -> concatenation
		int + String -> concatenation
		char + char -> addition
		int + int -> addition

__________________________________________________________________

Primitive Type Casting

	convert from one primitive datatype to another

	[Smallest] byte -> short -> int -> long -> float -> double [Largest]

		going from the smaller type to the bigger type:
			widening casting
			implicit (automatically)

		going from the bigger type to the smaller type:
			narrowing casting
			explicit (manually)

			(datatype) var

__________________________________________________________________

Operators
	arithmetic
		+, -, *, /, %

		10 / 3 = 3
		10.0/3 = 3.33

		10 % 3 = 1
		3 + 3 + 3 = 9
		left over 10 - 9 = 1

		use case: 	even and odd
					divisibility

		ex:
			20 / 5 = 4
			20 % 5 = 0

			3 % 5 = 3 -> 3 cannot be divided evenly by 5, so the left over is just 3

	unary

		+ (positive)
		- (negative)
		++ incrementing
		-- decrementing

		--pre the number is updated first and then used in the code
		post-- the number is used in the code, and then after is is updated

	shorthand
		perform the operation and update the variable

		+= -= *= /= %=

		int a = 1;
		a = a + 2; // i add the value of a to 2, and reassign the result into the a variable

		shorthand: a += 2;

	relational
		< > <= >= == !=

			4 == 4 -> true
			4 != 5 -> true

		Q: what is the difference between == and =
			= is the assignment operator
			== is to compare the values and return boolean

	logical

		! && ||

		&& AND
			both boolean should be true for the result to be true

		|| OR
			at least one of the boolean should be true for the result to be true

		! NOT
			opposite boolean

Operator precedence
	Execution happens from top to bottom. Left to right

        ! - (negative) ++ --
        * / %
        + -
        < > <= >=
        == !=
        &&
        ||
        = += -= *= /= %=

__________________________________________________________________

if

control flow statements

single if

	if(boolean_expression){
			// code will run if the boolean is true
	}

	check boolean, if the boolean is true -> run the code in the if block
	if it is false -> nothing happens

if else

	if(boolean_expression){
		// code will run if the boolean is true
	} else {
		// code that will run if the boolean is false
	}

	check boolean, if the boolean is true -> run the code in the if block
	if it is false ->  run the code in the else block

     */
}
