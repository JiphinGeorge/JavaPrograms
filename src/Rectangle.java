import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Applet {
   String str;
   int x1,x2,x3,x4;
   public void paint(Graphics g){
    int x1 =Integer.parseInt(this.getParameter("x1"));
    int x2 =Integer.parseInt(this.getParameter("x2"));
    int x3 =Integer.parseInt(this.getParameter("x3"));
    int x4 =Integer.parseInt(this.getParameter("x4"));
    g.drawRect(x1, x2, x3, x4);
    String str =getParameter("color");
    if(str.equals("blue"))
    g.setColor(Color.BLUE);
    else if(str.equals("green"))
    g.setColor(Color.green);
    else if(str.equals("Red"))
    g.setColor(Color.RED);
    g.fillRect(x1,x2,x3,x4);
   } 
}
