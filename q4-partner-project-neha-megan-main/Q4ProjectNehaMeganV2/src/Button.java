import javax.swing.JButton;

public class Button extends JButton {
	private int row;
	private int col;
	
	public Button(int r, int c){
		row = r;
		col = c;
	}
	
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	
}
