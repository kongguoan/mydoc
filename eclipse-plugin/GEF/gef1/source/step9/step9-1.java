package gef.tutorial.step.parts;

import gef.tutorial.step.model.HelloModel;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.swt.widgets.Text;

public class CustomDirectEditManager extends DirectEditManager {

	private HelloModel helloModel; // 要修改该模型的文本属性

	public CustomDirectEditManager(GraphicalEditPart source, Class editorType,
			CellEditorLocator locator) {
		super(source, editorType, locator);
		// 获得 HelloModel 模型
		helloModel = (HelloModel) source.getModel();
	}

	@Override
	protected void initCellEditor() {
		// 在显示一个 cell editor 之前，先给它设置一个值
		// 这里的值是获得图形模型的文本
		getCellEditor().setValue(helloModel.getText());
		// 在所选中的 TextCellEditor 的 Text 控件中的所有文本都显示为选择状态
		Text text = (Text) getCellEditor().getControl();
		text.selectAll();
	}

}
