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

import com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities.QuantityOfLength;
import com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities.ValueOfQuantity;

/**
 * This class represents a plane on which positions are plotted.
 *
 * @author ryancwilliams
 */
public class Plane {

    /**
     * The center of this plane on a parent plane. This field is
     * <code>null</code> if this plane is the highest in the hierarchy
     */
    private Position centerOnSuperPlane;
    /**
     * The scale of this plane. This value is equal to 1 unit on this plane.
     */
    private ValueOfQuantity<QuantityOfLength> scale;

    /**
     * Creates a new plane object.
     *
     * @param centerOnSuperPlane The center of this plane on a parent plane.
     * @param scale The scale of this plane.
     */
    public Plane(Position centerOnSuperPlane, ValueOfQuantity<QuantityOfLength> scale) {
        this.centerOnSuperPlane = centerOnSuperPlane;
        this.scale = scale;
    }

    /**
     * Creates a new root plane object. This plane is the highest in the
     * hierarchy.
     *
     * @param scale The scale of this plane.
     */
    public Plane(ValueOfQuantity<QuantityOfLength> scale) {
        this(null, scale);
    }

    /**
     * Creates a new plane object with a scale of 1 metre.
     *
     * @param centerOnSuperPlane The center of this plane on a parent plane.
     */
    public Plane(Position centerOnSuperPlane) {
        this(centerOnSuperPlane, new ValueOfQuantity(1, QuantityOfLength.METRE));
    }

    /**
     * Creates a new root plane with a default scale. This plane is the highest
     * in the hierarchy.
     */
    public Plane() {
        this((Position) null);
    }
}
