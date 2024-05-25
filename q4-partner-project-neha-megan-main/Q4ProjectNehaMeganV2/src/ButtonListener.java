import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonListener implements ActionListener {
    private ConnectFourView view;
    private static Board board;
    private static int currentPlayer;
    public static int scorePlayer1;
    public static int scorePlayer2;
    private Button button; 

    public ButtonListener(ConnectFourView v, Board b, Button bu) {
        view = v;
        board = b;
        currentPlayer = 1;  // Player 1 starts
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        button = bu; 
    } //test3

    @Override
    public void actionPerformed(ActionEvent e) {
    	
        String command = e.getActionCommand();
        String[] parts = command.split(",");
        int row = Integer.parseInt(parts[0]);
        int col = Integer.parseInt(parts[1]);

        if (board.placeChip(col, currentPlayer)) {
            Button button = view.getButton(row, col);
          
            if(currentPlayer==1) {
            	ImageIcon i = new ImageIcon("blueChip2.png");
            	button.setIcon(new ImageIcon("blueChip2.png"));
            	Image image = i.getImage(); // transform it 
            	Image newimg = image.getScaledInstance(5,5,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
            	i = new ImageIcon(newimg); 
            }else {
            	ImageIcon j = new ImageIcon("pinkChip2.png");
            	button.setIcon(new ImageIcon("pinkChip2.png"));
            	Image image = j.getImage(); // transform it 
            	Image newimg = image.getScaledInstance(5,5,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
            	j = new ImageIcon(newimg); 
            }
            
       
            

            currentPlayer = currentPlayer == 1 ? 2 : 1;
            view.updatePlayerLabel("Player " + currentPlayer + "'s turn (" + (currentPlayer == 1 ? "Blue" : "Pink") + ")");
            
           
        }
        
 
    }
    
    public static boolean reset() {
    	  if (board.checkForWin(currentPlayer)) {
             return true;
          	 
          	
          	
          /*	if (currentPlayer != 1) {
                  scorePlayer1++;
                  
              } else {
                  scorePlayer2++;
                  
              }
          	*/
             // view.updateScoreLabel("Score - Player 1: " + scorePlayer1 + ", Player 2: " + scorePlayer2);
              // Reset the game or handle the win
             
              
          }else {
        	  return false;
          }
    }
    
    
}