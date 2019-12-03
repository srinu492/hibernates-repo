package com.test;

import java.util.Date;

import com.dao.PaymentDAO;
import com.dao.PaymentDAOImpl;
import com.model.Cheque;
import com.model.CreditCard;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentDAO dao = new PaymentDAOImpl();
		CreditCard card = new CreditCard();
		card.setAmount(30000);
		card.setPaymentDate(new Date());
		card.setCardNumber(89123);
		card.setCardType("visa");
		dao.saveCreditCard(card);
		Cheque cheque = new Cheque();
		cheque.setAmount(40000);
		cheque.setPaymentDate(new Date());
		cheque.setChequeNumber(98123);
		cheque.setChequeType("ICICI");
		dao.saveCheque(cheque);
	}

}
