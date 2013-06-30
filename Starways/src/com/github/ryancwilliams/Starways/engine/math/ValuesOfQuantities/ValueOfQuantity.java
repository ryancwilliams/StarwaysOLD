/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities;

/**
 * An interface for reading values inside of a ValueOfQuantity object.
 * @author ryancwilliams
 */
public interface ValueOfQuantity {
    
    /**
     * Gets the value in the specified quantity.
     * @return the value in the specified quantity.
     */
    public double getValue();
    
    /**
     * Gets the quantity the value is specified in.
     * @return the quantity the value is specified in.
     */
    public Quantity getQuantity();
    
    /**
     * Gets this ValueOfQuantity as a formated string.
     * @param precision the number decimals to create the value to.
     * @return the ValueOfQuantity as a formated string.
     */
    public String asString(int precision);
    
    /**
     * Gets this ValueOfQuantity as a formated string using default precision.
     * default precision is defined in the implementation. 
     * @return the ValueOfQuantity as a formated string.
     */
    public String asString();
    
}
