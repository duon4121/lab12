import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Rectangle and extends Polygon.
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class Rectangle extends Polygon
{

    /**
     * Constructor for the Rectangle class
     * 
     * @param center Center point of the rectangle
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     * @param color Desired color for the rectangle
     * @param filled Whether or not the rectangle should be filled solid
     */
    public Rectangle(Point center, int width, int height, Color color, boolean filled)
    {
        // TODO: implement this.
        super(color, filled);
        location = new Point[4];
        
        // Assemble the 4 points
        location[0] = center;
        location[1] = new Point(center.x, center.y + height);
        location[2] = new Point(center.x + width, center.y + height);
        location[3] = new Point(center.x + width, center.y);
    }
}