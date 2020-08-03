import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
        //window.run();
        System.out.println("Red Vs Blue");
    }
    public class Canvas extends JPanel {
        public Canvas(){
            setPreferredSize(new Dimension(720,720));
        }
        Grid grid = new Grid(20,20);
        Point pos = getMousePosition(); 
        @Override
        public void paint(Graphics g){
            grid.paint(g, pos);
        }
        
    }
    public Main(){
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}