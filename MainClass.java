package TBolotovaHomework1;

public class MainClass {
    // p.1 - psvm
    public static void main(String[] args) {
        // p.2 - variable types
        byte b1 = 2;
        short s1 = 1570;
        int i1 = 295830;
        long l1 = 85839458009L;
        float f1 = 17.62f;
        double d1 = 45.2;
        char c1 = 'F';
        boolean bo1 = false;

        // p.3 - calculation
        System.out.println("Result is: " + Calculation(5, 2, 9, 3));

        // p.4 - 10 to 20
        System.out.println("Returned " + TenToTwenty(5, 15));

        // p.5 - positive or negative
        System.out.println("The number is " + PosNeg(10));

        // p.6 - is it negative?

        System.out.println(IsNegative(-8));

        // p.7 - Greetings
        System.out.println(Greetings("Artem"));

        // p8 - leap year
        System.out.println("This year is " + LeapYear(2000));


    }
    // p.3 - calculation
    static int Calculation(int a, int b, int c, int d){
        int result = a * (b + c/d);
        return result;
    }

    // p.4 - 10 to 20
    static Boolean TenToTwenty(int n1, int n2){
        if(n1 >= 10 && n1 <=20 && n2 >= 10 && n2 <=20){
           return true;
        } else {
            return false;
        }
    }
    // p.5 - positive or negative
    static String PosNeg(int number5){
        if(number5 < 0){
            return "negative";
        } else {
            return "positive";
        }
    }

    // p.6 - is it negative?
    static Boolean IsNegative(int number6) {
        if(number6 < 0) {
            return true;
        } else {
            return false;
        }
    }

    // p.7 - Greetings
    static String Greetings(String name){
        String greet = "Hello, " + name;
        return greet;
    }

    // p8 - leap year
    static String LeapYear(int year){
        String leapy = "leap";
        String nleapy = "not leap";
        if(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)){
            return nleapy;
        }else {
            return leapy;
        }
    }

}
