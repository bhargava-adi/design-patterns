package com.patterns.builder;

public class UserBuildingMain {

	public static void main(String... args) {

		UserInformation userInformation1 = new UserInformation.UserInformationBuilder().build();
		System.out.println("Information of User ID : " + userInformation1.getUserId());
		System.out.println("Information of User Name : " + userInformation1.getUserFirstName());

		UserInformation userInformation2 = new UserInformation.UserInformationBuilder().userId(10).build();
		System.out.println("Information of User ID : " + userInformation2.getUserId());
		System.out.println("Information of User Name : " + userInformation2.getUserFirstName());

	}

}