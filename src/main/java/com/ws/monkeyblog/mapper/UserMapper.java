package com.ws.monkeyblog.mapper;

import com.ws.monkeyblog.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List<User> queryUserList();

    User queryUserById(Long id);

    Long addUser(User user);

    int updateUser(User user);

    int deleteUser(Long id);

}
