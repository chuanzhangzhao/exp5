package utils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import entity.User;

public class MyExcelUtils {

    private static Integer totalRows = 0;
    private static Integer totalCells = 0;

    /**
     * ???excel?????????
     *
     * @param inputStream ??Part?§Ý?????????????????????›¥??????????????????Workbook????
     * @param fileName    ????????????§Ø??????????
     * @return ????User?????List????
     */
    public static List<User> getExcelData(InputStream inputStream, String fileName) {
        List<User> users = null;

        try {
            // ????
            if (!validFileIsExcel(fileName)) {
                return null;
            }
            // ????Workbook??????excel????????
            users = createWorkbook(inputStream, isExcel2007(fileName));

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return users;
    }

    private static List<User> createWorkbook(InputStream inputStream, boolean excel2007) {
        // TODO Auto-generated method stub
        List<User> users = null;

        try {
            if (excel2007) {
                // 2007?·Ú
                XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
                // ???????
                users = readWoekbookData(workbook);
            } else {
                // 2003?·Ú
                HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
                users = readWoekbookData(workbook);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return users;
    }

    private static List<User> readWoekbookData(HSSFWorkbook workbook) {
        // TODO Auto-generated method stub
        List<User> users = new ArrayList<User>();
        User user = null;
        try {
            // ???sheet??????????????????sheet1?????sheet2,3?????????????????
            HSSFSheet sheet = workbook.getSheetAt(0);
            // ????????????
            totalRows = sheet.getLastRowNum();
            // ?????????????????1???????????????????id, name, password????????
            for(int r = 1; r <= totalRows; r++) {
                user = new User();
                // ???????
                HSSFRow row = sheet.getRow(r);
                // ??§Ö???????
                totalCells = row.getPhysicalNumberOfCells();
                for (int c = 0; c < totalCells; c++) {
                    // ????§Ö????(??§Ø???3??????????¡À??0???)
                    HSSFCell cell = row.getCell(c);
                    switch (c) {
                        case 0: {
                            Integer id = (int) cell.getNumericCellValue();
                            user.setId(id);
                            break;
                        }
                        case 1: {
                            String name = cell.getStringCellValue();
                            user.setName(name);
                            break;
                        }
                        case 2: {
                            String password = cell.getStringCellValue();
                            user.setPassword(password);
                            break;
                        }
                        default:
                            break;
                    }
                }
                // ????????
                System.out.println(user.getId() + " " + user.getName() + " " + user.getPassword());
                // ????????????User??List????
                users.add(user);
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return users;
    }

    private static List<User> readWoekbookData(XSSFWorkbook workbook) {
        // TODO Auto-generated method stub
        List<User> users = new ArrayList<User>();
        User user = null;
        try {
            // ???sheet??????????????????sheet1?????sheet2,3?????????????????
            XSSFSheet sheet = workbook.getSheetAt(0);
            // ????????????
            totalRows = sheet.getLastRowNum();
            // ?????????????????1???????????????????id, name, password????????
            for(int r = 1; r <= totalRows; r++) {
                user = new User();
                // ???????
                XSSFRow row = sheet.getRow(r);
                // ??§Ö???????
                totalCells = row.getPhysicalNumberOfCells();
                for (int c = 0; c < totalCells; c++) {
                    // ????§Ö????(??§Ø???3??????????¡À??0???)
                    XSSFCell cell = row.getCell(c);
                    switch (c) {
                        case 0: {
                            Integer id = (int) cell.getNumericCellValue();
                            user.setId(id);
                            break;
                        }
                        case 1: {
                            String name = cell.getStringCellValue();
                            user.setName(name);
                            break;
                        }
                        case 2: {
                            String password = cell.getStringCellValue();
                            user.setPassword(password);
                            break;
                        }
                        default:
                            break;
                    }


                }
                // ????????
                System.out.println(user.getId() + " " + user.getName() + " " + user.getPassword());
                // ????????????User??List????
                users.add(user);
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return users;
    }

    /**
     * ?§Ø?????????????excel???
     *
     * @param fileName
     * @return
     */
    public static boolean validFileIsExcel(String fileName) {

        if (isExcel2003(fileName) || isExcel2007(fileName)) {
            return true;
        }

        return false;
    }

    private static boolean isExcel2007(String fileName) {
        // ?·Ú2007+??????
        String type = ".xlsx";
        // ?????????
        String fileType = fileName.substring(fileName.lastIndexOf("."));

        if (type.equalsIgnoreCase(fileType)) {
            return true;
        }

        return false;
    }

    private static boolean isExcel2003(String fileName) {
        // ?·Ú2003+??????
        String type = ".xls";
        // ?????????
        String fileType = fileName.substring(fileName.lastIndexOf("."));

        if (type.equalsIgnoreCase(fileType)) {
            return true;
        }

        return false;
    }

}