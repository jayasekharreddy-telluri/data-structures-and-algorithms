package slidingwindow;

import org.com.jai.pattrens.slidingwindow.MaximizeTheConfusionOfAnExam;
import org.junit.Assert;
import org.junit.Test;

public class MaximizeTheConfusionOfAnExamTest {

    @Test
    public void testOptimalSolution_ValidCase() {
        String answerKey = "TTFTTFTT";
        int k = 1;
        int expectedResult = 5;
        int actualResult = MaximizeTheConfusionOfAnExam.optimalSolution(answerKey, k);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOptimalSolution_AllT() {
        String answerKey = "TTTT";
        int k = 0;
        int expectedResult = 4;
        int actualResult = MaximizeTheConfusionOfAnExam.optimalSolution(answerKey, k);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOptimalSolution_AllF() {
        String answerKey = "FFFF";
        int k = 2;
        int expectedResult = 2;
        int actualResult = MaximizeTheConfusionOfAnExam.optimalSolution(answerKey, k);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOptimalSolution_EmptyAnswerKey() {
        String answerKey = "";
        int k = 3;
        int expectedResult = 0;
        int actualResult = MaximizeTheConfusionOfAnExam.optimalSolution(answerKey, k);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOptimalSolution_NullAnswerKey() {
        String answerKey = null;
        int k = 1;
        int expectedResult = 0;
        int actualResult = MaximizeTheConfusionOfAnExam.optimalSolution(answerKey, k);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOptimalSolution_KGreaterThanAnswerKeyLength() {
        String answerKey = "TFTT";
        int k = 5;
        int expectedResult = 4; // All 'T's or 'F's can be converted to maximize the sequence length
        int actualResult = MaximizeTheConfusionOfAnExam.optimalSolution(answerKey, k);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOptimalSolution_NegativeK() {
        String answerKey = "TFTTFT";
        int k = -2; // Negative k should be treated as 0, no changes allowed
        int expectedResult = 2; // Two consecutive 'T's in the initial sequence
        int actualResult = MaximizeTheConfusionOfAnExam.optimalSolution(answerKey, k);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
