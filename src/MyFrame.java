import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    public MyFrame(){
        super("Random_Array");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(500,500);

        jTextField = new JTextField(10);
        jButtonStart = new JButton("Start");
        jButtonStart.addActionListener(new MyJbuttonListener());
        jButtonStop = new JButton("Stop");

        getContentPane().add(jTextField);
        getContentPane().add(jButtonStart);
        getContentPane().add(jButtonStop);

        setVisible(true);
    }

    private JTextField jTextField;
    private JButton jButtonStart;
    private JButton jButtonStop;

    public int getjTextField(){
        int val = Integer.parseInt(jTextField.getText());
        return val;
    }

    class MyJbuttonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            getjTextField();
            System.out.println(getjTextField());
        }
    }


}
