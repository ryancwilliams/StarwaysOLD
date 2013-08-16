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
package com.github.ryancwilliams.Starways.engine.positions;

/**
 * This class represents a finite position on a plane.
 * @author ryancwilliams
 */
public class FinitePosition extends Position {

    /**
     * The X value of this position.
     */
    private double x;
    /**
     * The Y value of this position.
     */
    private double y;
    /**
     * The plane that this Position is located on.
     */
    private Plane plane;

    /**
     * Creates a new FinitePosition object.
     * @param x the X value of this position.
     * @param y the Y value of this position.
     */
    public FinitePosition(double x, double y, Plane plane) {
        this.x = x;
        this.y = y;
        this.plane = plane;
    }
    
    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public Plane getPlane() {
        return this.plane;
    }

    /**
     * Sets the X value of this position. 
     * @param x the new X value for this position.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Sets the Y value of this position. 
     * @param y the new Y value for this position.
     */
    public void setY(double y) {
        this.y = y;
    }
}
