/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set State Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.SetStateStat#isNext <em>Next</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.SetStateStat#getState <em>State</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getSetStateStat()
 * @model
 * @generated
 */
public interface SetStateStat extends Statement
{
  /**
   * Returns the value of the '<em><b>Next</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' attribute.
   * @see #setNext(boolean)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getSetStateStat_Next()
   * @model
   * @generated
   */
  boolean isNext();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.SetStateStat#isNext <em>Next</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' attribute.
   * @see #isNext()
   * @generated
   */
  void setNext(boolean value);

  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(State)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getSetStateStat_State()
   * @model
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.SetStateStat#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

} // SetStateStat
