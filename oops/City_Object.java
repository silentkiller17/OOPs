package oops;

public class City_Object {
	int cityNo;
	String cityName;
	void displayCity() 
	{
		System.out.println("CityNo: "+ cityNo);
		System.out.println("CityName:"+ cityName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City_Object c1 = new City_Object();
        c1.cityNo=100;
        c1.cityName="Pune";
        c1.displayCity();
        	
	}

}
