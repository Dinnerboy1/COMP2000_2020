import java.awt.*;
public class Cell {
    int xloc;
    int yloc;
    int size=35;
    public void paint(Graphics g, Point mpos){
        g.setColor(Color.WHITE);
        g.fillRect(xloc, yloc, size, size);
        if(mpos.getX()-xloc<35&&mpos.getX()-xloc>=0){
            if(mpos.getY()-yloc<35&&mpos.getY()-yloc>=0){
               g.setColor(Color.LIGHT_GRAY);
               g.fillRect(xloc, yloc, size, size);
            }
        }
        g.setColor(Color.BLACK);
        g.drawRect(xloc, yloc, size, size);
    }
    public Cell(int x,int y){
        xloc=x;
        yloc=y;
    }
}