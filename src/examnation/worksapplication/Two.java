package examnation.worksapplication;

import java.util.Scanner;


public class Two {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int city_num = scan.nextInt() - 1;
		int inquiry_num = scan.nextInt();
		int[][] cityArr = new int[city_num][3]; 
		int[][] inquiryArr = new int[inquiry_num + 1][2];
		inquiryArr[0][0] = inquiryArr[0][1] = 1;
		//Insert values to cityArr
		for(int row = 0; row < cityArr.length; row ++)
		{
			for(int colum = 0; colum < 2; colum ++ )
			{
				cityArr[row][colum] = scan.nextInt();
			}
			cityArr[row][2] = 1;
		}
		//Insert values to inquiryArr
		for(int row = 1; row < inquiryArr.length; row ++)
		{
			for(int colum = 0; colum < 2; colum ++ )
			{
				inquiryArr[row][colum] = scan.nextInt();
			}
		}
		scan.close();

		int currentCity = 1, goalCity = 1, route =0;
		for(int row = 0; row < inquiryArr.length; row ++)
		{
			if(inquiryArr[row][0] == 1)
			{ 
				currentCity = inquiryArr[row][1];
			}
			if(inquiryArr[row][0] == 2)
			{
				goalCity = inquiryArr[row][1];
				System.out.println(searchRoute(cityArr, currentCity, goalCity, route,0));
			}
			//else{System.out.println("System data input error!!!");}
		}
	}
	
	public static int searchRoute(int[][] cityArr, int currentCity, int goalCity, int route, int index)
	{
		System.out.println(currentCity + " " + goalCity);
		
		
		if(currentCity == goalCity)
		{
			return 0 ;
		}
		
		int count = 1;

		for(int row = index; row < cityArr.length; row ++)
		{
			if(currentCity == cityArr[row][0] && cityArr[row][2] == 1)
			{

				currentCity = cityArr[row][1];
				cityArr[row][2] = 0;
				route ++;
				count ++;
				searchRoute(cityArr, currentCity, goalCity, route, index);
			}
			System.out.println("route====>"+route);
		}
		if(count == cityArr.length && currentCity != goalCity)
		{
			route = 0;
			for (int i = 0; i < cityArr.length; i++) {
				cityArr[i][2] = 1;
			}
		}
		
		/*for(int i = 0; i < count; i++)
		{
			
		}*/
		/*if(currentCity != goalCity)
		{
			for(int row = 0; row < cityArr.length; row ++)
			{
				//Map<Integer,Integer> map = new HashMap<Integer,Integer>();
				if(currentCity == cityArr[row][0] && cityArr[row][2] == 1 )
				{
					cityArr[row][2] = 0;
					route ++;
					
					currentCity = cityArr[row][1];
					searchRoute(cityArr, currentCity, goalCity, route);
				}
			}
			
		}*/
		
		return route;
	}

}
