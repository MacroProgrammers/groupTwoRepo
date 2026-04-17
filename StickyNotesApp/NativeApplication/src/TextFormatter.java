import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.Color;

//Start formatter class
public class TextFormatter {

//Start highlight method
public static void highlight(JTextPane textPane){
    StyledDocument doc = textPane.getStyledDocument();
    Style style = textPane.addStyle("Highlight", null);
    
    //This actually does the color highlight.
    StyleConstants.setBackground(style, Color.YELLOW);

    int start = textPane.getSelectionStart();
    int end = textPane.getSelectionEnd();
    
    if (start != end){
        doc.setCharacterAttributes(start, end - start, style, false);
    }
}

//Start bold text method
public static void boldText(JTextPane textPane) {
    StyledDocument doc = textPane.getStyledDocument();
    
    Style style = textPane.addStyle("Bold", null);
    StyleConstants.setBold(style, true);
    
    int start = textPane.getSelectionStart();
    int end = textPane.getSelectionEnd();

    if (start != end) {
        doc.setCharacterAttributes(start, end - start, style, false);
    }
}
}
//End Text formatting