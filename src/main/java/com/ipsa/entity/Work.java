package com.ipsa.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Work implements Serializable {
    @Excel(name = "班级编号", needMerge = true)
    private Integer id;

    private String workName;
    private Double price;
}