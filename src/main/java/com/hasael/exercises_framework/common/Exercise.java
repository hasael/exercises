package com.hasael.exercises_framework.common;

import java.util.List;
import java.util.function.Function;

public class Exercise {
    private final String name;
    private final String description;
    private final List<Object> inputs;
    private final List<Object> outputs;
    private final Function<Object,Object> solution;

    public Exercise(String name, String description, List<Object> inputs, List<Object> outputs, Function<Object, Object> solution) {
        this.name = name;
        this.description = description;
        this.inputs = inputs;
        this.outputs = outputs;
        this.solution = solution;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Object> getInputs() {
        return inputs;
    }

    public List<Object> getOutputs() {
        return outputs;
    }

    public Function<Object, Object> getSolution() {
        return solution;
    }
}
