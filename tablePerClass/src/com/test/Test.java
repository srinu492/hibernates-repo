package com.test;

import java.util.Date;

import com.dao.PaymentDAO;
import com.dao.PaymentDAOImpl;
import com.model.Cheque;
import com.model.CreditCard;
import com.model.Payment;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentDAO dao = new PaymentDAOImpl();
		CreditCard card = new CreditCard();
		card.setAmount(70000);
		card.setPaymentDate(new Date());
		card.setCardNumber(949598);
		card.setCardType("MASTER");
		boolean flag = dao.saveCreditCard(card);
		if (flag == true) {
			System.out.println("card details are saved");
		} else {
			System.out.println("does't saved");
		}
     Cheque cheque=new Cheque();
     cheque.setAmount(50000);
     cheque.setPaymentDate(new Date());
     cheque.setChequeNumber(501879);
     cheque.setChequeType("order");
     boolean flag2=dao.saveCheque(cheque);
     if (flag2 == true) {
			System.out.println("cheque details are saved");
		} else {
			System.out.println("does't saved");
		}
	}

}
