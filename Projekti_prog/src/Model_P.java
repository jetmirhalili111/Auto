/** Model_P ben te gjitha llogaritjet e nevojshme te aplikacionit */
import java.text.*;
public class Model_P {
   protected double d,sh,k;
   protected int t=1;
   boolean ok;
   private DecimalFormat f;
   private String d_f;
   
   //metoda distance llogarit distancen permes parametrave Vo dhe a
   public double distance(double Vo, double a) {    
      d = Vo*t + (1.0/2)*a*Math.pow(t,2);
      t++;
      return d;
   }
   
   //metoda s_to_i e shnderron stringun e dhene nga shfrytezuesi ne numer
   public double s_to_i(String s) {
      sh=Double.parseDouble(s);
      return sh;
   }
   
   //metoda wrong gjen gabimin e shfrytezuesit ne vlerat hyrese
   public boolean wrong(String c){
      ok=true;
      for (int x=1;x<3;x++){
         try {
            k=s_to_i(c);
            if (k<0) {
               c=c+"a";
            }
         }
         catch (Exception e) {
            ok=false;
         }
      }
      return ok;
   }
   
   //metoda format ben foratimin e rezultatit (distances)
   public String format(double distance)
   {
      f=new DecimalFormat("0.00");
      d_f=f.format(distance);
      return d_f;
   }
   
   //metoda exit ben mbylljen e programit nese shfrytzuesi shtyp cancel
   public void exit(String s){
      if(s==null){
         System.exit(0);
      }
   }
}