/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.bts.bTS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.bts.bTS.BTSPackage
 * @generated
 */
public interface BTSFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BTSFactory eINSTANCE = org.xtext.example.bts.bTS.impl.BTSFactoryImpl.init();

  /**
   * Returns a new object of class '<em>BTS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BTS</em>'.
   * @generated
   */
  BTS createBTS();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Baggage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Baggage</em>'.
   * @generated
   */
  Baggage createBaggage();

  /**
   * Returns a new object of class '<em>Booking</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Booking</em>'.
   * @generated
   */
  Booking createBooking();

  /**
   * Returns a new object of class '<em>Ticket</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ticket</em>'.
   * @generated
   */
  Ticket createTicket();

  /**
   * Returns a new object of class '<em>Passenger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Passenger</em>'.
   * @generated
   */
  Passenger createPassenger();

  /**
   * Returns a new object of class '<em>Payment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Payment</em>'.
   * @generated
   */
  Payment createPayment();

  /**
   * Returns a new object of class '<em>Online Payment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Online Payment</em>'.
   * @generated
   */
  OnlinePayment createOnlinePayment();

  /**
   * Returns a new object of class '<em>KIOSK</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>KIOSK</em>'.
   * @generated
   */
  KIOSK createKIOSK();

  /**
   * Returns a new object of class '<em>Bus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bus</em>'.
   * @generated
   */
  Bus createBus();

  /**
   * Returns a new object of class '<em>City</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>City</em>'.
   * @generated
   */
  City createCity();

  /**
   * Returns a new object of class '<em>Seat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Seat</em>'.
   * @generated
   */
  Seat createSeat();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BTSPackage getBTSPackage();

} //BTSFactory
