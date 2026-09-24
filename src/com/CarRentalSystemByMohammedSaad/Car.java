package com.CarRentalSystemByMohammedSaad;

public class Car {

    private int carId;
    private String carBrand;
    private String carModel;
    private double carPrice;
    private boolean isAvailable;

    public Car(int carId, String carBrand, String carModel, double carPrice){
        this.carBrand = carBrand;
        this.carId = carId;
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.isAvailable = true;
    }

    //getter
    public int getCarId(){
       return carId;
    }
    public String getCarBrand(){
        return carBrand;
    }
    public String getCarModel(){
        return carModel;
    }
    public double getCarPrice(){
        return carPrice;
    }

    // method to calculate the rent
    public double rentCalculator(int rentalDays){
        return carPrice * rentalDays;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void rent(){
        isAvailable = false;
    }

    public void returnedCar(){
        isAvailable = true;
    }

}
