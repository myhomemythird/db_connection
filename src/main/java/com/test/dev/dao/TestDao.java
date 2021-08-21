package com.test.dev.dao;

import com.test.dev.domains.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TestDao {
    @Results(id = "User",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "name", column = "name")
            }
    )
    @Select("select * from my_table")
    List<User> getUserList();
}
