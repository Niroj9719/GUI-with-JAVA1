public class Store{
    //attributes
    private int store_id;
    private String store_name;
    private String location;
    private String opening_hour;
    private double total_sales;
    private double total_discount;
    //constructor
    public Store(int store_id,String store_name,String location,String opening_hour){
        this.store_id=store_id;
        this.store_name=store_name;
        this.location=location; 
        this.opening_hour=opening_hour;
        this.total_sales=0;    
        this.total_discount=0;
    }
    //getter method or accessor method
    public int getStore_id(){
        return this.store_id;
    }
    public String getStore_name(){
        return this.store_name;
    }
    public String getLocation(){
        return this.location;
    }
    public String getOpening_hour(){
        return this.opening_hour;
    }
    public double getTotal_sales(){
        return this.total_sales;
    }
    public double getTotal_discount(){
        return this.total_discount;
    }
    //setter method or mutator method
    public void setTotal_sales(double total_sales){
    this.total_sales=total_sales; 
    }
    public void setTotal_discount(double total_discount){
        this.total_discount=total_discount;
    }
    public void display(){ 
        //print statement
        System.out.println("The store id is " +store_id);
        System.out.println("The store name is " +store_name);
        System.out.println("The store location is " +location);
        System.out.println("The store opening hour is " +opening_hour);
        System.out.println("The store total sales is " +total_sales);
        //if....else.... statement
        if (total_sales==0 &&total_discount==0){
            System.out.println("Shopping is not done and discount is not given");
        }
        else{
            System.out.println("Shopping is done and discount is given");
            
        }
    
    }
}

    
        
    

