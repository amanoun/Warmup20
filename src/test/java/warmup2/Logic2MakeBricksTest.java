package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Logic2MakeBricksTest {

    Logic2MakeBricks logic2MakeBricks = new Logic2MakeBricks();

    @Test
    public void makeBricksShouldMakeGoalOf8When3SmallAnd1BigBricksPassed() {
        assertTrue(logic2MakeBricks.makeBricks(3, 1, 8));

    }

    @Test
    public void makeBricksShouldReturnFalseToMakeGoalOf9When3SmallAnd1BigBricksPassed() {
        assertFalse(logic2MakeBricks.makeBricks(3, 1, 9));

    }
    @Test
    public void makeBricksShouldReturnTrueToMakeGoalOf10When3SmallAnd2BigBricksPassed() {
        assertTrue(logic2MakeBricks.makeBricks(3, 2, 10));

    }

    @Test
    public void makeBricksShouldReturnFalseToMakeGoalOf9When3SmallAnd2BigBricksPassed() {
        assertFalse(logic2MakeBricks.makeBricks(3, 2, 9));

    }

    @Test
    public void makeBricksShouldReturnFalseToMakeGoalOf119When6SmallAndNoBigBricksPassed() {
        assertFalse(logic2MakeBricks.makeBricks(6, 0, 11));

    }
    @Test
    public void makeBricksShouldReturnFalseToMakeGoalOf13When6SmallAnd1BigBricksPassed() {
        assertFalse(logic2MakeBricks.makeBricks(7, 1, 13));

    }

    @Test
    public void makeBricksShouldReturnTrueToMakeGoalOf1000100WhenMilionSmallAnd1000BigBricksPassed() {
        assertFalse(logic2MakeBricks.makeBricks(1000000, 1000, 10000100));

    }


}
