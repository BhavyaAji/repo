/*
 * Class: CMSC203 
 * Instructor: Prof. Eivazi
 * Description: (Give a brief description for each Class)
 * A fun little game basing around random numbers and files.
 * Due: 09/15/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Bhavya
*/

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class ESPGames {
	
	public static void main(String[] args) throws IOException {
		int wins = 0;
		Scanner input = new Scanner(System.in);
		File file = new File("colors.txt");
		Random num = new Random();
		
		String choice = "";
		int option = 0;
		
		do {
			System.out.println("1-	read and display on the screen first 16 names of colors from a file colors.txt,"
					+ " so the player can select one of them names of colors.");
			System.out.println("2-	read and display on the screen first 10 names of colors from a file colors.txt,"
					+ " so the player can select one of them names of colors.");
			System.out.println("3-	read and display on the screen first 5 names of colors from a file colors.txt,"
					+ " so the player can select one of them names of colors.");
			System.out.println("4-	Exit form a program");

			System.out.print("Enter the option: ");
			
            option = input.nextInt();
            input.nextLine(); 
			
			int count = 0; //num of colors
			if (option == 1) {
				count = 16;
			} else if (option == 2) {
				count = 10;
			} else if (option == 3) {
				count = 5;
			} else if (option == 4) {
				break; 
			} else {
				System.out.println("Invalid option. Please choose a number from 1 to 4.");
				continue;
			}
			
			String[] colors = new String[count];
			
			Scanner readFile = new Scanner(file);
			for (int i = 0; i < count && readFile.hasNextLine(); i++) {
				colors[i] = readFile.nextLine();
			}
			readFile.close();
			
			System.out.println("There are " + colors.length + " colors to choose from. They are as follows:");
			for (int i = 0; i < colors.length; i++) {
				System.out.println((i + 1) + ". " + colors[i]);
			}

			
			
			int winCount = 0;
			for (int i = 1; i <= 3; i++) {
				int genNum = num.nextInt(colors.length);
				String secretColor = colors[genNum];
				
				System.out.println("\nRound " + i);
				System.out.println("I am thinking of a color. It is in the list. Enter your guess:");
				choice = input.nextLine();
				
				if (choice.equalsIgnoreCase(secretColor)) {
					System.out.println("Correct! You got it!");
					winCount++;
					continue; 
				} else {
					System.out.println("Incorrect. Staring New Round...");
					System.out.println("\nI was thinking of " + secretColor + ".\n");
					continue;
				}
			}
			wins = winCount;
			System.out.println("You won " + winCount + "/3 round(s).");
			System.out.println("Would you like to play again? (y/n)");
			String again = input.nextLine();
			System.out.println();
			if(again.equalsIgnoreCase("n")) {
				break;
			}
			
		} while(option != 4);		
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Descrie yourself: ");
		String desc = input.nextLine();
		System.out.println("Due Date: ");
		String date = input.nextLine();
		System.out.println("");
		System.out.println("Username: " + name+ "\n User Description: " + desc + "\n Date: " + date);
		
		PrintWriter output = new PrintWriter("ESPGames.txt");
		output.println("Game Over\n"+ "You won " + wins +"/3 Correctly\n" + "Due date: " + date + "\nUsername: " + name+ "\n User Description: " + desc + "\n Date: " + date);
		input.close();
		output.close();
	}
}

