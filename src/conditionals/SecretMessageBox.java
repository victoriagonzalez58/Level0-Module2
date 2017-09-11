//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {
	public static void main(String[] args) {
		String pass="123467890";
		String message =JOptionPane.showInputDialog(null, "What is the secret message?");
		String code = JOptionPane.showInputDialog(null, "what is the passcode?");
		
		if(code.equals("1234567890")){
			JOptionPane.showMessageDialog(null, message);
		}else{
		
			JOptionPane.showMessageDialog(null, "INTRUDER!");
		}
			
		}
}

		
		

			
			
	
	// 0. Make a main method and put steps 1-5 inside it

	// 1. Set the passcode in a String variable
	
	// 2. Using a pop-up, ask for a secret message and store it in a variable

	// 3. Ask your friend for the passcode and store it in a variable

	// 4. If the passcode matches, show the secret message

	// 5. If the passcode does not match, pop-up "INTRUDER!!"

	// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.


