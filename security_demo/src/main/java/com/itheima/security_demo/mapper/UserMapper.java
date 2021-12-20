package com.itheima.security_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
//    @Select("SELECT
//            t3.user_name,t1.name,t1.role_desc
//            FROM
//            `ss_role` t1,
//            `ss_role_user` t2,
//            `ss_user` t3
//            WHERE t1.role_id = t2.role_id
//            AND t2.user_id = t3.user_id)
//    List<String>selectRoles(String username);

}
