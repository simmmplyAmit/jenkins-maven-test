package com.simpleapps.SpringMvc.controller;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

	private String firstName;
	private String lastName;
	private int age;
	private String country;
	private Map<String, String> countryOptions;
	private String favouriteLanguage;
	private Map<String,String> languageOptions;
	private String[] operatingSystems;
	private Map<String,String> operatingSystemOptions;
	
	public Student() {
		super();
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("IN", "India");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("US", "United States of America");
		languageOptions = new LinkedHashMap<String, String>();
		languageOptions.put("Java", "Java");
		languageOptions.put("C#", "C#");
		languageOptions.put("Kotlin", "Kotlin");
		operatingSystemOptions = new LinkedHashMap<String, String>();
		operatingSystemOptions.put("Mac", "Mac");
		operatingSystemOptions.put("Linux", "Linux");
		operatingSystemOptions.put("Raspberry", "Raspberry");
	}
	
	public Map<String, String> getOperatingSystemOptions() {
		return operatingSystemOptions;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public Map<String, String> getLanguageOptions() {
		return languageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", country=" + country
				+ ", favouriteLanguage=" + favouriteLanguage + "]";
	}
	
}
