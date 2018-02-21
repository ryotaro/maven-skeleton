package example.my.xxx;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test 
    public void testApp2() {
    		assertEquals(App.add(3,2), 5);
    }
    
    @Test
    public void testtest() {
    		assertAll("This is", 
    				() -> {
    					assertEquals(App.add(3, 3), 6);
    				},
    				() -> {
    					assertEquals(App.add(2, 1), 3);
    				});
    }
}
