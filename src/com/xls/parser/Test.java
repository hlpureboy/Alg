package com.xls.parser;
import jxl.*;
import jxl.write.*;
import java.io.*;
public class Test {
	public static void main(String[] args) {
		/**
		 * 对 xls文档进行读写
		 */
		try {
			WritableWorkbook book =Workbook.createWorkbook(new File("test.xls"));
			//打开一个 xls 文档
			WritableSheet sheet = book.createSheet("sheet1",0);
			//生成一个sheet 参数0表示第一页
			Label label=new Label(0,0,"test0");
			Label label1=new Label(0,1,"test1");
			//生成一个label 0,0表示位置 内容是test
			sheet.addCell(label);
			sheet.addCell(label1);
			//为sheet添加一个cell
			jxl.write.Number number= new jxl.write.Number(1,0,232);
			//写入数字  1,0表示 第二列第一行 数值232
			sheet.addCell(number);
			book.write();
			book.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
