// pre-assessment 
// Jorge M. Magno
//BSIT 2A
import java.util.*;




public class Main {
  
    
    
  
   public static void main(String args[]){

	     int num;
	   String name,pt,em;
      Scanner sc=new Scanner(System.in);
       
        List<Details> c=new ArrayList<Details>();
        Iterator<Details> b=c.iterator();
     
      int i=1;
      
      while(i!=0){
      
       
       System.out.println("A.For Add");
              System.out.println("B.For View");
                System.out.println("C.For Edit");
                  System.out.println("D.For Delete");
                    System.out.println("E.For Report");
                    System.out.println("F. For Exit");
                    char r='o';
      System.out.print("Please Enter :");
      r=sc.next().charAt(0);
      
      switch(Character.toUpperCase(r)){
          
          case 'C':
       System.out.println("------------------------------------------");
              b=c.iterator();
              
              boolean fall=false;
              
           
              ListIterator<Details> de=c.listIterator();
		    	
              System.out.print("Please Enter The Name of the Device To Update :");
              name=sc.next();
		    	
		    	while(de.hasNext()) {
		    		Details e=de.next();
		    		if(e.Name().equalsIgnoreCase(name)) {
		    			
		    			System.out.print("Enter Barcode :");
            	        num =sc.nextInt();
            	        System.out.print("Enter New Name :");
            	        name=sc.next();
            	       System.out.print("Enter New Peripheral Type : ");
            	      pt=sc.nextLine();
            	      sc.nextLine();
            	       System.out.print("Enter New Employee Name : ");
            	        em=sc.nextLine();			
	        			  
	        			de.set(new Details(num,name,pt,em));
	        			  fall=true;
	        			  
		    		}
		    		
		    		
		    	}
		    			 
		    	System.out.println("================================================");	
		    			 
		    			  if(!fall) {
		   				   System.out.println("Please Try Again!!1");
		   			   }else {
		   				   System.out.println("Update Successfuly!!!!!!");	
		   				System.out.println("================================================");	
					 
		 }
				 
				   
   
            
              break;
              
          case 'A':
      System.out.print("Enter Barcode :");
        num =sc.nextInt();
        System.out.print("Enter Name :");
        name=sc.next();
       System.out.print("Enter Peripheral Type  :");
      pt=sc.nextLine();
      sc.nextLine();
       System.out.print("Enter Employee Name :");
        em=sc.nextLine();
      
        c.add(new Details(num,name,pt,em));
        
       
              break;
          case 'B':
        	   
        	  
        	  
                     System.out.println("================================================");       
            	b=c.iterator();	 
                	  while(b.hasNext()) {
                		  System.out.println("-----------------------------------------------------");
                		  System.out.println(b.next().Intro());
                		  System.out.println("-----------------------------------------------------");
                		  System.out.println("======================================================");    
                	  }
                	  
                	  System.out.println("================================================");    
                  String not[]= {"mouse,keyborad,printer,projector"};
                  
                  for(String nots:not) {
                	  System.out.println(nots);
                  }
                	  System.out.println("================================================");   
                	  
                	  System.out.println("================================================"); 
                	  
                	  String yes[]= {"barcode reader","game controller","speaker"};
                	  for(String yess:yes) {
                		  System.out.println(yess);
                	  }
                	  
                	  System.out.println("================================================"); 
                	  
                	  System.out.println("================================================"); 
                	  b=c.iterator();
                	  while(b.hasNext()) {
                		  System.out.println(b.next().Em());
                	  }
                	  System.out.println("================================================"); 
                	  
                	  
            
              break;
          case 'D':
         
        	  System.out.print("Enter Barcode :  ");
	    	   num=sc.nextInt();
	    	    fall=false;
	    	   b=c.iterator();
	    	   
	    	   while(b.hasNext()) {
	    		   Details e=b.next();
	    		  
	    		   if(e.Num()==num) {
	    			   b.remove();
	    			   fall = true;   
	    		   }
	    	   }
	    	   System.out.println("------------------------------------------------");	
	    	   if(!fall)System.out.println("Try Again");
	              else System.out.println(" Deleted Successfully..!");
	    	   System.out.println("-------------------------------------------------");	
        	  
        	  
               
              break;
              
          case 'E':
              System.out.println("---------------------------------------------------------");
        while(b.hasNext()) {
        	System.out.println(b.next().Intro());
        }
                        
              
    
              
              System.out.println("---------------------------------------------------------");
              break;
              
          case 'F':
        	  System.out.println("Thank You The Program Is Exit!!!!!!!!!!!!");
        	
        	  break;
              
          default:
              System.out.println("---------------------------------------------------------");
        
              System.out.println("Maybe You Enter a Wrong choice.!!!");
              i=0;
              System.out.println("---------------------------------------------------------");
              break;
              
         
                      
          
      }
          
          }
                      
              }
      }
abstract class  Peripheral{
	
	public abstract void Intro();
	
}
class Details{
	private int num;
	private String name,pt,em;
	
	
	
	Details(int num,String name,String pt,String em){
		this.num=num;
		this.name=name;
		this.pt=pt;
		this.em=em;
	}
	
	public String Intro(){
		return "BarCod : "+num+"Name Of The Device : "+name+"Kind Of Peripheral : "+pt+"Employee Name : "+em;
	}
	public String Em() {
		return em;
	}
	public String Name() {
		return name;
	}
	public int Num() {
		return num;
	}
	
	
	
}