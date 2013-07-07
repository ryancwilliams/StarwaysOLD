/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.Starways.engine.bodies;

import com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities.ValueOfLength;
import com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities.ValueOfMass;

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
    private ValueOfLength radius;
    
    /**
     * The mass of the object
     */
    private ValueOfMass mass;
    
    //TODO Add Length
    
    //TODO Constructor
    
    /**
     * Gets the radius of this body.
     * @return the radius of this body
     */
    public ValueOfLength getRadius() {
        return radius;
    }

    /**
     * Gets the mass of this body.
     * @return the mass of this body
     */
    public ValueOfMass getMass() {
        return mass;
    }
}
