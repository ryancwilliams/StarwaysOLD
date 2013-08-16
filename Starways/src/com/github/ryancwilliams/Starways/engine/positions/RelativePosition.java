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
 * This class represents a position on a plane relative to another position on
 * the same plane.
 *
 * @author ryancwilliams
 */
public class RelativePosition extends Position {

    /**
     * The reference position of this position. The zero point of the delta
     * positions (DY and DX)
     */
    private Position referencePosition;
    /**
     * The DX value of this position. The delta X value of this position
     * relative to the reference position.
     */
    private double dx;
    /**
     * The DY value of this position. The delta Y value of this position
     * relative to the reference position.
     */
    private double dy;

    /**
     * Creates a new RelativePosition with the specified attributes.
     *
     * @param referencePosition the Reference Position for this
     * RelativePosition.
     * @param dx the delta X value of this position relative to the reference
     * position.
     * @param dy the delta Y value of this position relative to the reference
     * position.
     */
    public RelativePosition(Position referencePosition, double dx, double dy) {
        this.referencePosition = referencePosition;
        this.dx = dx;
        this.dy = dy;
    }

    /**
     * Creates a new RelativePosition with the specified reference position with
     * the delta X and delta Y equal to 0.
     *
     * @param referencePosition the Reference Position for this
     * RelativePosition.
     */
    public RelativePosition(Position referencePosition) {
        this(referencePosition, 0, 0);
    }

    @Override
    public double getX() {
        return this.referencePosition.getX() + this.getDx();
    }

    @Override
    public double getY() {
        return this.referencePosition.getY() + this.getDy();
    }

    @Override
    public Plane getPlane() {
        //Return the plane that the reference position is located on
        return this.referencePosition.getPlane();
    }

    /**
     * Sets the X value of this position on the current plane.
     *
     * @param x the new X value for this position on the current plane.
     */
    public void setX(double x) {
        this.dx = x - this.referencePosition.getX();
    }

    /**
     * Sets the Y value of this position on the current plane.
     *
     * @param y the new Y value for this position on the current plane.
     */
    public void setY(double y) {
        this.dy = y - this.referencePosition.getY();
    }

    /**
     * Gets the Reference Position for this RelativePosition.
     *
     * @return the Reference Position for this RelativePosition.
     */
    public Position getReferencePosition() {
        return referencePosition;
    }

    /**
     * Sets the the Reference Position for this RelativePosition.
     *
     * @param referencePosition the new the Reference Position for this
     * RelativePosition.
     */
    public void setReferencePosition(Position referencePosition) {
        this.referencePosition = referencePosition;
    }

    public void changeReferencePosition(Position referencePosition) {
        //Get global cords.
        double globalX = this.getX();
        double globalY = this.getY();

        //Set new referencePosition
        this.setReferencePosition(referencePosition);

        //Set global cords to match orginal cords.
        this.setX(globalX);
        this.setY(globalY);
    }

    /**
     * Gets the DX value of this position.
     *
     * @return the delta X value of this position relative to the reference
     * position.
     */
    public double getDx() {
        return dx;
    }

    /**
     * Sets the DX value of this position.
     *
     * @param dx the new delta X value of this position relative to the
     * reference position.
     */
    public void setDx(double dx) {
        this.dx = dx;
    }

    /**
     * Gets the DY value of this position.
     *
     * @return the delta Y value of this position relative to the reference
     * position.
     */
    public double getDy() {
        return dy;
    }

    /**
     * Sets the DY value of this position.
     *
     * @param dy the new delta Y value of this position relative to the
     * reference position.
     */
    public void setDy(double dy) {
        this.dy = dy;
    }

    /**
     * Sets the Relative Position of this object.
     *
     * @param dx the new delta X value of this position relative to the
     * reference position.
     * @param dy the new delta Y value of this position relative to the
     * reference position.
     */
    public void setRelativePosition(double dx, double dy) {
        this.setDx(dx);
        this.setDy(dy);
    }
}
