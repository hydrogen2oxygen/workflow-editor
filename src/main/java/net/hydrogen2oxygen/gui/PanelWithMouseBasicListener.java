package net.hydrogen2oxygen.gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import lombok.Getter;

public class PanelWithMouseBasicListener extends JPanel implements MouseInputListener, MouseWheelListener {

	private static final long serialVersionUID = 8439120682413939734L;

	@Getter
	protected final MouseData mouse = new MouseData();

	public PanelWithMouseBasicListener() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		mouseEvent(e.getX(), e.getY(), false, true, false, false, false, false, false);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		mouseEvent(e.getX(), e.getY(), true, false, false, false, false, false, false);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		mouseEvent(e.getX(), e.getY(), false, false, true, false, false, false, false);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		mouseEvent(e.getX(), e.getY(), false, false, false, true, false, false, false);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		mouseEvent(e.getX(), e.getY(), false, false, false, null, true, false, false);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		mouseEvent(e.getX(), e.getY(), false, false, false, null, false, true, false);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseEvent(e.getX(), e.getY(), false, false, false, null, false, false, true);
	}

	private void mouseEvent(int x, int y, Boolean entered, Boolean clicked, Boolean exited, Boolean pressed,
	        Boolean released, Boolean dragged, Boolean moved) {

		mouse.setX(x);
		mouse.setY(y);
		if (entered != null)
			mouse.setEntered(entered);
		if (clicked != null)
			mouse.setClicked(clicked);
		if (exited != null)
			mouse.setExited(exited);
		if (pressed != null)
			mouse.setPressed(pressed);
		if (released != null)
			mouse.setReleased(released);
		if (dragged != null)
			mouse.setDragged(dragged);
		if (moved != null)
			mouse.setMoved(moved);

		repaint();
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
	}
}
