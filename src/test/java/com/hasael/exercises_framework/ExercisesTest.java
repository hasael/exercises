package com.hasael.exercises_framework;

import static org.junit.Assert.assertTrue;

import com.hasael.exercises_framework.ExercisesDictionary;
import com.hasael.exercises_framework.common.Exercise;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


public class ExercisesTest {

    @TestFactory
    public Stream<DynamicTest> exercises() {
        List<Exercise> inPhrases = ExercisesDictionary.EXERCISES;
        return inPhrases.stream().map(exercise -> DynamicTest.dynamicTest("Test exercise " + exercise.getName(), () -> {
            int idx = 0;
            for (Object input : exercise.getInputs()) {
                assertEquals("Failed for input " +input.toString() + ".", exercise.getOutputs().get(idx), exercise.getSolution().apply(input));
                idx++;
            }
        }));
    }

}
