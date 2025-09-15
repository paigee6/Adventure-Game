import javax.swing.*;
import java.util.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
    
    JFrame frame=new JFrame("Template");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new PanelTemplate(800,800));
    frame.pack();
    frame.setVisible(true);
  }
}