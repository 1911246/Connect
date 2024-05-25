import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ConnectFourView extends JFrame {
    private Button[][] buttons;
    private JLabel playerLabel;
    private JLabel scoreLabel;
    private final int ROWS = 6;
    private final int COLUMNS = 7;

    public ConnectFourView() {
        setTitle("Connect 4");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel boardPanel = new JPanel(new GridLayout(ROWS, COLUMNS));
        buttons = new Button[ROWS][COLUMNS];
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                buttons[row][col] = new Button(row, col);
                buttons[row][col].setActionCommand(row + "," + col);
                boardPanel.add(buttons[row][col]);
            }
        }

        playerLabel = new JLabel("Player 1's turn (Pink)");
        //scoreLabel = new JLabel("Score - Player 1: 0, Player 2: 0");

        add(boardPanel, BorderLayout.CENTER);
        add(playerLabel, BorderLayout.NORTH);
        //add(scoreLabel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }
    
    public void reset2() {
    	if(ButtonListener.reset()) {
    		setTitle("Connect 4");
            setLayout(new BorderLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel boardPanel = new JPanel(new GridLayout(ROWS, COLUMNS));
            buttons = new Button[ROWS][COLUMNS];
            for (int row = 0; row < ROWS; row++) {
                for (int col = 0; col < COLUMNS; col++) {
                    buttons[row][col] = new Button(row,col);
                    buttons[row][col].setActionCommand(row + "," + col);
                    boardPanel.add(buttons[row][col]);
                }
            }

            playerLabel = new JLabel("Player 1's turn (Pink)");
            //scoreLabel = new JLabel("Score - Player 1: 0, Player 2: 0");

            add(boardPanel, BorderLayout.CENTER);
            add(playerLabel, BorderLayout.NORTH);
            //add(scoreLabel, BorderLayout.SOUTH);

            pack();
            setVisible(true);
    	}
    }
    
    
    public void addBoardListener(ActionListener listener) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                buttons[row][col].addActionListener(listener);
            }
        }
    }

    public Button getButton(int row, int col) {
        return buttons[row][col];
    }

    public void updatePlayerLabel(String text) {
        playerLabel.setText(text);
    }

    public void updateScoreLabel(String text) {
       // scoreLabel.setText(text);
    }
    
    
    
    
}
