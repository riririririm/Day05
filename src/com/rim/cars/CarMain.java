package com.rim.cars;

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.wheel=4;
		c.color="pink";
		c.size="대형";
		c.company="bmw";
		//c.engine = new Engine();
		//c.engine.hp=100;
		//c.engine.fuel="gas";
		//c.engine.cc=1000;
		
		 Engine engine = new Engine();
		 engine.hp=100;
		 engine.fuel="gas";
		 engine.cc=1000;
		 c.engine = engine;
		 
		
		Car c2 = new Car();
		c2=c;
		
		System.out.println(c2.color);
		
		c2.color="red";
		
		Car c3 = new Car();
		c3.wheel = c.wheel;
		c3.color = c.color;
		c3.size = c.size;
		c3.company = c.company;
		
		System.out.println(c.color);
		System.out.println(c2.color);
		System.out.println(c3.color);
		
		Bike b1 = new Bike();
		b1.wheel=2;
		b1.color="white";
		b1.company="Honda";
		
		System.out.println(c.engine.fuel);
		
		////////////////////////////////////////////
		Airplane airplane = new Airplane();
		airplane.engine = new Engine[2];
		for(int i=0;i<airplane.engine.length;i++) {
			airplane.engine[i]=new Engine();
		}
		airplane.engine[0].hp = 10000;
		
		/////////////////////////////////////////////
		Airplane airplane2 = new Airplane();
		airplane2.engine = new Engine[12];
		
		for(int i=0;i<airplane2.engine.length;i++) {
			airplane2.engine[i]=new Engine();
			airplane2.engine[i].hp = 1000;
			airplane2.engine[i].fuel = "항공유";  
			airplane2.engine[i].cc =30000;
			/*
			 * Engine e = new Engine();
			 * e.hp=1000;
			 * e.fuel ="항공유";
			 * e.cc=30000;
			 * airplane2.engine[i] = e;
			 */
		}
		
		
		System.out.println(airplane.engine);

	}

}
