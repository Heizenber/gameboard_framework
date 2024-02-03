package test;
import gsf.unit.Unit;
import gsf.unit.Weapon;

public class UnitTest {
    public void testType(Unit unit, String type, String expectedOutputType) {
        System.out.println("\nTesting setting/getting the type property");
        unit.setType(type);
        String outputType = unit.getType();
        if (outputType.equals(expectedOutputType)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed: " + outputType + " does not equal " + expectedOutputType);
        }
    }

    public void unitSpecificProperty(Unit unit, String property, Object value, Object expectedOutputValue) {
        System.out.println("\nTesting setting/getting a unit-specific property");
        unit.setProperty(property, value);
        Object output = unit.getProperty(property);
        if (output.equals(expectedOutputValue)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed: " + output + " does not equal " + expectedOutputValue);
        }
    }

    public void testChangeProperty(Unit unit, String property, Object value, Object expectedOutputValue) {
        System.out.println("\nTesting changing a property");
        unit.setProperty(property, value);
        Object output = unit.getProperty(property);
        if (output.equals(expectedOutputValue)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed: " + output + " does not equal " + expectedOutputValue);
        }
    }

    public void testNonExistentProperty(Unit unit, String property) {
        System.out.println("\nTesting getting a non-existent property");
        Object output = unit.getProperty(property);
        if (output == null) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed: " + output + " does not equal null");
        }
    }

    public static void main(String[] args) {
        UnitTest test = new UnitTest();
        Unit unit = new Unit(1000);
        test.testType(unit, "infantry", "infantry");
        test.unitSpecificProperty(unit, "hitpoints", 25, 25);
        test.testChangeProperty(unit, "hitpoints", 15, 15);
        test.testNonExistentProperty(unit, "strength");
    }


}
