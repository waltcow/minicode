package com.waltcow.core;

import java.util.LinkedList;
import java.util.List;

class Solution {
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    List<String> letterCombinations(int[] digits) {
        List<String> ret = new LinkedList<String>();
        combination("", digits, 0, ret);
        return ret;
    }

    private void combination(String prefix, int[] digits, int offset, List<String> ret) {
        if (offset >= digits.length) {
            ret.add(prefix);
            return;
        }
        String letters = KEYS[(digits[offset])];

        for (int i = 0; i < letters.length(); i++) {
            combination(prefix + letters.charAt(i), digits, offset + 1, ret);
        }
    }
}