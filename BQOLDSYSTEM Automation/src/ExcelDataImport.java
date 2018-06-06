import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelDataImport
{
//	public String promptForFolder( Component parent )
//	{
//	    JFileChooser fc = new JFileChooser();
//	    fc.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY );
//
//	    if( fc.showOpenDialog( parent ) == JFileChooser.APPROVE_OPTION )
//	    {
//	        return fc.getSelectedFile().getAbsolutePath();
//	    }
//
//	    return null;
//	}
	
	
//	private void OpenActionPerformed(java.awt.event.ActionEvent evt) {
//	    int returnVal = fileChooser.showOpenDialog(this);
//	    if (returnVal == JFileChooser.APPROVE_OPTION) {
//	        File file = fileChooser.getSelectedFile();
//	        try {
//	          // What to do with the file, e.g. display it in a TextArea
//	          textarea.read( new FileReader( file.getAbsolutePath() ), null );
//	        } catch (IOException ex) {
//	          System.out.println("problem accessing file"+file.getAbsolutePath());
//	        }
//	    } else {
//	        System.out.println("File access cancelled by user.");
//	    }
//	} 
//	
	public void ImportData(WebDriver dr)
	{
		//dr.findElement(By.)
	}
	
	
	public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

	    //Create an object of File class to open xlsx file

	   File file =    new File(filePath+"\\"+fileName);
		//File file=new File(this.promptForFolder(parent));

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook BoutiqaatWorkwook = null;

	    //Find the file extension by splitting file name in substring  and getting only extension name

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	    	BoutiqaatWorkwook = new XSSFWorkbook(inputStream);

	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of XSSFWorkbook class

	    	BoutiqaatWorkwook = new HSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    Sheet BoutiqaatSheet= BoutiqaatWorkwook.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = BoutiqaatSheet.getLastRowNum()-BoutiqaatSheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = BoutiqaatSheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

	        System.out.println();

	    }

	    

	    }
	
	
	
	public void writeExcel(WebDriver dr,String filePath,String fileName,String sheetName,String result) throws FileNotFoundException
	{
		 //Create an object of File class to open xlsx file

        File file =    new File(filePath+"\\"+fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook BoutiqaatSanityWorkbook = null;

        //Find the file extension by splitting  file name in substring and getting only extension name

        String fileExtensionName = fileName.substring(fileName.indexOf("."));

        //Check condition if the file is xlsx file

        if(fileExtensionName.equals(".xlsx"))
        {

        //If it is xlsx file then create object of XSSFWorkbook class

        	try {
				BoutiqaatSanityWorkbook = new XSSFWorkbook(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }

        //Check condition if the file is xls file

        else if(fileExtensionName.equals(".xls"))
        {

            //If it is xls file then create object of XSSFWorkbook class

        	try {
				BoutiqaatSanityWorkbook = new HSSFWorkbook(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }

        

    //Read excel sheet by sheet name    

    Sheet sheet = BoutiqaatSanityWorkbook.getSheet(sheetName);

    //Get the current count of rows in excel file

    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

    //Get the first row from the sheet

    Row row = sheet.getRow(0);

    //Create a new row and append it at last of sheet

    Row newRow = sheet.createRow(rowCount+1);

    //Create a loop over the cell of newly created Row

    for(int j = 0; j < row.getLastCellNum(); j++){

        //Fill data in row

        Cell cell = newRow.createCell(j);
        
        cell.setCellValue(result);

      //  cell.setCellValue(dataToWrite[j]);

    }

    //Close input stream

    try {
		inputStream.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    //Create an object of FileOutputStream class to create write data in excel file

    FileOutputStream outputStream = new FileOutputStream(file);

    //write data in the excel file

    try {
		BoutiqaatSanityWorkbook.write(outputStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    //close output stream

    try {
		outputStream.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
		
	}

	    

	    //Main function is calling readExcel function to read data from excel file

//	    public static void main(String...strings) throws IOException{
//
//	    //Create an object of ReadGuru99ExcelFile class
//
//	    ReadGuru99ExcelFile objExcelFile = new ReadGuru99ExcelFile();
//
//	    //Prepare the path of excel file
//
//	    String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
//
//	    //Call read file method of the class to read data
//
//	    objExcelFile.readExcel(filePath,"ExportExcel.xlsx","ExcelGuru99Demo");
//
//	    }




