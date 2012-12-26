package gef.tutorial.step.actions;

import gef.tutorial.step.Activator;
import gef.tutorial.step.Application;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class DiagramAction extends Action implements ISelectionListener,IWorkbenchAction {
	private final IWorkbenchWindow window;
	public final static String ID="gef.tutorial.step.actions.DiagramAction";
	@Override
	public void selectionChanged(IWorkbenchPart arg0, ISelection arg1) {

	}
	public DiagramAction(IWorkbenchWindow window) {
		super();
		this.window = window;
		this.setId(ID);//添加id
		this.setText("&Diagram");
		this.setToolTipText("Draw the GEF diagram.");
		this.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/alt_window_16.gif"));
		window.getSelectionService().addSelectionListener(this);
	}
	@Override
	public void dispose() {
		window.getSelectionService().removeSelectionListener(this);
		
	}

}
