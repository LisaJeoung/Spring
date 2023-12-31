package com.service.spring.model.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.service.spring.domain.DiscountCalendar;
import com.service.spring.model.DiscountCalendarDAO;
import com.service.spring.model.DiscountCalendarService;



@Service
public class DiscountCalendarServiceImpl implements DiscountCalendarService {
	
	@Autowired
	private DiscountCalendarDAO discountCalendarDAO;

	@Override
	public List<DiscountCalendar> getDiscountCalendar() throws Exception {
		return discountCalendarDAO.getDiscountCalendar();
	}

	@Transactional
	@Override
	public int registerGeneralDiscountCalendar(DiscountCalendar discountcalendar) throws Exception {
		return discountCalendarDAO.registerGeneralDiscountCalendar(discountcalendar);
	}

	@Override
	public int registerBusinessDiscountCalendar(DiscountCalendar discountcalendar) throws Exception {
		return discountCalendarDAO.registerBusinessDiscountCalendar(discountcalendar);
	}

	@Override
	public int updateDiscountCalender(DiscountCalendar discountcalendar) throws Exception {
		return discountCalendarDAO.updateDiscountCalendar(discountcalendar);
	}

	@Override
	public int updateBusinessDiscountCalendar(DiscountCalendar discountcalendar) throws Exception {
		return discountCalendarDAO.updateBusinessDiscountCalendar(discountcalendar);
	}

	@Override
	public int discountCalendarWarn(Long discountSeq) throws Exception {
		return 0;
	}

	@Override
	public int deleteDiscountCalendar(Long discountSeq) throws Exception {
		return discountCalendarDAO.deleteDiscountCalendar(discountSeq);
	}

	@Override
	public DiscountCalendar getDiscountCalendarbySeq(long discountSeq) throws Exception {
		return discountCalendarDAO.getDiscountCalendarbySeq(discountSeq);
	}

	@Override
	public int updateCalendarLike(DiscountCalendar discountcalendar) throws Exception {
		return discountCalendarDAO.updateCalendarLike(discountcalendar);
	}

	@Override
	public List<DiscountCalendar> getDiscountCalendarByDate(String date) throws Exception {
		return discountCalendarDAO.getDiscountCalendarByDate(date);
	}
}
