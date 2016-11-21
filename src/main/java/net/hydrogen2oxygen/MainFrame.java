package net.hydrogen2oxygen;

import javax.swing.JFrame;

import net.hydrogen2oxygen.gui.WorkflowEditorPanel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = -1814974182310306489L;

	public MainFrame() {

		setTitle("Workflow Editor Demo");
		setVisible(true);
		setBounds(100, 100, 1200, 800);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(new WorkflowEditorPanel());
	}
}