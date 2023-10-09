import org.junit.jupiter.api.Test;
import task38.Kata;
import task39.Order;
import task40.DuplicateEncoder;

import static org.junit.jupiter.api.Assertions.*;

public class tasks_tests {
    @Test
    public void next_bigger_tests() {
        assertEquals(21, Kata.nextBiggerNumber(12));
        assertEquals(531, Kata.nextBiggerNumber(513));
        assertEquals(2071, Kata.nextBiggerNumber(2017));
        assertEquals(441, Kata.nextBiggerNumber(414));
        assertEquals(414, Kata.nextBiggerNumber(144));
        assertEquals(19009, Kata.nextBiggerNumber(10990));
    }
    @Test
    public void your_order_tests() {
        assertEquals("Thi1s is2 3a T4est", Order.order("is2 Thi1s T4est 3a"));
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", Order.order("4of Fo1r pe6ople g3ood th5e the2"));
        assertEquals("",Order.order(""));
    }

    @Test
    public void duplicate_encoder_tests() {
        assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}
