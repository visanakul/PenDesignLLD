package com.lld.pen.model;

import java.util.Arrays;
import java.util.List;

public class GelPen extends RefillPen {
	@Override
	public void write() {
		System.out.println("Writing using GelPen");
	}

	@Override
	public PenType getType() {
		return PenType.GEL_PEN;
	}

	@Override
	public List<String> getTargetUsers() {
		return Arrays.asList("Artists and Illustrators", "Bullet Journalers and Planners", "Calligraphy and Lettering Enthusiasts");
	}

	@Override
	public List<String> getUsages() {
		return Arrays.asList("Art and Illustration", "Lettering and Calligraphy", "Greeting Cards and Invitations");
	}
}
