package com.service.spring.model;

import java.util.List;

import com.service.spring.domain.DCMypick;

public interface DCMypickDAO {
	int insertDCMypick(DCMypick dCMypick) throws Exception;

	int updateUsedPick(DCMypick dCMypick) throws Exception;

	int deleteDCMypick(DCMypick dCMypick) throws Exception;

	List<DCMypick> getDCMypick(String generalId) throws Exception;

	List<DCMypick> getDCMypickUsed(String generalId) throws Exception;
}
