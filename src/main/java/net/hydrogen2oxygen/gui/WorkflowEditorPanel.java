package net.hydrogen2oxygen.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

import net.hydrogen2oxygen.workflow.components.Node;
import net.hydrogen2oxygen.workflow.components.WorkflowData;

public class WorkflowEditorPanel extends PanelWithMouseBasicListener {

	private static final long serialVersionUID = 5088301968312597163L;

	private WorkflowData workflowData = new WorkflowData();

	public WorkflowEditorPanel() {

		setBackground(new Color(100, 100, 100));
		setDoubleBuffered(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.WHITE);
		g.drawString(getMouse().toString(), 10, 10);

		if (getMouse().isClicked()) {
			g.drawRect(getMouse().getX(), getMouse().getY(), 50, 50);

			if (checkIfMouseInsideNode() != null) {
				insertNode();
			}
		}

		g.setColor(Color.BLUE);

		for (Node node : workflowData.getNodes()) {

			g.fillRect(node.getX(), node.getY(), 50, 50);
		}
	}

	private Node checkIfMouseInsideNode() {

		for (Node node : workflowData.getNodes()) {

			Rectangle rect = new Rectangle(node.getX(), node.getY(), 50, 50);
			Point p1 = new Point(getMouse().getX(), getMouse().getY());
			Point p2 = new Point(getMouse().getX() + 50, getMouse().getY());
			Point p3 = new Point(getMouse().getX(), getMouse().getY() + 50);

			if (rect.contains(p1)) {
				return node;
			}

			if (rect.contains(p2)) {
				return node;
			}

			if (rect.contains(p3)) {
				return node;
			}
		}

		return null;
	}

	private void insertNode() {
		Node node = new Node();
		node.setX(getMouse().getX());
		node.setY(getMouse().getY());
		workflowData.getNodes().add(node);
	}

}