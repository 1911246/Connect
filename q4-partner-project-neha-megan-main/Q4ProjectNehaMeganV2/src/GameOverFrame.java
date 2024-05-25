

public class GameOverFrame{
	public int score1;
	public int score2;
	public GameOverFrame() {
		score1= ButtonListener.scorePlayer1;
		score2= ButtonListener.scorePlayer2;
	}
	
	public boolean reset() {
		if(score1==0||score2==0) {
			return true;
		}
		return false;
	}
	
	
}
