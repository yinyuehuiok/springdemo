package com.demo.service;

import java.util.List;

import com.demo.model.MessageModel;

public interface IndexService {

	List<MessageModel> list();

	boolean add(MessageModel message);

}
