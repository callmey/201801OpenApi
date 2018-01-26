package net.skhu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.dto.User;
import net.skhu.mapper.UserMapper;

@Service
public class UserService {

    @Autowired UserMapper userMapper;

    public User login(String loginId, String password) {
        User user = userMapper.findOneByLoginId(loginId);
        if (user == null) return null;
        //String pw = Encryption.encrypt(password, Encryption.MD5);
        //if (user.getPassword().equals(pw) == false) return null;
        return user;
    }
}
