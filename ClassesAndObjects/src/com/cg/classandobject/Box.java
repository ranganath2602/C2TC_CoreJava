package com.cg.classandobject;

class Box {
	double dblWidth;
	double dblHeight;
	double dblDepth;
	
	public Box() {
		super();
	}

	public Box(double dblWidth, double dblHeight, double dblDepth) {
		super();
		this.dblWidth = dblWidth;
		this.dblHeight = dblHeight;
		this.dblDepth = dblDepth;
	}
	
	double calcVolume() {
		return dblWidth * dblHeight * dblDepth;
	}

	public double getDblWidth() {
		return dblWidth;
	}

	public void setDblWidth(double dblWidth) {
		this.dblWidth = dblWidth;
	}

	public double getDblHeight() {
		return dblHeight;
	}

	public void setDblHeight(double dblHeight) {
		this.dblHeight = dblHeight;
	}

	public double getDblDepth() {
		return dblDepth;
	}

	public void setDblDepth(double dblDepth) {
		this.dblDepth = dblDepth;
	}

}
