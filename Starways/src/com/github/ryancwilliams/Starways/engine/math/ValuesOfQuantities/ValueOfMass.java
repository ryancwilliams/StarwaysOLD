/*
 * Copyright 2013 ryancwilliams.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities;

/**
 * Used to link numerical values of mass to Quantities of mass
 *
 * @author ryancwilliams
 */
public class ValueOfMass extends ValueOfQuantity {

    /**
     * the quantity the value is specified in.
     */
    private QuantityOfMass quantity;

    /**
     * Creates a Value of Mass object
     *
     * @param value the value in the specified quantity.
     * @param quantity the quantity the value is specified in.
     */
    public ValueOfMass(double value, QuantityOfMass quantity) {
        this.value = value;
        this.quantity = quantity;
    }

    /**
     * Gets the quantity the value is specified in.
     *
     * @return the quantity the value is specified in.
     */
    @Override
    public QuantityOfMass getQuantity() {
        return this.quantity;
    }

    /**
     * Sets the quantity the value is specified in.
     *
     * @param quantity the quantity to change the value specified into.
     */
    public void setQuantity(QuantityOfMass quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the value in the specified quantity.
     *
     * @param quantity the quantity to return the value in.
     * @return the value in the specified quantity.
     */
    public double getConvertedValue(QuantityOfMass quantity) {
        return this.value * QuantityOfMass
                .caculateConversionFactor(this.quantity, quantity);
    }

    /**
     * Gets a ValueOfMass in the specified quantity.
     *
     * @param quantity the quantity the value should be in
     * @return the ValueOfMass in the specified quantity.
     */
    public ValueOfMass getConvertedValueOfLength(QuantityOfMass quantity) {
        return new ValueOfMass(this.getConvertedValue(quantity), quantity);
    }
    
    /**
     * Converts this ValueOfMass to the specified quantity.
     * @param quantity the quantity this value should be in.
     */
    public void convertTo(QuantityOfMass quantity) {
        this.value = this.getConvertedValue(quantity);
        this.quantity = quantity;
    }

    /**
     * Gets this ValueOfMass as a formated string using default precision.
     *
     * @return the ValueOfQuantity as a formated string.
     */
    @Override
    public String asString() {
        return this.asString(2);
    }

    /**
     * the toString.
     *
     * @return this object as a string.
     */
    @Override
    public String toString() {
        return "ValueOfMass{" + "value=" + value + ", quantity=" + quantity + '}';
    }
}
