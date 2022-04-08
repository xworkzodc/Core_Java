package com.xworkz.iplteam.dao;
import com.xworkz.iplteam.dto.IplTeamDTO;
import com.xworkz.iplteam.dao.IplDAO;

public class ImplTeamDAOImplementation  extends IplDAO{
	
	


	@Override
	public void save(IplTeamDTO dto) 
	{

		System.out.println("Created save dto");
		
		if(dto!=null && super.index<this.ipldto.length)
		{
			this.ipldto[super.index]=dto;
			super.index++;
			
			System.out.println("IplImplementationTeamDTO created sucessfully @"+super.index);
			
			
		}
		
		
	}
	
	
	
	
	
	public IplTeamDTO IplTeamDTOfindByName(String name)
	{
		IplTeamDTO[] arrayFromDTOParent=super.getIpldto();
		
		for(int count=0;count<arrayFromDTOParent.length;count++)
		{
			//IplTeamDTO tempDTO=arrayFromDTOParent[count];
			if(arrayFromDTOParent[count]!=null && arrayFromDTOParent[count].getCaptain()==(name))
			{
				System.out.println("Name is founded from dto @"+index);
				return ipldto[super.index];
			}
			else
			{
				System.out.println("Name is not found @"+index);
				return null;
			}
		}
		return null;
		
	}
	
	/*IplTeamDTO findByNameAndSponsor(String name,String sponsor)

IplTeamDTO findByNameAndSponsorAndCaptain(String name,String sponsor,String captain)

int total();*/
	
	
	
	public void IplTeamDTOfindByNameAndSponsor(String name,String sponsor)

	{
		IplTeamDTO[] arrayFromDTOParent=super.getIpldto();
		for(int count=0;count<arrayFromDTOParent.length;count++)
		{
			//IplTeamDTO tempDTO=arrayFromDTOParent[count];
			if(arrayFromDTOParent[count]!=null && arrayFromDTOParent[count].getCaptain()==(name) && arrayFromDTOParent[count].getSponser()==sponsor)
			{
				System.out.println("Name and sponser founded from dto @"+name+"sponser"+sponsor);
				return;
			}
			else
			{
				System.out.println("Name is not found @"+name+sponsor);
				return;
			}
		}
		return;
		

		
	}
	
	
	public void IplTeamDTOfindByNameAndSponsor(String name,String sponsor,String captain)

	{
		IplTeamDTO[] arrayFromDTOParent=super.getIpldto();
		for(int count=0;count<arrayFromDTOParent.length;count++)
		{
			//IplTeamDTO tempDTO=arrayFromDTOParent[count];
			if(arrayFromDTOParent[count]!=null
					&& arrayFromDTOParent[count].getCaptain()==(name) 
					&& arrayFromDTOParent[count].getSponser()==sponsor
					&& arrayFromDTOParent[count].getCaptain()==captain)
			{
				System.out.println("Name and sponser founded from dto === @"+name+"sponser"+sponsor+"captain"+captain);
				return;
			}
			else
			{
				System.out.println("Anything not found === @"+name+sponsor+captain);
				return;
			}
		}
		return;
		

		
	}
	
	
	public int gettotal()
	{
		int count=0;
		for(int index=0;index<ipldto.length;index++)
		{
			
			if(ipldto[index]!=null)
			{
				count++;
			}
			
			
		}

		System.out.println("Total number of dto is count"+count);
		
		return count;
		
		
		
	}
	
	
	public void saveMultiple(IplTeamDTO dto1,IplTeamDTO dto2)
 	{
    	 IplTeamDTO[] arrayFromParent=super.getIplTeamDTOs();
    	 int newIndex=super.getIplNewIndex();
 		if(dto1!=null )
 		{
 			arrayFromParent[newIndex]=dto1;
 			System.out.println(" dto is added to @"+newIndex);
 			newIndex++;
 			super.setIplNewIndex(newIndex);
 		}
 		
 		if(dto2!=null )
 		{
 			arrayFromParent[newIndex]=dto2;
 			System.out.println(" dto is added to @"+newIndex);
 			newIndex++;
 			super.setIplNewIndex(newIndex);
 		}
 		else
 		{
 			System.out.println("dtos are not found");
 		}
 		
 	}
 	

       
     public void updateSponsorByName(String Name,String Sponsor)
 	{
 		if( Name!=null && Sponsor!=null)
 		{
 			System.out.println("Running update by SponsorByName");
 		}
 			 IplTeamDTO[] arrayFromParent=super.getIplTeamDTOs();
 			for(int i=0;i<arrayFromParent.length;i++)
 			{
 				
 				if(arrayFromParent[i]!=null 
 						&& arrayFromParent[i].getName()!=null
 						&& arrayFromParent[i].getName().equals(Name))
 						{
 					arrayFromParent[i].setSponser(Sponsor);
 					System.out.println("Updated to"+i);
 					}
 			}
 			
 		
    
 	}
     
     
     public void updateCaptainByName(String Name,String Captain)
  	{
  		if( Name!=null && Captain!=null)
  		{
  			System.out.println("Running update by CaptainByName");
  		}
  			 IplTeamDTO[] arrayFromParent=super.getIplTeamDTOs();
  			for(int i=0;i<arrayFromParent.length;i++)
  			{
  				
  				if(arrayFromParent[i]!=null
  						&& arrayFromParent[i].getName()==null
  						&& arrayFromParent[i].getName().equals(Name))
  						{
  					arrayFromParent[i].setCaptain(Captain);
  					System.out.println("Updated to"+i);
  					}
  			}
  			
  		}
     
  	
}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

