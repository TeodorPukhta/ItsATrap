import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Buttons{

    private JButton change;
    private JButton left;
    private JButton right;
    private JButton newgame = new JButton("Start new game");
    private JButton closegame = new JButton("Close game");
    private boolean trueLeft,trueRight;
    private int score = 9;
    //private boolean status = true;
    private String s1 = "/TrueImages/";
    private String s2 = "/FakeImages/";
    private  int l = 0,r = 0;
    Randomizer randomizer;
    public Buttons(){
        randomizer = new Randomizer();
        newgame.addActionListener(new ButtonListener());
        closegame.addActionListener(new ButtonListener());
    }

    public void startGame(){
        String temp;

        if(randomizer.nextStage()) {
            trueLeft = true;
            trueRight = false;
            temp = randomizer.nextImage(1);

            if(temp == "stop") {
                Main.finishgame();
                change.setEnabled(false);
                left.setEnabled(false);
                right.setEnabled(false);
                return;
            }
            URL imageurl = getClass().getResource(s1 + temp);
            Image myPicture = Toolkit.getDefaultToolkit().getImage(imageurl);
            left = new JButton(new ImageIcon(myPicture));
            //  left.setIcon(new javax.swing.ImageIcon(this.getClass().getResource(s1+randomizer.nextImage())));
            left.setBorderPainted(false);
            left.setBorder(BorderFactory.createEmptyBorder());
            left.addActionListener(new ButtonListener());
            left.repaint();
            URL imageurl2 = getClass().getResource(s2 + randomizer.nextImage(2));
            Image myPicture2 = Toolkit.getDefaultToolkit().getImage(imageurl2);
            right = new JButton(new ImageIcon(myPicture2));
            right.setBorderPainted(false);
            right.setBorder(BorderFactory.createEmptyBorder());
            right.addActionListener(new ButtonListener());
            right.repaint();
        }
        else {
            trueLeft = false;
            trueRight = true;
            URL imageurl = getClass().getResource(s2 + randomizer.nextImage(2));
            Image myPicture = Toolkit.getDefaultToolkit().getImage(imageurl);
            left = new JButton(new ImageIcon(myPicture));
            left.setBorderPainted(false);
            left.setBorder(BorderFactory.createEmptyBorder());
            left.addActionListener(new ButtonListener());
            left.repaint();
            URL imageurl2 = getClass().getResource(s1 + randomizer.nextImage(1));
            Image myPicture2 = Toolkit.getDefaultToolkit().getImage(imageurl2);
            right = new JButton(new ImageIcon(myPicture2));
            right.setBorderPainted(false);
            right.setBorder(BorderFactory.createEmptyBorder());
            right.addActionListener(new ButtonListener());
            right.repaint();
        }
    }


    public void nextLevel(){
        String temp;

        if(randomizer.nextStage()) {
            temp = randomizer.nextImage(1);

            if(temp == "stop") {
                Main.finishgame();
                change.setEnabled(false);
                left.setEnabled(false);
                right.setEnabled(false);
                return;
            }
            trueLeft = true;
            trueRight = false;
            URL imageurl = getClass().getResource(s1 + temp);
            Image myPicture = Toolkit.getDefaultToolkit().getImage(imageurl);
            left.setIcon(new ImageIcon(myPicture));
            left.repaint();
            URL imageurl2 = getClass().getResource(s2 + randomizer.nextImage(2));
            Image myPicture2 = Toolkit.getDefaultToolkit().getImage(imageurl2);
            right.setIcon(new ImageIcon(myPicture2));
            right.repaint();
        }
        else {
            trueLeft = false;
            trueRight = true;
            URL imageurl = getClass().getResource(s2 + randomizer.nextImage(2));
            Image myPicture = Toolkit.getDefaultToolkit().getImage(imageurl);
            left.setIcon(new ImageIcon(myPicture));
            left.repaint();
            URL imageurl2 = getClass().getResource(s1 + randomizer.nextImage(1));
            Image myPicture2 = Toolkit.getDefaultToolkit().getImage(imageurl2);
            right.setIcon(new ImageIcon(myPicture2));
            right.repaint();
        }
    }

    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            if(e.getSource() == left) {
                change.setEnabled(true);
                left.setEnabled(false);
                right.setEnabled(false);
                String message = "";
                if(trueLeft) {
                   score++;
                    l++;
                      if(score == 10) {
                        Main.finishgame();
                        /*change.setEnabled(false);
                        left.setEnabled(false);
                        right.setEnabled(false);
                          left.setVisible(false);
                          right.setVisible(false);
                          change.setVisible(false);
                          newgame.setVisible(true);
                          closegame.setVisible(true);*/
                        changeMenu(false);
                        return;
                      }
                    message += "You are right! Your score: " + String.valueOf(score);

                    JOptionPane.showMessageDialog(null,
                            message,
                            "RESULT",
                            JOptionPane.PLAIN_MESSAGE);
                } else {
                    randomizer.refreshLists();
                    message += "You are wrong! Your final score: " + String.valueOf(score);
                    score=0;
                    JOptionPane.showMessageDialog(null,
                            message,
                            "RESULT",
                            JOptionPane.PLAIN_MESSAGE);
                }
            } else if(e.getSource() == right){
                change.setEnabled(true);
                left.setEnabled(false);
                right.setEnabled(false);
                String message = "";
                r++;
                if(trueRight) {
                    score++;
                      if(score == 10) {
                        Main.finishgame();
                          changeMenu(false);
                        /*change.setEnabled(false);
                        left.setEnabled(false);
                        right.setEnabled(false);
                          left.setVisible(false);
                          right.setVisible(false);
                          change.setVisible(false);
                          newgame.setVisible(true);
                          closegame.setVisible(true);*/
                        return;
                      }
                    message += "You are right! Your score: " + String.valueOf(score);
                    JOptionPane.showMessageDialog(null,
                            message,
                            "RESULT",
                            JOptionPane.PLAIN_MESSAGE);
                } else {
                    randomizer.refreshLists();
                    message += "You are wrong! Your final score: " + String.valueOf(score);
                    score=0;
                    JOptionPane.showMessageDialog(null,
                            message,
                            "RESULT",
                            JOptionPane.PLAIN_MESSAGE);
                }
            } else if(e.getSource() == change) {

                nextLevel();
                if (score == 10){
                    return;
               }
               left.setEnabled(true);
               right.setEnabled(true);
               change.setEnabled(false);
            } else if(e.getSource() == closegame){
                System.exit(0);
            } else if(e.getSource() == newgame){
                startNewGame();
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
        change.setEnabled(false);
    }

    public void startNewGame(){
        score = 0;
        randomizer.refreshLists();
        changeMenu(true);
        nextLevel();
    }

    public void changeMenu(boolean temp){
        left.setVisible(temp);
        right.setVisible(temp);
        change.setVisible(temp);
        newgame.setVisible(!temp);
        closegame.setVisible(!temp);
    }

    public JButton getNewgame() { return newgame; }

    public JButton getClosegame() { return closegame; }

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
