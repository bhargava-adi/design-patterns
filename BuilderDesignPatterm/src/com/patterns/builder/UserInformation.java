package com.patterns.builder;

public class UserInformation {

	private int userId;

	private String userFirstName;

	private String userMiddleName;

	private String userLastName;

	private String userAddress;

	private String userEmail;

	private long userMobileNo;

	private long userAddPinCode;

	private int userAge;

	private UserInformation(UserInformationBuilder information) {
		this.userId = information.iUserId;
		this.userFirstName = information.iUserFirstName;
		this.userMiddleName = information.iUserMiddleName;
		this.userLastName = information.iUserLastName;
		this.userAddress = information.iUserAddress;
		this.userEmail = information.iUserEmail;
		this.userMobileNo = information.iUserMobileNo;
		this.userAddPinCode = information.iUserAddPinCode;
		this.userAge = information.iUserAge;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public String getUserMiddleName() {
		return userMiddleName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public long getUserMobileNo() {
		return userMobileNo;
	}

	public long getUserAddPinCode() {
		return userAddPinCode;
	}

	public int getUserAge() {
		return userAge;
	}

	public static class UserInformationBuilder {

		private int iUserId;

		private String iUserFirstName;

		private String iUserMiddleName;

		private String iUserLastName;

		private String iUserAddress;

		private String iUserEmail;

		private long iUserMobileNo;

		private long iUserAddPinCode;

		private int iUserAge;

		public UserInformationBuilder userId(int iUserId) {
			this.iUserId = iUserId;
			return this;
		}

		public UserInformationBuilder userFirstName(String iUserFirstName) {
			this.iUserFirstName = iUserFirstName;
			return this;
		}

		public UserInformationBuilder userMiddleName(String iUserMiddleName) {
			this.iUserMiddleName = iUserMiddleName;
			return this;
		}

		public UserInformationBuilder userLastName(String iUserLastName) {
			this.iUserLastName = iUserLastName;
			return this;
		}

		public UserInformationBuilder userAddress(String iUserAddress) {
			this.iUserAddress = iUserAddress;
			return this;
		}

		public UserInformationBuilder userEmail(String iUserEmail) {
			this.iUserEmail = iUserEmail;
			return this;
		}

		public UserInformationBuilder userMobileNo(long iUserMobileNo) {
			this.iUserMobileNo = iUserMobileNo;
			return this;
		}

		public UserInformationBuilder userAddPinCode(long iUserAddPinCode) {
			this.iUserAddPinCode = iUserAddPinCode;
			return this;
		}

		public UserInformationBuilder userAge(int iUserAge) {
			this.iUserAge = iUserAge;
			return this;
		}

		public UserInformation build() {
			return new UserInformation(this);
		}

	}
}