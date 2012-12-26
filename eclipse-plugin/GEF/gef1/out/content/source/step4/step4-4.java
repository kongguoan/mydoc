package gef.tutorial.step.model;

import java.util.ArrayList;
import java.util.List;

public class ContentsModel {
	private List children=new ArrayList();//子模型列表
	/**
	 * 添加子模型
	 * @param child
	 */
	public void addChild(Object child){
		this.children.add(child);
	}
	/**
	 * 获得子模型
	 * @return
	 */
	public List getChildren() {
		return children;
	}

}
