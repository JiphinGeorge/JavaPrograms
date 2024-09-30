import java.awt.*;

public class ListExample {

    ListExample() {
        Frame f = new Frame ();
        List l1 = new List(5);
        l1.setBounds(100,100,75,75);
        l1.add("item 1");
        l1.add("item 2");
        l1.add("item 3");
        l1.add("item 4");
        l1.add("item 5");
        f.add(l1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new ListExample();
    }
}
