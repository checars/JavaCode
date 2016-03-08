package com.neu.checars;

public class CarSpeedMeter extends SpeedMeter
{
	public double getRadius()
	{
		return 0.28;
	}

	public static void main(String args[])
	{
		CarSpeedMeter car = new CarSpeedMeter();
		car.setTrunRate(15);
		System.out.println(car.getSpeed());
	}
}