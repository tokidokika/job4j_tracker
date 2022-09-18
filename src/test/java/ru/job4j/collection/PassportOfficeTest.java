package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        boolean expected = office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
        assertThat(expected).isTrue();
    }

    @Test
    public void whenDuplicatePassport() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen secondCitizen = new Citizen("2f44a", "Petr Ivanov");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.add(secondCitizen)).isFalse();
    }
}