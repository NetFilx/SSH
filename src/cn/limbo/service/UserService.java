package cn.limbo.service;

import cn.limbo.entity.User;

import java.util.List;

/**
 * Created by limbo on 2016/11/8.
 */
public interface UserService {

    public void save(User user);

    public List<User> getAllUsers();

}
