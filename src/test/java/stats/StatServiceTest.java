package stats;

import org.junit.jupiter.api.Test;
import stats.StatService;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {
    @Test
    void shouldCalculateSum() {
        StatService service = new StatService();
        int[] sales = {26, 11, 44, 39, 30};
        int expected = 150;

        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatService service = new StatService();
        int[] sales = {26, 11, 44, 39, 30};
        int expected = 30;

        int actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        StatService service = new StatService();
        int[] sales = {26, 11, 44, 39, 30};
        int expected = 44;

        int actual = service.findMaximum(sales);

        assertEquals(expected, actual);
    }
}

