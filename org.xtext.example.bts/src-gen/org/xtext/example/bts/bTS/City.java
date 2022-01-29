/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.bts.bTS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.bts.bTS.City#getBusstops <em>Busstops</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.bts.bTS.BTSPackage#getCity()
 * @model
 * @generated
 */
public interface City extends Type
{
  /**
   * Returns the value of the '<em><b>Busstops</b></em>' attribute list.
   * The list contents are of type {@link org.xtext.example.bts.bTS.Point}.
   * The literals are from the enumeration {@link org.xtext.example.bts.bTS.Point}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Busstops</em>' attribute list.
   * @see org.xtext.example.bts.bTS.Point
   * @see org.xtext.example.bts.bTS.BTSPackage#getCity_Busstops()
   * @model unique="false"
   * @generated
   */
  EList<Point> getBusstops();

} // City