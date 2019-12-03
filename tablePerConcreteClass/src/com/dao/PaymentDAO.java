package com.dao;

import com.model.Cheque;
import com.model.CreditCard;

public interface PaymentDAO {
	void saveCreditCard(CreditCard card);

	void saveCheque(Cheque cheque);

}
