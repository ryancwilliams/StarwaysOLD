package com.github.ryancwilliams.Starways;

import com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities.QuantityOfLength;
import com.github.ryancwilliams.Starways.engine.math.ValuesOfQuantities.ValueOfQuantity;

/**
 * This is a main class for testing the application
 * @author ryancwilliams
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        com.github.ryancwilliams.Starways.ui.LaunchWindow.createWindow();
        
        //Test Values of Quanties
        ValueOfQuantity<QuantityOfLength> test = new ValueOfQuantity(1, QuantityOfLength.LIGHT_YEAR);
        System.out.println(test);
        System.out.println(test.asString());
        System.out.println(test.getConvertedValueOfQuantity(QuantityOfLength.METRE).asString());
        System.out.println(test.getConvertedValueOfQuantity(QuantityOfLength.KILOMETRE).asString());
        System.out.println(test.getConvertedValueOfQuantity(QuantityOfLength.ASTRONOMICAL_UNIT).asString());
        System.out.println(test.getConvertedValueOfQuantity(QuantityOfLength.LIGHT_YEAR).asString());
        test = new ValueOfQuantity(1, QuantityOfLength.METRE);
        System.out.println(test);
        System.out.println(test.asString());
        System.out.println(test.getConvertedValueOfQuantity(QuantityOfLength.METRE).asString());
        System.out.println(test.getConvertedValueOfQuantity(QuantityOfLength.KILOMETRE).asString());
        System.out.println(test.getConvertedValueOfQuantity(QuantityOfLength.ASTRONOMICAL_UNIT).asString());
        System.out.println(test.getConvertedValueOfQuantity(QuantityOfLength.LIGHT_YEAR).asString());
    }
}
