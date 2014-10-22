package com.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.aop.LogAnnotation;
import com.demo.aop.OperateLogEnum;
import com.demo.model.MessageModel;
import com.demo.service.IndexService;
import com.demo.util.DataUtil;

public class IndexServiceImpl implements IndexService {

	@Override
	public List<MessageModel> list() {
		return DataUtil.list();
	}

	@Override
	@LogAnnotation(desc="添加一条记录",type=OperateLogEnum.ADD,passport="yujifang")
	public boolean add(MessageModel message) {
		System.out.println("service添加记录");
		DataUtil.add(message);
		return true;
	}

}
