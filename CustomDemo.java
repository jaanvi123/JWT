
import java.util.ArrayList;
import java.util.List;

class Point
{
	private int xCord;
	private int yCord;
	public Point(int xCord, int yCord) {
		 this.xCord = xCord;
		 this.yCord = yCord;
	}
	@Override
	public String toString() {
		return "Point [xCord=" + xCord + ", yCord=" + yCord + "]";
	}
	
}

public class CustomDemo {

	public static void main(String[] args) {

		List<Point> rectangle = new ArrayList<>();
		rectangle.add(new Point(55,0));
		
	}

}
