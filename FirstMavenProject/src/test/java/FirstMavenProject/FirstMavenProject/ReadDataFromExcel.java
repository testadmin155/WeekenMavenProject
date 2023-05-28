package FirstMavenProject.FirstMavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	public static void getData(String Coursename, String info) throws IOException
	{
		{
			//https://mvnrepository.com/artifact/org.apache.poi/poi/3.17
			//https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/3.17
			
			FileInputStream fis = new FileInputStream("E:\\Testing Session\\SeleniumTraining\\AutomationTraining.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			int numofsheets = workbook.getNumberOfSheets();
			//System.out.println("number of sheets in the xls is : " +numofsheets);
			
			for (int i=0; i<numofsheets; i++)
			{
				//System.out.println(workbook.getSheetName(i));
				if (workbook.getSheetName(i).equalsIgnoreCase("TrainingDetails"))
				{
					XSSFSheet sheet = workbook.getSheetAt(i);
					Iterator<Row> rows = sheet.iterator();
					Row firstrow = rows.next();
					
					Iterator<Cell> ce = firstrow.cellIterator();
					int ColumnNum =0;
					while(ce.hasNext())
					{
						Cell columnname = ce.next();
						//System.out.println(columnname.getStringCellValue());
						if (columnname.getStringCellValue().equals(info))
						{
							ColumnNum= columnname.getColumnIndex();
							//System.out.println("Index of the column is : " +ColumnNum);
						}
						
					}
					
					for (Row row : sheet)
					{
						Cell cellValue = row.getCell(0);
						//System.out.println(cellValue);
						
						if(cellValue.getStringCellValue().equals(Coursename))
						{
							//System.out.println(cellValue.getRow());
							System.out.println(cellValue.getRow().getCell(ColumnNum));
						}
					}
					
					
				}
			}

		}
	}

	public static void main(String[] args) throws IOException {
		
       getData("Selenium","Tutorname");
       getData("Selenium","Location");
       getData("Cypress", "Tutorname");

	}
}