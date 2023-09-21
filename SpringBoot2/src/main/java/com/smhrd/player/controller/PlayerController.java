package com.smhrd.player.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.player.service.PlayerService;

@RestController // 리액트 서버로 데이터만 응답
@CrossOrigin("http://localhost:3000/") // aws : 서버주소 변경
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	// select * from player;
	@RequestMapping("/PlayerList.do")
	public JSONArray PlayerList() {
		System.out.println("Spring : PlayerList.do");
		// 리액트 서버로 json데이터 응답
		return playerService.PlayerList();
	}
	
	@RequestMapping("/PlayerDetail.do")
	public JSONObject PlayerDetail(@RequestParam String name) {
		System.out.println("이름 : "+name);
		
		// DB에서 나상호의 정보만 가지고와서 리액트로 전송
		// JsonObject -> put메소드 활용
		
		JSONObject player = playerService.PlayerDetail(name);
		
		return player;
	}
	
	

}
