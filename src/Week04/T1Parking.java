package Week04;

public class T1Parking {

    public static void main(String[] args) {

        int time = 8; // lets assume this is always a valid time
        double fee;

        if(time >= 6 && time <= 12){
            fee = 7.50;
        } else { // else if( (time >= 13 && time <= 23) || (time >= 0 && time <= 5))
            fee = 15;
        }
        // I can else because I am already assuming the time will only be between 0 - 23

        System.out.println("Fee for parking is " + fee);

        // ternary solution:

        int time2 = 14;
        double fee2 = time2 >= 6 && time2 <= 12 ? 7.5 : 15;
        System.out.println("Fee for parking is " + fee2);

        /*
        T1Parking [ternary, relational]

	create a program that will define a time variable. Use a 24 hour format.
	Based on the given time determine the cost of parking in the city

		If the time is between 6-12:
			fee: 7.50

		if the time is between 13 - 23 or 0 - 5
			fee is 15
         */
    }
}
