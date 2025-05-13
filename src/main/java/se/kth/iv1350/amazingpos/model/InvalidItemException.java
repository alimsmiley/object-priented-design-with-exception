package se.kth.iv1350.amazingpos.model;

import java.lang.*;
/**
 * Contains invalid item exception handling 
 */

public class InvalidItemException extends Exception {
    //behöver vi ha fields till classen
    
    /**
     * Creats new instance of InvaliditemException with an error message
     * @param message The error message
     */
    public InvalidItemException(String message){
        super(message);
    }






}
