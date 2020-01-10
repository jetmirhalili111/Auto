/** View_P merret me pjeset te cilat i sheh perdoruesi
   duke perfshire inputin dhe outputin*/
import javax.swing.*;
import java.awt.*;

public class View_P   {
   private String s;
   private String s1,s2;
   public JFrame f= new JFrame("Distance d");
   private JLabel l= new JLabel();
   protected JPanel p = new JPanel();
   private JLabel label = new JLabel();
   private JLabel label2 = new JLabel();
   private JLabel label3 = new JLabel();
   private JLabel label4 = new JLabel();
   private JLabel label5 = new JLabel();
   private JLabel label6 = new JLabel();
   private JLabel label7 = new JLabel();
   private JLabel label8 = new JLabel();
   protected JButton b= new JButton("t+1");

   //metoda input shfaq dritaren permes se ciles merr vlerat hyrese
   public String input(String ms, String title, int i) {     
      s = JOptionPane.showInputDialog(null,ms,title,i);
      return s;
   }
   
   //metoda output_p merret me panelin (pamjet qe shihen) ne dritaren e te dhenave dalese
   public JPanel output_p(String distance, int seconds, double Vo, double a){
      s1 = distance + " meters";
      s2 = "for "+ seconds +" seconds";
      
      b.setBounds(315,320,60,30);
      b.setToolTipText("add one unit to the time");
      l.setIcon( new ImageIcon(this.getClass().getResource("foto2.png")));
      l.setBounds(0,0,686,389);
      
      p.add(write(label,s1,315,140,15));
      p.add(write(label2,s2,315,165,15));
      p.add(write(label3,"Distance",260,10,40));
      p.add(write(label4,"~~~~~~~~",252,40,40));
      p.add(write(label5,"2",602,95,10));
      p.add(write(label6,"d=Vo*t+0.5*a*t",500,100,15));
      p.add(write(label7,"Velocity Vo = "+Vo,20,100,15));
      p.add(write(label8,"Acceleration a = "+a,20,120,15));
   
      p.add(b);
      p.add(label);
      p.add(l);
      p.setLayout(null); 
      return p;
   } 
   
   //metoda output_p merret me krijimin e dritares grafike se outputit
   public void output_f(JPanel panel){  
      f.setVisible(true);
      f.setSize(686,430);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setResizable(false);
      f.setLocationRelativeTo(null);  
      f.getContentPane().add(panel);   
      f.validate();
   }
   
   //metoda write merret me shkrimet ne dritare grafike
   private JLabel write (JLabel k, String s, int left, int top, int size_s) {
      k.setText(s);
      k.setBounds(left,top,200,30);
      k.setFont(label.getFont().deriveFont(Font.BOLD,size_s)); 
      return k;
   }
   
   }
