package com.abstractfactory;

public abstract class AnimalFactory
{
	public abstract Animal getAnimal( String animalType );

	public static AnimalFactory getAnimalFactory(String factoryType)
	{
		AnimalFactory animalFactory = null ;
		if("sea".equals(factoryType))
		{
			animalFactory = new SeaAnimalFactory();
		}
		else
		{
			animalFactory = new LandAnimalFactory();
		}
		return animalFactory;
	}

}
