package com.demo.util;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.MessageModel;

public class DataUtil {
	
	private static List<MessageModel> messageModels = new ArrayList<MessageModel>();
	
	public static void add(MessageModel messageModel){
		messageModels.add(messageModel);
	}
	
	public static List<MessageModel> list(){
		return messageModels;
	}

}
