package com.xworkz.camera.dao;

import com.xworkz.camera.dto.CameraDTO;

public abstract class CameraDAO {
	
   private CameraDTO[] cameradtos=new CameraDTO[5];
   
   protected  CameraDAO()
   {
	   System.out.println("Invoking default constructor from the CameraDAO");
   }
	
   
   public CameraDTO[] getcameraDTOs(){
	return cameradtos;
	   
   }
   
   
   public abstract boolean save(CameraDTO dto);
   
   
   public abstract boolean findDuplicate(CameraDTO cameraDTO);
   
   
   public abstract CameraDTO findById(int id);
   
   public abstract CameraDTO findByMaxCost();
   
   
   public abstract CameraDTO findByMinCost();
   
   
   
   
   

}
