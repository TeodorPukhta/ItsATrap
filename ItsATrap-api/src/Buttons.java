import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Buttons{

    private JButton change;
    private JButton left;
    private JButton right;
    private boolean trueButton;
    //private boolean status = true;
    private String s1 = "/TrueImages/";
    private String s2 = "/FakeImages/";
    private  int l =0,r = 0;
    Randomizer randomizer;
    public Buttons(){
        randomizer = new Randomizer();
    }

    public void startGame(){

        if(randomizer.nextStage()) {
            URL imageurl = getClass().getResource(s1 + randomizer.nextImage());
            Image myPicture = Toolkit.getDefaultToolkit().getImage(imageurl);
            left = new JButton(new ImageIcon(myPicture));
            //  left.setIcon(new javax.swing.ImageIcon(this.getClass().getResource(s1+randomizer.nextImage())));
            left.setBorderPainted(false);
            left.setBorder(BorderFactory.createEmptyBorder());
            left.addActionListener(new ButtonListener());
            left.repaint();
            URL imageurl2 = getClass().getResource(s2 + randomizer.nextImage());
            Image myPicture2 = Toolkit.getDefaultToolkit().getImage(imageurl2);
            right = new JButton(new ImageIcon(myPicture2));
            right.setBorderPainted(false);
            right.setBorder(BorderFactory.createEmptyBorder());
            right.addActionListener(new ButtonListener());
            right.repaint();
        }
        else {
            URL imageurl = getClass().getResource(s2 + randomizer.nextImage());
            Image myPicture = Toolkit.getDefaultToolkit().getImage(imageurl);
            left = new JButton(new ImageIcon(myPicture));
            left.setBorderPainted(false);
            left.setBorder(BorderFactory.createEmptyBorder());
            left.addActionListener(new ButtonListener());
            left.repaint();
            URL imageurl2 = getClass().getResource(s1 + randomizer.nextImage());
            Image myPicture2 = Toolkit.getDefaultToolkit().getImage(imageurl2);
            right = new JButton(new ImageIcon(myPicture2));
            right.setBorderPainted(false);
            right.setBorder(BorderFactory.createEmptyBorder());
            right.addActionListener(new ButtonListener());
            right.repaint();
        }
    }


    public void nextLevel(){
        if(randomizer.nextStage()) {
            URL imageurl = getClass().getResource(s1 + randomizer.nextImage());
            Image myPicture = Toolkit.getDefaultToolkit().getImage(imageurl);
            left.setIcon(new ImageIcon(myPicture));
            left.repaint();
            URL imageurl2 = getClass().getResource(s2 + randomizer.nextImage());
            Image myPicture2 = Toolkit.getDefaultToolkit().getImage(imageurl2);
            right.setIcon(new ImageIcon(myPicture2));
            right.repaint();
        }
        else {
            URL imageurl = getClass().getResource(s2 + randomizer.nextImage());
            Image myPicture = Toolkit.getDefaultToolkit().getImage(imageurl);
            left.setIcon(new ImageIcon(myPicture));
            left.repaint();
            URL imageurl2 = getClass().getResource(s1 + randomizer.nextImage());
            Image myPicture2 = Toolkit.getDefaultToolkit().getImage(imageurl2);
            right.setIcon(new ImageIcon(myPicture2));
            right.repaint();
        }
    }
    private class ButtonListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            if(e.getSource() == left) {
                String message = "";
                l++;
                message += "left button was pressed " + String.valueOf(l);

                JOptionPane.showMessageDialog(null,
                        message,
                        "RESULT",
                        JOptionPane.PLAIN_MESSAGE);
            } else if(e.getSource() == right){
                String message = "";
                r++;
                message += "right button was pressed " + String.valueOf(r);

                JOptionPane.showMessageDialog(null,
                        message,
                        "RESULT",
                        JOptionPane.PLAIN_MESSAGE);
            } else if(e.getSource() == change){
               nextLevel();


            }
           /* else if(e.getSource() == change){
                if(status) {
                    status = false;
                    left.setEnabled(false);
                    right.setEnabled(false);
                    String mes = "";
                    mes += "left button was pressed " + String.valueOf(l) + "\n" + "right button was pressed " + String.valueOf(r);
                    JOptionPane.showMessageDialog(null,
                            mes,
                            "RESULT",
                            JOptionPane.PLAIN_MESSAGE);
                } else {
                    left.setEnabled(true);
                    right.setEnabled(true);
                    status = true;
                }
            }*/

        }
    }

    public void setChange(){
        change = new JButton("Next Level");
        change.addActionListener(new ButtonListener());
    }
    public JButton getChange() {
        return change;
    }
    public JButton getLeft() {
        return left;
    }

    public JButton getRight() {
        return right;
    }
}
