package net.hydrogen2oxygen.workflow.components;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class WorkflowData {

	private List<Node> nodes = new ArrayList<>();
}