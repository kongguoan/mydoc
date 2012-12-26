package gef.tutorial.step.commands;

import gef.tutorial.step.model.ContentsModel;
import gef.tutorial.step.model.HelloModel;

import org.eclipse.gef.commands.Command;

public class DeleteCommand extends Command {

	private ContentsModel contentsModel;

	private HelloModel helloModel;

	@Override
	public void execute() {
		//删除模型
		contentsModel.removeChild(helloModel);
	}

	public void setContentsModel(Object model) {
		contentsModel = (ContentsModel) model;
	}

	public void setHelloModel(Object model) {
		helloModel = (HelloModel) model;
	}

	@Override
	public void undo() {
		contentsModel.addChild(helloModel);
	}

}
