public class TypeCasting {
    public static void main(String[] args) {
        int num = 10;
        double d = num;  // Implicit casting (widening)
        System.out.println("Integer value: " + num);
        System.out.println("Double value (after implicit casting): " + d);


        double num2=20.5;
        int ConvertedNum=(int)num2;
        System.out.println(num2);
        System.out.println(ConvertedNum);


        String str="100";
        int strToInt=Integer.parseInt(str);
        // int checkType=typeOf(strToInt);
        System.out.println(strToInt);
        // System.out.println(checkType);


        // String str2="Ten Thosand Rupees";    //in this scenario, it will throw an exception
        // int str2ToInt=Integer.parseInt(str2);
        // System.out.println(str2ToInt);

        int Number=2000;
        String IntToString=String.valueOf(Number);
        System.out.println("Integer to String: " + IntToString);


        String str3="123.45";
        double str3ToDouble=Double.parseDouble(str3);
        System.out.println("String to Double: " + str3ToDouble);

        String name="Varun";
        boolean strToBoolean=Boolean.parseBoolean(name);
        System.out.println("String to Boolean: " + strToBoolean);

        String Number2="Ten";
        boolean StrNumToBoolean=Boolean.parseBoolean(Number2);
        System.out.println("StringNumber to Boolean: " + StrNumToBoolean);

        // int Number3=2000;
        // boolean NumToBoolean=Boolean.parseBoolean(Number3);     
        //The method parseBoolean(String) in the type Boolean is not applicable for the arguments (int)
        // System.out.println("StringNumber to Boolean: " + NumToBoolean);

        double Number1= 15.75;
        long DoubleToLong=(long)Number1; 
        System.out.println("Double to Long: " + DoubleToLong);

    }
}