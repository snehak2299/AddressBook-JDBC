package com.bridglab.addressbooktest;

import java.sql.Connection;

import org.junit.Test;

import com.bridglab.addressbook.AddressBookService;

public class AddressBookServiceTest {
	@Test
    public void checkConnectionIsestablished_orNot() {
        Connection dbConnection=new AddressBookService().getConnection();
        System.out.println(dbConnection);
    }
	@Test
    public void givenEmployeePayrollInDb_WhenRetrieved_ShouldMatchEmployeeCount() {
        AddressBookService addressBookService=new AddressBookService();
        addressBookService.readData();
    }
	@Test
    public void updateFirstName_whenCoreectQueryWritten() {
        AddressBookService addressBookService=new AddressBookService();
        addressBookService.updateAddressBookDataUsingStatement("deepika","dipika");
    }
	 @Test
	    public void showEntries_AddedBetween_mentionedDateRange(){
	        AddressBookService addressBookService=new AddressBookService();
	        addressBookService.showEntriesBetweenStartdateToMantionedDate("2016-01-01","2020-12-01");
	    }
	 @Test
	    public void showContacts_ByCity_whereCityNameIsMentioned(){
	        AddressBookService addressBookService=new AddressBookService();
	        addressBookService.retrieveDataByCity("kalyan");
	    } 
	 @Test
	    public void showContacts_ByState_whereStateNameIsMentioned(){
	        AddressBookService addressBookService=new AddressBookService();
	        addressBookService.retrieveDataByState("US");
	    } 
}
