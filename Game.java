public class Game
{
	public static void main( String[] args )
	{
		GameArena Arena = new GameArena(800, 800);

		Ball Ball = new Ball(400, 400, 20, "BLUE");
		
		Rectangle rectangleA = new Rectangle(60, 20, 40, 10, "BLUE");
		
		Rectangle rectangleB = new Rectangle(60, 790, 40, 10, "RED");
		
		Arena.addBall(Ball);
		
		Arena.addRectangle(rectangleA);
		
		Arena.addRectangle(rectangleB);
		
	}
}