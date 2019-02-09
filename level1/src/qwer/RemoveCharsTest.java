package qwer;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class RemoveCharsTest {
    RemoveChars r = new RemoveChars();

    @Test
    public void 테스트_결과() {
        assertEquals("Bttl f th Vwls: Hw vs. Grzny", r.solution("Battle of the Vowels: Hawaii vs. Grozny", "aeiou"));
    }
}
