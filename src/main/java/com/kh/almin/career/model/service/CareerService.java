package com.kh.almin.career.model.service;

import java.util.List;
import java.util.Map;

public interface CareerService {
	// ===================================================================================================================
		// 회원의 현재 근무지 정보를 가져오는 method
		public List<Map<String, String>> selectAllWork();
}
