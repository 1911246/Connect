import javax.swing.*;

public class Chip {
    private ImageIcon icon;
    private int player;
    private String path;

    public Chip(String imagePath, int player) {
        this.path = imagePath;
        this.player = player;
        
    }
    
    public String getPath() {
    	return path; 
    }
    
    public ImageIcon getIcon() {
        return icon;
    }

    public int getPlayer() {
        return player;
    }
}
