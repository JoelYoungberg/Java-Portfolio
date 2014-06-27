/*
 * Joel R. Youngberg - Calculator App
 * 3 Dec 2013
 */
package calclayout;

import java.awt.*;
import javax.swing.*;


/**
 * @author Joel R. Youngberg
 */


public class CalcTest extends JPanel {
    private final SplyAlctr resourceManager = new SplyAlctr(this.getClass());
    
    private final JLabel lbCaption = new JLabel("<html>" +
            resourceManager.getString("Joel R. Youngberg: Calculator")+ "</html");
    
    private final Calculator calculator = new Calculator();

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new CalcTest());
        frame.setPreferredSize(new Dimension(800,600));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//End Main
    
    public CalcTest(){//Constructor
        setLayout(new BorderLayout());
        
        initUI();
    }//End Constructor
    
    private void initUI(){
        Panel pnContent = new Panel(1,0,2);
        
        pnContent.setBorderEqual(10);
        
        pnContent.cell(lbCaption, Panel.Layout.FILL).
                cell().
                cell(calculator, Panel.Layout.CENTER, Panel.Layout.FIRST).
                cell();
        add(pnContent);
    }//End initUI
    
}//End CalcLayoutTest