import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import java.io.FileOutputStream;

public class ExcelDemoTest {
    @Test
    public void excelWrite(){
//        1、创建一个工作簿，即Excel文件
        HSSFWorkbook sheets = new HSSFWorkbook();
//        2、创建一个sheet页
        HSSFSheet sheet = sheets.createSheet("dandan");
//        3、创建行 角标都是从0开始的
        HSSFRow row = sheet.createRow(0);
//        4、写入数据
        row.createCell(0).setCellValue("liuhaha");
        row.createCell(1).setCellValue(18);
        row.createCell(2).setCellValue(true);
//        5、
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\sandra\\IdeaProjects\\java_practice\\src\\main\\resources\\1.xls");
            sheets.write(fileOutputStream);
            fileOutputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end");


    }
}
