//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String ans = JOptionPane.showInputDialog(null, "What can travel around the world while staying in a corner?");
String anw = ("a stamp");
if(ans.equalsIgnoreCase(anw)){
	JOptionPane.showMessageDialog(null, "correct");
}else{
	JOptionPane.showMessageDialog(null, "wrong \n it's a stamp");
			}

}

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}


