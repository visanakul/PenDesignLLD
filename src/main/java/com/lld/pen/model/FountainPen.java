package com.lld.pen.model;

import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class FountainPen extends Pen{
	private Nib nib;
	private Reservior reservior;
	@Override
	public void write() {
		System.out.println("Writing using Fountain Pen");
	}

	@Override
	public PenType getType() {
		return PenType.FOUNTAIN_PEN;
	}

	@Override
	public List<String> getTargetUsers() {
		return Arrays.asList("Professionals and Executives", "Authors and Writers", "Lawyers and Legal Professionals");
	}

	@Override
	public List<String> getUsages() {
		return Arrays.asList("Signatures", "Calligraphy and Hand Lettering", "Feedback and Grading");
	}
}
