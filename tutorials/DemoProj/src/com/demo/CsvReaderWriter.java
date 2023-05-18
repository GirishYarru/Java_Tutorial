package com.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderWriter {

	public static void main(String[] args) {
		String inputCSVFile = "C:\\TestCsv\\User.csv";
		List<User> users = createUsers(); // create users

		writeCsv(inputCSVFile, users); // write all created users to csv

		int displayUsers = 2;
		List<User> limitedUsers = readCsv(inputCSVFile, displayUsers); // read only required number of users

		String outputCSVFile = "C:\\TestCsv\\finalResult.csv";
		writeCsv(outputCSVFile, limitedUsers); // write required noOfUsers to csv

	}

	private static List<User> createUsers() {
		List<User> users = new ArrayList<User>();

		// create demo Users
		User user = new User();
		user.setUserReferenceNumber("");
		user.setCustomerNumber("");
		user.setMobileNumber("");
		user.setEmail("");
		user.setStatus("");
		user.setVKYCDate("");
		user.setCIF("");
		user.setAccount("");
		users.add(user);

		User user0 = new User();
		user0.setUserReferenceNumber("8945");
		user0.setCustomerNumber("Vkyc-126");
		user0.setMobileNumber("987654210");
		user0.setEmail("demo@gmail.com");
		user0.setStatus("Failed");
		user0.setVKYCDate("13/7/5201");
		user0.setCIF("SUCC");
		user0.setAccount("jjj");
		users.add(user0);

		User user1 = new User();
		user1.setUserReferenceNumber("8945");
		user1.setCustomerNumber("Vkyc-126");
		user1.setMobileNumber("987654210");
		user1.setEmail("demo@gmail.com");
		user1.setStatus("Failed");
		user1.setVKYCDate("13/7/5201");
		user1.setCIF("SUCC");
		user1.setAccount("ESS");
		users.add(user1);

		User user2 = new User();
		user2.setUserReferenceNumber("1451");
		user2.setCustomerNumber("Vkyc-43");
		user2.setMobileNumber("6958471212");
		user2.setEmail("sudha@mail.com.com");
		user2.setStatus("Transaction Completed");
		user2.setVKYCDate("13/02/2023");
		user2.setCIF("A");
		user2.setAccount("C");
		users.add(user2);

		User user3 = new User();
		user3.setUserReferenceNumber("6984");
		user3.setCustomerNumber("Vkyc-045");
		user3.setMobileNumber("4567891234");
		user3.setEmail("Sanosh@gmail.com");
		user3.setStatus("Pending");
		user3.setVKYCDate("38/07/1998");
		user3.setCIF("D");
		user3.setAccount("E");
		users.add(user3);

		User user4 = new User();
		user4.setUserReferenceNumber("1");
		user4.setCustomerNumber("Vkyc-98");
		user4.setMobileNumber("");
		user4.setEmail("sanday@gmail.com");
		user4.setStatus("Done");
		user4.setVKYCDate("1/8/1669");
		user4.setCIF("H");
		user4.setAccount("I");
		users.add(user4);
		return users;
	}

	public static void writeCsv(String filePath, List<User> users) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filePath);

			fileWriter.append("ReferenceNumber,CustomerNumber,MobileNumber,Email,Status,VKYCDate,CIF,Account\n");
			for (User u : users) {
				fileWriter.append(u.getUserReferenceNumber());
				fileWriter.append(",");
				fileWriter.append(u.getCustomerNumber());
				fileWriter.append(",");
				fileWriter.append(u.getMobileNumber());
				fileWriter.append(",");
				fileWriter.append(u.getEmail());
				fileWriter.append(",");
				fileWriter.append(u.getStatus());
				fileWriter.append(",");
				fileWriter.append(u.getVKYCDate());
				fileWriter.append(",");
				fileWriter.append(u.getCIF());
				fileWriter.append(",");
				fileWriter.append(u.getAccount());
				fileWriter.append("\n");

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static List<User> readCsv(String filePath, int noOfUsersToBeDisplayed) {
		BufferedReader reader = null;
		int count = 0;
		List<User> users = new ArrayList<User>();

		try {
			String line = "";
			reader = new BufferedReader(new FileReader(filePath));
			reader.readLine();

			while ((line = reader.readLine()) != null) {
				if (count == noOfUsersToBeDisplayed) {
					break;
				}
				String[] fields = line.split(",");

				if (fields.length > 0) {
					User user = new User();
					user.setUserReferenceNumber(fields[0]);
					user.setCustomerNumber(fields[1]);
					user.setMobileNumber(fields[2]);
					user.setEmail(fields[3]);
					user.setStatus(fields[4]);
					user.setVKYCDate(fields[5]);
					user.setCIF(fields[6]);
					user.setAccount(fields[7]);
					users.add(user);
					count++;

				}
			}

			for (User u : users) {

				System.out.println(u.getUserReferenceNumber());
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return users;

	}
}