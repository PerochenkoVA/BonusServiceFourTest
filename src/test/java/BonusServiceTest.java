import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test

    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1_000_60;
        boolean registered = true;
        long expected = 300;
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        //сравнение с результатом
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateRegisteredAndOverLimit () {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 5000;
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        //сравнение с результатом
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNoRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 100;
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        //сравнение с результатом
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNoRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 5000;
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        //сравнение с результатом
        assertEquals(expected, actual);
    }

}