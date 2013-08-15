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
package com.github.ryancwilliams.Starways.engine.bodies;

import com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities.QuantityOfLength;
import com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities.QuantityOfMass;
import com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities.ValueOfQuantity;

/**
 * Astronomical objects or celestial objects are naturally occurring physical 
 * entities. This object is to serve as the base-class for Stars, Planetary 
 * Bodies, and other objects like this.
 * @author ryancwilliams
 */
public class AstronomicalObject {
    
    /**
     * The radius of the object
     */
    private ValueOfQuantity<QuantityOfLength> radius;
    
    /**
     * The mass of the object
     */
    private ValueOfQuantity<QuantityOfMass> mass;
    
    //TODO Add Length
    
    //TODO Constructor
    
    /**
     * Gets the radius of this body.
     * @return the radius of this body
     */
    public ValueOfQuantity<QuantityOfLength> getRadius() {
        return radius;
    }

    /**
     * Gets the mass of this body.
     * @return the mass of this body
     */
    public ValueOfQuantity<QuantityOfMass> getMass() {
        return mass;
    }
}
