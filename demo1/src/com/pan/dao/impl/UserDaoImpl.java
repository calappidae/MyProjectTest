package com.pan.dao.impl;

import com.pan.dao.UserDao;
import com.pan.entity.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean UserAdd(User u) {
        if (u != null) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean UserDelete(User u) {
       return false;
    }

    @Override
    public List UserList() {
        return null;
    }
}
