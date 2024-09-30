package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pInfo")
public class PersonInfo {
	
	//injecting simple values collected from the properties file to spring bean properties
	
	@Value("${person.name}")
	private String name;
	@Value("${person.addrs}")
	private String address;
	@Value("${person.age}")
	private int age;
	
	//injeting system property values colleced to the spring bean perop
	
	@Value("${os.name}")
	private String osName;
	@Value("${os.version}")
	private float osVersion;
	
	//injecting wnv variables to the spring bean properties
	
	@Value("${Path}")
	private String pathData;
	
	@Override
	public String toString() {
		return "PersonInfo [name="+name+",address="+address+", age="+age+", osName="+osName+
				",osVersion="+osVersion+",pathData="+pathData+"]";
	}
	

}
