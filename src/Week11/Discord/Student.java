package Week11.Discord;

public class Student extends DiscordUser {

     /*
    	- Student class inherits DiscordUser class
	    - create constructor to call parent constructor and set up variables (role - Student, name, id)
	    - overload the sendMessage(String name) to accept a String for the chat name
	    	print Sending message to $name
     */

    int loveForJava;

    public Student(String name, int id, int loveForJava) {
        super("Student", name, id);
        this.loveForJava = loveForJava;
    }

    public void sendMessage(String name){
        System.out.println("Sending message to " + name);
    }

    public static void launch(){ // NOT OVERRIDING, we hide the original by creating a new one
        System.out.println("Student opening");
    }
}
