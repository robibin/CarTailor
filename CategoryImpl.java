package model;
import java.util.HashSet;
import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class CategoryImpl implements Category 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String Category;
	public Set<PartTypeImpl> partType;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public CategoryImpl(){
		super();
	}
	

	public CategoryImpl(String category) {
		this.Category = category;
	}
	
	public boolean addcategory(Category category) {
		// TODO implement me
		return false;
	}


	
	public boolean removecategory(Category category) {
		// TODO implement me
		return false;
	}


	public String getCategory() {
		return Category;
	}


	public void setCategory(String category) {
		Category = category;
	}
	
	
}

