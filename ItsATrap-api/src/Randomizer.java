import javax.swing.*;
import java.util.Random;

public class Randomizer{
   // private int b;

    Random rand;

  //  public Randomizer(JButton b1,JButton b2){
   //     button1 = b1;
    //    button2 = b2;
    //    b = rand.nextInt(1)+1;
  //  }
    public Randomizer(){
        rand = new Random();
    }

    public  String nextImage(){
        String res = String.valueOf(rand.nextInt(6)+1) + ".jpg";;
        return res;
    }
    public boolean nextStage(){
        int res = rand.nextInt(99)+1;
        if(res%2==0)
            return true;
        else return false;
    }
    /*public String nextImage(){
        String res;
        res = String.valueOf(rand.nextInt(6)+2) + ".jpg";
      *//*  if(n == 1 && b==1){
            nextImage(2);
        }*//*

        if(b == 1) {
         //   if(checkB())
            s1 += res;
            return s1;
            res = String.valueOf(rand.nextInt(6)+2) + ".jpg";
            s2 +=res;
            return s2;
        }
        else {
            s2 +=res;
            return s2;
            res = String.valueOf(rand.nextInt(6)+2) + ".jpg";
            s1 += res;
            return s1;
        }
    }*/

   /* public boolean checkB(){
        int a = rand.nextInt(1);
        if(a == 0)
            return false;
        else return true;
    }*/
}
