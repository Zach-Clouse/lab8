import java.awt.Color;
import java.awt.Dimension; // new
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyGUI6 extends JFrame {
    
    private static JLabel output;
    private static JTextField textField1;
    private static JTextField textField2;
    private static JButton button1;
    private static JButton button2;
    
    private void setupFrame() {
        // *** Changing the size ***
        // Instead of using:
        // this.setSize(420, 420);
        this.setPreferredSize(new Dimension(420, 420));
        
        // exit out of application 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        // prevent the frame from being closed
        //this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        // prevent the frame from being resized
        this.setResizable(false);
        
        // clear the layout. No Panel
        this.setLayout(null);
        
        // changing the background color
        //this.getContentPane().setBackground(Color.GREEN);
        
        // defining a new Color object
        Color color = new Color(125, 50, 250);
        this.getContentPane().setBackground(color);
        
    }
    
    private void addLabels() {
        // ******* ADDING Label *******
        JLabel label1 = new JLabel();
        // Where to put on on the frame?
        // using setBounds method that gets x, y, width, height
        label1.setBounds(10, 20, 100, 20);
        label1.setText("First Name");
        
        JLabel label2 = new JLabel();
        label2.setBounds(10, 70, 100, 20);
        label2.setText("Last Name");
        
        output = new JLabel();
        output.setBounds(140, 220, 140, 50);
        output.setText("");
        
        // Adding labels to the frame
        this.add(label1);
        this.add(label2);
        this.add(output);
    }
    
    private void addTestFields() {
        // ******* ADDING TextField *******
        textField1 = new JTextField();
        textField1.setBounds(150, 10, 150, 40);
        textField1.setText("");
        
        textField2 = new JTextField();
        textField2.setBounds(150, 60, 150, 40);
        textField2.setText("");
        
        // Adding UI components to the frame
        this.add(textField1);
        this.add(textField2);
    }
    
    private void addButtons() {
        // ******* ADDING Button *******
        button1 = new JButton();
        button1.setBounds(140, 150, 80, 50);
        button1.setText("print");
        // Adding ActionListener to the button
        // using lambda
        button1.addActionListener(e -> actionPrint());
                
        button2 = new JButton();
        button2.setText("clear");
        button2.setBounds(220, 150, 80, 50);
        button2.setEnabled(false);
        // Adding ActionListener to the button
        // using lambda
        button2.addActionListener(e -> actionClear());
        
        this.add(button1);
        this.add(button2);
    }
    
    private void actionClear() {
        output.setText("");
        button1.setEnabled(true);
        button2.setEnabled(false);
        textField1.setText("");
        textField2.setText("");    
    }
    
    private void actionPrint() {
        output.setText(
                "*** " + textField1.getText() 
                + " " + textField2.getText()
                + " ***");
        button2.setEnabled(true);
        button1.setEnabled(false);
    }

    public MyGUI6() {
        // Defines a JFrame with the given title
        super("My GUI");
        setupFrame();
        
        addLabels();
        
        addTestFields();
              
        addButtons();
    }
    
    public static void main(String[] args) {
        MyGUI2 myGui = new MyGUI2();
        // Causes this Window to be sized to fit 
        // the preferred size and layouts of its 
        // subcomponents.
        myGui.pack();  // important
        myGui.setVisible(true);
    }

}
