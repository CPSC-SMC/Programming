/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.lib;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author sbroad
 */
public class Turkey extends JApplet {

    /**
     * Painting method that will be called after the applet is loaded into
     * the browser.
     * @param page
     */
    
    @Override
    public void paint(Graphics page)
    {
        this.setBackground(Color.red);
    }
}
