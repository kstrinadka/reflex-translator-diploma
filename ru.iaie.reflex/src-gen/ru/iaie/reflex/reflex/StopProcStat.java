/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Proc Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflex.reflex.StopProcStat#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflex.reflex.ReflexPackage#getStopProcStat()
 * @model
 * @generated
 */
public interface StopProcStat extends Statement
{
  /**
   * Returns the value of the '<em><b>Process</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' reference.
   * @see #setProcess(ru.iaie.reflex.reflex.Process)
   * @see ru.iaie.reflex.reflex.ReflexPackage#getStopProcStat_Process()
   * @model
   * @generated
   */
  ru.iaie.reflex.reflex.Process getProcess();

  /**
   * Sets the value of the '{@link ru.iaie.reflex.reflex.StopProcStat#getProcess <em>Process</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process</em>' reference.
   * @see #getProcess()
   * @generated
   */
  void setProcess(ru.iaie.reflex.reflex.Process value);

} // StopProcStat
