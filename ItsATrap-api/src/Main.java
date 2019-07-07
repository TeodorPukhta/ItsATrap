import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    private JButton button1 = new JButton(new ImageIcon("D:\\ItsATrap\\images\\True\\1.png"));
    private JButton button2 = new JButton(new ImageIcon("D:\\ItsATrap\\images\\Fake\\2.png"));
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public Main() {
    //    super("Simple Example");

        GridBagConstraints con1 = new GridBagConstraints();
        con1.weightx = 0;
        con1.weighty = 0;
        con1.gridx = 2;
        con1.gridy = 1;
        con1.gridheight = 2;
        con1.gridwidth = 1;
        button1.addActionListener(new Button1EventListener());
        jPanel.add(button1,con1);

        GridBagConstraints con2 = new GridBagConstraints();
        con2.weightx = 0;
        con2.weighty = 0;
        con2.gridx = 2;
        con2.gridy = 1;
        con2.gridheight = 3;
        con2.gridwidth = 1;
        button2.addActionListener(new Button2EventListener());
        jPanel.add(button2,con2);
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

    static class Button1EventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button1 was pressed\n";
            JOptionPane.showMessageDialog(null,
                    message,
                    "Output",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

    static class Button2EventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button2 was pressed\n";
            JOptionPane.showMessageDialog(null,
                    message,
                    "Output",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }
    public static void main(String[] args) {
      //  Main app = new Main();
      //  app.setVisible(true);
        JButton button1 = new JButton(new ImageIcon("D:\\ItsATrap\\images\\True\\1.png"));
        button1.setBorderPainted( false );
        button1.setBorder(BorderFactory.createEmptyBorder());
        JButton button2 = new JButton(new ImageIcon("D:\\ItsATrap\\images\\Fake\\2.png"));
        button2.setBorderPainted( false );
        button2.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(jPanel);
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
        jPanel.add(button1,con1);

        GridBagConstraints con2 = new GridBagConstraints();
        con2.weightx = 0;
        con2.weighty = 0;
        con2.gridx = 2;
        con2.gridy = 2;
        con2.gridheight = 3;
        con2.gridwidth = 1;
        button2.addActionListener(new Button2EventListener());
        jPanel.add(button2,con2);
        jPanel.revalidate();
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setBounds(200,200,800,800);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        return jFrame;
    }
}