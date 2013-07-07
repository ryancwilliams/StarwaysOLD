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
