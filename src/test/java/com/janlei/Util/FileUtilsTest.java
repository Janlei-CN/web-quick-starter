package com.janlei.Util;

import com.janlei.model.ExcelDataVO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FileUtilsTest {

    @Test
    public void read(){
        String excelFileName = "D:/tt.xlsx";
        FileUtils.getMsgFromExcelByPoi(excelFileName);

    }

    @Test
    public void write(){
        // 创建需要写入的数据列表
        List<ExcelDataVO> dataVOList = new ArrayList<>(2);
        ExcelDataVO dataVO = new ExcelDataVO();
        dataVO.setName("小明");
        dataVO.setAge(18);

        ExcelDataVO dataVO2 = new ExcelDataVO();
        dataVO2.setName("小花");
        dataVO2.setAge(19);

        dataVOList.add(dataVO);
        dataVOList.add(dataVO2);
        String filename = "d:/tt.xlsx";
        boolean flag = FileUtils.createExcelByPoi(dataVOList, filename);
        assertThat(flag).isEqualTo(true);

    }
}