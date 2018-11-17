
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(200, 100), 400, Color.darkGray, true);
        
        // Ears:
        RightTriangle ear1 = new RightTriangle(new Point(270, 170), 50, 140, Color.darkGray, true);
        RightTriangle earRing1 = new RightTriangle(new Point(275, 160), 35, 110, Color.YELLOW, true);

        RightTriangle ear2 = new RightTriangle(new Point(535, 170), 50, 140, Color.darkGray, true);
        RightTriangle earRing2 = new RightTriangle(new Point(530, 160), 35, 110, Color.pink, true);

        // Eyes:
        
        Oval eye1 = new Oval(new Point(275,200), 50, 75, Color.WHITE, true);
        Oval eyeCenter1 = new Oval(new Point(280,205), 40, 60, Color.BLACK, true);
        
        Oval eye2 = new Oval(new Point(475,200), 50, 75, Color.WHITE, true);
        Oval eyeCenter2 = new Oval(new Point(480,205), 40, 60, Color.BLACK, true);

        // Nose and Whiskers:
        Circle nose = new Circle(new Point(385, 280), 30, Color.BLACK, true);
        PolyLine mouth1 = new PolyLine(new Point(330,350), new Point(400,370), 30, Color.RED, true);
        PolyLine mouth2 = new PolyLine(new Point(400,370), new Point(470,350), 30, Color.RED, true);
        Oval no1 = new Oval(new Point(400,370), 40, 60, Color.BLACK, true);
        Oval no2 = new Oval(new Point(200,450), 400, 75, Color.PINK, true);
        
        // Collar:
        Circle no3 = new Circle(new Point(350,435), 100, Color.RED, true);
        Circle no4 = new Circle(new Point(360,445), 80, Color.CYAN, false);
        
        // Square around the dog:
        Square around1 = new Square(new Point(135, 18), 520, Color.RED, false);
        Circle around2 = new Circle(new Point(35, -90), 730, Color.BLACK, false);
        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        
        
        // set background color
        drawPanel.setBackground(Color.BLUE);
        drawPanel.addShape(base);
        drawPanel.addShape(ear1);
        drawPanel.addShape(ear2); 
        drawPanel.addShape(earRing1);
        drawPanel.addShape(earRing2);
        drawPanel.addShape(eye1);
        drawPanel.addShape(eye2);
        drawPanel.addShape(eyeCenter1);
        drawPanel.addShape(eyeCenter2);
        drawPanel.addShape(nose);
        drawPanel.addShape(mouth1);
        drawPanel.addShape(mouth2);
        drawPanel.addShape(no1);
        drawPanel.addShape(no2);
        drawPanel.addShape(no3);
        drawPanel.addShape(no4);
        drawPanel.addShape(around1);
        drawPanel.addShape(around2);

        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
