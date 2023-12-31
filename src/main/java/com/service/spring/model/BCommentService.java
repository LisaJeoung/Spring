package com.service.spring.model;

import java.util.List;

import com.service.spring.domain.BComment;

public interface BCommentService {
	int insertBComment(BComment pvo) throws Exception;

	List<BComment> getBComment() throws Exception;

	List<BComment> getBComment(long boardSeq) throws Exception;

	int updateBComment(BComment pvo) throws Exception;

	int deleteBComment(long commentSeq) throws Exception;

	BComment getBCommentbySeq(long commentSeq) throws Exception;
}
