package com.dao;

import com.model.Cheque;
import com.model.CreditCard;

public interface PaymentDAO {
	boolean saveCreditCard(CreditCard card);

	boolean saveCheque(Cheque cheque);
}
