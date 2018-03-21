import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
 
public class test implements ActionListener 
{ 
    JFrame a = new JFrame("Swingin' Simpsons"); 
    JPanel panel = new JPanel();
    Icon tempStore = new ImageIcon(); 
    Icon tempStore1 = new ImageIcon(); 
    JButton[] button = new JButton[12]; 
    ImageIcon[] imageArray = new ImageIcon[12]; 
   
    public test() 
    { 
        a.setSize(448, 363); 
        a.setVisible(true); 
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        panel.setSize(448, 363); 
        a.setContentPane(panel); panel.setVisible(true); 
        GridLayout g = new GridLayout(3, 4); 
        panel.setLayout(g); 

        for(int counter = 0; counter<12; counter++) 
        { 
            imageArray[counter] = new ImageIcon("bart"+counter+".jpg"); 
            button[counter] = new JButton(imageArray[counter]);
            button[counter].setSize(112,119); 
            panel.add(button[counter]); 
            button[counter].setVisible(true); 
            button[counter].addActionListener(this); 
         } 
    
         panel.updateUI(); 
     
     } 
   
     public void actionPerformed(ActionEvent moveImage) 
     { 
         for(int counter1 = 0; counter1<12; counter1++) 
         { 
             if(button[counter1] == moveImage.getSource()) 
             {  
                 for(int counter2 =0; counter2<12; counter2++) 
                 { 
                     if(button[counter2].getIcon() == imageArray[0]) 
                     { 
                         tempStore = button[counter2].getIcon(); 
                         tempStore1 = button[counter1].getIcon(); 
        
                         button[counter2].setIcon(tempStore1); 
                         button[counter1].setIcon(tempStore); 
                     } 
                 } 
             } 
         } 
     }


     public static void main(String[] arguments) 
     { 
         test C = new test(); 
     } 
}
