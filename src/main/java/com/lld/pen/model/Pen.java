package com.lld.pen.model;

import java.util.List;

import lombok.Data;

@Data
public abstract class Pen {
	private Long id;
	private String brandName;
	private String description;
	private List<PenColor> availableColors;
	private int price;
	private int lenght;
	private int diameter;
	private ClosingType closingType;
	private int dryingTime;
	private int writingPressure;
	abstract public void write();
	abstract public PenType getType();
	abstract public List<String> getTargetUsers();
	abstract public List<String> getUsages();
}
