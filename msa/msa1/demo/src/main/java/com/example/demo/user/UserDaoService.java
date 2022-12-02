package com.example.demo.user;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDaoService {
    private static List<Users> users = new ArrayList<>();
    private static int userCount = 3;
    static{
        users.add(new Users(1,"Msg1", new Date(), "pass1", "951128-1111111"));
        users.add(new Users(2,"Msg2", new Date(),"pass2", "951128-1211111"));
        users.add(new Users(3,"Msg3", new Date(),"pass3", "951128-1311111"));
    }

    public List<Users> findAll(){
        return users;
    }

    public Users save(Users user){
        if (user.getId() == null){
            user.setId(++userCount);
        }

        users.add(user);
        return user;
    }

    public Users findOne(int id){
        for (Users user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public Users deleteById(int id){
//        users = users.stream().filter(m -> m.getId() != id).collect(Collectors.toList());
        Iterator<Users> iterator = users.iterator();
        while(iterator.hasNext()){
            Users user = iterator.next();
            if(user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }

}
