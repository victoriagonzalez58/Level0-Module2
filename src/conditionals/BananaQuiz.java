//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		String input= JOptionPane.showInputDialog(null, "Do you like bananas?");
		if(input.equals("no")){
			JOptionPane.showMessageDialog(null, "You're crazy!");
		//1. ask the user if they like bananas
		//2. if they say no, 
			
			//tell them they are crazy 
			//and end quiz
		
		}else{
			String hobby = JOptionPane.showInputDialog(null, "what is your favorite hobby?");
			JOptionPane.showMessageDialog(null, "Your "+hobby +" is much better with bannanas");
		}
		
		
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than â€œyesâ€� or â€œnoâ€�
		//	show a pop up that says â€œYou are bananas!â€�
	
	}

}
