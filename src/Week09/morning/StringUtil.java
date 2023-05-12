package Week09.morning;

public class StringUtil {
    public static String capitalize(String str){
        String[] eachWord = str.toLowerCase().trim().split(" ");
        String result = "";

        for(String each : eachWord){
            result += each.substring(0,1).toUpperCase() + each.substring(1) + " ";
        }

        return result.trim();
    }
}
