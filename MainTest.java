import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class MainTest {

        @Test
        public void TwoplusTwoEqualFour(){
            Main main = new Main();
            assertEquals(4,main.sum(2,2));
        }

        @Test
        public void MinusTwoPlusTwoEqual0(){
            Main main = new Main();
            assertEquals(0,main.sum(2,-2));
        }
        @Test
        public void MinusTwoMinusTwoEquialMinusFour(){
            Main main = new Main();
            assertEquals(-4,main.min(-2,2));
        }
        @Test
        public void TwoMinusFourEqualMinusTwo(){
            Main main = new Main();
            assertEquals(-2,main.min(2,4));
        }
        @Test
        public void MinusTwoMinusTwoEquial0(){
            Main main = new Main();
            assertEquals(0,main.sum(-2,2));
        }
        @Test
        public void ZeroMinusZeroEquals0(){
            Main main = new Main();
            assertEquals(0,main.sum(0,0));
        }
        @Test
        public void ZeroDivideOneEquals0(){
            Main main = new Main();
            assertEquals(0,main.divide(0,1));
        }
        @Test
        public void TwoDivideTwoEqualTwo(){
            Main main = new Main();
            assertEquals(1,main.divide(2,2));
        }
        @Test
        public void TwoMulitplyTwoEqualFour(){
            Main main = new Main();
            assertEquals(4,main.multiply(2,2));
        }
        @Test
        public void TwoMulitplyZeroEqual0(){
            Main main = new Main();
            assertEquals(0,main.multiply(2,0));
        }
        @Test
        public void ZeroExpEqual0(){
            Main main = new Main();
            assertEquals(0,main.exp(0));
        }
        @Test
        public void TwoExpEqual4(){
            Main main = new Main();
            assertEquals(4,main.exp(2));
        }
    }
