package com.lld.pen.model;

import java.util.List;

import lombok.Data;

@Data
public class Ink {
	private InkBase inkBase;
	private List<InkColor> availableColors;
	private int volume;
	private int viscocity;
	private List<String> ingredients;
	private String otherDetails;
}
