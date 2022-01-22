package ru.netology.sqr;

import ru.netology.sqr.stat.SQR.SQRService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldCalculateSQRService() {
        SQRService service = new SQRService();

        int count = 3;
        int expected = 3;
        int min = 200;
        int max = 300;
        int actual = service.sQCeil(min, max);

        assertEquals(expected, actual);
        System.out.println(count);
    }


    @Test
    public void shouldCalculateSQRService2() {
        SQRService service = new SQRService();

        int count = 5;
        int expected = 5;
        int min = 400;
        int max = 600;
        int actual = service.sQCeil(min, max);

        assertEquals(expected, actual);
        System.out.println(count);
    }

    @Test
    public void shouldCalculateNoResult() {
        SQRService service = new SQRService();


        int expected = 0;
        int min = 101;
        int max = 110;
        int actual = service.sQCeil(min, max);

        assertEquals(expected, actual);
        System.out.println(expected);
    }
}



