package edu.tamu.amos.spring.testing;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Amos on 2018/2/8.
 */
public class MathUtilMockUnitSpec {

    private MathUtilMock mathUtilMock;
    @Before
    public void initialization() {
        InternalService mocked = mock(InternalService.class);
        List<Integer> exampleList = new ArrayList<>();
        exampleList.add(1); exampleList.add(2); exampleList.add(3);
        when(mocked.getData()).thenReturn(exampleList);

        this.mathUtilMock = new MathUtilMock(mocked);
    }

    @Test
    public void MockTest1() {
        assertEquals("Testing MathUtilMock.callServiceAndSum",6, mathUtilMock.callServiceAndSum());
    }


}
