class Employeee{

    private String name;
    private String address;
    private String mobile;
    

    public void setName(String x){
        this.name= x;
    }
    public String getName(){
        return name;
    }

    

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

   

    public void setMobile(String mobile){
        this.mobile= mobile;
    }
    public String getMobile(){
        return mobile;
   }
    
    public void display()
	{
		System.out.println("Employee Details: ");
		System.out.println("Name: "+name);
		System.out.println("Address:"+address);
		System.out.println("Mobile: "+mobile);
	}
}