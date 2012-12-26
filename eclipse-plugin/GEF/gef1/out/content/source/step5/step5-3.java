package gef.tutorial.step.parts;

import gef.tutorial.step.model.HelloModel;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.ui.parts.GraphicalEditor;

public class HelloEditorPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		HelloModel model=(HelloModel)this.getModel();
		Label label = new Label();
		label.setText(model.getText());
		//边框
		label.setBorder(new CompoundBorder(new LineBorder(),
				new MarginBorder(3)));
		//背景颜色
		label.setBackgroundColor(ColorConstants.orange);
		//不透明
		label.setOpaque(true);

		return label;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void refreshVisuals() {
		Rectangle constraint=((HelloModel)this.getModel()).getConstraint();
		((GraphicalEditPart)getParent()).setLayoutConstraint(this, this.getFigure(), constraint);
	}

}
