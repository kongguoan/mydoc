package gef.tutorial.step.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Text;

public class CustomCellEditorLocator implements CellEditorLocator {
	/*Text 控件要处于 Figure 所在的为止 */
	private IFigure figure;

	public CustomCellEditorLocator(IFigure figure) {
		/*要在构造函数中得到为哪个 Figure 设置 Text 控件 */
		this.figure = figure;
	}

	public void relocate(CellEditor celleditor) {
		Text text = (Text) celleditor.getControl();
		/*Text 控件尺寸和 Figure 一样 */
		Rectangle rect = figure.getBounds().getCopy();
		figure.translateToAbsolute(rect);
		text.setBounds(rect.x, rect.y, rect.width, rect.height);

	}

}
