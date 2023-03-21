package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void mainusnFalse() {
        int dohod = 4600;
        double usnd = Main.mainusn(dohod);
        assertEquals(13, usnd, 0 );
    }

    @Test
    public void mainusnTrue() {
        int dohod = 4600;
        double usnd = Main.mainusn(dohod);
        assertEquals(276, usnd, 0 );
    }

    @Test
    public void mainusn2False() {
        int dohod = 4600;
        int rashod = 1300;
        double usnd2 = Main.mainusn2(dohod, rashod);
        assertEquals(13, usnd2, 0 );
    }

    @Test
    public void mainusn2True() {
        int dohod = 4600;
        int rashod = 1300;
        double usnd2 = Main.mainusn2(dohod, rashod);
        assertEquals(495, usnd2, 0 );
    }
}