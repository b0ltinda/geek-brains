/**
* Java. Level 1. Lesson 2. Homework
* 1. Replace elements of an array: 1 -> 0 and 0 -> 1
* 2. Fill an array with values divisible by three via loop
* 3. Multiply elements of an array lower than 6 by 2
* 4. Fill the diagonal elements of a square array with 1
* 5. Find min and max of an array
* 6. Check if there is a balance point in an array
* 7. Shift an array by n positions without auxiliary arrays
*@author Tatiana Bolotova
*@version Aug 16, 2018
*/

import java.util.Arrays;

public class TBolotovaGBHomeWork2 {
	public static void main (String[] args) {
		// 1. Replace elements of an array: 1 -> 0 and 0 -> 1
		int[] arrayToReplace = {1, 0, 1, 1, 0};
		System.out.println(Arrays.toString(oneToZeroAndBack(arrayToReplace)));

		// 2. Fill an array with values divisible by three via loop
		int arrSize = 8;
		divisibleByThree(arrSize);

		// 3. Multiply elements of an array lower than 6 by 2
		int[] initialArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		System.out.println(Arrays.toString(lessSix(initialArray)));

		//4. Fill the diagonal elements of a square array with 1
		arrSize = 5;
		diagon(arrSize);

		// 5. Find min and max of an array
		int[] miniMax = {1, 8, 18, -26, 173, 12, 92};
		findMiniMax(miniMax);

		// 6. Check if there is a balance point in an array
		int[] balanceArr1 = {6, 12, 7, 14, 3, 17, 8};
		int[] balanceArr2 = {1, 2, 3, 4, 2};
		System.out.println(checkBalance(balanceArr1));
		System.out.println(checkBalance(balanceArr2));

		// 7. Shift an array by n positions without auxiliary arrays
		int n = -17;
		int[] arrToShift1 = {1, 2, 3, 4, 5};
		int[] arrToShift2 = {2, 3, 4, 5, 6};
		shiftArray(n, arrToShift1);
		shiftArray(0, arrToShift2);
	}

	// 1. Replace elements of an array: 1 -> 0 and 0 -> 1
	public static int[] oneToZeroAndBack (int[] arrayToReplace) {
		for (int i = 0; i < arrayToReplace.length; i++) {
			if (arrayToReplace[i] == 1) {
				arrayToReplace[i] = 0;
			} else {
				arrayToReplace[i] = 1;
			}
		}
		return arrayToReplace;
	}

	// 2. Fill an array with values via loop
	public static void divisibleByThree (int n) {
		int[] divisibleByThree = new int[n];
		for (int i = 0; i < divisibleByThree.length; i++) {
			divisibleByThree[i] = i * 3;
		}
		System.out.println(Arrays.toString(divisibleByThree));
	}

	// 3. Multiply elements of an array lower than 6 by 2
	public static int[] lessSix (int[] initialArray) {
		for (int i = 0; i < initialArray.length; i++) {
			if (initialArray[i] < 6) {
				initialArray[i] = initialArray[i] * 2;
			} 
		}
		return initialArray;
	}

	// 4. Fill the diagonal elements of a square array with 1
	public static void diagon (int size) {
		int[][] diagonal = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j || i == size - j - 1) {
					diagonal[i][j] = 1;
				}
				System.out.print(diagonal[i][j]);
			}
			System.out.println();
		}
	}

	// 5. Find min and max of an array
	public static void findMiniMax (int[] miniMax){
		int min = miniMax[1];
		int max = miniMax[1];
		for (int i = 1; i < miniMax.length; i++){
			if (miniMax[i] < min){
				min = miniMax[i];
			} else {
				if (miniMax[i] > max){
					max = miniMax[i];
				}
			}
		}
		System.out.println("min = " + min + ", max = " + max);
	}

	// 6. Check if there is a balance point in an array
	public static boolean checkBalance (int[] balanceArr){
		int right = 0;
		int left = 0;
		int leftSum = 0;
		int rightSum;
		boolean balance = false;
		for (left = 0; left < balanceArr.length - 1; left++) {
			leftSum = leftSum + balanceArr[left];
			rightSum = 0;
			for (right = left + 1; right < balanceArr.length; right++){
				rightSum = rightSum + balanceArr[right];
			}
			if (leftSum == rightSum) {
				balance = true;
				break;
			} else {
				balance = false;
			}
		}
		return balance;
	}

	// 7. Shift an array by n positions without auxiliary arrays
	public static void shiftArray (int n, int[] arrToShift) {
		String direction = (n < 0) ? "left" : "right";
		n = Math.abs(n % arrToShift.length);
		if (direction == "left"){
			for (int i = 0; i < n; i++){
				int firstToGo = arrToShift[0];
				for (int j = 0; j < arrToShift.length - 1; j++){
					arrToShift[j] = arrToShift[j + 1];
				}
				arrToShift[arrToShift.length - 1] = firstToGo;
			} 
		} else {
			for (int i = 0; i < n; i++) {
				int firstToGo = arrToShift[arrToShift.length - 1];
				for (int j = arrToShift.length - 1; j > 0; j--){
					arrToShift[j] = arrToShift[j - 1];
				}
				arrToShift[0] = firstToGo;
			}
		}
		System.out.println(Arrays.toString(arrToShift));
	}
}