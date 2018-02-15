package com.pattern.interpreter;

public class Context {

	public String source;
	
	public char vocabulary;
	
	public boolean result;
	
	public int position;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public char getVocabulary() {
		return vocabulary;
	}

	public void setVocabulary(char vocabulary) {
		this.vocabulary = vocabulary;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
}
