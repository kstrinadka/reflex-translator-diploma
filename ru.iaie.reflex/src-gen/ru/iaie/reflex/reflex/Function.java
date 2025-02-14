/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.Function#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.Function#getName <em>Name</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.Function#getArgTypes <em>Arg Types</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' attribute.
   * The literals are from the enumeration {@link ru.iaie.reflex.reflex.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' attribute.
   * @see ru.iaie.reflex.reflex.Type
   * @see #setReturnType(Type)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getFunction_ReturnType()
   * @model
   * @generated
   */
  Type getReturnType();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.Function#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see ru.iaie.reflex.reflex.Type
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arg Types</b></em>' attribute list.
   * The list contents are of type {@link ru.iaie.reflex.reflex.Type}.
   * The literals are from the enumeration {@link ru.iaie.reflex.reflex.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg Types</em>' attribute list.
   * @see ru.iaie.reflex.reflex.Type
   * @see ru.iaie.reflex.reflex.ReflexPackage#getFunction_ArgTypes()
   * @model unique="false"
   * @generated
   */
  EList<Type> getArgTypes();

} // Function
