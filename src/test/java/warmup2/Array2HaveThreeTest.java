package warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Array2HaveThreeTest {

    private Array2HaveThree array2HaveThree = new Array2HaveThree();

    @Test
    public void haveThreeShouldReturnTrueIfNumber3Appears3TimesNotNextToEachWhen31313ArePassed() {
        int a[] = {3, 1, 3, 1, 3};
        assertTrue(array2HaveThree.haveThree(a));
    }

    @Test
    public void haveThreeShouldReturnFalseIfNumber3DoesntApear3TimeNotNextToEachOtherWhen3133ArePassed() {
        int a[] = {3, 1, 3, 3};
        assertFalse(array2HaveThree.haveThree(a));
    }

    @Test
    public void haveThreeShouldReturnFalseIfNumber3DoesntApear3TimeNotNextToEachOtherWhen333ArePassed() {
        int a[] = {3, 3, 3};
        assertFalse(array2HaveThree.haveThree(a));
    }


    @Test
    public void haveThreeShouldReturnFalseIfNumber3DoesntApear3TimeNotNextToEachOtherWhen33333ArePassed() {
        int a[] = {3, 3, 3, 3, 3};
        assertFalse(array2HaveThree.haveThree(a));
    }

    @Test
    public void haveThreeShouldReturnFalseIfNumber3DoesntApear3TimeNotNextToEachOtherWhen1333331ArePassed() {
        int a[] = {1, 3, 3, 3, 3, 3, 1};
        assertFalse(array2HaveThree.haveThree(a));
    }

    @Test
    public void haveThreeShouldReturnTrueIfNumber3Appears3TimesNotNextToEachWhen3434344ArePassed() {
        int a[] = {3, 4, 3, 4, 3, 4, 4};
        assertTrue(array2HaveThree.haveThree(a));
    }

}