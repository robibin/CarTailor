package model;

import java.util.ArrayList;

public class ConfigImpl implements Configuration{
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public ArrayList<PartTypeImpl> MyPart;
	
	public ConfigImpl() {
		this.MyPart = MyPart;
	}
	
	public Configuration getconfiguration() {
		// TODO implement me
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void showlistpartcategories() {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void selectcategory() {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void selectpartcategory() {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean isvalidconfiguration() {
		// TODO implement me
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean isincompatible() {
		// TODO implement me
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean removepart(PartType partype) {
		//PartType part = new PartType(new Name(), new Description(), new CategoryImpl());
		for(PartType PT : this.MyPart) {
			if(PT.equals(partype)) {
				MyPart.remove(PT);
				return true;
			}
		}
		return false;
	}

	
	public boolean addpart (PartType partype) {
		
		for(PartType PT : this.MyPart) {
				MyPart.add(PT);
				return true;
		}
		return false;
	
	}
}
