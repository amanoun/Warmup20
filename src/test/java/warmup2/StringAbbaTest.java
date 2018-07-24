package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringAbbaTest {
    @Test
    public void makeAbbashouldReturnHiByeByeHi() {
        StringAbba stringAbba = new StringAbba();
        assertEquals("HiByeByeHi", stringAbba.makeAbba("Hi", "Bye") );

    }
   @Test
    public void makeAbbashouldReturnYoAliceAliceYo() {
        StringAbba stringAbba = new StringAbba();
        assertEquals("YoAliceAliceYo", stringAbba.makeAbba("Yo", "Alice") );

    }
      @Test
    public void makeAbbashouldReturnWhatUpUpWhat() {
        StringAbba stringAbba = new StringAbba();
        assertEquals("WhatUpUpWhat", stringAbba.makeAbba("What", "Up") );

    }


    @Test
    public void makeAbbashouldReturnyy() {
        StringAbba stringAbba = new StringAbba();
        assertEquals("yy", stringAbba.makeAbba("", "y"));

    }
}