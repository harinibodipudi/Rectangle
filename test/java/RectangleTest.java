import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import utility.Rectangle;

public class RectangleTest {

    @Test
    public void TestAreaIsPositiveForPositiveValuedSide(){
        int length = 5;
        int breadth = 10;
        Rectangle newRectangle = new Rectangle(length,breadth);

        int expectedArea = 50;
        assertEquals(expectedArea,newRectangle.area());
    }
}
