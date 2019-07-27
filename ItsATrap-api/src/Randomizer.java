import java.util.Arrays;
import java.util.Random;

public class Randomizer{
   // private int b;
    private int usedTrue[] = new int[10];
    private int usedFake[] = new int[10];
    private int i1=0,i2=0;
    Random rand;

  //  public Randomizer(JButton b1,JButton b2){
   //     button1 = b1;
    //    button2 = b2;
    //    b = rand.nextInt(1)+1;
  //  }
    public Randomizer(){
        rand = new Random();
        Arrays.fill(usedTrue, 0);
        Arrays.fill(usedFake, 0);

    }
    public void refreshLists(){
        Arrays.fill(usedTrue, 0);
        Arrays.fill(usedFake, 0);
        i1=0; i2=0;
    }
    public  String nextImage(int x){
        int r;
        boolean rep = false;
        String res;
        if(x==1) {
            if (usedTrue[9] != 0)
                return res = "stop";
            do {
                r = rand.nextInt(10) + 1;
                if (r>10) r = 10;
                for (int a : usedTrue) {
                    if (r == a) {
                        rep = true;
                        break;
                    }
                    rep = false;
                }
            } while (rep == true);
            usedTrue[i1++] = r;
        } else{
            if (usedFake[9] != 0)
                return res = "stop";
            do {
                r = rand.nextInt(10) + 1;
                if (r>10) r = 10;
                for (int a : usedFake) {
                    if (r == a) {
                        rep = true;
                        break;
                    }
                    rep = false;
                }
            } while (rep == true);
            usedFake[i2++] = r;
        }
        res = String.valueOf(r) + ".jpg";
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
