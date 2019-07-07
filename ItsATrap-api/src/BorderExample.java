import java.awt.*;

public class BorderExample {
    private Frame f;
    private Button bn,bs,bw,be,bc;

    BorderExample(){
        f = new Frame("Border Layout");
        bn = new Button("");
        bs = new Button("");
        bw = new Button("");
        be = new Button("");
        bc = new Button("");
    }
public void launchFrame(){
    f.add(bn, BorderLayout.NORTH);
    f.add(bs, BorderLayout.SOUTH);
    f.add(bw, BorderLayout.WEST);
    f.add(be, BorderLayout.EAST);
    f.add(bc, BorderLayout.CENTER);
    f.setBounds(550,200,500,500);
    f.setVisible(true);

}
}
