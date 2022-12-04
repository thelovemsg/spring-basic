package catalogservice.catalogservice.config;

import catalogservice.catalogservice.jpa.CatalogEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
public class InitDb {

    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.init();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService{
        private final EntityManager em;
        public void init() {
            CatalogEntity gun1 = new CatalogEntity("CATALOG-001", "Gun1", 100, 1500);
            CatalogEntity gun2 = new CatalogEntity("CATALOG-002", "Gun2", 110, 1200);
            CatalogEntity gun3 = new CatalogEntity("CATALOG-003", "Gun3", 120, 1800);
            em.persist(gun1);
            em.persist(gun2);
            em.persist(gun3);
        }
    }
}
