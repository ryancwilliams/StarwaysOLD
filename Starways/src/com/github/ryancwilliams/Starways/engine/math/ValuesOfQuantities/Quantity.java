/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities;

/**
 * This interface provides methods for working with quantities.
 * @author ryancwilliams
 */
public interface Quantity {
    
    /**
     * Gets the name of this unit.
     * @return the name of this unit.
     */
    public String getName();

    /**
     * Gets the symbol of this unit.
     * @return the symbol of this unit.
     */
    public String getSymbol();

    /**
     * Gets the conversion factor for converting from the base unit 
     * (conversionFactor = 1) to this unit.
     * @return the conversion factor for converting from the base unit to this unit.
     */
    public double getConversionFactor();
}
