package me.lagbug.emailer.global;

import jakarta.mail.internet.InternetAddress;

@SuppressWarnings("serial")
public class EmailAddress extends InternetAddress {

	public EmailAddress(String address) {
		super.setAddress(address);
		
		try {
			super.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
