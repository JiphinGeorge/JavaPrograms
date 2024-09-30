
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Applet implements ActionListener {
    TextField txt = new TextField(20); // Use a number to set the width
    String str, actionMessage;
    Button bt_add = new Button("Add");
    Button bt_del = new Button("Delete");
    List l = new List();

    public void init() { // Corrected method name from 'int' to 'init'
        add(bt_add);
        add(bt_del);
        add(txt);
        add(l);
        bt_add.addActionListener(this); // Corrected syntax
        bt_del.addActionListener(this); // Corrected syntax
    }

    public void paint(Graphics g) { // Corrected method name from 'print' to 'paint'
        g.drawString(actionMessage, 20, 55); // Corrected syntax
    }

    public void actionPerformed(ActionEvent event) { // Corrected method name from 'actionperformed' to 'actionPerformed'
        if (event.getSource() == bt_add) {
            str = txt.getText();
            if (!str.equals(" ")) { // Corrected condition syntax
                l.add(str);
            }
            txt.requestFocus();
        }
        if (event.getSource() == bt_del) {
            int selectedIndex = l.getSelectedIndex();
            if (selectedIndex != -1) { // Check if an item is selected
                l.remove(selectedIndex);
            }
        }
        
        String action = event.getActionCommand();
        if (action.equals("Add")) { // Case-sensitive check for the button text
            actionMessage = "Add button pressed"; // Fixed variable naming
        } else if (action.equals("Delete")) { // Fixed syntax
            actionMessage = "Delete button pressed"; // Fixed variable naming
        }
        repaint();
    }
}
