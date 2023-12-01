package in.dev.gmsk.model;

class Tire{}

class Door {}

class Steering {}

class Window {}


public class CarModel { // Favor Composition over Inheritance

    private Tire[] tires;

    private Door[] doors;

    private Steering[] steerings;

    private Window[] windows;
}
