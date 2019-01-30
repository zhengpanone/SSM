package com.zp.dao;


import com.zp.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("Select * from user where id = #{id}")
    public User selectUserById(int id);

    @Select("select * from user where userName=#{userName}")
    public List<User> selectUserByName(String userName);

    @Insert("insert into user(userName, userAge, userAddress) values(#{userName}, #{userAge}, #{userAddress})")
    public void addUser(User user);

    @Update("update user set useName=#{userName}, userAge=#{userAge}, userAddress=#{userAddress} where id = #{id}")
    public void updateUser(User use);

    @Delete("delete from user where id=#{id}")
    public void deleteUser(int id);
}
