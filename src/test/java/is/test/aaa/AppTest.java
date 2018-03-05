package is.test.aaa;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import is.test.aaa.*;

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
    
    @Test
    public void funcTest() {
    		Target target_mock = mock(Target.class);
    		when(target_mock.getAdded(100)).thenReturn(101);
    		assertEquals(App.func(100, target_mock), 101);
    }
    
    @Test
    public void funcTestWithoutMock() {
    		Target target = new Target();
    		assertEquals(101, App.func(100, target));
    }
}
