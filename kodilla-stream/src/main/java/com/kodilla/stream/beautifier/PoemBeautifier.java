package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String toDecorate, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(toDecorate);
        System.out.println("Upiekszony String: " + result);
    }
}
