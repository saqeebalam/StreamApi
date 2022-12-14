package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entity.Employees;

public class Company {
	public static void main(String[] args) {
		List<Employees> employee=new ArrayList<>();
		Employees e1=new Employees(21,10000,"ABC");
		Employees e2=new Employees(25,12000,"PQR");
		Employees e3=new Employees(27,16000,"xyz");
		Employees e4=new Employees(20,11000,"DEF");
		Employees e5=new Employees(28,19000,"MNO");
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		System.out.println("Before increment= "+employee);
		List<Employees> collect = employee.stream().map(e->
		{
			if(e.getAge()>=25) {
				e.setSalary(e.getSalary()*1.10);
			}
			return e;
		}).collect(Collectors.toList());
		
		System.out.println("After increment= "+collect);
	}

}
