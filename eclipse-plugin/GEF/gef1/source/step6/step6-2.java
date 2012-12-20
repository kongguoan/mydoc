package gef.tutorial.step.commands;

import gef.tutorial.step.model.HelloModel;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

public class ChangeConstraintCommand extends Command {

	private HelloModel helloModel;

	private Rectangle constraint;


	@Override
	public void execute() {
		helloModel.setConstraint(constraint);
	}

	public void setModel(Object model) {
		this.helloModel = (HelloModel) model;
	}

	public void setConstraint(Rectangle constraint) {
		this.constraint = constraint;
	}

	

}
