package vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Group_3_4_Tests {

    @Test
    public void chevroletBirdSetup() {
        ChevroletBird Chevvy = new ChevroletBird();
        assertEquals(0, Chevvy.getMileage(), 0.1, "Default mileage should be zero.");
        assertEquals(false, Chevvy.checkWingsExtended(), "Wings should not be extended at creation.");
        assertEquals(250, Chevvy.getMaxRange(), 0.1, "The max range is incorrect. It should be 250.");
        assertEquals("Cheverolet Bird (0.0 mi)", Chevvy.toString(), "toString() does not print the correct message."); //
        assertEquals(false, Chevvy.checkWingsExtended(),"Wings should be retracted before driving.");
    }

    @Test
    public void chevroletBirdDrive() {
        ChevroletBird cbird = new ChevroletBird(2018);

        assertThrows(IllegalArgumentException.class, () -> {
            cbird.drive(-1);
        }, "Driving mileage cannot be negative.");

       assertTrue(cbird.canDrive(30), "canDrive should be true");
       assertTrue(cbird.canDrive(0), "canDrive should be true");
       assertTrue(cbird.canDrive(250), "canDrive should be true");
       assertFalse(cbird.canDrive(251), "canDrive should be false");
       cbird.drive(30);
        assertEquals(30, cbird.getMileage(), .1, "Mileage should be 30 after first drive.");
        assertEquals(30, cbird.getRemainingRange(), .1, "Remaining range should be 220.");

        cbird.drive(200);
        assertEquals(230, cbird.getMileage(), .1, "Mileage should be 230 after second drive.");

        //assertEquals(cbird.getFuelCapacity() * honda.getMPG() - 230, honda.getRemainingRange(), .1,
                //"Remaining range of car not correct after driving twice.");

        assertFalse(cbird.canDrive(252), "Driving 252 should fail.");
        assertTrue(cbird.canDrive(251), "Driving 251 should succeed.");

        cbird.drive(251);
        assertEquals(481, cbird.getMileage(), .1, "Mileage should be 481 after third drive.");

        assertThrows(IllegalArgumentException.class, () -> {
            cbird.drive(5);
        }, "Driving beyond empty should fail.");
    }
    @Test
    public void teslaModelZSetup() {
        
        TeslaModelZ tesla = new TeslaModelZ(77);
        assertEquals(0, tesla.getMileage(), 0.1, "Default mileage should be zero.");
        assertEquals("Z77", tesla.getModel(), "Model is not correct.");
        assertEquals(tesla.getMaxRange(), 340, 0.1, "Max range should be 340.");
        assertEquals(tesla.getMaxRange(), tesla.getRemainingRange(), 0.1, "Initial remaining range should be max range.");
        assertEquals(77, tesla.getModelNum(),
                "Model num should be 77.");
        assertEquals("Telsa Z77 (0.0 mi)", tesla.toString(), "toString does not match");
        TeslaModelZ tesla2 = new TeslaModelZ(10,25);
        assertEquals(10, tesla2.getMileage(), 0.1, "Starting mileage should be ten.");
    }

    @Test
    public void teslaModelZDrive() {
        
        TeslaModelZ tesla = new TeslaModelZ(77);

        assertThrows(IllegalArgumentException.class, () -> {
            tesla.canDrive(-1);
        }, "Driving mileage cannot be negative.");

       assertTrue(tesla.canDrive(0), "canDrive should be true");
       assertTrue(tesla.canDrive(340), "canDrive should be true");
       assertFalse(tesla.canDrive(341), "canDrive should be false");
       tesla.drive(30);
        assertEquals(30, tesla.getMileage(), .1, "Mileage should be 30 after first drive.");
        assertFalse(tesla.canDrive(340), "canDrive should be false");
        assertEquals(310, tesla.getRemainingRange(), .1, "Remaining range should be 310 after first drive.");
        tesla.recharge();
        assertEquals(340, tesla.getRemainingRange(), .1, "Remaining range should be 340 after recharging.");
        assertEquals(tesla.getMaxRange(), tesla.getRemainingRange(), .1, "Remaining range should be same as max range after recharging.");

        assertThrows(IllegalArgumentException.class, () -> {
            tesla.driveAutonomously(-1);
        }, "Driving distance should not be negative");
        tesla.driveAutonomously(100);
        assertEquals(130, tesla.getMileage(), .1,
                "Mileage should be 130");
        assertEquals(240, tesla.getRemainingRange(), .1,
                "Remaining range should be 210");    

        assertThrows(IllegalArgumentException.class, () -> {
                tesla.drive(230);
        }, "Driving beyond how much you have should fail.");
        tesla.driveAutonomously(230);
        assertEquals(340, tesla.getMileage(), .1, "Mileage should be 340 after this drive.");
        assertEquals(0, tesla.getRemainingRange(), .1, "Should have no range left.");
        assertThrows(IllegalArgumentException.class, () -> {
            tesla.drive(-1);
        }, "You can't drive negative.");
    }
}
