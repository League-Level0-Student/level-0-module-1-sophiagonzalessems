package _99_extra;

import javax.swing.JOptionPane;

public class hjkl {
	public static void main(String[] args) {


	String input=JOptionPane.showInputDialog("What animal do you like?");
	
	
	if(input.equals("Dog")){
		
		
	JOptionPane.showMessageDialog(null, "Dog goes woof.");
	}
	else if(input.equals("Cat")) {
	
		JOptionPane.showMessageDialog(null, "Cat goes meow.");
	}
	
	else {
		JOptionPane.showMessageDialog(null,"I don't know that animal.");
	}
	}
}