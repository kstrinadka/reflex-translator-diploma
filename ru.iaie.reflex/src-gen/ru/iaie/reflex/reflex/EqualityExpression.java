/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.EqualityExpression#getEqCmpOp <em>Eq Cmp Op</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getEqualityExpression()
 * @model
 * @generated
 */
public interface EqualityExpression extends BitAndExpression
{
  /**
   * Returns the value of the '<em><b>Eq Cmp Op</b></em>' attribute.
   * The literals are from the enumeration {@link ru.iaie.reflex.reflex.CompareEqOp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eq Cmp Op</em>' attribute.
   * @see ru.iaie.reflex.reflex.CompareEqOp
   * @see #setEqCmpOp(CompareEqOp)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getEqualityExpression_EqCmpOp()
   * @model
   * @generated
   */
  CompareEqOp getEqCmpOp();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.EqualityExpression#getEqCmpOp <em>Eq Cmp Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eq Cmp Op</em>' attribute.
   * @see ru.iaie.reflex.reflex.CompareEqOp
   * @see #getEqCmpOp()
   * @generated
   */
  void setEqCmpOp(CompareEqOp value);

} // EqualityExpression
