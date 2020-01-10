/** Controller_P ben lidhjen e klases View_P dhe Model_P
   pra ben lidhjen e pjeseve qe i sheh shfrytzuesi me llogaritjet e te dhenave*/
import javax.swing.*;
import java.awt.event.*;

public class Controller_P implements ActionListener  {
   private View_P obj_v;
   private Model_P obj_m;
   private String s, u;
   private int t;
   private double Vo_a,Vo,a,d;
   private JButton b;
   private JPanel p;
   
   //konstruktori merr si parametra klaset View_P dhe Model_P dhe i inicializon per ti perdorur ne ter klasen
   public Controller_P(View_P obj_v, Model_P obj_m) {
      this.obj_v = obj_v;  
      this.obj_m = obj_m;
   }
   
   //metoda s_wrong ben lidhjen e metodave per stringun hyres dhe shendrrimin e ti ne numer
   public double s_wrong(String ms, String title, int i, String ms_g, int k) {
      s=obj_v.input(ms,title,i);
      obj_m.exit(s);
      while (obj_m.wrong(s)==false) {
         Vo_a=s_wrong(ms_g,title,k,ms_g,k);
      }
      Vo_a=obj_m.s_to_i(s);
      return Vo_a;
   }
   
   //metoda distance1 lidh llogaritjen e distances me formatimin e tij
   public String distance1(double Vo, double a) {
      this.Vo=Vo;
      this.a=a;
      d=obj_m.distance(Vo,a);
      t=obj_m.t-1;
      u=obj_m.format(d);
      return u;
   }
   
   //metoda panel_end lidh askionin e butonit me buton dhe panelin me frame  
   public void panel_end(String d) {
      b=obj_v.b;
      b.addActionListener(this); 
      p = obj_v.output_p(d,t,Vo,a);
      obj_v.output_f(p);
   }
   
   //kjo metod kryen aksionin e butonit
   public void actionPerformed (ActionEvent e) {
      u=distance1(Vo,a);
      p=obj_v.output_p(u,t,Vo,a);
   }
}
