import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Applet implements ActionListener {
    TextField txt = new TextField(20); 
    String str, actionMessage;
    Button bt_add = new Button("Add");
    Button bt_del = new Button("Delete");
    List l = new List();

    public void init() { 
        add(bt_add);
        add(bt_del);
        add(txt);
        add(l);
        bt_add.addActionListener(this); 
        bt_del.addActionListener(this); 
    }

    public void paint(Graphics g) { 
        g.drawString(actionMessage, 20, 55); 
    }

    public void actionPerformed(ActionEvent event) { 
        if (event.getSource() == bt_add) {
            str = txt.getText();
            if (!str.equals(" ")) { 
                l.add(str);
            }
            txt.requestFocus();
        }
        if (event.getSource() == bt_del) {
            int selectedIndex = l.getSelectedIndex();
            if (selectedIndex != -1) { 
                l.remove(selectedIndex);
            }
        }
        
        String action = event.getActionCommand();
        if (action.equals("Add")) { 
            actionMessage = "Add button pressed"; 
        } else if (action.equals("Delete")) { 
            actionMessage = "Delete button pressed"; 
        }
        repaint();
    }
}
