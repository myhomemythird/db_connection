package com.test.dev.services;

import com.test.dev.dao.TestDao;
import com.test.dev.domains.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public List<User> getUserList() {
        List<User> res = testDao.getUserList();
        System.out.println(res);
        return res;
    }
}
