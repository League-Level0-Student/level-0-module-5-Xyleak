package algorithms;

import java.awt.Image;
import java.util.Random;

import javax.imageio.stream.ImageInputStreamImpl;
import javax.swing.JOptionPane;
import javax.swing.Popup;
import javax.swing.event.PopupMenuEvent;
import javax.swing.plaf.metal.MetalBorders.PopupMenuBorder;

public class SkillPractice {
	
public static void main(String[] args){
	SkillPractice skills = new SkillPractice();	
	skills.skill1();
	skills.skill2();
	skills.skill3();
	skills.skill4();
	skills.skill5(); 
}

void skill1() {
	String D = JOptionPane.showInputDialog("How Many Dimes Do You Have?");
	JOptionPane.showMessageDialog(null, "You have "+ 10*Integer.parseInt(D)+" cents.");

	String C = JOptionPane.showInputDialog("How Tall Are You In Inches?");
	if (Integer.parseInt(C) < 36) { JOptionPane.showMessageDialog(null, " Go Eat Your Wheaties");}
}

void skill2() {
	
	for (int i = 1; i < 11; i++) {
		System.out.println(i*3+" ");
	}	
}


void skill3() {
Random gen = new Random();
Random gen2 = new Random();
int r = gen.nextInt(20);
int r2 = gen2.nextInt(10);
System.out.println("The First Random Number = " +r);
System.out.println("The Second Random Number = " +r2);
int rr2 = (r-r2);
JOptionPane.showMessageDialog(null, "The Difference Between The Two Random Numbers Are |" +rr2+ "|");
}

void skill4() {

String c = JOptionPane.showInputDialog("What City Do You Live In?");	
if(c.equals("San Diego")){ 
	JOptionPane.showMessageDialog(null, "You Live In One Of The Greatest Cities IN THE WORLD!");
}
else{JOptionPane.showMessageDialog(null, c+" = The Worst");
  	
}
String ca = JOptionPane.showInputDialog("How Many Cars Do You Have?");
int car = Integer.parseInt(ca)*4;
int int_ca=Integer.parseInt(ca);
if(int_ca == 0) {
	JOptionPane.showMessageDialog(null, "I Bet You Use Public Transportation");
}
else if(int_ca == 1) {
String cc =	JOptionPane.showInputDialog(null, "What Model Is Your Car");
	JOptionPane.showMessageDialog(null,cc+ " Has Four Wheels");
	
}
else if(int_ca>1) {
String ccc = JOptionPane.showInputDialog("What Model is Your Car");	
JOptionPane.showMessageDialog(null,"Your Total Number Of Wheels On Your Cars Equal Up To... " +car+ " Wheels");
}
else {
	
}
//Image:  https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjq-Pmhu6_gAhVNC6wKHbPzBLEQjRx6BAgBEAU&url=https%3A%2F%2Fwww.reddit.com%2Fr%2Fphotoshopbattles%2Fcomments%2F3juf5c%2Fpsbattle_mr_bean_driving_his_car_like_a_pro%2F&psig=AOvVaw37Dxk8gusV28PmRg_HUUn_&ust=1549829567631910
}


void skill5() {
	String Sck00le = JOptionPane.showInputDialog("wH4t Skc0oOo0l3ee3e D0 y0u aTt3nD");
	JOptionPane.showMessageDialog(null, "hMmmmM Y0u g0 to "+Sck00le+  "?" );
	JOptionPane.showMessageDialog(null, "YoU aR3 a cOol m1n3cr4ft G4m3r"+Sck00le+ " 1S Th3 b3St Sko0l3 F0R c00000l  M1neCr4afT k1ds ");
	
	
	
}	



}