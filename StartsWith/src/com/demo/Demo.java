package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11,99,74,773,89,73);
		List<String> newList=list.stream().map(S->S+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
        System.out.println(newList);
	}

}
