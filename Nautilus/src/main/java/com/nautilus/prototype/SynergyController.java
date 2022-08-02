package com.nautilus.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nautilus.vo.Champion;
import com.nautilus.vo.Classes;
import com.nautilus.vo.Origins;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/syn")
public class SynergyController {

	@Autowired
	private SynergyService synService;
	
	@GetMapping("hi")
	@ResponseBody
	public String test() {
		return "thymeleaf/saveCham";
	}
	
	@GetMapping("/show")
	public String show(Model model) {
		
		model.addAttribute("test",synService.test());
		return "thymeleaf/test";
	}
	
	@GetMapping("/champions")
	public String champions(Model model) {
		List<Champion> list = synService.getChamList();
		model.addAttribute("list",list);
		return "thymeleaf/championPage";
	}
	
	@GetMapping("/origins")
//	@ResponseBody
	public String origins(Model model) {
	
		List<Origins> oriList = synService.getOriginsList();
		Map<String,List<String>> map = new HashMap<>();
//		List<Champion> chamList = new ArrayList<>();
		
		for(int i=0;i<oriList.size();i++) {
			List<String> chamList = synService.getChamListByOrigin(oriList.get(i).getOriginName());
			map.put(oriList.get(i).getOriginName(), chamList);
		}
		
		model.addAttribute("map",map);
//		return map.toString();
		return "thymeleaf/origins";
	}
	
//	
//	@GetMapping("/classes")
//	//@ResponseBody
//	public String classes(Model model) {
//		
//		List<Classes> classList = synService.getClassesList();
//		Map<Classes,List<Champion>> map = new HashMap<>();
//		
//		for(int i=0;i<classList.size();i++) {
//			String className = classList.get(i).getClassName();
//			log.debug(className);
//			List<Champion> chamList = synService.getChamListByClass(className);
//			
//			map.put(classList.get(i), chamList);
//		}
//		model.addAttribute("map",map);
//		//return map.toString();
//		return "thymeleaf/origins";
//	}
}
