package edu.nwmissouri.zoo11group;

/**
 * Animal super class for traits shared by all animals. Abstract - don't make a
 * general animal - only specific types.
 *
 * @author Homakesavadurgaprasad Omtri (S544929)
 */
public abstract class Animal {

    /**
     * Every animal has a name. Class variable name is not private, but
     * protected - only subclasses can use it.
     */
    protected String name = "no name";

    /**
     * Animals have an associated gender which may be unknown.
     *
     * We limit the choices for selection by using an enum
     */
   // protected AnimalGender gender;

    /**
     * Animal constructor
     *
     * @param name - the name of this instance of an animal
     */
    public Animal(String name) {
        this.name = name;
        //this.gender = AnimalGender.UNKNOWN;

    }

    /**
     * speak() - general method for animal utterance
     */
    public void speak() {
        System.out.println("Generic animal sound");
    }

    /**
     * move() - general method for animal movement
     */
    public void move() {
        System.out.println("Generic animal movement");
    }

    /**
     * Get animal's name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the animal gender.
     *
     * @see edu.nwmissouri.zoo04lab.AnimalGender
     * @return the gender
     */
   // public AnimalGender getGender() {
   //     return gender;
   // }

    /**
     * Set the animal gender using an enum
     *
     * @see edu.nwmissouri.zoo04lab.AnimalGender
     * @param gender the gender to set
     */
    //public void setGender(AnimalGender gender) {
     //   this.gender = gender;
    //}

}
