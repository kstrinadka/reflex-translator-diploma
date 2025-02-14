/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.iaie.reflex.reflex.AdditiveExpression;
import ru.iaie.reflex.reflex.AdditiveOp;
import ru.iaie.reflex.reflex.ReflexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.impl.AdditiveExpressionImpl#getAddOp <em>Add Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditiveExpressionImpl extends ShiftExpressionImpl implements AdditiveExpression
{
  /**
   * The default value of the '{@link #getAddOp() <em>Add Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddOp()
   * @generated
   * @ordered
   */
  protected static final AdditiveOp ADD_OP_EDEFAULT = AdditiveOp.PLUS;

  /**
   * The cached value of the '{@link #getAddOp() <em>Add Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddOp()
   * @generated
   * @ordered
   */
  protected AdditiveOp addOp = ADD_OP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdditiveExpressionImpl()
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
    return ReflexPackage.Literals.ADDITIVE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AdditiveOp getAddOp()
  {
    return addOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAddOp(AdditiveOp newAddOp)
  {
    AdditiveOp oldAddOp = addOp;
    addOp = newAddOp == null ? ADD_OP_EDEFAULT : newAddOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexPackage.ADDITIVE_EXPRESSION__ADD_OP, oldAddOp, addOp));
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
      case ReflexPackage.ADDITIVE_EXPRESSION__ADD_OP:
        return getAddOp();
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
      case ReflexPackage.ADDITIVE_EXPRESSION__ADD_OP:
        setAddOp((AdditiveOp)newValue);
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
      case ReflexPackage.ADDITIVE_EXPRESSION__ADD_OP:
        setAddOp(ADD_OP_EDEFAULT);
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
      case ReflexPackage.ADDITIVE_EXPRESSION__ADD_OP:
        return addOp != ADD_OP_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (addOp: ");
    result.append(addOp);
    result.append(')');
    return result.toString();
  }

} //AdditiveExpressionImpl
