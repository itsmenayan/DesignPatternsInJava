package com.abstractfactory;

public class SeaAnimalFactory extends AnimalFactory
{
	public Animal getAnimal( String animalType )
	{
		Animal animal = null;
		if( "shark".equals(animalType) )
		{
			animal = new Shark();
		}
		return animal;
	}
}
