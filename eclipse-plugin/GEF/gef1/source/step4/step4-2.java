package gef.tutorial.step.parts;

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
		// TODO Auto-generated method stub

	}

}
