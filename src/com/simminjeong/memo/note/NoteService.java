package com.simminjeong.memo.note;

import java.util.Scanner;

import com.simminjeong.memo.note.NotePad;

public class NoteService {
	
	private final NotePad notePad;
	
	public NoteService() {
		this.notePad=new NotePad();
	}
	
	public void run() {
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("안녕하세요");
			System.out.println("1.메모리스트 2.메모보기 3.메모작성 4.메모수정 5.메모삭제 6.종료");
			System.out.println("번호 입력하세요");

			int selectNumber = scanner.nextInt();

			switch (selectNumber) {
			case 1:
				selectAllPrint();
				break;
			case 2:
				selectPrint();
				break;
			case 3:
				addMemo();
				break;
			case 4:
				updateMemo();
				break;
			case 5:
				deleteMemo();
				break;
			default:
				System.out.println("번호다시입력");
				break;

			}

		}
		
	}

}
