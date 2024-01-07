package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class VacationServiceTest {

    @Test
    void shouldCalculateFirstVariant() {
        VacationService vacationService = new VacationService();
        int income = 10_000;
        int expense = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = vacationService.calculateVacation(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSecondVariant() {
        VacationService vacationService = new VacationService();
        int income = 100_000;
        int expense = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int actual = vacationService.calculateVacation(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
