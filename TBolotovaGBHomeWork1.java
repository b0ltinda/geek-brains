/**
* Java. Level 1. Lesson 1. Homework
* 2. define variables of different types
* 3. calculation of formula
* 4. check if sum of two integers is between 10 and 20
* 5. check positive or negative
* 6. check if negative
* 7. greeting
* 8. check if the year is leap
*@author Tatiana Bolotova
*@version Aug 12, 2018
*/

public class TBolotovaGBHomeWork1 {
	public static void main (String[] args) {
		System.out.println("Result is: " + calculate(2, 5, 9, 3));
		System.out.println("Returned " + tenToTwenty(9, 12));
		System.out.println(checkPosNeg(-6));
		System.out.println(isNegative(-8));
		System.out.println(greeting("Sergey"));
		System.out.println(isLeap(1900));
	}

//2. define variables
	public static void defineVariables (String[] args) {
		byte b1 = 2;
        short s1 = 1570;
        int i1 = 295830;
        long l1 = 85839458009L;
        float f1 = 17.62f;
        double d1 = 45.2;
        char c1 = 'F';
        boolean bo1 = false;

	}

//3. calculation of formula
	public static int calculate (int a, int b, int c, int d) {
		int result = a * (b + c/d);
		return result;
	}

//4. check if sum of two integers is between 10 and 20
	public static boolean tenToTwenty (int a, int b) {
		if (a + b >= 10 && a + b <= 20){
			return true;
		} else {
			return false;
		}
	}

//5. check positive or negative
	public static String checkPosNeg (int a) {
		if (a >= 0) {
			return "The number " + a + " is positive.";
		} else {
			return "The number " + a + " is negative.";
		}
	}

//6. check if negative
	public static boolean isNegative (int a) {
		if (a < 0) {
			return true;
		} else {
			return false;
		}
	}

//7. greeting
	public static String greeting(String name) {
		return "Hello, " + name;
	}

//8. check if the year is leap
	public static String isLeap(int year){
		String leapY = "leap";
		String nleapY = "not leap";
		if (year % 4 != 0 || (year % 100 == 0 && year % 400 !=0)) {
			return nleapY;
		} else {
			return leapY;
		}
	}
}