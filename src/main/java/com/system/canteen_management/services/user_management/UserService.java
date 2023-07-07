package com.system.canteen_management.services.user_management;

import com.system.canteen_management.dto.AuthenticationResponse;
import com.system.canteen_management.dto.LoginDto;
import com.system.canteen_management.entity.user_management.User;
import com.system.canteen_management.pojo.user_management.UserPojo;

import java.io.IOException;
import java.util.List;

public interface UserService {

    UserPojo save(UserPojo userPojo) throws IOException;

    List<User> fetchAll();

    User fetchById(Integer id);

    void deleteById(Integer id);

    void sendEmail();

    AuthenticationResponse authenticate(LoginDto loginDto);
}
