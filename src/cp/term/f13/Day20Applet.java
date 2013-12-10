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
public class Day20Applet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void paint(Graphics page) {
        page.drawLine(200, 0, 400, 400);
        page.drawLine(400,400,0,400);
        page.drawLine(0,400,200,0);
        
        
        page.drawRect(110,200,180,100);
        
        page.drawOval(110,310,180,80);
        
        page.drawArc(0,0,100,100,210,120);
        // TODO start asynchronous download of heavy resources
    }
    // TODO overwrite start(), stop() and destroy() methods
}
