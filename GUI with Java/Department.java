public class Department extends Store{
    //attributes
    private String product_name;
    private double marked_price;
    private double selling_price;
    private boolean isInSales;
    //constructor
    public Department(int store_id,String store_name,String location,String opening_hour,
    double total_sales,double total_discount,String product_name,double marked_price){
        super(store_id,store_name,location,opening_hour);
        this.product_name=product_name;
        this.marked_price=marked_price;
        super.setTotal_sales(total_sales);
        super.setTotal_discount(total_discount);   
        this.isInSales=true; 
        this.selling_price=0;
    }
    //getter method
    public String getProduct_name(){
        return this.product_name;
    }
    public double getMarked_price(){
        return this.marked_price;
    }
    public double getSelling_price(){
        return this.selling_price;
    }
    public boolean getIsInSales(){
        return this.isInSales;
    }
    //setter method or mutator method
    public void setMarked_price(double marked_price){
        this.marked_price=marked_price;
    }
    public void calculateDiscountPrice(boolean isInSales,double marked_price){
        double discount=0;
        //nested if statement
        if(isInSales==true){
            if(marked_price>=5000){
                discount=0.2*marked_price;
            }
            else if(marked_price==3000 && marked_price<5000){
                discount=0.1*marked_price;
            }
            else if(marked_price==1000 &&marked_price<3000){
                discount=0.05*marked_price;
            }
            else{
                discount=0*marked_price;
            }
        }
        super.setTotal_discount(discount);
        this.selling_price=marked_price-discount;
        this.isInSales=false;
    }
    public void display(){
        super.display();
        //if....else statement
        if(isInSales==true){
            System.out.println("The product name is "+product_name);
            System.out.println("The marked price is "+marked_price);
        }
        else{
            System.out.println("The product name is "+product_name);
            System.out.println("The selling price is "+selling_price);
        }
    }
}
    

         
    
    
    
        
 
        
        
        
        

    
    
    


