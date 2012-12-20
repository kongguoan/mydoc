package gef.tutorial.step.parts;

import gef.tutorial.step.model.HelloModel;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class HelloEditorPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		HelloModel model=(HelloModel)this.getModel();
		Label label=new Label();
		label.setText(model.getText());
		return label;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

}
