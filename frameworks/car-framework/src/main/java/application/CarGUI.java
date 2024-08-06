package application;

import framework.commands.Command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarGUI extends framework.CarGUI {
    private final JButton jButtonJump = new JButton();
    public CarGUI() {
        // Pass custom CarController which extends Framework CarController
        super(new CarController());
        initCarGUI();
    }

    public static void main(String[] args) {
        // Initialize CarGUI which in turn will initialize the super class -> Framework GUI
        CarGUI frame = new CarGUI();
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
        this.getFrame().setTitle("Porsche" + " \uD83C\uDFCE");
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
    }

    private void jButtonJump_actionPerformed(ActionEvent e) {
        Command command = new Jump(new CarController());
        command.execute();
        commandHistory.add(command);
    }
}
