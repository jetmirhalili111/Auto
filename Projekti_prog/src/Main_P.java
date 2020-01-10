/** Main_P perdor View_P dhe Model_P ne Controller_P per te aktivizuar aplikacionin*/
import javax.swing.*;
public class Main_P {
   public static void main (String [] args) {
      
      String Vo_ms="Write velocity-Vo of a automobile";
      String a_ms="Write acceleration-a of a automobile";
      String Vo_title="Velocity Vo";
      String a_title="Acceleration a";
      String gabim1="PLEASE\n";
      String gabim2="\n ONLY WITH NON NEGATIVE NUMBERS";
      String Vo_ms_g=gabim1+Vo_ms+gabim2;
      String a_ms_g=gabim1+a_ms+gabim2;
      
      int ask=JOptionPane.QUESTION_MESSAGE;
      int warning=JOptionPane.WARNING_MESSAGE;
      View_P obj_v= new View_P();       //krijon instancen e klases View_P
      Model_P obj_m= new Model_P();     //krijon instancen e klases Model_P
      Controller_P obj_c= new Controller_P(obj_v,obj_m);   //krijon instancen e klases Controller_P me parmetra klaset View_P dhe Model_P
      
      //me posht behet perdorimi i metodave te klases Controller_P   
      double Vo = obj_c.s_wrong(Vo_ms,Vo_title,ask,Vo_ms_g,warning);
      double a = obj_c.s_wrong(a_ms,a_title,ask,a_ms_g,warning);
      String d_f = obj_c.distance1(Vo,a);
      obj_c.panel_end(d_f);
   }
}

