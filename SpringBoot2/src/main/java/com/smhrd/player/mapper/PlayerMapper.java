package com.smhrd.player.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.player.entity.Player;

@Mapper
public interface PlayerMapper {

	public List<Player> PlayerList();

	public Player PlayerDetail(String name);

}
