package WebApp.GenericUtilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtility {

    public String readData(String sheetName,int rowIndex,int columnIndex) throws IOException {
        //creates a FileInputStream object to read the Excel file from the provided file path (in the empty string "", you would place the path to the Excel file).
        FileInputStream fis=new FileInputStream("");
        Workbook wb= WorkbookFactory.create(fis);
        String cell=wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).toString();
//        DataFormatter formater=new DataFormatter();
//        String data=formater.formatCellValue(cell);
        return cell;

    }

}
