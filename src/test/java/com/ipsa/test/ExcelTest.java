package com.ipsa.test;


import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.ipsa.entity.Person;
import com.ipsa.entity.Work;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelTest {

    @Test
    public void test1() throws IOException {
        //测试
        ArrayList<Work> works = new ArrayList<>();
        Person person = new Person(1, "张三", '男');
        Person person2 = new Person(2, "张si", '男');
        Person person3 = new Person(3, "wangwu", '男');
        List<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person2);
        people.add(person3);

        Work w = new Work(1, "干活", people);
        Work w2 = new Work(2, "兼职", people);
        Work w3 = new Work(3, "劳力", people);
        works.add(w);
        works.add(w2);
        works.add(w3);

        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("工作列表", "工作"), Work.class, works);
        workbook.write(new FileOutputStream("D://work.xls"));

    }
}
