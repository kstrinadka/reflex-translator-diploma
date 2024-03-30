/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.ClockDefinition#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.ClockDefinition#getTimeValue <em>Time Value</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getClockDefinition()
 * @model
 * @generated
 */
public interface ClockDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Value</em>' attribute.
   * @see #setIntValue(String)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getClockDefinition_IntValue()
   * @model
   * @generated
   */
  String getIntValue();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.ClockDefinition#getIntValue <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Value</em>' attribute.
   * @see #getIntValue()
   * @generated
   */
  void setIntValue(String value);

  /**
   * Returns the value of the '<em><b>Time Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Value</em>' attribute.
   * @see #setTimeValue(String)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getClockDefinition_TimeValue()
   * @model
   * @generated
   */
  String getTimeValue();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.ClockDefinition#getTimeValue <em>Time Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Value</em>' attribute.
   * @see #getTimeValue()
   * @generated
   */
  void setTimeValue(String value);

} // ClockDefinition
