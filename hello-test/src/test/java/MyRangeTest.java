import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRangeTest {

    @Test
    public void startNumberWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStart();
        assertEquals(1, result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5] นั้นจะขึ้นต้นด้วย ( ผลที่ได้คือ false")
    public void startWithExclude() {
        MyRange myRange = new MyRange("(1,5]");
        boolean result = myRange.isStartWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นด้วย [ (include) ผลที่ได้คือ true")
    public void startWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertTrue(result);
    }

}
