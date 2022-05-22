package com.instance.controllers;

import java.util.Date;
import java.util.Random;

public class Info {
	public String date;
	public int id;

	public Info(){
	}

	public void setId(){
		this.id = new Random().nextInt(0, 1000);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
