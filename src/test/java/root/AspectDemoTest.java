package root;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import root.subject.SubjectService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AspectDemoTest {

    @Autowired
    private SubjectService subjectService;

    @Test
    public void sleepTest() throws InterruptedException {
        subjectService.sleep(2000);
    }

    @Test
    public void exponentiationTest() {
        subjectService.exponentiation(3, 8);
    }
}