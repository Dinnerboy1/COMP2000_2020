import java.awt.*;
public class Grid {
    Cell[][] cells;
    public Grid(int x, int y){
        cells = new Cell[x][y];
    }
    public void paint(Graphics g, Point mpos){
        Point pos = mpos;
        for(int i=0;i<cells[1].length;i++){
            for(int j=0;j<cells[0].length;j++){
                cells[i][j]= new Cell(10+i*35,10+j*35);
                cells[i][j].paint(g, pos);
            }
        }
    }
}