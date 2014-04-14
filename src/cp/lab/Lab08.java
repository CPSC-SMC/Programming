/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.lab;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>Lab 8: Drawing in Java</p>
 * <p>CPSC 207: Computer Programming</p>
 * 
 * <p>If it is Fall semester, make a Java applet in which you draw a turkey and 
 * add the text Happy Thanksgiving!</p>
 * 
 * <p>If it is Spring semester, make a Java applet in which you draw a bunny and
 * add the text Happy Easter!</p>
 * 
 * <ol><li>Choose an image (possibly from a Google search) of a turkey to use as 
 * a model.</li>
 * 
 * <li>Create a new project. Copy this file over the text in Lab08.java.</li>
 * 
 * <li>Make sure that the class Lab08 extends JPanel. (Why?)</li>
 * 
 * <li>Declare a public void paint(Graphics page) method in the Lab8 class.</li>
 * 
 * <li>Implement the code that paints your picture. You may want to use the 
 * JPolyDraw applet to help you draw polygons. http://sites.saintmarys.edu/~sbroad/jPolyDraw/</li>
 * 
 * <li>Publish your applet to your Saint Mary’s web page.</li><ol type="a">
 * 
 * <li>Publish your site: Visit http://sites.saintmarys.edu/ and follow 
 * instructions to publish your page.</li>
 * 
 * <li>Look in My Documents for the NetBeansProjects folder. In that folder, 
 * find Lab08. In Lab08, find the build folder. Copy everything in the build 
 * folder into H:\WWW\. )</li>
 * 
 * <li>Now visit http://sites.saintmarys.edu/~<username>/Lab08.html</li></ol>
 * 
 * <li>If the Turkey or Bunny doesn’t show up completely, open notepad and edit 
 * H:\WWW\Lab08.html.  About two thirds of the way down, you’ll see &lt;applet&gt;. 
 * Just change the width and height until you can see the whole turkey!</li>
 * 
 * <li>Submit your project.</li></ol>
 * 
 * @author sbroad
 */
public class Lab08 extends JPanel {
    
    public Lab08() {
        this.setPreferredSize(new Dimension(400,400));
    }
    /**
     * This method is an override for the <code>paint</code> method in the JApplet
     * class. Implement this method to draw your turkey or bunny.
     * @param page the graphics object for this applet
     */
    @Override
    public void paint(Graphics page) {
        
        Graphics2D g = (Graphics2D) page;
        g.setStroke(new BasicStroke(10));
        
        page.setColor(new Color(173,255,47));
        page.fillRect(0, 0, 400, 400);
        
        page.setColor(Color.PINK);
        page.drawRect(100, 100, 200, 200);
        
        g.setStroke(new BasicStroke(3));
        page.setColor(Color.blue);
        page.drawRect(150, 150, 100, 100);
        
        int [] x = {100, 200, 150};
        int [] y = {100, 100, 150};
        page.drawPolygon(x, y, 3);
        
        page.drawArc(155, 140, 100, 100, 250, 40);
        
        page.setFont(new Font("Cambria", Font.ITALIC, 48));
        page.drawString("Hello world!", 10, 350);
    }
    
    public static void main(String [] args) {
        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setContentPane(new Lab08());
        
        frame.pack();
        frame.setVisible(true);
        
    }
    
}
