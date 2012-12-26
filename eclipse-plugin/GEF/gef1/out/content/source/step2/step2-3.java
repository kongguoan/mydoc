package gef.tutorial.step;

import gef.tutorial.step.actions.DiagramAction;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	private IWorkbenchAction about;
	private IWorkbenchAction exit;
	private IWorkbenchAction diagram;
	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	protected void makeActions(IWorkbenchWindow window) {
		about=ActionFactory.ABOUT.create(window);
		exit=ActionFactory.QUIT.create(window);
		diagram=new DiagramAction(window);
		register(about);
		register(exit);
		register(diagram);
	}

	protected void fillMenuBar(IMenuManager menuBar) {
		MenuManager fileMenu=new MenuManager("&File", "File");
		fileMenu.add(diagram);
		fileMenu.add(new Separator());
		fileMenu.add(exit);
		MenuManager helpMenu=new MenuManager("&Help", "Help");
		helpMenu.add(about);
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
	}

}
