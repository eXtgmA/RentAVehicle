package de.marvin.kuenkler;

import de.marvin.kuenkler.model.*;
import de.marvin.kuenkler.repository.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RentAVehicleApplicationTests {

	@Autowired
	private BookinghistoryDao bookinghistory;
	@Autowired
	private CustomerDao customer;
	@Autowired
	private DrivingLicenseDao drivingLicense;
	@Autowired
	private LicenseClassDao licenseClass;
	@Autowired
	private VehicleDao vehicle;

	@Test
	public void contextLoads() {

	}

	@Test
	public void allDatabaseReadAndWrite() {
		// create a new entry in bookinghistory
		bookinghistory.save(new Bookinghistory("WVWZZZ1JZ3W386752", 1L, new Date(), new Date(), 12L, 15L));
		// create a new entry in customer
		customer.save(new Customer("Muster", "Marvin", "0865215", new Date(), "1245780976431"));
		// create a new entry in drivingLicense
		drivingLicense.save(new DrivingLicense("1245780976431", new Date(), "paar Infos und so"));
		// create a new licenseClass
		licenseClass.save(new LicenseClass("B"));
		// create a new entry in vehicle
		vehicle.save(new Vehicle("WVWZZZ1JZ3W386752", "Volkswagen", "Golf", 300L, 500L, "auto", 1L, 1L, 15L, new Date()));

		// Print all bookinghistory entries
		System.out.println("\n--------------------\nBOOKINGHISTORY\n--------------------\n");
		for(Bookinghistory bh : bookinghistory.findAll()) {
			System.out.println(bh.toString());
		}
		// Print all customers entries
		System.out.println("\n--------------------\nCUSTOMER\n--------------------\n");

		for(Customer c : customer.findAll()) {
			System.out.println(c.toString());
		}
		// Print all drivingLicense entries
		System.out.println("\n--------------------\nDRIVINGLICENSE\n--------------------\n");
		for(DrivingLicense dl : drivingLicense.findAll()) {
			System.out.println(dl.toString());
		}
		// Print all licenseClass entries
		System.out.println("\n--------------------\nLICENSECLASS\n--------------------\n");
		for(LicenseClass lc : licenseClass.findAll()) {
			System.out.println(lc.toString());
		}
		// Print all vehicle entries
		System.out.println("\n--------------------\nVEHICLE\n--------------------\n");
		for(Vehicle v : vehicle.findAll()) {
			System.out.println(v.toString());
		}

		// Löscht alle Einträge in bookinghistory
		bookinghistory.deleteAll();
		// Löscht alle Einträge in customer
		customer.deleteAll();
		// Löscht alle Einträge in drivingLicense
		drivingLicense.deleteAll();
		// Löscht alle Einträge in licenseClass
		licenseClass.deleteAll();
		// Löscht alle Einträge in vehicle
		vehicle.deleteAll();
	}

}
