package com.waltcow.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private Solution solution;

    @BeforeEach
    @DisplayName("Before run test case to init Solution")
    void init() {
        solution = new Solution();
    }

    @DisplayName("Test two number combinations")
    @Test
    void testSingleNumber() {
        int[] input = {9};
        String[] expected = {"w", "x", "y", "z"};
        List<String> expectedList =  Arrays.asList(expected);
        List<String> result = solution.letterCombinations(input);
        assertEquals(expectedList, result);
    }

    @DisplayName("Test two number combinations")
    @Test
    void testTwoNumber() {
        int[] input = {2, 3};
        String[] expected = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        List<String> expectedList =  Arrays.asList(expected);
        List<String> result = solution.letterCombinations(input);
        assertEquals(expectedList, result);
    }

}
