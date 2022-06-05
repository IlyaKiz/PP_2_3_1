package web.dao;


import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void add(User user) {
      sessionFactory.getCurrentSession().save(user);
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }

   @PersistenceContext
   private EntityManager em;

   @Override
   @SuppressWarnings("uncheked")
   public List<User> getAllUsers() {
      String jpql = "SELECT c FROM User c";
      TypedQuery<User> query = em.createQuery(jpql, User.class);
      return query.getResultList();
   }

   @Override
   public void addUser(User user) {
      em.persist(user);
   }

   @Override
   public void deleteUser(Long id) {
      em.remove(em.find(User.class, id));
   }

   @Override
   public void updateUser(User user) {
      em.merge(user);
   }

   @Override
   public User getUserById(Long id) {
      return em.find(User.class, id);
   }



}
