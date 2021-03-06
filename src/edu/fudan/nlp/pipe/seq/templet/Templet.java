package edu.fudan.nlp.pipe.seq.templet;

import java.io.Serializable;

import edu.fudan.ml.types.Instance;
import edu.fudan.ml.types.alphabet.IFeatureAlphabet;
/**
 * 模板接口
 * @author xpqiu
 *
 */
public interface Templet extends Serializable{
	
	/**
	 * 返回该模板的阶
	 * @return 阶
	 */
	public int getOrder();
	
	/**
	 * 在给定实例的指定位置上抽取特征
	 * @param instance 给定实例
	 * @param pos 指定位置
	 * @param fv 特征向量
	 * @param numLabels 标签数量
	 * @throws Exception 
	 */
	public int generateAt( Instance instance,
							IFeatureAlphabet features,
							int pos,
							int ... numLabels ) throws Exception;

	public int[] getVars();
	
}
