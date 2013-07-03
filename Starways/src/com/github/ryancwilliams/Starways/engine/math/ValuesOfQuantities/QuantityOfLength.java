/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities;

/**
 * This enum provides quantities of length for working with lengths. 
 * @author ryancwilliams
 */
public enum QuantityOfLength implements Quantity {
    /**
     * The metre (International spelling as used by the 
     * International Bureau of Weights and Measures) or meter 
     * (American spelling), (SI unit symbol: m; SI dimension symbol: L),
     * is the fundamental unit of length in the International System of 
     * Units (SI). Originally intended to be one ten-millionth of the 
     * distance from the Earth's equator to the North Pole (at sea level), 
     * its definition has been periodically refined to reflect growing 
     * knowledge of metrology. Since 1983, it has been defined as "the 
     * length of the path travelled by light in vacuum during a time 
     * interval of 1/299,792,458 of a second."
     * <p> 1 m is the base unit of this Quantity
     */
    METRE("metre","m",1d),
    /**
     * The kilometre (International spelling as used by the 
     * International Bureau of Weights and Measures; SI symbol: km) 
     * or kilometer (American spelling) is a unit of length in the 
     * metric system, equal to one thousand metres (kilo- being the 
     * SI prefix for 1000). It is now the measurement unit used 
     * officially for expressing distances between geographical 
     * places on land in most of the world; notable exceptions are 
     * the United States and the United Kingdom where the statute mile 
     * is the official unit used.
     * <p> 1 km = 1000 m
     */
    KILOMETRE("kilometre","km",1000d),
    /**
     * An astronomical unit (abbreviated as au; other abbreviations 
     * that are sometimes used include ㍳, a.u. and ua) is a unit of
     * length now defined as exactly 149,597,870,700 m (92,955,807.3 mi),
     * or roughly the average Earth–Sun distance.
     * <p> 1 au = 149,597,870,700 m
     */
    ASTRONOMICAL_UNIT("astronomical unit","au",149597870700d),
    /**
     * A light-year, also light year or lightyear (symbol: ly), is
     * an astronomical unit of length equal to just under 10 trillion 
     * kilometres (or about 6 trillion miles). As defined by the 
     * International Astronomical Union (IAU), a light-year is the 
     * distance that light travels in a vacuum in one Julian year.
     * <p> 1 ly = 9,460,730,472,580,800 m
     */
    LIGHT_YEAR("light-year","ly",9460730472580800d),
    /**
     * Solar radius is a unit of distance used to express the size of
     * stars in astronomy equal to the current radius of the Sun: 
     * <p> 1 R☉ = 6.955*10^8 m
     */
    SOLAR_RADIUS("solar radius","R☉",695500000d),
    /**
     * Earth radius is the distance from Earth's center to its surface,
     * about 6,371 kilometers (3,959 mi). This length is also used as a 
     * unit of distance, especially in astronomy and geology, where it 
     * is usually denoted by R⊕.
     * <p> 1 R⊕ = 6371000 m
     */
    EARTH_RADIUS("earth radius","R⊕",6371000d);
    
    /**
     * The base unit for these lengths.
     */
    public static final QuantityOfLength BASE_UNIT = METRE;
    
    /**
     * The name of the unit.
     */
    private final String Name;
    /**
     * the symbol for the unit.
     */
    private final String Symbol;
    /**
     * The conversion factor for converting from the base unit 
     * (conversionFactor = 1) to this unit.
     */
    private final double ConversionFactor;

    /**
     * Creates a QuantityOfLength object
     * @param NAME the name of the unit.
     * @param SYMBOL the symbol for the unit.
     * @param CONVERSION_FACTOR the conversion factor for converting from the base unit to this unit.
     */
    private QuantityOfLength(String Name, String Symbol, double ConversionFactor) {
        this.Name = Name;
        this.Symbol = Symbol;
        this.ConversionFactor = ConversionFactor;
    }

    /**
     * Gets the name of this unit.
     * @return the name of this unit.
     */
    @Override
    public String getName() {
        return Name;
    }

    /**
     * Gets the symbol of this unit.
     * @return the symbol of this unit.
     */
    @Override
    public String getSymbol() {
        return Symbol;
    }

    /**
     * Gets the conversion factor for converting from the base unit 
     * (conversionFactor = 1) to this unit.
     * @return the conversion factor for converting from the base unit to this unit.
     */
    @Override
    public double getConversionFactor() {
        return ConversionFactor;
    }
    
    /**
     * Calculates a conversion factor for converting between the source unit 
     * and the destination unit.
     * @param source the unit to convert from.
     * @param destination the unit to convert to.
     * @return the conversion factor.
     */
    public static double caculateConversionFactor(QuantityOfLength source, 
            QuantityOfLength destination) {
        return (source.ConversionFactor / destination.ConversionFactor);
    }

    /**
     * The toString.
     * @return this object as a string.
     */
    @Override
    public String toString() {
        return "QuantityOfLength{" + "Name=" + Name + ", Symbol=" + Symbol + ", ConversionFactor=" + ConversionFactor + '}';
    }
}
