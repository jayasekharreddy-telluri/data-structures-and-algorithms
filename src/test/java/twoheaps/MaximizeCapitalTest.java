package twoheaps;

import org.com.jai.pattrens.twoheaps.MaximizeCapital;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximizeCapitalTest {

    @Test
    public void testMaximizeCapitalWithBasicScenario() {
        int[] capital = {0, 1, 2, 3};
        int[] profits = {1, 2, 3, 5};
        int initialCapital = 0;
        int numberOfProjects = 3;
        int expected = 8;
        assertEquals(expected, MaximizeCapital.findMaximumCapital(capital, profits, numberOfProjects, initialCapital));
    }

    @Test
    public void testMaximizeCapitalWithAllProjectsAffordable() {
        int[] capital = {0, 1, 2, 3};
        int[] profits = {1, 2, 3, 5};
        int initialCapital = 10; // All projects can be afforded initially.
        int numberOfProjects = 4; // Invest in all projects.
        int expected = 21; // All profits added to initial capital.
        assertEquals(expected, MaximizeCapital.findMaximumCapital(capital, profits, numberOfProjects, initialCapital));
    }

}
