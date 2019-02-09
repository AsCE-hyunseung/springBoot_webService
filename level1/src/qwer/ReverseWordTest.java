package qwer;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class ReverseWordTest {
    ReverseWord r = new ReverseWord();

    @Test
    public void 테스트_결과() {
        assertEquals("try. no is there not. do or Do", r.solution("Do or do not. there is no try."));
    }
}
