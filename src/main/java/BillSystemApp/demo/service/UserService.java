package BillSystemApp.demo.service;

import BillSystemApp.demo.entity.UserModel;
import BillSystemApp.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
   private UserRepository userRepository;


    public void addUser(UserModel userModel){
        String password = userModel.getPassword();

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = bCryptPasswordEncoder.encode(password);

        userModel.setPassword(encodedPassword);
        userModel.setRole("");

        userRepository.save(userModel);
    }

    public boolean checkUsername(String username) {
        return userRepository.findByUsername(username).isPresent();
    }

    public UserModel getUserById(Long meter_no){
        return userRepository.findById(meter_no).orElse(null);
    }

    public void editUser(UserModel userModel) {
        String password = userModel.getPassword();

        if (password != null && !password.trim().isEmpty()) {
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            String encodedPassword = bCryptPasswordEncoder.encode(password);
            userModel.setPassword(encodedPassword);
        }
        userRepository.save(userModel);
    }

    public List<UserModel> getUsers() {
        return userRepository.findAll();
    }

    public void deleteUserById(Long meter_no) {
        userRepository.findById(meter_no);
    }
}
