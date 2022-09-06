package com.mycom.word;

import java.util.Scanner;

public class WordManager {
	Scanner s = new Scanner(System.in);
	WordCRUD wordCRUD;
	
	WordManager(){
		wordCRUD = new WordCRUD(s);
	}
	
	public void start() {
		while(true) {
			int menu = selectMenu();
			if(menu == 0) break;
			if(menu == 4) {
				wordCRUD.addWord();
			}
			else if(menu == 1) {
				wordCRUD.listAll();
			}
			else if(menu == 5) {
				wordCRUD.updateItem();
			}
			else if(menu == 6) {
				//delete
			}
		}
		System.out.println("���α׷� ����~!");
	}
	
	public int selectMenu() {
		System.out.print("*** ���ܾ� ������ ***\n"
				+ "******************\n"
				+ "1. ��� �ܾ� ����\n"
				+ "2. ���غ� �ܾ� ����\n"
				+ "3. �ܾ� �˻�\n"
				+ "4. �ܾ� �߰�\n"
				+ "5. �ܾ� ����\n"
				+ "6. �ܾ� ����\n"
				+ "7. ���� ����\n"
				+ "0. ������\n"
				+ "*******************\n"
				+ "=> ���ϴ� �޴���? ");
		return s.nextInt();
	}
}
