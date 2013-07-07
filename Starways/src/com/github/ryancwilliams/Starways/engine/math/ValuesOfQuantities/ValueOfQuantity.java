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
 * An class providing common methods for working with a ValueOfQuantity object.
 *
 * @author ryancwilliams
 */
public abstract class ValueOfQuantity {

    /**
     * the value in the specified quantity.
     */
    protected double value;

    /**
     * Gets the value in the specified quantity.
     *
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
     *
     * @return the quantity the value is specified in.
     */
    public abstract Quantity getQuantity();

    /**
     * Gets this ValueOfQuantity as a formated string.
     *
     * @param precision the number decimals to create the value to.
     * @return the ValueOfQuantity as a formated string.
     */
    public String asString(int precision) {
        //Call the formator to format this value.
        return ValueOfQuantityFormatter.formatValueOfQuantity(this, precision);
    }

    /**
     * Gets this ValueOfQuantity as a formated string using default precision.
     * default precision is defined in the implementation.
     *
     * @return the ValueOfQuantity as a formated string.
     */
    public String asString() {
        return this.asString(2);
    }
}
