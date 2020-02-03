package org.launchcode.java.studios.quizzie;

public abstract class Question {

    private String q; //question
    private String[] a; //answers
    private String[] correctA; //correct answer(s)

    public Question(String q, String[] a, String[] correctA) {
        this.q = q;
        this.a = a;
        this.correctA = correctA;
    }

    public String getQ() {
        return q;
    }

    public String[] getA() {
        return a;
    }

    public String[] getCorrectA() {
        return correctA;
    }

}
