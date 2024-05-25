import java.lang.reflect.Array;

public class Board {
	
	Chip arr[][] = new Chip[6][7];
	
	public Board() {
		for(int row = 0; row< 6; row++) {
			for(int col= 0; col<7; col++) {
				arr[row][col] = null;
			}
		}
	}
}
