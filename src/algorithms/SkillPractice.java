package algorithms;

import java.awt.Image;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.Popup;

public class SkillPractice {
	
public static void main(String[] args){
	SkillPractice skills = new SkillPractice();	
	skills.skill1();
	skills.skill2();
	skills.skill3();
	skills.skill4();
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
else{JOptionPane.showMessageDialog(null, c+" Is The Worst City");
  	
}
String ca = JOptionPane.showInputDialog("How Many Cars Do You Have?");
int int_ca=Integer.parseInt(ca);
if(int_ca == 0) {
	JOptionPane.showMessageDialog(null, "I Bet You Use Public Transportation");
}
else if(int_ca == 1) {
	JOptionPane.showMessageDialog(null, "Oh Ok");
	//Image = https://www.google.com/search?biw=843&bih=942&tbm=isch&sa=1&ei=fwBWXKm3IMu1tgWihLTQAw&q=working+carboard+car&oq=working+carboard+car&gs_l=img.3...48672.53959..54206...3.0..0.279.2305.18j3j2......0....1..gws-wiz-img.......0j0i67j0i10i24j0i8i30.7_J2joFeM_g#imgdii=Gp1ABKI0KRzQsM:&imgrc=V5IFaizb4_qc2M:
}
//Image = https://www.google.com/search?biw=843&bih=942&tbm=isch&sa=1&ei=tgBWXMK7Dce7tgWG8YKQDQ&q=weird+cars&oq=wierd+car&gs_l=img.1.0.0i10l10.326000.331503..332351...1.0..0.241.1037.9j1j1......0....1..gws-wiz-img.....0..0j0i67j0i10i67j0i10i24.QMKHZ1vYclU#imgrc=rRHBSxan3_ukBM:

}
}