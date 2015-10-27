
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelToJS {
	
	public static void main( String[] args) throws Exception{
		Workbook wb=WorkbookFactory.create(new FileInputStream(new File("C:/Temp/input.xlsx")));
		 Sheet ws = wb.getSheet("Sheet1") ;
		
			int rowNum =ws.getLastRowNum() + 1 ;
		//	int colNum =ws.getRow(0).getLastCellNum() ;
			 System.out.println("{");	
		for  ( int i =1 ; i < rowNum ; i++) {
			 Row row = ws.getRow(i) ;
				for ( int j = 0 ; j <2 ; j++) {
					
					 Cell cell = row.getCell(j) ;
					String Inbox_File_Name = cellToString(cell);
					System.out.print(Inbox_File_Name);
					j++;
					 cell = row.getCell(j) ;
					String Windows_ID = cellToString(cell);
					String Allowedusers =": { AllowedUsers: [\""+Windows_ID+"\"],  ";
					System.out.print(Allowedusers);
					/*j++;
					 cell = row.getCell(j) ;
					String fullName = cellToString(cell);
					String AllowedusersFullName =" AllowedUsersFullName: [\""+fullName+"\"] }, ";
					System.out.println(AllowedusersFullName);
					
					*/
					System.out.println(" AllowedUsersFullName: [] }, ");
				
				}
				
			}
		 System.out.println("}");
	}
	
	
public static String cellToString( Cell cell) {
			
			int type ;
			Object result ;
			type = cell.getCellType() ;
			
			switch (type) {
			
				case 0 : // numeric value in Excel
					result = cell.getNumericCellValue() ;
				   	break ;
				case 1 : // String Value in Excel 
					result = cell.getStringCellValue() ;
					break ;
				default :  
					throw new RuntimeException("There are no support for this type of cell") ; 						
			}
				
			return result.toString() ;
		}

}

	
