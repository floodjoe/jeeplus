/**
 * Copyright &copy; 2015-2020 <a href="--版权信息--">JeePlus</a> All rights reserved.
 */
package com.jeeplus.modules.test.entity.onetomany;

import com.jeeplus.modules.sys.entity.Area;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.jeeplus.common.persistence.DataEntity;
import com.jeeplus.common.utils.excel.annotation.ExcelField;

/**
 * 票务代理Entity
 * @author liugf
 * @version 2016-01-15
 */
public class TestDataChild2 extends DataEntity<TestDataChild2> {
	
	private static final long serialVersionUID = 1L;
	private Area start;		// 出发地
	private Area end;		// 目的地
	private Double price;		// 价格
	private TestDataMain testDataMain;		// 外键 父类
	
	public TestDataChild2() {
		super();
	}

	public TestDataChild2(String id){
		super(id);
	}

	public TestDataChild2(TestDataMain testDataMain){
		this.testDataMain = testDataMain;
	}

	@NotNull(message="出发地不能为空")
	@ExcelField(title="出发地", fieldType=Area.class, value="start.name", align=2, sort=1)
	public Area getStart() {
		return start;
	}

	public void setStart(Area start) {
		this.start = start;
	}
	
	@NotNull(message="目的地不能为空")
	@ExcelField(title="目的地", fieldType=Area.class, value="end.name", align=2, sort=2)
	public Area getEnd() {
		return end;
	}

	public void setEnd(Area end) {
		this.end = end;
	}
	
	@ExcelField(title="价格", align=2, sort=3)
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Length(min=1, max=64, message="外键长度必须介于 1 和 64 之间")
	public TestDataMain getTestDataMain() {
		return testDataMain;
	}

	public void setTestDataMain(TestDataMain testDataMain) {
		this.testDataMain = testDataMain;
	}
	
}