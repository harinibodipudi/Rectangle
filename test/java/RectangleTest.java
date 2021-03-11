import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;
import utility.Rectangle;

public class RectangleTest {

    @Test
    public void testAreaIsPositiveForPositiveValuedSide(){
        int length = 5;
        int breadth = 10;
        Rectangle newRectangle = new Rectangle(length,breadth);
        int expectedArea = 50;

        assertEquals(expectedArea,newRectangle.area());
    }

    @Test
    public void testAreaIsNegativeForOneNegativeValuedSides(){
        int length = -10;
        int breadth = 4;
        Rectangle newRectangle = new Rectangle(length,breadth);
        int expectedArea = -40;

        assertEquals(expectedArea,newRectangle.area());
    }

    @Test
    public void testAreaIsPositiveForBothSidesValuedNegative(){
        int length = -10;
        int breadth = -4;
        Rectangle newRectangle = new Rectangle(length,breadth);
        int expectedArea = 40;

        assertEquals(expectedArea,newRectangle.area());
    }

    @Test
    public void testAreaIsZeroForLengthValuedZero(){
        int length =0;
        int breadth = 4;
        Rectangle newRectangle = new Rectangle(length,breadth);
        int expectedArea = 0;

        assertEquals(expectedArea,newRectangle.area());
    }

    @Test
    public void testAreaIsZeroForBreadthValuedZero(){
        int length = 4;
        int breadth = 0;
        Rectangle newRectangle = new Rectangle(length,breadth);
        int expectedArea = 0;

        assertEquals(expectedArea,newRectangle.area());
    }
}
