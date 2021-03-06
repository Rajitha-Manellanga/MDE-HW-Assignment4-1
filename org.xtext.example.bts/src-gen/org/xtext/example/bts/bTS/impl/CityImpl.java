/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.bts.bTS.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.bts.bTS.BTSPackage;
import org.xtext.example.bts.bTS.City;
import org.xtext.example.bts.bTS.Point;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.bts.bTS.impl.CityImpl#getBusstops <em>Busstops</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CityImpl extends TypeImpl implements City
{
  /**
   * The cached value of the '{@link #getBusstops() <em>Busstops</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusstops()
   * @generated
   * @ordered
   */
  protected EList<Point> busstops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BTSPackage.Literals.CITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Point> getBusstops()
  {
    if (busstops == null)
    {
      busstops = new EDataTypeEList<Point>(Point.class, this, BTSPackage.CITY__BUSSTOPS);
    }
    return busstops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BTSPackage.CITY__BUSSTOPS:
        return getBusstops();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BTSPackage.CITY__BUSSTOPS:
        getBusstops().clear();
        getBusstops().addAll((Collection<? extends Point>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BTSPackage.CITY__BUSSTOPS:
        getBusstops().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BTSPackage.CITY__BUSSTOPS:
        return busstops != null && !busstops.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (busstops: ");
    result.append(busstops);
    result.append(')');
    return result.toString();
  }

} //CityImpl
