package gef.tutorial.step.parts;

import gef.tutorial.step.model.HelloModel;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class PartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part=this.getPartForElement(model);//获得控制器
		part.setModel(model);//连接模型和控制器
		return part;
	}

	/**
	 * 根据模型类型创建控制器
	 * @param model
	 * @return 控制器
	 */
	private EditPart getPartForElement(Object model) {
		if(model instanceof HelloModel){
			return new HelloEditorPart();
		}
		throw new RuntimeException("Can't create part for model element: "
				+ ((model != null) ? model.getClass().getName()
						: "null"));
	}

}
