package aoptest.aop.aoptest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class AopRepository {

    public String AopRepositoryTest(String test1){
        log.info("[AopRepository.AopRepositoryTest]");
        if (test1.equals("exception")) {
            throw new IllegalStateException("error occur!");
        }
        return "ok";
    }

}
