/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.bts.bTS.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.bts.bTS.BTSPackage;
import org.xtext.example.bts.bTS.KIOSK;
import org.xtext.example.bts.bTS.Payment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KIOSK</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.bts.bTS.impl.KIOSKImpl#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KIOSKImpl extends TypeImpl implements KIOSK
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected Payment superType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KIOSKImpl()
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
    return BTSPackage.Literals.KIOSK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Payment getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (Payment)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BTSPackage.KIOSK__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Payment basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSuperType(Payment newSuperType)
  {
    Payment oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BTSPackage.KIOSK__SUPER_TYPE, oldSuperType, superType));
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
      case BTSPackage.KIOSK__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BTSPackage.KIOSK__SUPER_TYPE:
        setSuperType((Payment)newValue);
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
      case BTSPackage.KIOSK__SUPER_TYPE:
        setSuperType((Payment)null);
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
      case BTSPackage.KIOSK__SUPER_TYPE:
        return superType != null;
    }
    return super.eIsSet(featureID);
  }

} //KIOSKImpl
