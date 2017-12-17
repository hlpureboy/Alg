package com.xls.parser;
import jxl.*;
import jxl.write.*;
import java.io.*;
public class Save2xls {
	/*
	 * 此类的方法是用来存储各类算法所产生的时间 
	 * */
	public static void save2xls(double[][] s,String[] name,String filename) {
		try {
			WritableWorkbook book =Workbook.createWorkbook(new File(filename+".xls"));
			WritableSheet [] sheets =new WritableSheet[name.length];
			for(int i=0;i<name.length;i++) {
				sheets[i]=book.createSheet(name[i],i);
			}
			//System.out.println(sheets.length);
//			for(int i=0;i<s.length;i++) {
//				for(int j = 0;j<s[i].length;j++) {
//					jxl.write.Number number= new jxl.write.Number(j,i%4,s[i][j]);
//					//System.out.println(i/name.length);
//					sheets[i%4].addCell(number);
//				}
//			}
			for(int i=0;i<5;i++) {
				for(int j=0;j<20;j++) {
					jxl.write.Number number= new jxl.write.Number(j%5,j/5,s[j][i]);
					sheets[i].addCell(number);
				}
			}
			book.write();
			book.close();
			System.out.println("输出完成！");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
