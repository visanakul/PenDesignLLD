package com.lld.pen.model;

import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class BallPen extends RefillPen {
	@Override
	public void write() {
		System.out.println("Writing using BallPen");
	}

	@Override
	public PenType getType() {
		return PenType.BALL_PEN;
	}

	@Override
	public List<String> getTargetUsers() {
		return Arrays.asList("Students","Office Workers","Field Workers");
	}

	@Override
	public List<String> getUsages() {
		return Arrays.asList("Note-taking","Journaling","Score Keeping");
	}
	
}
