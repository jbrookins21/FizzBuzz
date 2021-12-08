import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
        FizzBuzz underTest = new FizzBuzz();


    @Test
    public void shouldRespond1For1(){
        String response = underTest.playGame(1);
        assertEquals("1", response);

    }

    @Test
    public void shouldRespond2for2(){
        String response = underTest.playGame(2);
        assertEquals("2", response);
    }

    @Test
    public void shouldRespondFizzFor3(){
        String response = underTest.playGame(3);
        assertEquals("FIZZ", response);
    }

    @Test
    public void shouldRespondBuzzFor5(){
        String response = underTest.playGame(5);
        assertEquals("BUZZ", response);
    }

    @Test
    public void shouldRespondFizzFor6(){
        String response = underTest.playGame(6);
        assertEquals("FIZZ", response);
    }

    @Test
    public void shouldRespondFizzFor10(){
        String response = underTest.playGame(10);
        assertEquals("BUZZ", response);
    }

    @Test
    public void shouldRespondFizzFor15() {
        String response = underTest.playGame(15);
        assertEquals("FIZZBUZZ", response);
    }
}
