import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public String[][] ExcelIntg() throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook("./Excel/Login.xlsx");
		XSSFSheet Sheet = workbook.getSheet("Sheet1");

		//getting row
		int row=Sheet.getLastRowNum();
		
		//getting column
		int column = Sheet.getRow(0).getLastCellNum();


		String[][] Data = new String[row][column];
		for (int i = 1; i <= row; i++) {
			XSSFRow eachrow = Sheet.getRow(i);
			System.out.println("Sheet entered");

			for (int j = 0; j < column; j++) {
				XSSFCell Cellfor = eachrow.getCell(j);
				String ValueRxcel = Cellfor.getStringCellValue();
				System.out.println(ValueRxcel);

				Data[i - 1][j] = ValueRxcel;

			}
		}

		return Data;

	}

	public static void main(String[] args) throws IOException {
		Excel Ex = new Excel();
		Ex.ExcelIntg();
	}
}
