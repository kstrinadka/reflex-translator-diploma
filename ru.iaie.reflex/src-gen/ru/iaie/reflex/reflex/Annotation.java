/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.Annotation#getKey <em>Key</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.Annotation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getAnnotation_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.Annotation#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getAnnotation_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.Annotation#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // Annotation
