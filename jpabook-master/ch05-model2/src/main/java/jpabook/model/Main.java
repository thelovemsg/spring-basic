package jpabook.model;

import jpabook.model.test.entity.MyMember;
import jpabook.model.test.entity.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by 1001218 on 15. 4. 5..
 */
public class Main {

    public static void main(String[] args) {

        //엔티티 매니저 팩토리 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager(); //엔티티 매니저 생성

        EntityTransaction tx = em.getTransaction(); //트랜잭션 기능 획득

        try {

            tx.begin(); //트랜잭션 시작
            //TODO 비즈니스 로직
            tx.commit();//트랜잭션 커밋

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback(); //트랜잭션 롤백
        } finally {
            em.close(); //엔티티 매니저 종료
        }

        emf.close(); //엔티티 매니저 팩토리 종료
    }

    public void testSave(){
        //엔티티 매니저 팩토리 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager(); //엔티티 매니저 생성

        EntityTransaction tx = em.getTransaction(); //트랜잭션 기능 획득
        Team team1 = new Team("team1" ,"팀1");
        em.persist(team1);

        MyMember member1 = new MyMember("member1", "회원1");
        member1.setTeam(team1);
        em.persist(member1);

        MyMember member2 = new MyMember("member1", "회원2");
        member2.setTeam(team1);
        em.persist(member2);
    }

    public static void queryLogicJoin(EntityManager em) {
        String jpql = "select m from MyMember m join m.team t where " +
                    "t.name =: teamName";
        List<MyMember> resultList = em.createQuery(jpql, MyMember.class).setParameter("teamName", "팀1")
                .getResultList();

        for (MyMember mymember : resultList) {
            System.out.println(mymember.getUsername());
        }
    }

    public static void updateRelation(EntityManager em){
        Team team2 = new Team("team2", "팀2");
        em.persist(team2);

        MyMember member = em.find(MyMember.class, "member1");
        member.setTeam(team2);
    }

}
