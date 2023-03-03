package com.atguigu.bean;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {

    private int id;
    private String password;
    private String identity;


    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String name;


    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime time;
}