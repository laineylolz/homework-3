import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
//1. Create an array of int called ages that contains the following values:

	int[] ages = new int[8];
	
	ages[0] = 3;
	ages[1] = 9;
	ages[2] = 23;
	ages[3] = 64;
	ages[4] = 2;
	ages[5] = 8;
	ages[6] = 28;
	ages[7] = 93;
	
	// a. subtract the value of the first element in the array from the value in the last element of the array
	
	int age = ages[ages.length - 1] - ages[0];
	System.out.println(age);
			
	
   //b. Add a new age to your array and repeat the step above
	
    int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 1013};
	
	int age2 = ages2[ages2.length - 1] - ages2[0];
	
    System.out.println(age2);
	
	
   //c. Use a loop to iterate through the array and calculate the average age
	
	int sum = 0;
	for (int i = 0; i < ages.length; i++) {
		sum += ages[i];
	}
	double lengthOfAges = ages.length;
	double average = sum / lengthOfAges;
	System.out.println("The average age is " + average );

//2. Create an array of String called names that contains the following values:
	
	String[] names = new String[6];
	
	names[0] = "Sam";
	names[1] = "Tommy";
	names[2] = "Tim";
	names[3] = "Sally";
	names[4] = "Buck";
	names[5] = "Bob";
	
	//a. Use a loop to iterate through the array and calculate the average number of letters per name.
	
	int sum2 = 0;
	for (int i = 0; i < names.length; i++) {
		sum2 += names[i].length();
	} 
	double length = names.length;
	double average2 = sum2 / length;
	
	System.out.println("The average number of letters per name is " + average2);

	//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces.
	
	String c = "";
	
	for (int i = 0; i < names.length; i++) {
		c += names[i] + " ";	
	}
	System.out.println(c);
	
	//3. How do you access the last element of any array?
		//A: You can access the last element of any array by using array[array.length - 1].
	
	//4. How do you access the first element of any array?
		//A:You can acces the first element of any array by using array[0].
	
	//5. Create a new array of int called nameLengths. 
	
	int[] namesLength = new int[names.length];
	for(int i = 0; i < names.length; i++) {
	namesLength[i] = names[i].length();
		}
	//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.

	sum = 0;
	for (int i = 0; i < namesLength.length; i++) {
	sum += namesLength[i];
		}
	System.out.println("The sum of all the elements in the array is " + sum);
	
	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	
	System.out.println(concatenateWord("Delainey", 6));
	
	//8.
	
	String firstName = "George";
	String lastName = "Washington";
	
	String fullName = makeFullName(firstName, lastName);
	
	System.out.println(fullName);
	
	//9.
	
	int[] array = {3, 5, 7, 8, 34, 76, 80};
	System.out.println(sumArrayMoreThan100(array));
	int [] array2 = {4, 9, 10, 4, 8, 45, 1};
	System.out.println(sumArrayMoreThan100(array2));
	
	//10.

	double[] aveNumber = {7, 56, 34, 86, 38, 2004, 6, 33, 54};
	System.out.println(calculateAverage(aveNumber));
	
	//11.
	double [] arr1 = {6, 3, 4, 8, 9,};
	double [] arr2 = {7, 4, 5, 8, 10, 55};
	
	System.out.println(averageIsGreater(arr1, arr2));
	
	//12. 
	
	boolean isHotOutside = false;
	double moneyInPocket = 11.52;
	
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	
	//13.
	//This code returns "You are eligible for the COVID-19 vaccine" if user is 65 or over. 
	//If not, code tells you you are not eligible.
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter your current age: ");
	int ageNow = sc.nextInt();
	if (ageNow >= 65) {
	System.out.println("You are eligible to recieve the COVID-19 vaccine");
	}
	else if (ageNow <= 64) {
	System.out.println("Sorry, you are not eligible to recieve the COVID-19 vaccine at this time.");
	}
	
}
	
//7.
	public static String concatenateWord(String str, int num) {
		String result = "";
		for (int i =0; i < num; i++) {
		result += str;	
		}
		return result;
}
//8. 
	public static String makeFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
//9. 
	public static boolean sumArrayMoreThan100(int[] numbers) {
		int sum = 0;
		for (int number : numbers) 
			sum += number;
		if (sum > 100) {
			return true;
		}
		else if (sum < 100){
		}
		return false ;
	}
//10.	
	public static double calculateAverage (double[] numbers) {
	double sum = 0;
			for( double number : numbers) {
				sum += number;
			}
	return sum / numbers.length;
}
//11.
	public static boolean averageIsGreater (double[] array1, double[] array2) {
	return (calculateAverage(array1) > calculateAverage(array2));		
}
//12. 
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50);
	}
	
}
	
	

