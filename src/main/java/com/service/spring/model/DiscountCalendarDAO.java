package com.service.spring.model;

import java.util.List;

import com.service.spring.domain.DiscountCalendar;

public interface DiscountCalendarDAO {
	
	List<DiscountCalendar> getDiscountCalendar() throws Exception; // 전체 달력 조회
	
	int registerGeneralDiscountCalendar(DiscountCalendar discountcalendar) throws Exception; // 일반 회원 할인 달력 등록
	
	int registerBusinessDiscountCalendar(DiscountCalendar discountcalendar) throws Exception; // 사업자 회원 할인 달력 등록
	
	int updateDiscountCalendar(DiscountCalendar discountcalendar) throws Exception;
	int updateBusinessDiscountCalendar(DiscountCalendar discountcalendar) throws Exception;
	
	int discountCalendarWarn(Long discountSeq) throws Exception; // 신고
	
	int deleteDiscountCalendar(Long discountSeq) throws Exception; // 달력 삭제

	DiscountCalendar getDiscountCalendarbySeq(long discountSeq) throws Exception; 
	
	// 좋아요 수 변화
	int updateCalendarLike(DiscountCalendar discountcalendar) throws Exception;
	
	// 해당날짜 할인정보
	List<DiscountCalendar> getDiscountCalendarByDate(String date) throws Exception;
	
//	List<DiscountCalendar> getAllDiscountCalenderAdmin(DiscountCalendar discountcalendar) throws Exception; // 전체 신고 내역
//	
//	int getDetailDiscountCalenderAdmin(DiscountCalendar discountcalendar) throws Exception; // 신고 내용
}