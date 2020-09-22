/**
 * 
 */
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
package TreeSet;
/*
 * HashSet allows null object. TreeSet doesn’t allow null Object and throw NullPointerException, 
 * Why, because TreeSet uses compareTo() method to compare keys and 
 * compareTo() will throw java.lang.NullPointerException.
 * If you want a sorted Set then it is better to add elements to HashSet 
 * and then convert it into TreeSet rather than creating a TreeSet and adding elements to it.
 */
