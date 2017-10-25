/*
   William Turner csc 112 Palindrome

   description: program will read user input then compare forward and backward spelling for equivalence.
   				(using java ADT, stack and queue structures through linked lists, for-each iteration, String methods)


   pseudocode: 1. prompt and read sentence
			   2. parse sentence of spacing using String.replaceAll()
			   	  2a. assign to parsedSentence
			   3. make forward reading sentence
			   	  3a. instantiate a queue
			      3b. enqueue characters of parsedSentence and assign as Sent1

			   4. make backward reading sentence
			      4a. instantiate a stack
				  4b. push characters of parsedSentence to stack and assign as Sent2

			   5. compare Sent 1 and 2 for equivalence
			   6. output result

			   end
*/

import java.util.Scanner;
public class PalindromeDriver
{
     public static void main (String [] args)
     {
		 String sentence; // user input sentence
		 String parsedSentence; //sentence without spaces and puncuation
		 String Sent1, Sent2; //forward-reading characters (from queue) and backwards(from stack)representations  of parsedSentence
		 String another = "y";
		 Queue forward;
		 StackList backwards;

		 Scanner scan = new Scanner (System.in);
		 System.out.println("\n\n");
		 System.out.println((Util.setLeft(23,"Assignment 6 - Palindrome Checker\n\n")));

		 System.out.println("\tenter the sentence:\n");
		 System.out.print("\t");
		 sentence = scan.nextLine();
		 parsedSentence=sentence.replaceAll("\\s","");

		//processing module
		 forward = new Queue();
		 for(char ch : parsedSentence.toCharArray())
		 	forward.enqueue(ch);
		 Sent1 = forward.toString();

		 backwards = new StackList();
		 for(char ch : parsedSentence.toCharArray())
		 	backwards.push(ch);
		 Sent2 = backwards.toString();

		 //output module
		 //System.out.println(Sent1);
		 //System.out.println (Sent2);
		 if(Sent1.equalsIgnoreCase(Sent2))
		 	System.out.println("\n\tThis is a palindrome");
		 else
		 	System.out.println("\n\tThis is not a palindrome\t");
		 System.out.print("\n\t");

     }
}