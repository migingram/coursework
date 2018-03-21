import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class coursework implements ActionListener
{
   ImageIcon tempStore;
   JButton[] b = new JButton[12];
   ImageIcon[] img = new ImageIcon[12];

   public coursework()
   {
      JFrame f = new JFrame();
      f.setSize(443,363);
      f.setTitle("Swingin' Simpsons"); 
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel p = new JPanel();
      f.add(p);
      f.setContentPane(p);
      p.setVisible(true);
      GridLayout layout = new GridLayout(3,4,0,0);
      p.setLayout(layout);

 
      for (int counter = 0; counter < 12; counter++)
      {
         img[counter] = new ImageIcon("bart"+counter+".jpg");
         b[counter] = new JButton(img[counter]);
         b[counter].setSize(112,119);
         p.add(b[counter]);
         b[counter].setVisible(true);
         p.updateUI();
      }
   }

   public void actionPerformed(ActionEvent click)
   {
       for (int counter1 = 0; counter1 < 12; counter1++)
       {
           if(b[counter1] == click.getSource())
           {
               b[0].setIcon(img[counter1]);
 	       b[counter1].setIcon(img[0]);
      
           }
       }     
   }

   public static void main(String[] args)
   {
       coursework c = new coursework();
   }
}
