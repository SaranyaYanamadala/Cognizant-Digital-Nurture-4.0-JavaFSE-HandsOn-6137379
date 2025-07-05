package com.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    CalculateAddTest.class,
    CalculateSubtractTest.class
})
public class AllTests {
    // This groups all the classes
}
