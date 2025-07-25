package org.mtr.core.data;

public enum RouteType {
	NORMAL, LIGHT_RAIL, METRO, INTERCITY, HIGH_SPEED;

	public RouteType next() {
		return values()[(ordinal() + 1) % values().length];
	}
}
