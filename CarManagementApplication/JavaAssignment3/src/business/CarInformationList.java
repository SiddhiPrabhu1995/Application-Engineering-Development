/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Siddhi
 */
public class CarInformationList {
    
   public static ArrayList<Car> carList; //changed from private to public static
   private ArrayList<Car> carSearch;
   private ArrayList<Car> carUnavailable;
   private ArrayList<Car> list = new ArrayList<Car>();
   private ArrayList<Car> firstAvailcar;
   private ArrayList<Car> expireCert;
   private ArrayList<Car> searchcriteriaList;   
   private ArrayList<Car> searchByBrand;
   private ArrayList<Car> searchByCondition;
   private ArrayList<Car> searchMinMaxSeats;
   ArrayList<Car> availList = new ArrayList<Car>();
   
   private static Date date = new Date();

    public static Date getDate() {
        return date;
    }

    public static void setDate(Date date) {
        CarInformationList.date = date;
    }
   
   //public static ArrayList<Car> searchListCarManu;

    /*public  static ArrayList<Car> getSearchListCarManu() {
      return carList;
    }

    public void setSearchListCarManu(ArrayList<Car> searchListCarManu) {
        this.searchListCarManu = searchListCarManu;
    }
   */
   private ArrayList<Car> searchLastUpdatedItem;

    
    public void setSearchLastUpdatedItem(ArrayList<Car> searchLastUpdatedItem) {
        this.searchLastUpdatedItem = searchLastUpdatedItem;
    }

   
    
    

    public void setSearchMinMaxSeats(ArrayList<Car> searchMinMaxSeats) {
        this.searchMinMaxSeats = searchMinMaxSeats;
    }

    
    public void setSearchByCondition(ArrayList<Car> searchByCondition) {
        this.searchByCondition = searchByCondition;
    }
   
    public void setSearchcriteriaList(ArrayList<Car> searchcriteriaList) {
        this.searchcriteriaList = searchcriteriaList;
    }

   
    public void setExpireCert(ArrayList<Car> expireCert) {
        this.expireCert = expireCert;
    }
    

   
    public void setFirstAvailcar(ArrayList<Car> firstAvailcar) {
        this.firstAvailcar = firstAvailcar;
    }

   

    public void setCarUnavailable(ArrayList<Car> carUnavailable) {
        this.carUnavailable = carUnavailable;
    }

    
   
   
   public CarInformationList()
   {    //Allocate memory to the Array List to avoid NULL pointer exception
       this.carList = new ArrayList<Car>();
       this.carSearch = new ArrayList<>();
       
   
   }

    public ArrayList<Car> getCarList() { // Converted to static method
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
   
   public void createCar(Car car)
   {
       
       carList.add(car);
       
       
   }
    
   public void deleteCar(Car car)
   {
       carList.remove(car);
   
   }
   
   //Search By City
   public ArrayList<Car> getcarList(String city)
   {    
       //list.clear() to clear the list beacause if we don't clear data from previous city gets added on 
       list.clear();
       for(Car car:this.getCarList())
       {
       if(car.getAvailble_city().equalsIgnoreCase(city))
       {
           list.add(car);
       }
       
       
       }
       return list;
   }
   
   //Search by Brand Name
   public ArrayList<Car> getSearchcriteriaList(String branName) {
        
      
        list.clear();
       for(Car car:this.getCarList())
       {
       if(car.getBrand().equalsIgnoreCase(branName))
       {
           list.add(car);
       }else if(car.getModel_num().equals(branName))
       {
        list.add(car);
       
       }
      
       
       }
       
      
       return list;
    }
   
   //Search By Manufactured Year
   public ArrayList<Car> getSearchByManuSerial(int searchBy) {
        
       list.clear();
       for(Car car:this.getCarList())
       {
       if(car.getManufactured_year() == searchBy)
       {
           list.add(car);
       }
       else if (car.getSerial_num() == searchBy)
       {
        list.add(car);
       
       }
       
       }
       
      
       return list;
    }
   
   
   //Find last item with it's updated timestamp
   public ArrayList<Car> getSearchLastUpdatedItem() {
       
       
       
       return searchLastUpdatedItem;
    }

   
  
   //Check Available Cars from ArrayList within the selected city
   public ArrayList<Car> getCarSearch() {
        ArrayList<Car> availList = new ArrayList<Car>();
      //list.clear();
        for(Car car:this.list)
        {
        if(car.isAvailable() == true)
        {
        availList.add(car);
        
        }
        
        }
        return availList;
        
        
    }
   
   
   //Display car which have seats no more than max seats and no less than minimum seats
   
   public ArrayList<Car> getSearchMinMaxSeats(int minSeats, int maxSeats) {
   
       list.clear();
       for(Car car:this.getCarList())
        {
            
        if(car.getMin_seats()>= minSeats && car.getMax_seats()<= maxSeats)
        {
        list.add(car);
        
        }
        
        }
        return list;
        
    }
   
  


   //Check Unavailable Cars from ArrayList within the selected city
   public ArrayList<Car> getCarUnavailable() {
       //ArrayList<Car> availList = new ArrayList<Car>();
       //list.clear();
        for(Car car:this.list)
        {
        if(car.isAvailable() == false)
        {
        availList.add(car);
        
        }
        
        }
        return availList;
        
    }
   
   //Check for first available car within the selected city
    public ArrayList<Car> getFirstAvailcar() {
       ArrayList<Car> firstavailList = new ArrayList<Car>();
       
       for(Car car:this.list)
        {
        if(car.isAvailable() == true)
        {
        firstavailList.add(car);
        break;
        
        }
        
        }
        return firstavailList;
    }

    
    //Check for Expired Maintenance certificate within the selected city
     public ArrayList<Car> getExpireCert() {
       ArrayList<Car> expirecert = new ArrayList<Car>();
        for(Car car:this.list)
        {
        if(car.isMaintenance_certificate() == false)
        {
        expirecert.add(car);
        
        }
        
        }
        return expirecert;
    }

     
     //Search Car
     
     public Car searchCar(String city)
     {
         for(Car car: this.carList)
         {
             if(car.getAvailble_city().equalsIgnoreCase(city))
             {
             
                 return car;
             }
         }
     
     return null;
     }
    
   
    public void setCarSearch(ArrayList<Car> carSearch) {
        this.carSearch = carSearch;
    }
    
    
    
}
