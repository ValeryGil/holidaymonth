package ru.netology.holidaymonth.services;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vacation.csv")
    void emulationOne(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();

        // подготавливаем данные:
        //int income = 10_000;
        //int expenses = 3_000;
        //int threshold = 20_000;
        //int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    //@Test
    // void emulationTwo() {
    //     VacationService service = new VacationService();
    //
    //     // подготавливаем данные:
    //     int income = 100_000;
    //     int expenses = 60_000;
    //     int threshold = 150_000;
    //     int expected = 2;
    //
    //     // вызываем целевой метод:
    //     int actual = service.calculate(income, expenses, threshold);
    //
    //     // производим проверку (сравниваем ожидаемый и фактический):
    //     Assertions.assertEquals(expected, actual);
    // }
}
