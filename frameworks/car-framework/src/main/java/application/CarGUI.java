package application;

import framework.commands.Command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarGUI extends framework.CarGUI {
    private final JButton jButtonJump = new JButton();
    CarController carController;

    Car car;
    public CarGUI(CarController carController) {
        // Pass custom CarController which extends Framework CarController
        super(carController);
        this.carController = carController;
        initCarGUI();
    }

    public static void main(String[] args) {
        // Initialize CarGUI which in turn will initialize the super class -> Framework GUI
        CarGUI frame = new CarGUI(new CarController(new Car()));
        // Set screen
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
        frame.setVisible(true);
    }

    public void initCarGUI(){
        // Set title of the frame
        this.getFrame().setTitle("Application" + " \uD83C\uDFCE");
        // Extend the height of the GUI
        this.setSize(new Dimension(297, 279));
        // Add jump buttton
        jButtonJump.setText("jump");
        jButtonJump.setBounds(new Rectangle(95, 195, 73, 22));
        jButtonJump.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButtonJump_actionPerformed(e);
            }
        });
        this.getContentPane().add(jButtonJump);
        this.carController.addObserver(new DatabaseLogger());
        // Remove File Logger
        this.removeFileLogger();

    }

    private void jButtonJump_actionPerformed(ActionEvent e) {
        Command command = new Jump(this.carController);
        command.execute();
        commandHistory.add(command);
    }
}
