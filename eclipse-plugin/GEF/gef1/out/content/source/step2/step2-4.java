package gef.tutorial.step.ui;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IPersistableElement;

public class DiagramEditorInput implements IPathEditorInput {
	private IPath path;
	public DiagramEditorInput(Path path) {
		this.path=path;
	}

	@Override 
	public boolean exists() {
		return path.toFile().exists();
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return path.toString();
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return path.toString();
	}

	@Override
	public Object getAdapter(Class arg0) {
		return null;
	}

	@Override
	public IPath getPath() {
		return path;
	}

}
