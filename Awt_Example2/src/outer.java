import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class outer implements ActionListener {
    awt_event obj;
    outer(awt_event obj){
        this.obj=obj;
    }

    public void actionPerformed(ActionEvent e){
        obj.tf.setText("hello mini");
    }
}
