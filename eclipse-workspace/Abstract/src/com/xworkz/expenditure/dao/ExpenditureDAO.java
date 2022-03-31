package com.xworkz.expenditure.dao;
import com.xworkz.expenditure.dto.ExpenditureDTO;

public class ExpenditureDAO {
	
	
	private ExpenditureDTO[] expenditureDTOs=new ExpenditureDTO[20];
	 private int expenditureIndex=0;
	
	public ExpenditureDAO() {


		System.out.println("Created"+this.getClass().getSimpleName());
	}

	public boolean create(ExpenditureDTO dto)
	{
		System.out.println("invoked created expenditure".concat(dto.toString()));
		
		if(expenditureIndex <this.expenditureDTOs.length) {
			this.expenditureDTOs[expenditureIndex]=dto;
			expenditureIndex++;
			System.out.println("Expenditure added @"+this.expenditureIndex);
			return true;
		}
		else {
			System.err.println("Expenditure Index is FULL");
		}
		
		
		
		return false;
	}

	
	
	
	
	
}
