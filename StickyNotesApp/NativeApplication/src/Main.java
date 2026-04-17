//Grouped new dependencies.
import javax.swing.*;
import java.awt.*;

import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

//Added java abstract window tk for UI functionality
/* 
 * Main class with main method invoked on app start.
 * @version 1.0.0
 * @author Dr. Jody Paul
 */

public class Main {
    /** Private constructor to prevent instantiation of entry point class. */
    private Main() { }

    /**
     * Invoked on start.
     * @param args ignored
     */
    public static void main(String[] args) {

// Testing output
System.out.println("Program Started");

// I have no clue what this does, but DON'T TOUCH IT.
SwingUtilities.invokeLater(() -> {

    JFrame frame = new JFrame("Welcome to Sticky Note!");
        frame.setLayout(new BorderLayout());
        
    JLabel label = new JLabel("Enter text");
    label.setHorizontalAlignment(SwingConstants.LEFT);
    frame.add(label, BorderLayout.NORTH);

    JTextPane textPane = new JTextPane();

//Ui and graphic control buttons

    JButton boldButton = new JButton("Bold");
    JButton highlightButton = new JButton("Highlight");
    JButton colorPick = new JButton("Change Color");


//Action listeners, these call >>TextFormatter on clicks.

    highlightButton.addActionListener(e -> {
        TextFormatter.highlight(textPane);
    });

    boldButton.addActionListener(e -> {
        TextFormatter.boldText(textPane);
    });
    

// Start user picks color

    colorPick.addActionListener(e -> {

        Color chosenColor = JColorChooser.showDialog(
            frame,
            "Choose Color",
            frame.getContentPane().getBackground()
        );
        
//This actually chnages the color, don't remove 'if', needs the check or breaks.
        if (chosenColor != null) {
            frame.getContentPane().setBackground(chosenColor);
            textPane.setBackground(chosenColor);
        }
    });

//	label.setVerticalAlignment(SwingConstants.TOP);
//  Removed for now, Alignment setVerticalAlignment is redundant to NORTH.

//  Window Setup

	JScrollPane scrollPane = new JScrollPane(textPane);
    frame.add(scrollPane, BorderLayout.CENTER);

// Frame setup
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(colorPick);
        buttonPanel.add(boldButton);
        buttonPanel.add(highlightButton);
        
        frame.add(buttonPanel, BorderLayout.SOUTH);

    //    frame.add(colorPick, BorderLayout.SOUTH);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        });
    }
}
