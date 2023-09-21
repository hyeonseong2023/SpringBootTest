package com.smhrd.player.converter;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;

public class ImageToBase64 implements PlayerImageConverter<File, String> {

	// 이미지 파일을 byte문자열 형태로 변환할 때 base64(이미지 기본 인코딩)를 활용해서 인코딩하는 클래스
	@Override
	public String converte(File f) throws IOException {
		
		// 1. 파일 가져오기 -> commons-io 라이브러리
		// commons-io 라이브러리 : 파일, 디렉토리 조작, 입출력, 파일 필터링 등과 같은 기능을 제공
		
		// readFileToByteArray : 파일 가져와서 byte 배열 형태로 읽는 메소드
		// 픽셀을 byte로 변경, 픽셀이 여러개라서 배열 형태로 반환
		byte[] file = FileUtils.readFileToByteArray(f);
		
		// 2. byte배열 -> 문자열(base64로 인코딩)
		String result_file = Base64.getEncoder().encodeToString(file);
		
		return result_file;
	}
}
