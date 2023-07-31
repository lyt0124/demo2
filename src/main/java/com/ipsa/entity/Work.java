package com.ipsa.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Work implements Serializable {
    @Excel(name = "工作编号", needMerge = true)
    private Integer id;
    @Excel(name = "工作名称",needMerge = true)
    private String workName;
    @ExcelCollection(name = "该工作下的人员")
    private List<Person> person;
}