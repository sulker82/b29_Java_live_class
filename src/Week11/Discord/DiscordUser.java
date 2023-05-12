package Week11.Discord;

import java.time.LocalDate;

public class DiscordUser {

    /*
    	Create an DiscordUser class
	    - create variables:
	        role, name, id
	        variable: account creation date
	    - create constructor to initialize the variables
	    - create a method sendMessage()
	    	prints: "Sending message to class chat"
	    - create a method joinDiscord(String discordUrl)
	    	prints: "Joining $discordUrl"
	    - override toString()
     */

    String role;
    String name;
    int id;
    LocalDate createdDate;

    public DiscordUser(String role, String name, int id){
        this.role = role;
        this.name = name;
        this.id = id;
        createdDate = LocalDate.now();
    }

    public void sendMessage(){
        System.out.println("Sending message to class chat");
    }

    public void joinDiscord(String discordUrl){
        System.out.println("Joining " + discordUrl);
    }

    public static void launch(){
        System.out.println("Connecting to server");
    }

    @Override
    public String toString(){
        return name + "#" + id + "\nRoles: " + role + "\nAccount Created: " + createdDate;
    }

}
