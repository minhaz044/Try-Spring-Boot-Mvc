package com.services;

import java.awt.List;
import java.util.ArrayList;

public class RestBody<T> extends RestAbstract {
	public ArrayList<T> data=new ArrayList<>();
	private static RestBody instance=null;
	public static<N> RestBody getRestBody() {
		if(instance==null) {
			instance=new RestBody<N>();
		}
		return instance;
	};

}
