import java.applet.Applet;
import java.awt.*;

public class Exercise2 extends Applet {
    @Override
    public void paint(Graphics g) {
        int x1, x2, y1, y2;
        x1 = 0;
        x2 = 500;
        y1 = y2 = 250;

        g.setColor(Color.red);
        for(int i=0; i<5; i++){
            if(i%2==0){
                g.setColor(Color.red);
            }
            else{
                g.setColor(Color.blue);
            }
            g.drawLine(x1, y1, x2, y2);
            y1 = y2 -= 30;
        }
    }
}
