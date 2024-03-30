/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.iaie.reflex.reflex.ReflexPackage;
import ru.iaie.reflex.reflex.Statement;
import ru.iaie.reflex.reflex.SwitchOptionStatSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Option Stat Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.impl.SwitchOptionStatSequenceImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.impl.SwitchOptionStatSequenceImpl#isHasBreak <em>Has Break</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchOptionStatSequenceImpl extends MinimalEObjectImpl.Container implements SwitchOptionStatSequence
{
  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * The default value of the '{@link #isHasBreak() <em>Has Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasBreak()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_BREAK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasBreak() <em>Has Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasBreak()
   * @generated
   * @ordered
   */
  protected boolean hasBreak = HAS_BREAK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchOptionStatSequenceImpl()
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
    return ReflexPackage.Literals.SWITCH_OPTION_STAT_SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, ReflexPackage.SWITCH_OPTION_STAT_SEQUENCE__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isHasBreak()
  {
    return hasBreak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHasBreak(boolean newHasBreak)
  {
    boolean oldHasBreak = hasBreak;
    hasBreak = newHasBreak;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexPackage.SWITCH_OPTION_STAT_SEQUENCE__HAS_BREAK, oldHasBreak, hasBreak));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ReflexPackage.SWITCH_OPTION_STAT_SEQUENCE__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ReflexPackage.SWITCH_OPTION_STAT_SEQUENCE__STATEMENTS:
        return getStatements();
      case ReflexPackage.SWITCH_OPTION_STAT_SEQUENCE__HAS_BREAK:
        return isHasBreak();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReflexPackage.SWITCH_OPTION_STAT_SEQUENCE__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case ReflexPackage.SWITCH_OPTION_STAT_SEQUENCE__HAS_BREAK:
        setHasBreak((Boolean)newValue);
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
      case ReflexPackage.SWITCH_OPTION_STAT_SEQUENCE__STATEMENTS:
        getStatements().clear();
        return;
      case ReflexPackage.SWITCH_OPTION_STAT_SEQUENCE__HAS_BREAK:
        setHasBreak(HAS_BREAK_EDEFAULT);
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
      case ReflexPackage.SWITCH_OPTION_STAT_SEQUENCE__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case ReflexPackage.SWITCH_OPTION_STAT_SEQUENCE__HAS_BREAK:
        return hasBreak != HAS_BREAK_EDEFAULT;
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
    result.append(" (hasBreak: ");
    result.append(hasBreak);
    result.append(')');
    return result.toString();
  }

} //SwitchOptionStatSequenceImpl
