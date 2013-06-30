package gef.tutorial.step.model;

import java.util.ArrayList;
import java.util.List;

public class ContentsModel extends AbstractModel{
	private List children=new ArrayList();//子模型列表
	// 定义下面的字符串用于标识该模型中结构（Children）改变 
	  public static final String P_CHILDREN = "_children"; 
	/**
	 * 添加子模型
	 * @param child
	 */
	public void addChild(Object child){
		this.children.add(child);
		 // 添加子模型后通知 EditPart 
	      firePropertyChange(P_CHILDREN, null, null); 
	}
	/**
	 * 获得子模型
	 * @return
	 */
	public List getChildren() {
		return children;
	}
	  // 删除一个子模型 
	  public void removeChild(Object child) { 
	        // 删除一个子模型 
	        children.remove(child); 
	        // 删除子模型后通知 EditPart 
	        firePropertyChange(P_CHILDREN, null, null); 
	 } 
}
