package qwer;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class Solution5Test {

    @Test
    public void solution() {
        Solution5 s = new Solution5();
        assertTrue("true", s.solution("pPoooyY"));
        assertFalse("false", s.solution("pPoooY"));
    }
}
