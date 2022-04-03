package aoptest.aop.aoptest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AopService {

    private final AopRepository repository;

    public AopService(AopRepository repository) {
        this.repository = repository;
    }

    public void AopServiceTest(String test1){
        log.info("[AopService.AopServiceTest]");
        repository.AopRepositoryTest(test1);
    }

}
