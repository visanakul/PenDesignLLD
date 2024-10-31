package com.lld.pen.model;

import lombok.Data;

@Data
abstract public class RefillPen extends Pen {
	private Ink ink;
	private RefillBall ball;
	private RefillTip tip;
}
