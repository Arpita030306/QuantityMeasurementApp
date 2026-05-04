package Test;

import Main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTestUC11 {

    @Test
    void testAdd_Length() {
        var a = new Quantity(1, Unit.FEET);   // 12 inch
        var b = new Quantity(2, Unit.INCH);   // 2 inch

        var result = a.add(b);

        assertEquals(new Quantity(14, Unit.INCH), result);
    }

    @Test
    void testAdd_Volume() {
        var a = new UnitType(1, VolumeUnit.LITER);
        var b = new UnitType(1000, VolumeUnit.MILLILITER);

        var result = a.add(b);

        assertEquals(new UnitType(2, VolumeUnit.LITER), result);
    }

    @Test
    void testAdd_Weight() {
        var a = new QuantityWeight(1, WeightUnit.KILOGRAM);
        var b = new QuantityWeight(500, WeightUnit.GRAM);

        var result = a.add(b);

        assertEquals(new QuantityWeight(1.5, WeightUnit.KILOGRAM), result);
    }
}