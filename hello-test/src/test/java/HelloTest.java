import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {
    // f(name) = "Hello somkiat"
    @Test
    @DisplayName("ทำการทดสอบ .....")
    public void case01() {
        // Arrange
        Hello hello = new Hello();
        String name = "somkiat";
        // Act
        String actualResult = hello.sawadee(name);
        // Assert
        assertEquals("Hello somkiat", actualResult);
    }
}