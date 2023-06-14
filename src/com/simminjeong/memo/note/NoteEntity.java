package com.simminjeong.memo.note;

import java.time.LocalDateTime;

public class NoteEntity {

	private String title;
	private String content;
	private LocalDateTime lastUpdatedDatetime;

	public NoteEntity(String title, String content) {
		this.title = title;
		this.content = content;
		this.lastUpdatedDatetime = LocalDateTime.now();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getLastUpdatedDatetime() {
		return lastUpdatedDatetime;
	}

	public void setLastUpdatedDatetime(LocalDateTime lastUpdatedDatetime) {
		this.lastUpdatedDatetime = lastUpdatedDatetime;
	}

	@Override
	public String toString() {
		return "NoteEntity [title=" + title + ", content=" + content + ", lastUpdatedDatetime=" + lastUpdatedDatetime
				+ "]";
	}

}
