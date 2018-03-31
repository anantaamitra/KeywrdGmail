package GoogleAccount.test;

import org.testng.annotations.*;

import GoogleAccount.utility.Excel_Utility;
import config.ActionKeywords;

public class DriverScriptKeyWrd {
	
	@Test
	public void DriverTest() throws Exception {
    	// Declaring the path of the Excel file with the name of the Excel file
    	String filePath= System.getProperty("user.dir")+"\\Excel\\Gmail.xlsx"; 
    	
    	// Here we are passing the Excel path and SheetName as argumsents to connect with Excel file 
    	Excel_Utility.readExcel(filePath, "Login");
     	int maxRow=Excel_Utility.rowCount();
    	
    	for (int iRow=1;iRow<=maxRow ;iRow++){
		    //Storing the value of excel cell in sActionKeyword string variable
    		String sActionKeyword = Excel_Utility.getCellData(iRow, 3);
 
    		//Comparing the value of Excel cell with all the project keywords
    		if(sActionKeyword.equals("openBrowser")){
    			ActionKeywords.openBrowser();
    			}
    		else if(sActionKeyword.equals("navigate")){
    			ActionKeywords.navigate();
    			}
    	 	else if(sActionKeyword.equals("click_Gmail")){
    			ActionKeywords.click_Gmail();
    			}
    		else if(sActionKeyword.equals("signIn")){
    			ActionKeywords.signIn();
    			}
    		else if(sActionKeyword.equals("userId")){
    			ActionKeywords.userId();
    			}
    		else if(sActionKeyword.equals("userNext")){
    			ActionKeywords.userNext();
    			}
    		else if(sActionKeyword.equals("input_Password")){
    			ActionKeywords.input_Password();
    			}
    		else if(sActionKeyword.equals("password_Next")){
    			ActionKeywords.password_Next();
    			}
    		else if(sActionKeyword.equals("waitFor")){
    			ActionKeywords.waitFor();
    			}
    		/*else if(sActionKeyword.equals("click_Logout")){
    			ActionKeywords.click_Logout();}*/
    		else if(sActionKeyword.equals("closeBrowser")){
    			ActionKeywords.closeBrowser();
    			}
 
    		}
    	}
 }