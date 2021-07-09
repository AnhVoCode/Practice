import java.applet.Applet;
import java.awt.*;

public class Exercise1 extends Applet {

    public void paint(Graphics g) {
        //  set up some constants
        final int MID = 150;    // middle of the snowman
        final int TOP = 50;        // top of the snowman

        //  need to set the background colors
        setBackground(Color.cyan);

        // color the ground
        g.setColor(Color.blue);
        // the ground is a blue rectangle
        g.fillRect(1, 175, 400, 50);

        //  draw three large snowballs to make up snowman
        g.setColor(Color.white);

        // draw head
        g.fillOval(MID + 25, TOP, 50, 50);
        // draw middle (upper torso)
        g.fillOval(MID + 15, TOP + 35, 70, 60);
        // draw base (lower torso)
        g.fillOval(MID, TOP + 80, 100, 70);

        //  draw in features of snowman
        g.setColor(Color.black);

        //  draw eyes
        // draw left eye
        g.fillOval(MID + 35, TOP + 20, 5, 5);
        // draw right eye
        g.fillOval(MID + 55, TOP + 20, 5, 5);

        // draw mouth
        g.drawArc(MID + 37, TOP + 25, 20, 10, 190, 160);

        //  draw arms
        // draw left arm
        g.drawLine(MID + 30, TOP + 70, MID - 20, TOP + 40);
        // draw right arm
        g.drawLine(MID + 75, TOP + 60, MID + 120, TOP + 60);

        //  draw hat
        // draw brim of hat
        g.drawLine(MID + 75, TOP+5, MID + 20, TOP+5);
        // draw top of hat
        g.fillRect(MID + 32, TOP - 25, 35, 30);
    }
}
