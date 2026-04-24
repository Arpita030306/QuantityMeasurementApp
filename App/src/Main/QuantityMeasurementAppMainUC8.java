package Main;

public class QuantityMeasurementAppMainUC8 {
    public static void main(String[] args) {

        QuantityLength a =
                new QuantityLength(1, LengthUnit.FEET);

        QuantityLength b =
                new QuantityLength(12, LengthUnit.INCHES);

        System.out.println(a.equals(b));

        System.out.println(
                a.convertTo(LengthUnit.INCHES)
        );

        System.out.println(
                a.add(b, LengthUnit.FEET)
        );

        System.out.println(
                new QuantityLength(
                        1,
                        LengthUnit.YARDS
                ).add(
                        new QuantityLength(
                                3,
                                LengthUnit.FEET),
                        LengthUnit.YARDS
                )
        );
    }
}