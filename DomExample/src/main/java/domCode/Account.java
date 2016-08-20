package domCode;

import java.io.Serializable;

public class Account implements Serializable{

	private static final long serialVersionUID = -3070138913002276026L;
	
	private String accountName;
	private int accountOrganizationNumber;
	private String accountAddress1;
	private String accountAddress2;
	private String accountCity;
	private String accountCountry;
	private String accountProgramName;
	private float accountCreditLine;
	
	public Account(String accountName, int accountOrganizationNumber,
			String accountAddress1, String accountAddress2, String accountCity,
			String accountCountry, String accountProgramName,
			float accountCreditLine) {
		super();
		this.accountName = accountName;
		this.accountOrganizationNumber = accountOrganizationNumber;
		this.accountAddress1 = accountAddress1;
		this.accountAddress2 = accountAddress2;
		this.accountCity = accountCity;
		this.accountCountry = accountCountry;
		this.accountProgramName = accountProgramName;
		this.accountCreditLine = accountCreditLine;
	}

	public Account() {
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountOrganizationNumber() {
		return accountOrganizationNumber;
	}

	public void setAccountOrganizationNumber(int accountOrganizationNumber) {
		this.accountOrganizationNumber = accountOrganizationNumber;
	}

	public String getAccountAddress1() {
		return accountAddress1;
	}

	public void setAccountAddress1(String accountAddress1) {
		this.accountAddress1 = accountAddress1;
	}

	public String getAccountAddress2() {
		return accountAddress2;
	}

	public void setAccountAddress2(String accountAddress2) {
		this.accountAddress2 = accountAddress2;
	}

	public String getAccountCity() {
		return accountCity;
	}

	public void setAccountCity(String accountCity) {
		this.accountCity = accountCity;
	}

	public String getAccountCountry() {
		return accountCountry;
	}

	public void setAccountCountry(String accountCountry) {
		this.accountCountry = accountCountry;
	}

	public String getAccountProgramName() {
		return accountProgramName;
	}

	public void setAccountProgramName(String accountProgramName) {
		this.accountProgramName = accountProgramName;
	}

	public float getAccountCreditLine() {
		return accountCreditLine;
	}

	public void setAccountCreditLine(float accountCreditLine) {
		this.accountCreditLine = accountCreditLine;
	}

	@Override
	public String toString() {
		return "Account [accountName=" + accountName
				+ ", accountOrganizationNumber=" + accountOrganizationNumber
				+ ", accountAddress1=" + accountAddress1 + ", accountAddress2="
				+ accountAddress2 + ", accountCity=" + accountCity
				+ ", accountCountry=" + accountCountry
				+ ", accountProgramName=" + accountProgramName
				+ ", accountCreditLine=" + accountCreditLine + "]";
	}
	
	
}
