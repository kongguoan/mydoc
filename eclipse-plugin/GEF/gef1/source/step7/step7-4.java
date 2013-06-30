package gef.tutorial.step.commands;

import gef.tutorial.step.model.HelloModel;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

public class ChangeConstraintCommand extends Command {

	private HelloModel helloModel;

	private Rectangle constraint;
	//以前的位置
	private Rectangle oldConstraint;

	@Override
	public void execute() {
		helloModel.setConstraint(constraint);
	}

	public void setModel(Object model) {
		this.helloModel = (HelloModel) model;
		//记住以前的位置
		oldConstraint = helloModel.getConstraint();
	}

	public void setConstraint(Rectangle constraint) {
		this.constraint = constraint;
	}

	@Override
	public void undo() {
		//重新回到以前的位置
		helloModel.setConstraint(oldConstraint);
	}

}
