package edu.cnm.deepdive.codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class GCDTest {
 // must add correct dir path for parameterizedTest to work. See example in the project window.

  @ParameterizedTest
  @CsvFileSource(resources = "gcd.csv", numLinesToSkip = 1)
  void findGCD(long numberA, long numberB, long expected) {
    assertEquals(expected, GCD.findGCD(numberA, numberB));
  }
}