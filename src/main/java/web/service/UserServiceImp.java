package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Override
   public List<User> getAllUsers() {
      return userDao.getAllUsers();
   }


   @Override
   public void addUser(User user) {
      userDao.addUser(user);
   }


   @Override
   public void deleteUser(Long id) {
      userDao.deleteUser(id);
   }

   @Override
   public void updateUser(User user) {
      userDao.updateUser(user);
   }

   @Override
   public User getUserById(Long id) {
      return userDao.getUserById(id);
   }

}






