import org.junit.jupiter.api.Test;
import technology.Computer;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    @Test
    void testTurnOn() {
        Computer computer = new Computer("Dell", 800.0);
        computer.turnOn();
        assertTrue(computer.isOn());
    }

    @Test
    void testTurnOff() {
        Computer computer = new Computer("Dell", 800.0);
        computer.turnOn();
        computer.turnOff();
        assertTrue(computer.isOn());
    }

    @Test
    void testGetId() {
        Computer computer = new Computer("Dell", 800.0);
        assertNotNull(computer.getId());
    }
}
