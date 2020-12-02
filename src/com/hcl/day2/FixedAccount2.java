package com.hcl.day2;

public class FixedAccount2 extends SavingAccount2 {
	private int lockingPeriod;

	public int getLockingPeriod() {
		return lockingPeriod;
	}

	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}
}
