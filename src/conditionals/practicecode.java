package gauntlet;

import javax.swing.JOptionPane;

public class practicecode {
public static void main(String[] args) {
	String fries = JOptionPane.showInputDialog(null, "enter a number");
	String num = JOptionPane.showInputDialog(null, "Enter a word");
	int integ = Integer.parseInt(fries);

	for(int i= 1; i<= integ;i++){
		
	System.out.println(num+i);
	
	}

}
}
