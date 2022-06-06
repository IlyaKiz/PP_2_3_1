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

//   @Override
//   public List<User> listUsers() {
//      userDao.addUser(new User("User1", "Lastname1", "user1@mail.ru"));
//      userDao.addUser(new User("User2", "Lastname2", "user2@mail.ru"));
//      userDao.addUser(new User("User3", "Lastname3", "user3@mail.ru"));
//      userDao.addUser(new User("User4", "Lastname4", "user4@mail.ru"));
//      return new ArrayList<>();
//   }




}






