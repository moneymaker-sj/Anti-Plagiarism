package allcodes.tests;

import allcodes.codesearch.CodeSearch;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Tests for CodeSearch
 */
public class CodeSearchTests {
    /**
     * Tests a sample Hello, world program.
     */
    @Test
    public void BasicHelloWorldTest() {
        String s1 = "public class Main {" +
                "public static void main(String[] args) { System.out.println(\"Hello, world!\") } }";

        assertEquals(CodeSearch.getSimilarSourceCode(s1, 23, 2), CodeSearch.getSimilarSourceCode(s1, 23, 2));
    }
}