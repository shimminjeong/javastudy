package com.simminjeong.memo.note;

import com.simminjeong.memo.usecase.NoteService;

public class Main {

	public static void main(String[] args) {
		NoteService noteService = new NoteService();
		noteService.run();
		

	}

}
