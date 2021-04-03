import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class outer2  implements ActionListener {
    awt_event obj2;
    outer2(awt_event obj){
        this.obj2=obj;
    }
    public void actionPerformed(ActionEvent e){
        obj2.tf.setText("hey honey");
    }
}
