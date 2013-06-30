package gef.tutorial.step.ui;

import gef.tutorial.step.model.ContentsModel;
import gef.tutorial.step.parts.PartFactory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.parts.GraphicalEditor;

public class DiagramEditor extends GraphicalEditor {
	public final static String ID = "gef.tutorial.step.ui.DiagramEditor";// 我们要加一个
		 																// ID用于标示这个																			// Editor

	@Override
	protected void initializeGraphicalViewer() {
		
		this.getGraphicalViewer().setContents(new ContentsModel());

	}

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		GraphicalViewer viewr;	
		viewr=this.getGraphicalViewer();
		viewr.setEditPartFactory(new PartFactory());
	}

	public DiagramEditor() {
		/*
		 * Editing domain管理命令堆栈 command stack、工具条 palette viewer 等。Editing
		 * domain还起通知在 Graphicalviewer 中生成的 SWT 事件的作用。因此，一定要建立一个 Editing
		 * domain。这里，在
		 * DiagramEditor的构造函数中使用setEditDomain()函数设置了一个org.eclipse.gef
		 * .DefaultEditDomain作为 Editing domain。我们要说明的是：虽然对 GEF来讲一个 Editing
		 * domain必须是设置成 Graphicalviewer （直白点说就是可画图的） ，因为我们的 DiagramEditor是从
		 * GraphicalEditor 派生的，所以这里的缺省的 Editing domain—DefaultEditDomain
		 * 其内在是被设置成 Graphicalviewer的。 说明：如果我们把 Graphicalviewer 放在 Editor 中时，我们使用
		 * DefaultEditDomain。如果把 Graphicalviewer放在View中或者放在一个独立的Eclipse应用中时，
		 * 我们要用org.eclipse.gef.EditDomain 作为 Editing domain。
		 */
		this.setEditDomain(new DefaultEditDomain(this));
	}

	@Override
	public void doSave(IProgressMonitor arg0) {
		// TODO Auto-generated method stub

	}

}
