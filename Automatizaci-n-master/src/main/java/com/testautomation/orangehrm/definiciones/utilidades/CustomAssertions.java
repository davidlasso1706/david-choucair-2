package com.testautomation.orangehrm.definiciones.utilidades;

import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class CustomAssertions {
    public static <T> AssertionBuilder<T> verifierQue(Question<T> question) {
        return new AssertionBuilder<>(question);
    }

    public static class AssertionBuilder<T> {
        private final Question<T> question;

        AssertionBuilder(Question<T> question) {
            this.question = question;
        }

        public Consequence<T> esIgualA(T expectedValue) {
            return GivenWhenThen.seeThat(question, Matchers.equalTo(expectedValue));
        }

        public Consequence<T> cumple(Matcher<T> matcher) {
            return GivenWhenThen.seeThat(question, matcher);
        }
    }
}