package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.MessageModel;
import com.demo.service.IndexService;
import com.demo.vo.MessageVo;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	/*@Autowired
	private IndexService indexService;
	
	@RequestMapping("/index")
	public String index(ModelMap model){
		List<MessageModel> messages = indexService.list();
		List<MessageVo> messageLists = new ArrayList<MessageVo>();
		for(MessageModel message:messages){
			MessageVo vo = new MessageVo(message);
			messageLists.add(vo);
		}
		model.addAttribute("messageLists", messageLists);
		return "index";
	}
	
	@RequestMapping("/add")
	public String add(MessageModel message){
		if(indexService.add(message)){
			return "redirect:/index.do";
		}
		return "index";
	}*/

}
