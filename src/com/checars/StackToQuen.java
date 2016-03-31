package com.checars;

import java.util.Stack;

public class StackToQuen {

	Stack<String> stackA = new Stack<String>();
	Stack<String> stackB = new Stack<String>();
	
	public void pushString(String item){
		stackA.push(item);
	}
	
	public void popString(){
		if(stackB.isEmpty()){
			while(stackA.size()>0){
				String item = stackA.pop();
				stackB.push(item);
			}
		}
		System.out.println(stackB.pop());
	}
	
	public int size(){
		return stackA.size() + stackB.size();
	}
}
