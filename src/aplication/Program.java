package aplication;

import java.io.File;
import java.util.Scanner;

public class Program{
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//pegar todas as pastas que estão a partir deste caminho:
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		//LISTA DE ARQUIVOS
		File[]files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for(File file : files) {
			System.out.println(file);
		}
		//CRIAR UMA SUBPASTA A PARTIR DE TEMP
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
	sc.close();
	}
}