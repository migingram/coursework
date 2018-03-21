import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
 
public class coursework implements ActionListener 
{ 
    JFrame f = new JFrame(); 					/** Creates a window to hold components*/
    JPanel p = new JPanel();  				        /** Creates a panel to place items in */
    JButton[] B = new JButton[12]; 				/** Creates an array of buttons */
    ImageIcon[] Iarray = new ImageIcon[12];                     /** Creates an array of images */
    Icon[] Store = new ImageIcon[2];                            /** An array to temporarily store images */
                                 
    public coursework() 
    { 
        f.setTitle("Swingin' Simpsons");
        f.setSize(448, 363); 
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        p.setSize(448, 363); 
        p.setVisible(true);
        f.setContentPane(p);  
        GridLayout grid = new GridLayout(3,4);                          /** Creates a grid layour for the buttons to be displayed */
        p.setLayout(grid);  

        for(int counter = 0; counter < 12; counter++)                   /** A counter to create buttons with correct image */
        { 
            Iarray[counter] = new ImageIcon("bart"+counter+".jpg"); 
            B[counter] = new JButton(Iarray[counter]);
            B[counter].setSize(112,119); 
            p.add(B[counter]); 
            B[counter].setVisible(true); 
            B[counter].addActionListener(this);               /** Adds an ActionListener to each button */ 
         } 
    
         p.updateUI();                                        /** Updates the display */   

     } 
   
     public void actionPerformed(ActionEvent click)           /** An action event to take place when the button is clicked */
     { 
         for(int counter1 = 0; counter1 < 12; counter1++) 
         { 
             if (B[counter1] == click.getSource()) 
             {  
                 for(int counter2 = 0; counter2 < 12; counter2++) 
                 { 
                     if (B[counter2].getIcon() == Iarray[0]) 
                     { 
                         if (((counter1 == counter2 + 1) && (counter2 != 3 && counter2 != 7)) || 
                             ((counter1 == counter2 - 1) && (counter2 != 4 && counter2 != 8)) || 
                              (counter1 == counter2 - 4) || 
                              (counter1 == counter2 + 4))              /** Validation stage, ensures boundaries kept */
                         { 
                             Store[0] = B[counter2].getIcon();         /** Temporarily holds the grey tile image, bart0 */
                             Store[1] = B[counter1].getIcon();         /** Temporarily holds the clicked tile image */
       
                             B[counter2].setIcon(Store[1]); 
                             B[counter1].setIcon(Store[0]); 
                         }
                     } 
                 } 
             } 
         } 
     }


     public static void main(String[] arguments) 
     { 
         coursework C = new coursework();                              /** Runs the GUI */
     } 
}

