package framework;

import framework.commands.Command;
import framework.commands.CommandHistory;
import framework.commands.Decrement;
import framework.commands.Increment;
import framework.domain.Car;
import framework.domain.CarController;
import framework.observers.CarObserver;
import framework.observers.FileLogger;
import framework.states.Below70;
import framework.states.CarState;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CarGUI extends JFrame implements CarObserver {
    private JButton jButtonIncrement = new JButton();
    private JButton jButtondecrement = new JButton();
    private JButton jButtonundo = new JButton();
    private JButton jButtonredo = new JButton();

    private javax.swing.JLabel JLabelCount = new javax.swing.JLabel();

    protected CommandHistory commandHistory;

    protected CarController carController;

    Car car;

    FileLogger fileLogger;

    public CarGUI(CarController carController) {
        try {
            jbInit();
            commandHistory = new CommandHistory();
            this.carController = carController == null ? new CarController(new Below70(), car) : carController;
            fileLogger = new FileLogger();
            this.carController.addObserver(this);
            this.carController.addObserver(fileLogger);

            CarGUI.SymWindow aSymWindow = new CarGUI.SymWindow();
            this.addWindowListener(aSymWindow);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeFileLogger(){
        this.carController.removeObserver(fileLogger);
    }

    public static void main(String[] args) {
        CarGUI frame = new CarGUI(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        frame.setLocation( ( screenSize.width - frameSize.width ) / 2, ( screenSize.height - frameSize.height ) / 2 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle("Framework");
        frame.setVisible(true);
    }

    public CarGUI getFrame(){
        return this;
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(297, 229));
        jButtonIncrement.setText("+");
        jButtonIncrement.setBounds(new Rectangle(30, 25, 73, 22));
        jButtonIncrement.setActionCommand("increment");
        jButtonIncrement.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jButtonIncrement_actionPerformed(e);
            }
        });
        jButtondecrement.setText("-");
        jButtondecrement.setBounds(new Rectangle(155, 25, 73, 22));
        jButtondecrement.setActionCommand("decrement");
        jButtondecrement.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButtondecrement_actionPerformed(e);
            }
        });
        jButtonundo.setText("undo");
        jButtonundo.setBounds(new Rectangle(30, 135, 73, 22));
        jButtonundo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButtonundo_actionPerformed(e);
            }
        });
        jButtonredo.setText("redo");
        jButtonredo.setBounds(new Rectangle(155, 135, 73, 22));
        jButtonredo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButtonredo_actionPerformed(e);
            }
        });

        JLabelCount.setFont(new Font("Dialog", Font.BOLD, 36));
        JLabelCount.setBounds(120,48,170,86);
        setCarSpeed(0);
        this.getContentPane().add(jButtonredo, null);
        this.getContentPane().add(jButtonundo, null);
        this.getContentPane().add(jButtondecrement, null);
        this.getContentPane().add(jButtonIncrement, null);
        this.getContentPane().add(JLabelCount, null);
    }

    private void jButtonIncrement_actionPerformed(ActionEvent e) {
        Command command = new Increment(carController);
        command.execute();
        commandHistory.add(command);
    }

    private void jButtondecrement_actionPerformed(ActionEvent e) {
        Command command = new Decrement(carController);
        command.execute();
        commandHistory.add(command);
    }

    private void jButtonundo_actionPerformed(ActionEvent e) {
        commandHistory.undo();
    }

    private void jButtonredo_actionPerformed(ActionEvent e) {
        commandHistory.redo();
    }

    @Override
    public void update(Car car) {
        setCarSpeed(car.getSpeed());
    }

    public void setCarSpeed (int speed){
        JLabelCount.setText(String.valueOf(speed));
    }

    class SymWindow extends java.awt.event.WindowAdapter
    {
        public void windowClosing(java.awt.event.WindowEvent event)
        {
            Object object = event.getSource();
            if (object == CarGUI.this)
                CarGUI_WindowClosing(event);
        }
    }

    void CarGUI_WindowClosing(java.awt.event.WindowEvent event)
    {
        dispose();		 // dispose of the Frame.
    }

}
