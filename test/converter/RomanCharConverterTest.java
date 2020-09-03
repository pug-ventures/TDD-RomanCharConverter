package converter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanCharConverterTest {

    private RomanCharConverter converter;

    @BeforeEach
    public void setUp() {
        converter = new RomanCharConverter();
    }

    @Test
    public void givenOneRomanChar_whenConvert_thenReturnArabicOne() {
        assertEquals(1, converter.convert("I"));
        assertEquals(5, converter.convert("V"));
    }

    @Test
    public void givenMultipleChars_whenConvert_thenReturnArabicNumber() {
        assertEquals(3, converter.convert("III"));
        assertEquals(7, converter.convert("VII"));
    }

    @Test
    public void givenMultipleCharsRegression_whenConvert_thenReturnArabicNumber() {
        assertEquals(4, converter.convert("IV"));
        assertEquals(9, converter.convert("IX"));
        assertEquals(14, converter.convert("XIV"));
    }
}
