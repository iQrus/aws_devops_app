package com.fullstack.devops.model;

import java.util.Comparator;

public class SortByPriority implements Comparator<User>  {

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getFirstname().compareTo(o2.getFirstname());
	}

}
