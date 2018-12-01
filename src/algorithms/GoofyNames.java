package algorithms;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";
		String Goofyname = "";
		// 1. Ask the user to enter their name

		goofyName = JOptionPane.showInputDialog(null, "Enter Your Name");
		JOptionPane.showMessageDialog(null, "Thinking... You Are RainbowPony_Minecraft_Kitty_Yt_" + goofyName);
		JOptionPane.showMessageDialog(null, "Actually No.... Let's Go With Something More Interesting");
		String goofy = JOptionPane.showInputDialog(null, "Type Something In Here (It Won't Affect Anything)");
		JOptionPane.showMessageDialog(null, "Your Name Will Be..");
		String Goofy = JOptionPane.showInputDialog(null, goofy
				+ " RainbowUnicornPoopGamer_1239z_Gamer322_928374LolololNocraftdiamondgG12HashtagsRobloxNoobOrAnthroLololGamer_"
				+ goofyName);
		JOptionPane.showMessageDialog(null, "I Lied About The Thing Not Affecting It ");

		// 2. Print upper case name to the console using .toUpperCase()
		// Run your program to see that this works.

		// 3. Loop through each character of the name (steps 4 - 6).
		// HINT: Use .length() to determine the number of characters in the String.

		// 4. Create a String variable to store the next character of the name
		// using .substring(start, end)
		// HINT: replace 'start' and 'end' to get String with character at i

		// 5. Use MODULO to set this variable to upper case for EVEN characters
		// and lower case for ODD characters.

		// 6. ADD this String (containing 1 char) to the goofyName String

		// 7. Use pop-up to show user their Goofy name

	}
}
