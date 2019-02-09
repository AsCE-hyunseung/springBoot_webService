package qwer;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BudgetTest {

    @Test
    public void 처음_테스트() {
        Budget b=new Budget();
        int [] d={1,3,2,5,4};
        assertEquals(3,b.solution(d,9));
    }

    @Test
    public void _테스트(){

    }
}
