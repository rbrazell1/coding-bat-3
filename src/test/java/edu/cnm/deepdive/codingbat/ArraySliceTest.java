package edu.cnm.deepdive.codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ArraySliceTest {

  @ParameterizedTest
  @CsvFileSource(resources = "slice.csv")
  void sliceArray() {
    assertArrayEquals();
  }
}