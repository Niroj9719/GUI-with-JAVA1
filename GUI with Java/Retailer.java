public class Retailer extends Store{
    //attributes
    private int VAT_inclusive_price;
    private int loyalty_point;
    private boolean isPaymentOnline;
    private String purchased_Year;
    //constructor
    public Retailer(int store_id,String store_name,String location,String opening_hour,
    double total_sales,double total_discount,int VAT_inclusive_price,boolean isPaymentOnline,
    String purchased_Year){
        super(store_id,store_name,location,opening_hour);
        this.VAT_inclusive_price=VAT_inclusive_price;
        this.isPaymentOnline=isPaymentOnline;
        this.purchased_Year=purchased_Year;
        super.setTotal_sales(total_sales);
        super.setTotal_discount(total_discount);
        this.loyalty_point=0; 
    }
    //getter method or accessor method
    public int getVat_inclusive_price(){
        return this.VAT_inclusive_price;
    }
    public int getLoyalty_point(){
        return this.loyalty_point;
    }
    public boolean getIsPaymentOnline(){
        return this.isPaymentOnline;
    }
    public String getPurchased_Year(){
        return this.purchased_Year;
    }
    //setter method or mutator method
    public void setIsPaymentOnline(boolean isPaymentOnline){
        this.isPaymentOnline=isPaymentOnline;
    }
    public void loyalty(boolean isPaymentOnline,int VAT_inclusive_price){
        //if....else statement
        if(isPaymentOnline==true){
            this.loyalty_point=(int)(0.01* VAT_inclusive_price);   
        }
        else{
            this.loyalty_point=0;
        }    
    }
    public void remove_product(){
        //if statement
        if(loyalty_point==0&& purchased_Year=="2020"|| purchased_Year=="2021"||
        purchased_Year=="2022"){
            this.VAT_inclusive_price=0;
            this.loyalty_point=0;
            this.isPaymentOnline=false;
        }
    }
    public void display(){ 
        super.display();
        //print statement
        System.out.println("The VAT inclusive price is "+VAT_inclusive_price);
        System.out.println("The loyalty point is "+loyalty_point);
        System.out.println("The purchased year is "+purchased_Year);
        //if statement
        if(loyalty_point==0&& purchased_Year=="2020" || purchased_Year=="2021" ||
        purchased_Year=="2022"){
            System.out.println("Product is removed"); //print statement
        }
    }    
}  
