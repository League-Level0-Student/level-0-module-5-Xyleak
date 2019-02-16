package extra;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Code4Life {
	
	public static void main(String[] args) {
		
	String code = JOptionPane.showInputDialog("How Many Hours Do You Spend Coding Each Weak?");
	
	int code_int=Integer.parseInt(code);
	
	if (code_int < 3){ 
		JOptionPane.showMessageDialog(null, "Stop Watching YoutTube And Get On Eclipse, Get Started. Asap!");
		}
	else if (code_int < 6 )	{
		JOptionPane.showMessageDialog(null, "Psst~ You're A Coding Shinobi");	
	}
	else {
		JOptionPane.showMessageDialog(null, ":O    You Must Be...... CodeMan");
		playBatmanTheme();
	}
	
	// 1. Ask The user how many hours they spent coding this week.

	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.


}
	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja

	// 4. If it is more than 5, call the method below to play the Batman theme song.

	private static void playBatmanTheme() {
		try {
			AudioClip sound = JApplet.newAudioClip(Code4Life.class.getResource("batman.wav"));
			sound.play();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}