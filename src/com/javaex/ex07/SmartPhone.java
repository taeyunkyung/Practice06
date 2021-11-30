package com.javaex.ex07;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {

		if ("앱".equals(str)) {
			openApp();
		} else if ("음악".equals(str)) {
			playMusic(); // protected
		} else {
			super.execute(str);
		}

	}

	private void openApp() { // or public
		System.out.println("앱실행");
	}
	
	protected void playMusic() { // or public
		System.out.println("다운로드해서 음악재생");
	}

	// public void execute(String str)
	// private void call()
	// protected void playMusic()
}
