package topkelements;

import org.com.jai.pattrens.topkelements.FrequencyStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FrequencyStackTest {

    @Test
    public void testFrequencyStack() {
        FrequencyStack frequencyStack = new FrequencyStack();

        // Test case: Pushing elements and popping them
        frequencyStack.push(1);
        frequencyStack.push(2);
        frequencyStack.push(3);
        frequencyStack.push(2);
        frequencyStack.push(1);
        frequencyStack.push(2);
        frequencyStack.push(5);

        assertEquals(2, frequencyStack.pop());
        assertEquals(1, frequencyStack.pop());
        assertEquals(2, frequencyStack.pop());

        // Test case: Edge case - Popping when stack is empty (expected to throw an exception or return a default value)
        assertThrows(Exception.class, () -> frequencyStack.pop());

        // Test case: Edge case - Pushing and popping same element multiple times
        frequencyStack.push(5);
        frequencyStack.push(5);
        frequencyStack.push(5);

        assertEquals(5, frequencyStack.pop());
        assertEquals(5, frequencyStack.pop());
        assertEquals(5, frequencyStack.pop());

        // Test case: Edge case - Pushing and popping for a single element
        frequencyStack.push(10);
        assertEquals(10, frequencyStack.pop());
        assertThrows(Exception.class, () -> frequencyStack.pop()); // Popping when stack is empty
    }
}
