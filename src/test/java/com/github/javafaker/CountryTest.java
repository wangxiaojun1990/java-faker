package com.github.javafaker;

import com.github.javafaker.repeating.Repeat;
import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class CountryTest extends AbstractFakerTest {

    @Test
    @Repeat(times=10)
    public void testFlag() {
        String flag = faker.country().flag();
        assertThat(flag, matchesRegularExpression("^http:\\/\\/flags.fmcdn\\.net\\/data\\/flags\\/w580\\/[a-zA-Z0-9_]+\\.png$"));
    }


    @Test
    public void testCode2() {
        assertThat(faker.country().country_code2(), matchesRegularExpression("([a-z]{2})"));
    }

    @Test
    public void testCode3() {
        assertThat(faker.country().country_code3(), matchesRegularExpression("([a-z]{3})"));
    }

    @Test
    public void testCapital() {
        assertThat(faker.country().capital(), matchesRegularExpression("([\\w-]+ ?)+"));
    }

    @Test
    public void testCurrency() {
        assertThat(faker.country().currency(), matchesRegularExpression("([\\w-]+ ?)+"));
    }

    @Test
    public void testCurrencyCode() {
        assertThat(faker.country().currency_code(), matchesRegularExpression("([\\w-]+ ?)+"));
    }
}
