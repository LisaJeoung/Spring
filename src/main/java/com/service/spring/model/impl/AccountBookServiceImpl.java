package com.service.spring.model.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.spring.domain.AccountBook;
import com.service.spring.model.AccountBookDAO;
import com.service.spring.model.AccountBookService;

@Service
public class AccountBookServiceImpl implements AccountBookService{

	@Autowired
	private AccountBookDAO accountBookDAO;

	@Override
	public List<AccountBook> getAccountBook(String generalId) throws Exception {
		return accountBookDAO.getAccountBook(generalId);
	}

	@Override
	public int registerAccountBook(AccountBook accountBook) throws Exception {
		return accountBookDAO.registerAccountBook(accountBook);
	}

	@Override
	public int updateAccountBook(AccountBook accountBook) throws Exception {
		return accountBookDAO.updateAccountBook(accountBook);
	}

	@Override
	public int shareAccountBook(AccountBook accountBook) throws Exception {
		return 0;
	}

	@Override
	public int deleteAccountBook(long accountBookSeq) throws Exception {
		return accountBookDAO.deleteAccountBook(accountBookSeq);
	}

	@Override
	public List<AccountBook> dailyAccountBook(String time) throws Exception {
		return accountBookDAO.dailyAccountBook(time);
	}
	
	@Override
	public List<Map<String, Object>> getStat(String generalId) throws Exception {
		return accountBookDAO.getStat(generalId);
	}

	@Override
	public List<AccountBook> personalDailyAccountBook(AccountBook accountBook) throws Exception {
		return accountBookDAO.personalDailyAccountBook(accountBook);
	}
	
	
	public long checkIsUsed(AccountBook accountBook) throws Exception {
		return accountBookDAO.checkIsUsed(accountBook);
	}

	@Override
	public int registerDiscountCalendarInfo(AccountBook accountBook) throws Exception {
		return accountBookDAO.registerDiscountCalendarInfo(accountBook);
	}

	@Override
	public long getMyTickle(String generalId) throws Exception {
		return accountBookDAO.getMyTickle(generalId);
	}

	
}
