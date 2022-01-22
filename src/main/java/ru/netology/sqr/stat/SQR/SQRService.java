package ru.netology.sqr.stat.SQR;

public class SQRService {

    public int sQCeil(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                count++;


            }

        }
        return count;
    }
}