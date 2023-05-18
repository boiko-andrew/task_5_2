package binops;

import ru.netology.binops.BinOps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BinOpsTests {
    static BinOps binOps;

    @BeforeAll
    public static void beforeAll() {
        binOps = new BinOps();
    }

    @ParameterizedTest
    @MethodSource("sumMethodSource")
    public void parametrizedTestSum(String arg0, String arg1, String sum) {
        //arrange
        String result;
        String expected = sum;

        //act
        result = binOps.sum(arg0, arg1);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("multMethodSource")
    public void parametrizedTestMult(String arg0, String arg1, String product) {
        //arrange
        String result;
        String expected = product;

        //act
        result = binOps.mult(arg0, arg1);

        //assert
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> sumMethodSource() {
        return Stream.of(
                Arguments.of("10", "01", "11"),
                Arguments.of("11", "01", "100"),
                Arguments.of("ab", "11", ""),
                Arguments.of("10", "cd", "")
        );
    }

    public static Stream<Arguments> multMethodSource() {
        return Stream.of(
                Arguments.of("10", "01", "10"),
                Arguments.of("11", "10", "110"),
                Arguments.of("ef", "01", ""),
                Arguments.of("10", "gh", "")
        );
    }
}