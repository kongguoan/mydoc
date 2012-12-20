package gef.tutorial.step.commands;

import gef.tutorial.step.model.ContentsModel;
import gef.tutorial.step.model.HelloModel;

import org.eclipse.gef.commands.Command;

public class CreateCommand extends Command {

	private ContentsModel contentsModel;

	private HelloModel helloModel;

	@Override
	public void execute() {
		contentsModel.addChild(helloModel);
	}

	public void setContentsModel(Object model) {
		contentsModel = (ContentsModel) model;
	}

	public void setHelloModel(Object model) {
		helloModel = (HelloModel) model;
	}

	@Override
	public void undo() {
		contentsModel.removeChild(helloModel);
	}

}
