package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringAbbaTest {
    StringAbba stringAbba = new StringAbba();

    @Test
    public void makeAbbashouldReturnHiByeByeHi() {

        assertEquals("HiByeByeHi", stringAbba.makeAbba("Hi", "Bye"));

    }

    @Test
    public void makeAbbashouldReturnYoAliceAliceYo() {
        assertEquals("YoAliceAliceYo", stringAbba.makeAbba("Yo", "Alice"));

    }

    @Test
    public void makeAbbashouldReturnWhatUpUpWhat() {
        assertEquals("WhatUpUpWhat", stringAbba.makeAbba("What", "Up"));

    }


    @Test
    public void makeAbbashouldReturnyy() {
        assertEquals("yy", stringAbba.makeAbba("", "y"));

    }
}