/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.CompareExpression#getCmpOp <em>Cmp Op</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getCompareExpression()
 * @model
 * @generated
 */
public interface CompareExpression extends EqualityExpression
{
  /**
   * Returns the value of the '<em><b>Cmp Op</b></em>' attribute.
   * The literals are from the enumeration {@link ru.iaie.reflex.reflex.CompareOp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmp Op</em>' attribute.
   * @see ru.iaie.reflex.reflex.CompareOp
   * @see #setCmpOp(CompareOp)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getCompareExpression_CmpOp()
   * @model
   * @generated
   */
  CompareOp getCmpOp();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.CompareExpression#getCmpOp <em>Cmp Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmp Op</em>' attribute.
   * @see ru.iaie.reflex.reflex.CompareOp
   * @see #getCmpOp()
   * @generated
   */
  void setCmpOp(CompareOp value);

} // CompareExpression
