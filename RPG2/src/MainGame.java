import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import tsinn.ui.SimpleApp;

public class MainGame extends SimpleApp 
	{
	
	private Character hero;
	
	public void updateAnimation(long arg0)
	{
		
	}
	
	public void draw(GraphicsContext gc)
	{
		hero.draw(gc);
	}
	
	public void setupApp(GraphicsContext gc)
	{
		hero = new Character(getWidth()/2, getHeight()/2, 50, 50);
	}
	
	public void onMousePressed(MouseEvent m) 
	{
		hero.move(m.getX(), m.getY());
	}
	
	public void onMouseDragged(MouseEvent m) 
	{
		hero.move(m.getX(), m.getY());
	}
	
	public static void main (String[] args)
	{
		launch();
	}
	
	}