package gef.tutorial.step.model;

import org.eclipse.draw2d.geometry.Rectangle;

public class HelloModel   extends AbstractModel{
	public static final String PROP_CONSTRAINT = "CONSTRAINT";
	private String text="hello word";
	private Rectangle constraint;//约束
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	
	}

	public Rectangle getConstraint() {
		return constraint;
	}

	public void setConstraint(Rectangle constraint) {
		this.constraint = constraint;
			//通知
		firePropertyChange(PROP_CONSTRAINT, null, constraint);
	}
	
}
