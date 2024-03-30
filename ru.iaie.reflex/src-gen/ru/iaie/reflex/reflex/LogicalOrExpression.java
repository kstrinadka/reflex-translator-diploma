/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.LogicalOrExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.LogicalOrExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getLogicalOrExpression()
 * @model
 * @generated
 */
public interface LogicalOrExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LogicalOrExpression)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getLogicalOrExpression_Left()
   * @model containment="true"
   * @generated
   */
  LogicalOrExpression getLeft();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.LogicalOrExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LogicalOrExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(LogicalOrExpression)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getLogicalOrExpression_Right()
   * @model containment="true"
   * @generated
   */
  LogicalOrExpression getRight();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.LogicalOrExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(LogicalOrExpression value);

} // LogicalOrExpression
