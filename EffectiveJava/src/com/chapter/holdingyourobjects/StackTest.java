package com.chapter.holdingyourobjects;
import java.util.*;
import static com.chapter.everythingisanobject.Print.*;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for(String s : "My dog has fleas".split(" "))
			stack.push(s);
		while(!stack.empty())
			println(stack.pop());
	}

}
