package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Joe= "Nice Typing";
String Bob= "Good at taking notes.";
String Rob="Skilled Coder";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String input= JOptionPane.showInputDialog("What's your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(input.equals("Rob")) {
	
	JOptionPane.showMessageDialog(null, " You are a Skilled Coder");
}
	if(input.equals("Bob")) {
		JOptionPane.showMessageDialog(null, " You are good at taking notes.");
	}
		if(input.equals("Joe")) {
			JOptionPane.showMessageDialog(null, "You are good at typing");
		
	}
		
	
	}
}

