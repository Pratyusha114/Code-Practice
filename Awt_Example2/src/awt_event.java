import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt_event extends Frame {
    TextField tf;

    awt_event() {
//create components
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("click me");
        b.setBounds(100, 120, 80, 30);
        Button b2= new Button("click 2");
        b2.setBounds(100, 140, 80, 30);

//    outer o = new outer(this);
//    b.addActionListener(o);
//    outer2 o2 = new outer2(this);
//    b2.addActionListener(o2);
//
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                tf.setText("hey siri");
            }
        });
         b2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 tf.setText("byee!!");
             }

         });

        add(b);add(tf);add(b2);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String args[]){
        awt_event awt=new awt_event();
    }
}

