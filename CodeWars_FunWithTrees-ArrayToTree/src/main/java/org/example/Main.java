package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {17, 0, -1, 3, 15};
        Solution.arrayToTree(array);
    }
}


/*
TESTING
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    @Test
    public void emptyArray() {
        TreeNode expected = null;
        assertThat(Solution.arrayToTree(arrayFrom()), is(expected));
    }

    @Test
    public void arrayWithMultipleElements() {
        TreeNode expected = new TreeNode(17, new TreeNode(0, new TreeNode(3), new TreeNode(15)), new TreeNode(-4));
        assertThat(Solution.arrayToTree(arrayFrom(17, 0, -4, 3, 15)), is(expected));
    }

    private int[] arrayFrom(int... values) {
        return values;
    }
}

Another testing during "Attempt" with alternatives as input:
-randomBigArray,
-emptyArray,
-randomSmallArray,
-arrayWithSingleElement,
-arrayWithMultipleElements.

 */