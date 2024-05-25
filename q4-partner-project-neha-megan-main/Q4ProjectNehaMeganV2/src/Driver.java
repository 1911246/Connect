import javax.swing.JButton;

public class Driver {
    public static void main(String[] args) {
        ConnectFourView view = new ConnectFourView();
        Board board = new Board();
        Button b = new Button(0,0);
		ButtonListener listener = new ButtonListener(view, board, b );
        view.addBoardListener(listener);
        view.reset2();
    }
}
