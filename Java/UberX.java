class UberX extends Car
{
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model)
    {
        super(license, driver); //Asi se acceden a las propiedades de la superclase
        this.brand = brand;
        this.model = model;        
    }    
}