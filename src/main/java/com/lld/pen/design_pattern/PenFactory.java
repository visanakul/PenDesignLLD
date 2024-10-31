package com.lld.pen.design_pattern;

import com.lld.pen.exception.PenTypeException;
import com.lld.pen.model.BallPen;
import com.lld.pen.model.FountainPen;
import com.lld.pen.model.GelPen;
import com.lld.pen.model.Pen;
import com.lld.pen.model.PenType;

public class PenFactory {
	public Pen createPen(String type) throws PenTypeException {
		PenType penType = PenType.valueOf(type);
		switch (penType) {
		case BALL_PEN:
			return new BallPen();
		case GEL_PEN:
			return new GelPen();
		case FOUNTAIN_PEN:
			return new FountainPen();
		default:
			throw new PenTypeException("Type does not exist");
		}
	}
}
