package com.test.mybatis.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class User{
    @TableId(value = "ID",type = IdType.AUTO)
    private long id;
    private String name;
    private int age;
    private String email;

    @TableLogic
    private Integer deleted;
}
