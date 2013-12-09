/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ds;

/**
 *
 * @author Steven
 */
public class LabException extends RuntimeException {

    /**
     * Creates a new instance of <code>LabException</code> without detail message.
     */
    public LabException() {
        super("This is part of your lab.");
    }


    /**
     * Constructs an instance of <code>LabException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public LabException(String msg) {
        super(msg);
    }
}
