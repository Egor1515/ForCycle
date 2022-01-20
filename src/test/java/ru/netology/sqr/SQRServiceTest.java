package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldCalculateSQRService() {
        SQRService service = new SQRService();

        int number = 3;
        int expected = 3;
        int actual = service.SQCeil(number);

        assertEquals(expected, actual);
        System.out.println(number);


    }
}





