/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.iaie.reflex.reflex.CompareExpression;
import ru.iaie.reflex.reflex.CompareOp;
import ru.iaie.reflex.reflex.ReflexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.impl.CompareExpressionImpl#getCmpOp <em>Cmp Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompareExpressionImpl extends EqualityExpressionImpl implements CompareExpression
{
  /**
   * The default value of the '{@link #getCmpOp() <em>Cmp Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmpOp()
   * @generated
   * @ordered
   */
  protected static final CompareOp CMP_OP_EDEFAULT = CompareOp.LESS;

  /**
   * The cached value of the '{@link #getCmpOp() <em>Cmp Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmpOp()
   * @generated
   * @ordered
   */
  protected CompareOp cmpOp = CMP_OP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompareExpressionImpl()
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
    return ReflexPackage.Literals.COMPARE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompareOp getCmpOp()
  {
    return cmpOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCmpOp(CompareOp newCmpOp)
  {
    CompareOp oldCmpOp = cmpOp;
    cmpOp = newCmpOp == null ? CMP_OP_EDEFAULT : newCmpOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexPackage.COMPARE_EXPRESSION__CMP_OP, oldCmpOp, cmpOp));
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
      case ReflexPackage.COMPARE_EXPRESSION__CMP_OP:
        return getCmpOp();
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
      case ReflexPackage.COMPARE_EXPRESSION__CMP_OP:
        setCmpOp((CompareOp)newValue);
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
      case ReflexPackage.COMPARE_EXPRESSION__CMP_OP:
        setCmpOp(CMP_OP_EDEFAULT);
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
      case ReflexPackage.COMPARE_EXPRESSION__CMP_OP:
        return cmpOp != CMP_OP_EDEFAULT;
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
    result.append(" (cmpOp: ");
    result.append(cmpOp);
    result.append(')');
    return result.toString();
  }

} //CompareExpressionImpl
