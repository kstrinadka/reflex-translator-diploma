/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ru.iaie.reflex.reflex.ImportedVariableList;
import ru.iaie.reflex.reflex.ProcessVariable;
import ru.iaie.reflex.reflex.ReflexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imported Variable List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.impl.ImportedVariableListImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link ru.iaie.reflex.reflex.impl.ImportedVariableListImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportedVariableListImpl extends MinimalEObjectImpl.Container implements ImportedVariableList
{
  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<ProcessVariable> variables;

  /**
   * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected ru.iaie.reflex.reflex.Process process;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportedVariableListImpl()
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
    return ReflexPackage.Literals.IMPORTED_VARIABLE_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ProcessVariable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectResolvingEList<ProcessVariable>(ProcessVariable.class, this, ReflexPackage.IMPORTED_VARIABLE_LIST__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ru.iaie.reflex.reflex.Process getProcess()
  {
    if (process != null && process.eIsProxy())
    {
      InternalEObject oldProcess = (InternalEObject)process;
      process = (ru.iaie.reflex.reflex.Process)eResolveProxy(oldProcess);
      if (process != oldProcess)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReflexPackage.IMPORTED_VARIABLE_LIST__PROCESS, oldProcess, process));
      }
    }
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ru.iaie.reflex.reflex.Process basicGetProcess()
  {
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcess(ru.iaie.reflex.reflex.Process newProcess)
  {
    ru.iaie.reflex.reflex.Process oldProcess = process;
    process = newProcess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexPackage.IMPORTED_VARIABLE_LIST__PROCESS, oldProcess, process));
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
      case ReflexPackage.IMPORTED_VARIABLE_LIST__VARIABLES:
        return getVariables();
      case ReflexPackage.IMPORTED_VARIABLE_LIST__PROCESS:
        if (resolve) return getProcess();
        return basicGetProcess();
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
      case ReflexPackage.IMPORTED_VARIABLE_LIST__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends ProcessVariable>)newValue);
        return;
      case ReflexPackage.IMPORTED_VARIABLE_LIST__PROCESS:
        setProcess((ru.iaie.reflex.reflex.Process)newValue);
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
      case ReflexPackage.IMPORTED_VARIABLE_LIST__VARIABLES:
        getVariables().clear();
        return;
      case ReflexPackage.IMPORTED_VARIABLE_LIST__PROCESS:
        setProcess((ru.iaie.reflex.reflex.Process)null);
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
      case ReflexPackage.IMPORTED_VARIABLE_LIST__VARIABLES:
        return variables != null && !variables.isEmpty();
      case ReflexPackage.IMPORTED_VARIABLE_LIST__PROCESS:
        return process != null;
    }
    return super.eIsSet(featureID);
  }

} //ImportedVariableListImpl
