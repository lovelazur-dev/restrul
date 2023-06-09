package com.lovelazur.restrul.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Component
@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 3;

    static {
        users.add(new User(1, "jongha.lee1", new Date()));
        users.add(new User(2, "jongha.lee2", new Date()));
        users.add(new User(3, "jongha.lee3", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id){
        for (User user : users){
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User save(User user){
        if(user.getId() == null){
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

}
