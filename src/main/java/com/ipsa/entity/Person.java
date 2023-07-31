package com.ipsa.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Excel(name = "人员编号")
    private Integer id;
    @Excel(name = "姓名")
    private String name;
    @Excel(name = "性别")
    private char sex;
}
