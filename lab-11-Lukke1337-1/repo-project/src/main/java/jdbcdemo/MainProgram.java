package jdbcdemo;

import java.util.List;

import jdbcdemo.dao.CarRepository;
import jdbcdemo.dao.PersonRepository;
import jdbcdemo.domain.Car;
import jdbcdemo.domain.Person;
import


public class MainProgram
{
    public static void main( String[] args )
    {
    	PersonRepository repo = new PersonRepository();
    	repo.createTable();
//
    	Person janek = new Person();
    	janek.setAge(30);
    	janek.setName("Jan");
    	janek.setSurname("Kowalski");

    	repo.add(janek);

		janek.setName("Anna");
		janek.setSurname("Kowalska");
		janek.setId(0);
		repo.update(janek);

		CarRepository repoCar = new CarRepository();
		repoCar.createTable();

		Car audi = new Car();
		audi.setBrand("Audi");
		audi.setRegistration("R8R10");

//		repo.add(audi);

		audi.setBrand("VW");
		audi.setRegistration("R10R10");
//
    	List<Person> people = repo.getAll();
    	for(Person p : people){
    		System.out.println(p.getId()+"\t"
    				+ p.getName()+"\t"
    				+ p.getSurname()+"\t"
    				+ p.getAge());
    	}

        System.out.println( "Koniec" );
    }
}
