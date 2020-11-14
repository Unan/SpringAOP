package root.subject;

import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    public void sleep(long l) throws InterruptedException {
        System.out.println("I'm going to sleep for " + l + " ms");
        Thread.sleep(l);
        System.out.println("I woke up");
    }

    public void exponentiation(Integer base, Integer exponent) {
        long result = (long) base;
        for (int i = 2; i <= exponent; i++) {
            result = result * base;
        }
        System.out.println("result = " + result);
    }
}
