package framework;
import framework.domain.Car;
import framework.observers.CarObserver;

import java.awt.Font;


public class TextFrame extends javax.swing.JFrame implements CarObserver
{
    javax.swing.JLabel JLabelCount = new javax.swing.JLabel();

    public TextFrame()
    {
        getContentPane().setLayout(null);
        setSize(300,200);
        setVisible(false);
        getContentPane().add(JLabelCount);
        JLabelCount.setFont(new Font("Dialog", Font.BOLD, 36));
        JLabelCount.setBounds(48,48,170,86);
        setTitle("Text Frame");
        setCarSpeed(0);

        SymWindow aSymWindow = new SymWindow();
        this.addWindowListener(aSymWindow);
    }

    @Override
    public void update(Car car) {
        setCarSpeed(car.getSpeed());
    }


    class SymWindow extends java.awt.event.WindowAdapter
    {
        public void windowClosing(java.awt.event.WindowEvent event)
        {
            Object object = event.getSource();
            if (object == TextFrame.this)
                TextFrame_WindowClosing(event);
        }
    }

    void TextFrame_WindowClosing(java.awt.event.WindowEvent event)
    {
        dispose();		 // dispose of the Frame.
    }

    public void setCarSpeed (int speed){
        JLabelCount.setText(String.valueOf(speed));
    }
}
