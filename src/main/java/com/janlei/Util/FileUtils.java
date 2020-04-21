package com.janlei.Util;

import com.janlei.model.ExcelDataVO;
import com.sun.tools.internal.ws.wsdl.document.Output;
import groovy.transform.ASTTest;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 文件上传下载工具类
 */
public class FileUtils {

    private static Logger logger = Logger.getLogger(ExcelReader.class.getName()); // 日志打印类
    /**
     * 读取文件信息
     */
    public static void getMsgFromFile(){


    }

    /**
     * 将信息写入文件
     * @param fileName
     * @param path
     * @return boolean
     */
    public static boolean createFile(String fileName,String path){
        File file = new File(path + fileName);
//        InputStream ins = new BufferedInputStream(file);
        return true;
    }


    public static void getMsgFromExcelByPoi(String filenmae){
        // 读取Excel文件内容
        List<ExcelDataVO> list = (List<ExcelDataVO>) ExcelReader.readExcel(filenmae);

        System.out.println(list);
    }

    public static boolean createExcelByPoi(List<ExcelDataVO> list,String exportFilePath){

        // 写入数据到工作簿对象内
        Workbook workbook = ExcelWriter.exportData(list);

        // 以文件的形式输出工作簿对象
        FileOutputStream fileOut = null;
        try {
            File exportFile = new File(exportFilePath);
            if (!exportFile.exists()) {
                exportFile.createNewFile();
            }

            fileOut = new FileOutputStream(exportFilePath);
            workbook.write(fileOut);
            fileOut.flush();
        } catch (Exception e) {
            logger.info("输出Excel时发生错误，错误原因：" + e.getMessage());
        } finally {
            try {
                if (null != fileOut) {
                    fileOut.close();
                }
                if (null != workbook) {
                    workbook.close();
                }
            } catch (IOException e) {
                logger.info("关闭输出流时发生错误，错误原因：" + e.getMessage());
                return false;
            }
        }

        ExcelWriter.exportData(list);
        return true;
    }
}
