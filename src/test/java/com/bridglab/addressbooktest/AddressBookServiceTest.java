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
}
