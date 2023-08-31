package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> functionMap = new HashMap<>();

        for (int x : sourceList) {
            int functionValue = calculateFunctionValue(x);
            functionMap.put(x, functionValue);
        }
        return functionMap;
    }

    private int calculateFunctionValue(int x) {
        return 5 * x + 2;
    }
}
