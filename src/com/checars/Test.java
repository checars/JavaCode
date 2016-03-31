package com.checars;

public class Test {
public static void main(String[] args) {
	StackToQuen s = new StackToQuen();
	s.pushString("first");
	s.pushString("second");
	s.pushString("third");
	s.pushString("fourth");
	s.pushString("five");
	s.pushString("six");
	int size = s.size();
	for(int i = 0; i < size; i ++){
		s.popString();
	}
}
}
