import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Main extends JFrame {
  /*  private JButton button1 = new JButton(new ImageIcon("D:\\ItsATrap\\images\\True\\1.png"));
    private JButton button2 = new JButton(new ImageIcon("D:\\ItsATrap\\images\\Fake\\2.png"));*/
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
  //  private String s1 = "D:\\ItsATrap\\images\\True\\";
   // private String s2 = "D:\\ItsATrap\\images\\Fake\\";
  //  private JButton change= new JButton("Next Level");
    public Main() {
        Buttons B = new Buttons();
        B.startGame();
        B.setChange();
        jFrame.add(jPanel);
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);
     //   change.addActionListener(new Button1Listener());
        GridBagConstraints con1 = new GridBagConstraints();
        con1.weightx = 0;
        con1.weighty = 0;
        con1.gridx = 1;
        con1.gridy = 1;
        con1.gridheight = 1;
        con1.gridwidth = 1;
      //  button1.addActionListener(new Button1EventListener());

        jPanel.add(B.getLeft(),con1);

        GridBagConstraints con2 = new GridBagConstraints();
        con2.weightx = 0;
        con2.weighty = 0;
        con2.gridx = 2;
        con2.gridy = 1;
        con2.gridheight = 1;
        con2.gridwidth = 1;
      //  button2.addActionListener(new Button2EventListener());
        jPanel.add(B.getRight(),con2);

        GridBagConstraints con3 = new GridBagConstraints();

        con3.weightx = 0;
        con3.weighty = 0;
        con3.gridx = 0;
        con3.gridy = 0;
        con3.gridheight = 1;
        con3.gridwidth = GridBagConstraints.REMAINDER ;
        con3.fill = GridBagConstraints.BOTH;
       // con3.anchor = GridBagConstraints.NORTH;
        jPanel.add(B.getChange(),con3);

       /* GridBagConstraints con4 = new GridBagConstraints();

        con4.weightx = 0;
        con4.weighty = 0;
        con4.gridx = 1;
        con4.gridy = 4;
        con4.gridheight = 1;
        con4.gridwidth = 1;
        jPanel.add(change,con4);*/

        jPanel.revalidate();
        //this.setBounds(200,200,1000,800);
       // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // this.setResizable(true);
      //  Container container = this.getContentPane();
      //  container.setLayout(new GridLayout(3,2));


     //   button1.addActionListener(new Button1EventListener());
     //   container.add(button1,BorderLayout.WEST);
     //   button2.addActionListener(new Button2EventListener());
     //   container.add(button2,BorderLayout.EAST);

    }
    private class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jPanel.invalidate();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        //  Randomizer randomizer = new Randomizer();
          //  Main app = new Main();
          //  app.setVisible(true);
          //    JButton button1 = new JButton(new ImageIcon("D:\\ItsATrap\\images\\True\\1.png"));
       //  JButton button1 = new JButton();
       //  JButton button2 = new JButton();
          // randomizer = new Randomizer(button1,button2);
         // randomizer.nextImage();
        //  button1.setBorderPainted(false);
       //   button1.setBorder(BorderFactory.createEmptyBorder());
          // JButton button2 = new JButton(new ImageIcon("D:\\ItsATrap\\images\\Fake\\2.png"));

      //    button2.setBorderPainted(false);
      //    button2.setBorder(BorderFactory.createEmptyBorder());
        /*  jFrame.add(jPanel);
          GridBagLayout gridBagLayout = new GridBagLayout();
          jPanel.setLayout(gridBagLayout);
          GridBagConstraints con1 = new GridBagConstraints();
          con1.weightx = 0;
          con1.weighty = 0;
          con1.gridx = 1;
          con1.gridy = 1;
          con1.gridheight = 2;
          con1.gridwidth = 1;
          button1.addActionListener(new Button1EventListener());
          jPanel.add(button1, con1);

          GridBagConstraints con2 = new GridBagConstraints();
          con2.weightx = 0;
          con2.weighty = 0;
          con2.gridx = 2;
          con2.gridy = 2;
          con2.gridheight = 3;
          con2.gridwidth = 1;
          button2.addActionListener(new Button2EventListener());
          jPanel.add(button2, con2);*/
         // jPanel.revalidate();

    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame("IT'S A TRAP GAME v1.0"){};
        jFrame.setVisible(true);
        jFrame.setBounds(500,0,800,868);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(true);
        return jFrame;
    }
}
