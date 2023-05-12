package Week03;

public class reviewNotes {
    public static void main(String[] args) {
        /*
        Week 3
	02/20/2023: OFF: Presidents' day
	Java Day07 - If Statements Continue
	Java Day08 - Ternaries, Switch Statement Intro

Review Today:
	Morning: Java
	Afternoon: Soft Skills

Variables Short Quiz Due Today by 11:59 EST
__________________________________________________________________

multibranch if
if statements without brackets
nested if
ternary
switch
__________________________________________________________________

if statements without brackets

	if(true)
		// statement 1
		// statement 2

	in this case only statement 1 is a part of the if statement
	statement 2 will always run because it is not part of the if block

__________________________________________________________________

multibranch if

	single if and if else only check one boolean condition

	multibranch check multiple boolean conditions

	if(boolean1){
		// when boolean1 is true this block of code runs
	} else if(boolean2){
		// when boolean2 is true this block of code runs
	} else if(boolean3){
		// when boolean3 is true this block of code runs
	} else {
		// this block runs when all other boolean conditions were false
	}

__________________________________________________________________

switch

	switch statements want to match an exact value ( == )
	datatypes no allowed in switch: boolean, long, double, float
		(the value part)

	switch(value){
		case a:
		case b:
		case c:
	}

	switch will match the case and jump to the line

	once a case is matched execute starts there (top to bottom). It will continue running until the end of the switch statement or a break statement

	default: this case runs if no other case is matched

__________________________________________________________________

ternary

	alternative way to write an if statement, but it is useful when you need to return a value ( when there is a result )

	? if
	: else

	result = boolean ? true_value : false_value;
__________________________________________________________________

single if vs if else vs multi branch vs nested

	single if: you want to check one boolean and don't want to run anything when it is false
	if else: you want to check one boolean but want to run else block when the boolean was false
	multi branch: you want to check multiple conditions
	nested if: parts of the code only execute if other boolean are true

if vs switch vs ternary

	in general you will use if statement

	if: boolean condition to check
	switch: match a single value
	ternary: get a single value back
__________________________________________________________________

nested if

	if inside of an if

	think of them as separate if statements

	int a = 10;

	if(a > 0){

		if(a == 1){
			//print 1
		} else if(a == 2){
			//print 1
		} else {

		}

	} else {

	}

         */
    }
}
