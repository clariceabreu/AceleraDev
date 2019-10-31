//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class People {
    private String name;
    private Date birthday;
    private float height;
    private int age;

    public People(){
    	getData();
    }
    
    public People(String name, int age, float height){
    	this.name = name;
    	this.age = age;
    	this.height = height;
    }

    public void printPersonalData() {
        System.out.println("Nome: " + this.name);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data de nascimento: " + format.format(this.birthday));
        System.out.println("Altura: " + this.height);
        getAge();
    }
    
    public void getData() {
    	Scanner sc = new Scanner(System.in);
    	
		System.out.println("Digite seu nome:");
		this.name = sc.nextLine();
		
		try {
			System.out.println("Digite sua data de nascimento:");
			String birthday = sc.nextLine();
            if (birthday.length() != 10) throw new Exception();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            this.birthday = format.parse(birthday);
            System.out.println("Digite sua altura:");
			this.height = sc.nextFloat();
			printPersonalData();
        } catch (Exception e) {
            System.out.println("Data no formato inválido, a data deve ser inserida no seguinte formato 'dd/mm/yyyy'");
        }
    }

    public void calculateAge() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.birthday);
        int year = calendar.get(1);
        int month = calendar.get(2) + 1;
        int date = calendar.get(5);
        LocalDate l1 = LocalDate.of(year, month, date);
        LocalDate now1 = LocalDate.now();
        Period diff1 = Period.between(l1, now1);
        this.age = diff1.getYears();
        System.out.println("Idade: " + diff1.getYears() + " anos");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
		this.age = age;
	}
    
    public int getAge() {
    	return this.age;
    }

	public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}