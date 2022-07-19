package com.selenium.Bridzlab;

import com.selenium.SeleniumConc.BaseClass;

public class WebTable extends BaseClass{
public static void main(String[] args) {
driver.get("C:\Users\HP\eclipse-workspace\Bridzlab\html\WebTable.html");
//Count Total number of rows present in the table
List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
int totalRows = allRows.size();
System.out.println("total number of rows present in the table is :"+ totalRows);
//count total number of columns
List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
int totalColumns = allColumns.size();
System.out.println("Total number of columns in the table is :" + totalColumns);
//Count number of cells present in the table
List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
int totalCells = allCells.size();
System.out.println("Total number of cells present in the table is :" + totalCells);
//Print ONLY the numbers
int countNumberValue = 0;
int sum=0;
for (WebElement cell : allCells) {
String cellValue = cell.getText();
try{
int number = Integer.parseInt(cellValue);
System.out.print(“ ”+number);
countNumberValue++;
sum = sum+number;
}catch (Exception e) {
}
}
System.out.println("Total count of numeric values is :"+countNumberValue);
System.out.println("Total sum of all the numeric values is :"+sum);
//close the browser
driver.close();
}
}
