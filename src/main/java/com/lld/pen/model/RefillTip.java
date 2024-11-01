package com.lld.pen.model;

import lombok.Data;

@Data
public class RefillTip {
	private int length;
	private int diameter;
	private String material;
	private TipShape shape;
}
