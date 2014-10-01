package dojo.tdd.kiatnakin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void countOneSayOne() {
        String said = fizzBuzz.say(1);
        assertEquals("1", said);
    }
    
    @Test
    public void countTwoSayTwo() {
        String said = fizzBuzz.say(2);
        assertEquals("2", said);
    }

    @Test
    public void countThreeSayFizz() {
        String said = fizzBuzz.say(3);
        assertEquals("Fizz", said);
    }
    
    @Test
    public void countFiveSayBuzz() {
        String said = fizzBuzz.say(5);
        assertEquals("Buzz", said);
    }
    
    @Test
    public void countSixSayFizz() {
        String said = fizzBuzz.say(6);
        assertEquals("Fizz", said);
    }
    
    @Test
    public void countTenSayBuzz() {
        String said = fizzBuzz.say(10);
        assertEquals("Buzz", said);
    }
    
    @Test
    public void countFifteenSayFizzBuzz() {
        String said = fizzBuzz.say(15);
        assertEquals("FizzBuzz", said);
    }
}
