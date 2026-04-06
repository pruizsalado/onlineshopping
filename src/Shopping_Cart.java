
import java.util.*;


/**
 * Class Shopping_Cart
 */
public class Shopping_Cart {

  //
  // Fields
  //

  private Date created;

  public Vector line_itemVector = new Vector();
  
  //
  // Constructors
  //
  public Shopping_Cart () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of created
   * @param newVar the new value of created
   */
  public void setCreated (Date newVar) {
    created = newVar;
  }

  /**
   * Get the value of created
   * @return the value of created
   */
  public Date getCreated () {
    return created;
  }

  /**
   * Add a Line_item object to the line_itemVector List
   */
  public void addLine_item (LineItem new_object) {
    line_itemVector.add(new_object);
  }

  /**
   * Remove a Line_item object from line_itemVector List
   */
  public void removeLine_item (LineItem new_object)
  {
    line_itemVector.remove(new_object);
  }

  /**
   * Get the List of Line_item objects held by line_itemVector
   * @return List of Line_item objects held by line_itemVector
   */
  public List getLine_itemList () {
    return (List) line_itemVector;
  }


  //
  // Other methods
  //

}
