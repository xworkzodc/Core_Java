package com.xworkz.interfaces.runner;
import com.xworkz.interfaces.CustomRuleImplementor;
import com.xworkz.interfaces.CustomCheckInTimeRule;
import com.xworkz.interfaces.CustomGoodsRule;
import com.xworkz.interfaces.CustomRule;
public class InterfaceRunner {
	
	public static void main(String[] args) {
 
	CustomRule rules=new CustomCheckInTimeRule();
	
	boolean timeCheck=rules.baggageCheckin();
    boolean  checkTime=rules.validPassport();
    String  bookTickets=rules.bookedTickets();
    
    System.out.println(timeCheck);
    System.out.println(checkTime);
    System.out.println(bookTickets);
    
    
    CustomCheckInTimeRule customRules= (CustomCheckInTimeRule)rules;
    
    boolean checktime=customRules.baggageCheckin();
    System.out.println(checktime);
    
    customRules.baggageCheckin();
    customRules.bookedTickets();
    customRules.validPassport();
    
    CustomGoodsRule goodsRule=new CustomCheckInTimeRule();
    goodsRule.nonvalidItems();
    
    
    String[] refernce=goodsRule.validItems();
   System.out.println(refernce);

	
	
}

}
