/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.term.f13;

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author sbroad
 */
public class Day20 extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       (new Day20()).show();
    }
    
    @Override
    public void paint(Graphics page)
    {
        page.drawLine(0, 0, 400, 400);
    }
}
