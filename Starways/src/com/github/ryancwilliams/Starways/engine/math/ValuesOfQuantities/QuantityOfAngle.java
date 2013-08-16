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
 * This enum provides quantities of angle for working with angles.
 *
 * @author ryancwilliams
 */
public enum QuantityOfAngle implements Quantity {

    /**
     * The radian is the standard unit of angular measure, used in many areas of
     * mathematics. An angle's measurement in radians is numerically equal to
     * the length of a corresponding arc of a unit circle, so one radian is just
     * under 57.3 degrees (when the arc length is equal to the radius).
     */
    RADIAN("radian", "rad", 1d),
    /**
     * The cycle (or turn, full circle, revolution, or rotation) is one full
     * circle. A turn can be subdivided in centiturns and milliturns. A turn is
     * abbreviated \tau or rev or rot depending on the application, but just r
     * in rpm (revolutions per minute). 1 turn = 360° = 2π rad = 400 grad = 4
     * right angles.
     */
    CYCLE("cycle", "rot", (double) 2 * Math.PI),
    /**
     * A degree (in full, a degree of arc, arc degree, or arcdegree), usually
     * denoted by ° (the degree symbol), is a measurement of plane angle,
     * representing 1⁄360 of a full rotation; one degree is equivalent to π/180
     * radians.
     */
    DEGREE("degree", "°", (double) Math.PI / 180),
    /**
     * A minute of arc, arcminute, or minute arc (MOA), is a unit of angular
     * measurement equal to one sixtieth (1⁄60) of one degree. Since one degree
     * is defined as one three hundred and sixtieth (1⁄360) of a rotation, one
     * minute of arc is 1⁄21,600 of a rotation, which also equals π⁄10,800
     * radians. It is used in those fields which require a unit for the
     * expression of small angles, such as astronomy, optometry, ophthalmology,
     * optics, navigation and marksmanship.
     */
    ARCMINUTE("arcminute", "′", (double) Math.PI / 10800),
    /**
     * A second of arc or arcsecond is one sixtieth (1⁄60) of one arcminute.
     * Since one degree is defined as one three hundred and sixtieth (1⁄360) of
     * a rotation, one minute of arc is 1⁄21,600 of a rotation, which also
     * equals π⁄10,800 radians. The arcsecond is 1⁄3,600 of a degree, or
     * 1⁄1,296,000 of a circle, or π⁄648,000 radians (which is approximately
     * 1⁄206,265 radian).
     */
    ARCSECOND("arcsecond", "″", (double) Math.PI / 648000);
    /**
     * The base unit for these lengths.
     */
    public static final QuantityOfAngle BASE_UNIT = RADIAN;
    /**
     * The name of the unit.
     */
    private final String Name;
    /**
     * the symbol for the unit.
     */
    private final String Symbol;
    /**
     * The conversion factor for converting from the base unit (conversionFactor
     * = 1) to this unit.
     */
    private final double ConversionFactor;

    /**
     * Creates a QuantityOfAngle object
     *
     * @param NAME the name of the unit.
     * @param SYMBOL the symbol for the unit.
     * @param CONVERSION_FACTOR the conversion factor for converting from the
     * base unit to this unit.
     */
    private QuantityOfAngle(String Name, String Symbol, double ConversionFactor) {
        this.Name = Name;
        this.Symbol = Symbol;
        this.ConversionFactor = ConversionFactor;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSymbol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getConversionFactor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Calculates a conversion factor for converting between the source unit and
     * the destination unit.
     *
     * @param source the unit to convert from.
     * @param destination the unit to convert to.
     * @return the conversion factor.
     */
    public static double caculateConversionFactor(QuantityOfAngle source,
            QuantityOfAngle destination) {
        return (source.ConversionFactor / destination.ConversionFactor);
    }

    @Override
    public String toString() {
        return "QuantityOfAngle{" + "Name=" + Name + ", Symbol=" + Symbol + ", ConversionFactor=" + ConversionFactor + '}';
    }
}
