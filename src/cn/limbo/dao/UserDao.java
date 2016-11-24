package cn.limbo.dao;

import cn.limbo.entity.User;

import java.util.List;

/**
 * Created by limbo on 2016/11/8.
 */
public interface UserDao {

    public void save(User user);

    public List<User> findAll();

}
