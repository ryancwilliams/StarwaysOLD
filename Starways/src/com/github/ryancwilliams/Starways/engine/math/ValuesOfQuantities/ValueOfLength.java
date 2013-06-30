/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities;

/**
 * Used to link numerical values of length to Quantities of Length
 * @author ryancwilliams
 */
public class ValueOfLength implements ValueOfQuantity {
    
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
    @Override
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
    @Override
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
    public double getConvertedValue(QuantityOfLength quantity) {
        return this.value * QuantityOfLength
                .caculateConversionFactor(this.quantity, quantity);
    }
    
    /**
     * Gets a ValueOfLength in the specified quantity.
     * @param quantity the quantity the value should be in
     * @return the ValueOfLength in the specified quantity.
     */
    public ValueOfLength getConvertedValueOfLength(QuantityOfLength quantity) {
        return new ValueOfLength(this.getConvertedValue(quantity), quantity);
    }

    /**
     * Gets this ValueOfLength as a formated string.
     * @param precision the number decimals to create the value to.
     * @return the ValueOfQuantity as a formated string.
     */
    @Override
    public String asString(int precision) {
        //Call the formator to format this value.
        return ValueOfQuantityFormatter.formatValueOfQuantity(this, precision);
    }

    /**
     * Gets this ValueOfLength as a formated string using default precision.
     * @return the ValueOfQuantity as a formated string.
     */
    @Override
    public String asString() {
        return this.asString(2);
    }

    /**
     * the toString.
     * @return this object as a string.
     */
    @Override
    public String toString() {
        return "ValueOfLength{" + "value=" + value + ", quantity=" + quantity + '}';
    }
}
