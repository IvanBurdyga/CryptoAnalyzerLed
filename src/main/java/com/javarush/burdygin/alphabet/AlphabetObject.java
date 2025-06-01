package com.javarush.burdygin.alphabet;

public class AlphabetObject {

    private final char first;
    private final char second;
    public final char penultimate;
    public final char last;
    public char[] exempts;

    public AlphabetObject(char first, char second, char penultimate, char last, char... exempts) {
        this.first = first;
        this.second = second;
        this.penultimate = penultimate;
        this.last = last;
        this.exempts = exempts;
    }

    public AlphabetObject(char first, char second, char penultimate, char last) {
        this.first = first;
        this.second = second;
        this.penultimate = penultimate;
        this.last = last;
    }

    public char getFirst() {
        return first;
    }

    public char getSecond() {
        return second;
    }
}
