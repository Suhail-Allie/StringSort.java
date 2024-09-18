package org.example;
import java.util.Arrays;
import java.util.Scanner;

    public class StringSort {
        public static void main(String[] args) {
            final int MAX_STRINGS = 15;
            Scanner input = new Scanner(System.in);

            String[] strings = new String[MAX_STRINGS];
            int count = 0;

            System.out.println("Enter up to 15 strings. Type 'done' when you are finished:");

            // Read strings from the user
            while (count < MAX_STRINGS) {
                System.out.print("Enter string #" + (count + 1) + ": ");
                String userInput = input.nextLine();
                if (userInput.equalsIgnoreCase("done")) {
                    break;
                }
                strings[count] = userInput;
                count++;
            }

            // Create a new array to store only the entered strings
            String[] enteredStrings = Arrays.copyOf(strings, count);

            // Sort the strings in ascending order
            Arrays.sort(enteredStrings);

            // Display the sorted strings
            System.out.println("\nStrings in ascending order:");
            for (String str : enteredStrings) {
                System.out.println(str);
            }

            input.close();
        }
    }


