package com.simminjeong.memo.note;

public class NotePad {

	private int noteLength = 0;
	private final NoteEntity[] noteEntities;
	private final int NOTE_SIZE = 20;
	
	// Notepad에 각각의 내용들 noteentities 생성
	public NotePad() {
		this.noteEntities=new NoteEntity[NOTE_SIZE];
	}

	public void selectAllPrint() {
		// 전체 메모 타이틀하고 update날짜만

	}

	public void selectPrint() {
		// 사용자로부터 입력받으면 content보기

	}

	public void addMemo() {
		noteEntities[this.noteLength++]=
		// 내용 추가
		// 
		

	}

	public void updateMemo() {

	}

	public void deleteMemo() {

	}

}
