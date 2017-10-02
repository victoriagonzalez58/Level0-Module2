//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
JOptionPane.showMessageDialog(null, score);
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String ans = JOptionPane.showInputDialog(null, "What can travel around the world while staying in a corner?");
String anw = ("a stamp");
if(ans.equalsIgnoreCase(anw)){
	JOptionPane.showMessageDialog(null, "correct!");
	JOptionPane.showMessageDialog(null, score=score+1);

}else{
	JOptionPane.showMessageDialog(null, "wrong \n it's a stamp");
			}


String too = JOptionPane.showInputDialog(null, "If you have me, you want to share me. If you share me, you haven't got me. What am I?");
String wer = ("a secret");
		if(too.equalsIgnoreCase(wer)){
			JOptionPane.showMessageDialog(null, "correct!");
			JOptionPane.showMessageDialog(null, score=score+1);

		}else{
			JOptionPane.showMessageDialog(null, "nope it's a secret");
		}
String thre = JOptionPane.showInputDialog(null, "What 8 letter word can have a letter taken away and it still makes a word.  Take another letter away and it still makes a word. \n Keep on doing that until you have one letter left. What is the word?");
String tre = ("starting");
if(thre.equalsIgnoreCase(tre)){
	JOptionPane.showMessageDialog(null, "correct!");
	JOptionPane.showMessageDialog(null, score=score+1);

	
}else{
	
	JOptionPane.showMessageDialog(null, "nope it's starting");

	
}
		}
	}
	
	
	
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	


