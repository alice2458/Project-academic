package org.user.entity;

public class User {
	
	private String name;
	private String sex;
	private int age;
	private String phone;
	private String email;
	private String graduated_school;
	private String company;
	private String CSDN_add;
	private String password;
	
	public User(){
		
	}
	
	/**
     * @param name
     * @param sex
     * @param age
     * @param phone
     * @param email
     * @param graduated_school
     * @param company
     * @param CSDN_add
     * @param password
     */
	
	public User(String name,String sex,int age,String phone,String email,String graduated_school,String company,String CSDN_add)
	{
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.graduated_school = graduated_school;
		this.company = company;
		this.CSDN_add = CSDN_add;
		this.password = password;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSex()
	{
		return sex;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age =  age;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getGraduated_school()
	{
		return graduated_school;
	}
	public void setGraduated_school(String graduated_school)
	{
		this.graduated_school = graduated_school;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company = company;
	}
	public String getCSDN_add()
	{
		return CSDN_add;
	}
	public void setCSDN_add(String CSDN_add)
	{
		this.CSDN_add = CSDN_add;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	@Override
    public String toString()
    {
		return "personal [name=" + name + ", sex=" + sex + ", age=" + age + ", phone=" + phone + ", email=" + email + ", graduated_school" + graduated_school + ", company" + company + ", CSDN_add" + CSDN_add + ", password" + password + "]";
    }


}
