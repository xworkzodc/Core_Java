package com.xworkz.iplteam;
import com.xworkz.iplteam.dto.IplTeamDTO;
import com.xworkz.iplteam.dao.IplDAO;
import com.xworkz.iplteam.dao.ImplTeamDAOImplementation;

class iplTeamRunner {
	
	public static void main(String[] args) {
		
		
		
		IplTeamDTO ipldto1=new IplTeamDTO();
		ipldto1.setName("NELLORE WARRIERS");
		ipldto1.setId(100);
		ipldto1.setCaptain("VIGNESH");
		ipldto1.setSponser("YS JAGAN CM OF ANDHRA");
		ipldto1.setNoOfLostMatch(5);
		ipldto1.setNoOfWins(10);
		
		IplTeamDTO ipldto2=new IplTeamDTO();
		ipldto2.setName("BANGLORE WARRIERS");
		ipldto2.setId(101);
		ipldto2.setCaptain("NEELESH");
		ipldto2.setSponser("BOMBAI CM OF ANDHRA");
		ipldto2.setNoOfLostMatch(5);
		ipldto2.setNoOfWins(11);
		
		
		IplTeamDTO ipldto3=new IplTeamDTO();
		ipldto3.setName("DELHI WARRIERS");
		ipldto3.setId(103);
		ipldto3.setCaptain("SUYOG");
		ipldto3.setSponser("SUYOG CM OF ANDHRA");
		ipldto3.setNoOfLostMatch(6);
		ipldto3.setNoOfWins(10);
		
		IplTeamDTO ipldto4=new IplTeamDTO();
		ipldto4.setName("XWORKZ WARRIERS");
		ipldto4.setId(104);
		ipldto4.setCaptain("OMKAR SIR");
		ipldto4.setSponser("BOMBAI CM OF ANDHRA");
		ipldto4.setNoOfLostMatch(5);
		ipldto4.setNoOfWins(12);
		
		
		IplTeamDTO ipldto5=new IplTeamDTO();
		ipldto5.setName("PUNE WARRIERS");
		ipldto5.setId(105);
		ipldto5.setCaptain("DHONI");
		ipldto5.setSponser(" XWORKZ");
		ipldto5.setNoOfLostMatch(9);
		ipldto5.setNoOfWins(19);
		
		IplTeamDTO ipldto6=new IplTeamDTO();
		ipldto6.setName("MAHARASTRA WARRIERS");
		ipldto6.setId(105);
		ipldto6.setCaptain("SUYOG");
		ipldto6.setSponser("ANJALI");
		ipldto6.setNoOfLostMatch(6);
		ipldto6.setNoOfWins(18);
		
		
		IplTeamDTO ipldto7=new IplTeamDTO();
		ipldto7.setName("MALAYALAM WARRIERS");
		ipldto7.setId(107);
		ipldto7.setCaptain("HIMESH YADHAV");
		ipldto7.setSponser("LG");
		ipldto7.setNoOfLostMatch(6);
		ipldto7.setNoOfWins(17);
		
		
		IplTeamDTO ipldto8=new IplTeamDTO();
		ipldto8.setName("PUNJAB RIDERS");
		ipldto8.setId(108);
		ipldto8.setCaptain("VIRAT");
		ipldto8.setSponser("SAMSUNG");
		ipldto8.setNoOfLostMatch(6);
		ipldto8.setNoOfWins(17);
		
		
		IplTeamDTO ipldto9=new IplTeamDTO();
		ipldto9.setName("PUNE BUILDERS ");
		ipldto9.setId(109);
		ipldto9.setCaptain("SACHIN");
		ipldto9.setSponser("HYNDAI");
		ipldto9.setNoOfLostMatch(4);
		ipldto9.setNoOfWins(12);
		
		IplTeamDTO ipldto10=new IplTeamDTO();
		ipldto10.setName("NELLORE DARLINGS");
		ipldto10.setId(110);
		ipldto10.setCaptain("VICKY");
	    ipldto10.setSponser("HP");
		ipldto10.setNoOfLostMatch(5);
		ipldto10.setNoOfWins(11);
		
		IplTeamDTO ipldto11=new IplTeamDTO();
		ipldto11.setName("arjun");
		ipldto11.setId(111);
		ipldto11.setCaptain("RANDEV");
		ipldto11.setSponser(" CM OF ANDHRA");
		ipldto11.setNoOfLostMatch(3);
		ipldto11.setNoOfWins(1);
		
		
		IplTeamDTO ipldto12=new IplTeamDTO();
		ipldto12.setName("XWORKZ WARRIERS");
		ipldto12.setId(104);
		ipldto12.setCaptain("OMKAR SIR");
		ipldto12.setSponser("BOMBAI CM OF ANDHRA");
		ipldto12.setNoOfLostMatch(5);
		ipldto12.setNoOfWins(12);
		
		IplTeamDTO ipldto13=new IplTeamDTO();
		ipldto13.setName("SNEHA");
		ipldto13.setId(113);
		ipldto13.setCaptain("VIGNESH");
		ipldto13.setSponser(" CM OF GOA");
		ipldto13.setNoOfLostMatch(6);
		ipldto13.setNoOfWins(16);
		
		IplTeamDTO ipldto14=new IplTeamDTO();
		ipldto14.setName("LADY WARRIERS");
		ipldto14.setId(104);
		ipldto14.setCaptain("AFREEN");
		ipldto14.setSponser(" CM OF DELHI");
		ipldto14.setNoOfLostMatch(2);
		ipldto14.setNoOfWins(14);
		
		IplTeamDTO ipldto15=new IplTeamDTO();
		ipldto15.setName("AKSHARAKANTH");
		ipldto15.setId(115);
		ipldto15.setCaptain("VINAYAK");
		ipldto15.setSponser("BOMBAICM OF ANDHRA");
		ipldto15.setNoOfLostMatch(5);
		ipldto15.setNoOfWins(15);
		
		
		
		
		
		
		IplDAO dao=new ImplTeamDAOImplementation();
		
		ImplTeamDAOImplementation castedDAO=(ImplTeamDAOImplementation)dao; //typecasting reference to childclass.
		
		
		
		castedDAO.IplTeamDTOfindByName("NELLORE WARRIERS");
				castedDAO.save(ipldto1);
				castedDAO.save(ipldto2);
				castedDAO.save(ipldto3);
				castedDAO.save(ipldto4);
				castedDAO.save(ipldto5);
				castedDAO.save(ipldto6);
				castedDAO.save(ipldto7);
				castedDAO.save(ipldto8);
				castedDAO.save(ipldto9);
				castedDAO.save(ipldto10);
				castedDAO.save(ipldto11);
				castedDAO.save(ipldto12);
				castedDAO.save(ipldto13);
				castedDAO.save(ipldto14);

				
				
				castedDAO.IplTeamDTOfindByName("SUYOG");
 			    castedDAO.IplTeamDTOfindByNameAndSponsor("arjun",  "CM OF ANDHRA");
 			   castedDAO.IplTeamDTOfindByNameAndSponsor("NELLORE WARRIERS"," VIGNESH", "YS JAGAN CM OF ANDHRA");

				castedDAO.gettotal();
				
				castedDAO.saveMultiple(ipldto15, ipldto15);
				castedDAO.updateSponsorByName("SRIVIGNESH", "OMKAR SIR");
		        castedDAO.saveMultiple(ipldto15, ipldto2);
		        castedDAO.updateCaptainByName("SRI VIGNESH","SRIVIGNESH");
		        castedDAO.updateSponsorByName("ANUSHKA", "SAINANEHWAL");
		
		
		
		
		
		
	}

}
