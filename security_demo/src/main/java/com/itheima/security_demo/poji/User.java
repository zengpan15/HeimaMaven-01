package com.itheima.security_demo.poji;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userId;
    private String email;
    private String userName;
    private String station;
    private String password;
    private Integer state;
    private String managerId;
    private String gender;
    private String telephone;
    private String birthday;
    private Integer degree;
    private Integer salary;
    private String joinDate;
    private Integer orderNo;
    private String remark;
    private String deptId;
    private String deptName;
    private String createBy;
    private String create_dept;

    private LocalDateTime createTime;
    private String updateBy;

    private LocalDateTime updateTime;
}
