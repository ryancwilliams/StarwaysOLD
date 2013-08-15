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
 * This class is a base class for a Position on a plane.
 * @author ryancwilliams
 */
public abstract class Position {
    
    /**
     * Gets the X value of this position on the current plane. 
     * @return the X value of this position on the current plane.
     */
    public abstract double getX();
    
    /**
     * Gets the Y value of this position on the current plane.
     * @return Y value of this position on the current plane.
     */
    public abstract double getY();
    
}
