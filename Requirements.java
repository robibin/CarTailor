package model;

import java.util.ArrayList;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Requirements extends IncompatibilityManager
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public ArrayList<PartTypeImpl> Requirement;

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
	public Requirements(){
		super();
	}

	public String getRequirement() {
		if(this.Requirement != null)
			return this.Requirement.toString();
		return null;
	}

	public void setRequirement(ArrayList<PartTypeImpl> requirement) {
		Requirement = requirement;
	}

	@Override
	public String toString() {
		return "Requirements [Requirement=" + Requirement;
		//+ ", part=" + part + "]";
	}
	
	
	

}

