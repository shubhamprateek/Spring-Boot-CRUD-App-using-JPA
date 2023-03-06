package com.jpa.jpacrud.Service;

import com.jpa.jpacrud.DAO.UserRepository;
import com.jpa.jpacrud.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public List<User> fetchUserList() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User updateUser(User user, int userId) {
        User userDB = userRepository.findById(userId).get();
        if(user.getName()!=null){
            userDB.setName(user.getName());
        }
        if(user.getCity()!=null){
            userDB.setCity(user.getCity());
        }
        if(user.getStatus()!=null){
            userDB.setStatus(user.getStatus());
        }


        return userRepository.save(userDB);
    }

    @Override
    public void deleteUserById(int userId) {
        userRepository.deleteById(userId);
    }
}
