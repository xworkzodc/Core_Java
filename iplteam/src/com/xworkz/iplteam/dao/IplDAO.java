package com.xworkz.iplteam.dao;
import com.xworkz.iplteam.dto.IplTeamDTO;

public abstract  class IplDAO {
	
	
	protected IplTeamDTO[] ipldto=new IplTeamDTO[14];
	protected int index=0;
	
	public  void save(IplTeamDTO dto)
	{

		System.out.println("Created save dto");
		
		if(dto!=null  && index<this.ipldto.length) 
		{
			this.ipldto[index]=dto;
			index++;
			System.out.println("IplTeamDTO created sucessfully @"+dto);
			
			
		}
		
		
	}

	public IplTeamDTO[] getIpldto() {
		return ipldto;
	}

	
	

	
	

}
