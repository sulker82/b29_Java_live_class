package Week09.morning;

import java.text.DecimalFormat;

public class MathUtil {



        public static double format(double num){
            DecimalFormat df = new DecimalFormat("#.##");
            return Double.parseDouble(df.format(num));
        }

    }

