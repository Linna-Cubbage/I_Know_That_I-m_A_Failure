import javax.swing.JOptionPane;
import javafx.scene.canvas.*;
import javafx.scene.image.*;
public class Character
{
	private String name;
	private int level;
	private int hp = (int) ((Math.random() * 3) + 3);
	private int str;
	private int def;
	private int mag;
	private int sdef;
	private int spd;
	private double x;
	private double y;
	private double vx = 5;
	private double vy = 5;
	private int width;
	private int height;
	private Image Sprite = new Image("AdventureSprite01.png");
	
	public Character(double x, double y, int sizex, int sizey)
	{
		this.x = x;
		this.y = y;
		this.width = sizex;
		this.height = sizey;
	}
	
	public void levelUp()
	{
		
	}
	
	public void move(double x, double y)
	{
		this.x = x - width/2;
		this.y = y - height/2;
		/*while (this.x < x)
		{
			//this.x += 1;
					//(x - this.x)/((Math.sqrt((x - this.x)*(x - this.x) + (y - this.y)*(y - this.y)))/15) +1;
		}
		while (this.y < y)
		{
			this.y -= 1;
					//(x - this.y)/((Math.sqrt((x - this.x)*(x - this.x) + (y - this.y)*(y - this.y)))/15) +1;
		}
		*/
		
		
		/*while (this.x != x || this.y != y)
		{
			if (this.x != x)
			{
				this.x += (x-this.x)/10;
			}
			if (this.y != y)
			{
				this.y += (y-this.y)/10;
			}
		}*/
	}
	
	public double getX()
	{
		return x;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public void setName()
	{
		this.name = JOptionPane.showInputDialog("Enter a name.");
	}
	
	public String getName()
	{
		return name;
	}
	
	public void draw(GraphicsContext gc)
	{
		gc.drawImage(Sprite, x, y, width, height);
	}
}