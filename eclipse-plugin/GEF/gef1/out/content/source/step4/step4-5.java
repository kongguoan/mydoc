package gef.tutorial.step.parts;

import gef.tutorial.step.model.ContentsModel;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class ContentsEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		Layer layer=new Layer();
		return layer;
	}

	@Override
	protected void createEditPolicies() {

	}

	@Override
	protected List getModelChildren() {
		return ((ContentsModel)this.getModel()).getChildren();
	}

}
