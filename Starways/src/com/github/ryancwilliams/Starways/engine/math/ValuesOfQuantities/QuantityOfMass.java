/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities;

/**
 * This enum provides quantities of mass for working with masses. 
 * @author ryancwilliams
 */
public enum QuantityOfMass implements Quantity {
    /**
     * The kilogram or kilogramme (SI unit symbol: kg; SI dimension 
     * symbol: M), is the base unit of mass in the International 
     * System of Units (SI) and is defined as being equal to the mass 
     * of the International Prototype of the Kilogram (IPK). The 
     * avoirdupois (or international) pound, used in both the 
     * Imperial system and U.S. customary units, is defined as 
     * exactly 0.45359237 kg, making one kilogram approximately 
     * equal to 2.2046 avoirdupois pounds.
     * <p> 1 kg is the base unit of this Quantity
     */
    KILOGRAM("kilogram","kg",1d),
    /**
     * The gram (alternative British English spelling: gramme; 
     * SI unit symbol: g) (Greek/Latin root grámma) is a metric 
     * system unit of mass. Originally defined as "the absolute weight 
     * of a volume of pure water equal to the cube of the hundredth part of
     * a metre, and at the temperature of melting ice" (later 4 °C), a 
     * gram is now defined as one one-thousandth of the SI base unit, the 
     * kilogram, or 1×10−3 kg, which itself is defined as being equal to 
     * the mass of a physical prototype preserved by the International 
     * Bureau of Weights and Measures.
     * <p> 1 g = 0.001 kg
     */
    GRAM("gram","g",0.001d),
    /**
     * The tonne (SI symbol: t) is a metric system unit of mass equal to 
     * 1,000 kilograms (2,204.6 pounds) or 1 megagram (1 Mg). It is a 
     * non-SI unit accepted for use with SI. To avoid confusion with the 
     * much smaller short ton and the slightly larger long ton, it is also 
     * known as a metric ton in the United States.
     */
    METRIC_TON("metric ton","t",1000d),
    /**
     * The solar mass (M☉) is a standard unit of mass in astronomy that 
     * is used to indicate the masses of other stars, as well as clusters,
     * nebulae and galaxies. It is equal to the mass of the Sun, about 
     * two nonillion kilograms.
     * <p> 1 M☉ = 1.98855*10^30 kg
     */
    SOLAR_MASS("solar mass","M☉",1.98855d*Math.pow(10, 30)),
    /**
     * Earth mass (M⊕) is the unit of mass equal to that of the Earth.
     * 1 M⊕ = 5.97219 × 10^24 kg.[1] Earth mass is often used to describe 
     * masses of rocky terrestrial planets.
     * <p> 1 M⊕ = 5.97219*10^24 kg
     */
    EARTH_MASS("earth mass","M⊕",5.97219d*Math.pow(10, 24));
    
    /**
     * The base unit for these Masses.
     */
    public static final QuantityOfMass BASE_UNIT = KILOGRAM;
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
     * Creates a QuantityOfMass object
     *
     * @param NAME the name of the unit.
     * @param SYMBOL the symbol for the unit.
     * @param CONVERSION_FACTOR the conversion factor for converting from the
     * base unit to this unit.
     */
    private QuantityOfMass(String Name, String Symbol, double ConversionFactor) {
        this.Name = Name;
        this.Symbol = Symbol;
        this.ConversionFactor = ConversionFactor;
    }

    /**
     * Gets the name of this unit.
     *
     * @return the name of this unit.
     */
    @Override
    public String getName() {
        return this.Name;
    }

    /**
     * Gets the symbol of this unit.
     *
     * @return the symbol of this unit.
     */
    @Override
    public String getSymbol() {
        return this.Symbol;
    }

    /**
     * Gets the conversion factor for converting from the base unit
     * (conversionFactor = 1) to this unit.
     *
     * @return the conversion factor for converting from the base unit to this
     * unit.
     */
    @Override
    public double getConversionFactor() {
        return this.ConversionFactor;
    }

    /**
     * Calculates a conversion factor for converting between the source unit and
     * the destination unit.
     *
     * @param source the unit to convert from.
     * @param destination the unit to convert to.
     * @return the conversion factor.
     */
    public static double caculateConversionFactor(QuantityOfMass source,
            QuantityOfMass destination) {
        return (source.ConversionFactor / destination.ConversionFactor);
    }

    /**
     * The toString.
     *
     * @return this object as a string.
     */
    @Override
    public String toString() {
        return "QuantityOfMass{" + "Name=" + Name + ", Symbol=" + Symbol + ", ConversionFactor=" + ConversionFactor + '}';
    }
}
