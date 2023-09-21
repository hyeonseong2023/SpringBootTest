package com.smhrd.player.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
	
	private String name;
	private String position;
	private int age;
	private int height;
	private int weight;
	private String team;
	private String imgSrc;

}
