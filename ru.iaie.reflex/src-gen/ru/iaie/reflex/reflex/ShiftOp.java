/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Shift Op</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ru.iaie.reflex.reflex.ReflexPackage#getShiftOp()
 * @model
 * @generated
 */
public enum ShiftOp implements Enumerator
{
  /**
   * The '<em><b>LEFT SHIFT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEFT_SHIFT_VALUE
   * @generated
   * @ordered
   */
  LEFT_SHIFT(0, "LEFT_SHIFT", ">>"),

  /**
   * The '<em><b>RIGHT SHIFT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RIGHT_SHIFT_VALUE
   * @generated
   * @ordered
   */
  RIGHT_SHIFT(1, "RIGHT_SHIFT", "<<");

  /**
   * The '<em><b>LEFT SHIFT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEFT_SHIFT
   * @model literal="&gt;&gt;"
   * @generated
   * @ordered
   */
  public static final int LEFT_SHIFT_VALUE = 0;

  /**
   * The '<em><b>RIGHT SHIFT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RIGHT_SHIFT
   * @model literal="&lt;&lt;"
   * @generated
   * @ordered
   */
  public static final int RIGHT_SHIFT_VALUE = 1;

  /**
   * An array of all the '<em><b>Shift Op</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ShiftOp[] VALUES_ARRAY =
    new ShiftOp[]
    {
      LEFT_SHIFT,
      RIGHT_SHIFT,
    };

  /**
   * A public read-only list of all the '<em><b>Shift Op</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ShiftOp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Shift Op</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ShiftOp get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ShiftOp result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Shift Op</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ShiftOp getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ShiftOp result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Shift Op</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ShiftOp get(int value)
  {
    switch (value)
    {
      case LEFT_SHIFT_VALUE: return LEFT_SHIFT;
      case RIGHT_SHIFT_VALUE: return RIGHT_SHIFT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ShiftOp(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ShiftOp
