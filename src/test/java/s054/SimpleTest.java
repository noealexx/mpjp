package s054;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SimpleTest {
    @Test
    public void negatePositive() {
        Simple simple = new Simple();
        int value = 42;

        int result = simple.negate(value);

        assertThat(result, equalTo(-42));
    }
    @Test
    public void negateMaxInt() { 
//        int value = Integer.MAX_VALUE;
//
//        int result = simple.negate(value);
//
//        assertThat(result, equalTo(-2147483647));
    }
    @Test
    public void negateMinInt() { 
//        int value = Integer.MIN_VALUE; // BHO TUTTO SBAGLIATO NON SONO RIUSCITA A SEGUIRE 
//
//        int result = simple.negate(value);
//
//        assertThat(result, equalTo(-2147483647));
    }
}


