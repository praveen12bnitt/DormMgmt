package com.smartworks.dorm.exportimport;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.smartworks.dummy.TAddress;
import com.smartworks.dummy.TDataList;
import com.smartworks.dummy.TEmployee;

public class DataExporter {
	
	static Properties dataClassMapping =
			   null;
	
	static {
		try {
			dataClassMapping = new Properties();
			URL url = ClassLoader.getSystemClassLoader().getSystemResource("dataClassMapping.properties");
			dataClassMapping.load(url.openStream());
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void exportData(
			String transactionName
			) throws Exception {
		
		String fileName="d:/data.out";
		TDataList employeeList = createDummyData();
		final FileOutputStream file = new FileOutputStream(fileName);
        final PrintStream printer = new PrintStream(file);

        Marshaller marshaller = prepareMarshaller(fileName, getDataClass(transactionName));

        printer.println("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
        //for(TEmployee employee: employeeList) {
			marshaller.marshal(employeeList, file);
		//}
		
		file.close();
		printer.close();
	}
	
	
	public static TDataList importData(
			String transactionName
			) throws Exception {
		
		String fileName="d:/data.out";
		
		Unmarshaller unMarshaller = prepareUnMarshaller(getDataClass(transactionName));
		TDataList tdataList = (TDataList)unMarshaller.unmarshal(new File("d:/data.out"));
		return tdataList;
	}
	
	
	private static Marshaller prepareMarshaller(final String fileName, Class exportClass) throws Exception
    {
        final JAXBContext jaxbContext = JAXBContext.newInstance(exportClass);
        final Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);

        return marshaller;
    }
	
	
	private static Unmarshaller prepareUnMarshaller(Class importClass) throws Exception
    {
        final JAXBContext jaxbContext = JAXBContext.newInstance(importClass);
        final Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();
        return unMarshaller;
    }
	
	private static Class getDataClass(String transactionName) throws ClassNotFoundException{
		//return Class.forName(dataClassMapping.getProperty(transactionName));
		return Class.forName("com.smartworks.dummy.TDataList");
	}
	
	private static TDataList createDummyData() {
		TDataList dataList = new TDataList();
		List<TEmployee> employeeList = new ArrayList<TEmployee>();
		for(int j=1;j<=100;j++) {
			TEmployee employee = new TEmployee();
			employee.setEmployeeId(j);
			employee.setFirstName("FIRSTNAME"+j);
			employee.setLastName("LASTNAME"+j);
			employee.setPosition("ENGINEER");
			employee.setSalary("100000");
			List<TAddress> addressList = new ArrayList<TAddress>();
			
			for(int k=1;k<=3;k++) {
				TAddress address = new TAddress();
				address.setAddressTypeId(k);
				address.setStreetName("STREETNAME"+k);
				address.setCity("CITY"+k);
				address.setState("STATE"+k);
				address.setZipCode("ZIPCODE"+k);
				address.setCountry("COUNTRY"+k);
				addressList.add(address);
			}
			employee.setAddressList(addressList);
			employeeList.add(employee);
			
		}
		dataList.setListObjects(employeeList);
		return dataList;
	}
	
}
