package net.hydrogen2oxygen.workflow.components;

import lombok.Data;

@Data
public class Node {

	private boolean dragged;
	private int x, y;
	private String name;
	private String description;
	private String nodePicture;
	private String developerNotes;
}