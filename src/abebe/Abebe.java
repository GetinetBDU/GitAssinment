
package abebe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Abebe { 
   JFrame f;
   JLabel l;
   JTextField tf;
   JLabel l2;
   JTextField tf2;
  JPanel p;
  
public Abebe(){
    tse();
}
public void tse (){
  f =new JFrame ("THE BEST WAY");      
 l =new JLabel("first name ");
 l2 = new JLabel("Second Name");
 tf=new JTextField (12);
 tf2  =new JTextField (12);
 f.setVisible(true);
 f.setSize(400,400);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setBackground(Color.blue);
 p =new JPanel();
 p.add(l);
 p.add(tf);
 p.add(l2);
 p.add(tf2);
 f.add(p);
 p.setBackground(Color.blue);
 
 

}

public static void main (String ...args){
       Abebe gf = new Abebe ();
}}










