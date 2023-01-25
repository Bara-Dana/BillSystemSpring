package BillSystemApp.demo.Controller;

import BillSystemApp.demo.entity.UserModel;
import BillSystemApp.demo.entity.auth.LoginModel;
import BillSystemApp.demo.entity.auth.RegisterModel;
import BillSystemApp.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private AuthenticationManager authenticationManager;
    @Autowired
    public AuthController(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder,AuthenticationManager authenticationManager){
        this.authenticationManager = authenticationManager;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.userRepository =userRepository;
    }

    @PostMapping("/auth/register")
    public ResponseEntity register(@RequestBody RegisterModel registerModel) {

        UserModel userFormDB = this.userRepository.findByUsername(registerModel.getUsername()).orElse(null);
        if (userFormDB != null) {
            return new ResponseEntity("Acest username este deja inregistrat!", HttpStatus.BAD_REQUEST);
        }
            String currentPassword = registerModel.getPassword();
            String newPassword = this.bCryptPasswordEncoder.encode(currentPassword);
            System.out.println(newPassword);
            UserModel user = new UserModel();
            user.setUsername(registerModel.getUsername());
            user.setUsername(registerModel.getUsername());
            user.setPassword(newPassword);
            user.setName(registerModel.getName());

            user.setRole("");
            this.userRepository.save(user);
            return new ResponseEntity("Utilizator creat cu succes", HttpStatus.OK);


        }
    @PostMapping("/auth/login")
    public ResponseEntity login(@RequestBody LoginModel loginModel) {
        System.out.println(loginModel.getUsername());
        System.out.println(loginModel.getPassword());

        UserModel user = this.userRepository.findByUsername(loginModel.getUsername()).orElse(null);
        if (user != null) {
            if (this.bCryptPasswordEncoder.matches(loginModel.getPassword(), user.getPassword())) {
                return new ResponseEntity(user, HttpStatus.OK);
            }
            return new ResponseEntity("Parola incorecta! ", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity( "Reincercati!", HttpStatus.BAD_REQUEST);
        }
    }
    }


