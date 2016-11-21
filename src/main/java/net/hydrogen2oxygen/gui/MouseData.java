package net.hydrogen2oxygen.gui;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MouseData {

	private int x, y;
	private boolean entered;
	private boolean clicked;
	private boolean exited;
	private boolean pressed;
	private boolean released;
	private boolean dragged;
	private boolean moved;

}
