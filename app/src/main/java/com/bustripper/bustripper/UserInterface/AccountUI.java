package com.bustripper.bustripper.UserInterface;

public class AccountUI{
	private String username;

	public AccountUI(String username){
		this.username = username;
	}

	/*
	* This method will be called when the user taps on the account settings icon.
	* Then displays user's account information.
	*/
	public void showAccountPage(){}


	/*
	* This method will be called when the user taps on 'Change Password' button.
	* Then prompt for user's inputs within the class:
	* - old password
	* - new password
	* - confirm new password
	*/
	public void showChangePasswordPage(){}


	/*
	* This method will be called when the user taps on 'Change Notification Settings' button.
	*/
	public void showNotificationPage(){}


	/*
	* This method will be called when the user taps on the arrival time toggle button on the UI.
	*/
	public void setArrivalTimeStatus(){}


	/*
	* This method will be called to capture the user's new input for arrival time notification.
	*/
	public void setArrivalTime(){}


	/*
	This method will be called when the user taps on the alighting distance toggle button on the UI.
	*/
	public void setAlightDistStatus(){}


	/*
	* This method will be called to capture the user's new input for alighting distance notification.
	*/
	public void setAlightDist(){}	
}