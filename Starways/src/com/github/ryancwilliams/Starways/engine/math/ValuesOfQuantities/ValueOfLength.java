/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities;

/**
 * Used to link numerical values of length to Quantities of Length
 * @author ryancwilliams
 */
public class ValueOfLength {
    
    /**
     * the value in the specified quantity.
     */
    private double value;
    /**
     * the quantity the value is specified in.
     */
    private QuantityOfLength quantity;

    /**
     * Creates a Value of Length object
     * @param value the value in the specified quantity.
     * @param quantity the quantity the value is specified in.
     */
    public ValueOfLength(double value, QuantityOfLength quantity) {
        this.value = value;
        this.quantity = quantity;
    }

    /**
     * Gets the value in the specified quantity.
     * @return the value in the specified quantity.
     */
    public double getValue() {
        return value;
    }
    
    /**
     * Sets the value in the specified quantity.
     * @param value the value to set specified quantity into.
     */
    public void setValue(double value) {
        this.value = value;
    }
    
    /**
     * Gets the quantity the value is specified in.
     * @return the quantity the value is specified in.
     */
    public QuantityOfLength getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity the value is specified in.
     * @param quantity the quantity to change the value specified into.
     */
    public void setQuantity(QuantityOfLength quantity) {
        this.quantity = quantity;
    }
    
    /**
     * Gets the value in the specified quantity.
     * @param quantity the quantity to return the value in.
     * @return the value in the specified quantity.
     */
    public double getConvertedQuantity(QuantityOfLength quantity) {
        return this.value * QuantityOfLength
                .caculateConversionFactor(this.quantity, quantity);
    }
}
