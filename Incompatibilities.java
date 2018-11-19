package model;

import java.util.ArrayList;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Incompatibilities extends IncompatibilityManager
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public ArrayList<PartTypeImpl> Incompatibility;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public PartTypeImpl part;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Incompatibilities(){
		super();
	}

	public String getIncompatibility() {
		if(this.Incompatibility != null)
			return this.Incompatibility.toString();
		return null;
	}

	public void setIncompatibility(ArrayList<PartTypeImpl> incompatibility) {
		Incompatibility = incompatibility;
	}

	@Override
	public String toString() {
		return "Incompatibilities [Incompatibility=" + Incompatibility;
				//+ ", part=" + part + "]";
	}
	
	

}

