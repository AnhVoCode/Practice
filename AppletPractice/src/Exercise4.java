import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

public class Exercise4 extends Applet {

    TextField radius, perimeter, area;
    Label label1, label2, label3;
    Button cal;
    @Override
    public void init() {
        label1 = new Label("Radius:");
        radius = new TextField(20);
        label2 = new Label("Perimeter:");
        perimeter = new TextField(20);
        label3 = new Label("Area:");
        area = new TextField(20);
        BoxLayout b = new BoxLayout(this, BoxLayout.Y_AXIS);

        this.setLayout(b);
        this.add(label1);this.add(radius);
        this.add(label2);this.add(perimeter);
        this.add(label3);this.add(area);
        cal = new Button(" Calculate ");
        cal.addActionListener(new addlistener());  //register
        this.add(cal);
        this.setSize(400, 400);
        this.setVisible(true);
    }

    class addlistener implements ActionListener { //inner class
        public void actionPerformed(ActionEvent e) {
            double r = Double.parseDouble(radius.getText());
            double p = 2 * r * Math.PI;
            double s = Math.pow(r,2) * Math.PI;
            perimeter.setText(p + "");
            area.setText(s + "");
        }
    }
}


