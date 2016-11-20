package net.hydrogen2oxygen.workflow;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class WorkflowEditorPanel extends JPanel implements MouseInputListener {

	private static final long serialVersionUID = 5088301968312597163L;

	private int x, y;

	public WorkflowEditorPanel() {
		setBackground(new Color(100, 100, 100));
		addMouseListener(this);
		addMouseMotionListener(this);
		setDoubleBuffered(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.WHITE);

		g.drawString(x + "," + y, 10, 10);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent mouseEvent) {
		x = mouseEvent.getX();
		y = mouseEvent.getY();
		repaint();
	}

}
