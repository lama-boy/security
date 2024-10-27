package test.prj.securityPrj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.prj.securityPrj.dto.JoinDto;
import test.prj.securityPrj.entity.UserEntity;
import test.prj.securityPrj.repository.UserRepository;

@Service
public class JoinService {

    @Autowired
    private UserRepository userRepository;

    public void joinProcess(JoinDto joinDto){
        String user_id = joinDto.getUser_id();
        String user_name = joinDto.getUser_name();
        String password = joinDto.getPassword();

        Boolean isExist = userRepository.userIdVerification(user_id);

        if(!isExist){
            return;
        }

        UserEntity data = new UserEntity();
        data.setUser_id(user_id);
        data.setUser_nmae(user_name);
        

    }
    
}
