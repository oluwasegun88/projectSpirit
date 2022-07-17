package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UnicornOilAndGasTest {
    UnicornOilAndGas fillingStation;
    @BeforeEach
    public void SetUp(){
        fillingStation = new UnicornOilAndGas("sabo");
    }

    @Test
    void testThatObjectExist(){
        assertNotNull(fillingStation);
    }

    @Test
    public void testToSetLitreBought(){
        fillingStation.setLitreBought(2);
        assertEquals(2, fillingStation.getLitreBought());
    }

    @Test
    public void testAmount(){
        fillingStation.setLitreBought(2);
        assertEquals(400, fillingStation.petrolAmount());
    }

    @Test
    public  void testAmountAfterDiscount(){
        fillingStation.setLitreBought(2);
        assertEquals(392, fillingStation.priceAfterDiscount());
    }


}
