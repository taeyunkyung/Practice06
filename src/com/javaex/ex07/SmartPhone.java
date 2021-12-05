package com.javaex.ex07;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {

		if ("앱".equals(str)) {
			openApp();
		} 
		// else if ("음악".equals(str)) {playMusic();} execute(str) MusicPhone에서 오버리아딩
		else {
			super.execute(str);
		}

	}

	private void openApp() { 
		System.out.println("앱실행");
	}
	
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}

	// public void execute(String str)
	// private void call()
	// protected void playMusic()
}
