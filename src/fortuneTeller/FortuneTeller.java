package fortuneTeller;

import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first name.");
		String firstName = input.nextLine();
		if (firstName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter.");
			System.exit(0);
		}

		System.out.println("Enter your last name.");
		String lastName = input.nextLine();
		if (lastName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter.");
			System.exit(0);
		}

		int retirementYears = 0;
		System.out.println("Please enter your age.");
		String age = input.nextLine();
		if (age.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter.");
			System.exit(0);
		} else {
			int ageInt = Integer.parseInt(age);
			if (ageInt % 2 == 0) {
				retirementYears = 69;
			} else {
				retirementYears = 34;
			}
		}

		System.out.println("Enter your birth number for your birth month.");
		System.out.println("For example January would be 1, February would be 2 and so on.");
		String birthMonth = input.nextLine();
		int birthMonthInt = 0;
		String bankBalance = "$86,753.09";
		if (birthMonth.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter.");
			System.exit(0);
		} else {
			birthMonthInt = Integer.parseInt(birthMonth);
			if (0 < birthMonthInt && birthMonthInt <= 4) {
				bankBalance = "$12,345.00";
			} else if (4 < birthMonthInt && birthMonthInt <= 8) {
				bankBalance = "$1,000,000.32";
			} else if (8 < birthMonthInt && birthMonthInt <= 12) {
				bankBalance = "$45,000.00";
			} else {
				bankBalance = "$0.00";
			}
		}

		String favoriteColor;
		System.out.println("Enter your favorite ROYGBIV color. Type \"Help\" for a list of ROYGBIV colors.");
		favoriteColor = input.nextLine();
		while (favoriteColor.equalsIgnoreCase("help")) {
			if (favoriteColor.equalsIgnoreCase("help")) {
				System.out.println("R stands for red");
				System.out.println("O stands for orange");
				System.out.println("Y stands for yellow");
				System.out.println("G stands for green");
				System.out.println("B stands for blue");
				System.out.println("I stands for indigo");
				System.out.println("V stands for violet");
				favoriteColor = input.nextLine();
			}
		}

		System.out.println("Enter your number of siblings.");
		String numberOfSiblings = input.nextLine();
		int numberOfSiblingsInt = 0;
		String vacationLocation = "";
		if (numberOfSiblings.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter.");
			System.exit(0);
		} else {
			if (numberOfSiblingsInt < 0) {
				vacationLocation = "the Sun";
			} else if (numberOfSiblingsInt == 0) {
				vacationLocation = "Gary, Indiana";
			} else if (numberOfSiblingsInt == 1) {
				vacationLocation = "San Diego, California";
			} else if (numberOfSiblingsInt == 2) {
				vacationLocation = "Austin, Texas";
			} else if (numberOfSiblingsInt == 3) {
				vacationLocation = "Pittsburgh, Pennsylvania";
			} else {
				vacationLocation = "Buffalo, New York";
			}
		}

		input.close();

		String modeOfTrans;
		if (favoriteColor.equalsIgnoreCase("red")) {
			modeOfTrans = "city bus";
		} else if (favoriteColor.equalsIgnoreCase("orange")) {
			modeOfTrans = "bicycle";
		} else if (favoriteColor.equalsIgnoreCase("yellow")) {
			modeOfTrans = "sports car";
		} else if (favoriteColor.equalsIgnoreCase("green")) {
			modeOfTrans = "space shuttle";
		} else if (favoriteColor.equalsIgnoreCase("blue")) {
			modeOfTrans = "submarine";
		} else if (favoriteColor.equalsIgnoreCase("indigo")) {
			modeOfTrans = "high speed rail";
		} else if (favoriteColor.equalsIgnoreCase("violet")) {
			modeOfTrans = "motorcycle";
		} else {
			modeOfTrans = "walking";
		}

		System.out.println(firstName + " " + lastName + " will retire in " + retirementYears + " years with "
				+ bankBalance + " in the bank, a vacation home in " + vacationLocation + ", and travel by "
				+ modeOfTrans + ".");

	}
}