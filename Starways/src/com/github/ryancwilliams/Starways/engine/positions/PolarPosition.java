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

import com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities.QuantityOfAngle;
import com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities.QuantityOfLength;
import com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities.ValueOfQuantity;

/**
 * This class represents a position on a plane that revolves around another position on
 * the same plane.
 * @author ryancwilliams
 */
public class PolarPosition extends Position {

    /**
     * The center position of this position. The position that represents the
     * center of the circle that the Position is located on.
     */
    private Position centerPosition;
    /**
     * The distance at which this position revolves around the reference
     * position.
     */
    private ValueOfQuantity<QuantityOfLength> distance;
    /**
     * The angle at which this position is in relation to the reference
     * position. 0 is positive x on the plane.
     */
    private ValueOfQuantity<QuantityOfAngle> angle;

    @Override
    public double getX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Plane getPlane() {
        //Return the plane that the reference position is located on
        return this.centerPosition.getPlane();
    }

    /**
     * Gets the position that represents the center of the circle that the
     * Position is located on.
     *
     * @return The position that represents the center of the circle that the
     * Position is located on.
     */
    public Position getCenterPosition() {
        return centerPosition;
    }

    /**
     * Sets the position that represents the center of the circle that the
     * Position is located on.
     *
     * @param centerPosition The new position that represents the center of
     * the circle that the Position is located on.
     */
    public void setCenterPosition(Position centerPosition) {
        this.centerPosition = centerPosition;
    }

    /**
     * Gets the distance at which this position revolves around the reference
     * position.
     *
     * @return The distance at which this position revolves around the reference
     * position.
     */
    public ValueOfQuantity<QuantityOfLength> getDistance() {
        return distance;
    }

    /**
     * Sets the distance at which this position revolves around the reference
     * position.
     *
     * @param distance The new distance at which this position revolves around
     * the reference position.
     */
    public void setDistance(ValueOfQuantity<QuantityOfLength> distance) {
        this.distance = distance;
    }

    /**
     * Gets the angle at which this position is in relation to the reference
     * position.
     *
     * @return The angle at which this position is in relation to the reference
     * position.
     */
    public ValueOfQuantity<QuantityOfAngle> getAngle() {
        return angle;
    }

    /**
     * Sets the angle at which this position is in relation to the reference
     * position.
     *
     * @param angle The new angle at which this position is in relation to the
     * reference position.
     */
    public void setAngle(ValueOfQuantity<QuantityOfAngle> angle) {
        this.angle = angle;
    }
}
