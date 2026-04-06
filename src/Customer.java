
import java.util.*;


/**
 * Class Customer
 */
public class Customer {

  //
  // Fields
  //

  private String id;
  private Address address;
  private Phone phone;
  /**
   * 						
   */
  private String email;
  private Account new_attribute;
  private Account new_attribute_1;
  
  //
  // Constructors
  //
  public Customer () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (String newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public String getId () {
    return id;
  }

  /**
   * Set the value of address
   * @param newVar the new value of address
   */
  public void setAddress (Address newVar) {
    address = newVar;
  }

  /**
   * Get the value of address
   * @return the value of address
   */
  public Address getAddress () {
    return address;
  }

  /**
   * Set the value of phone
   * @param newVar the new value of phone
   */
  public void setPhone (Phone newVar) {
    phone = newVar;
  }

  /**
   * Get the value of phone
   * @return the value of phone
   */
  public Phone getPhone () {
    return phone;
  }

  /**
   * Set the value of email
   * 
   * @param newVar the new value of email
   */
  public void setEmail (String newVar) {
    email = newVar;
  }

  /**
   * Get the value of email
   * 
   * @return the value of email
   */
  public String getEmail () {
    return email;
  }

  /**
   * Set the value of new_attribute
   * @param newVar the new value of new_attribute
   */
  public void setNew_attribute (Account newVar) {
    new_attribute = newVar;
  }

  /**
   * Get the value of new_attribute
   * @return the value of new_attribute
   */
  public Account getNew_attribute () {
    return new_attribute;
  }

  /**
   * Set the value of new_attribute_1
   * @param newVar the new value of new_attribute_1
   */
  public void setNew_attribute_1 (Account newVar) {
    new_attribute_1 = newVar;
  }

  /**
   * Get the value of new_attribute_1
   * @return the value of new_attribute_1
   */
  public Account getNew_attribute_1 () {
    return new_attribute_1;
  }

  //
  // Other methods
  //

}
