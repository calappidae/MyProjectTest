package com.pan.dao;

import com.pan.entity.User;

import java.util.List;

public interface UserDao {
        public boolean UserAdd(User u);
        public List UserList();
        public boolean UserDelete(User u);
}
