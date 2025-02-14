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
 * A representation of the literals of the enumeration '<em><b>Assign Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ru.iaie.reflex.reflex.ReflexPackage#getAssignOperator()
 * @model
 * @generated
 */
public enum AssignOperator implements Enumerator
{
  /**
   * The '<em><b>ASSIGN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASSIGN_VALUE
   * @generated
   * @ordered
   */
  ASSIGN(0, "ASSIGN", "="),

  /**
   * The '<em><b>MUL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MUL_VALUE
   * @generated
   * @ordered
   */
  MUL(1, "MUL", "*="),

  /**
   * The '<em><b>DIV</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIV_VALUE
   * @generated
   * @ordered
   */
  DIV(2, "DIV", "/="),

  /**
   * The '<em><b>MOD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOD_VALUE
   * @generated
   * @ordered
   */
  MOD(3, "MOD", "+="),

  /**
   * The '<em><b>SUB</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUB_VALUE
   * @generated
   * @ordered
   */
  SUB(4, "SUB", "-="),

  /**
   * The '<em><b>CIN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CIN_VALUE
   * @generated
   * @ordered
   */
  CIN(5, "CIN", "<<="),

  /**
   * The '<em><b>COUT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COUT_VALUE
   * @generated
   * @ordered
   */
  COUT(6, "COUT", ">>="),

  /**
   * The '<em><b>BIT AND</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIT_AND_VALUE
   * @generated
   * @ordered
   */
  BIT_AND(7, "BIT_AND", "&="),

  /**
   * The '<em><b>BIT XOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIT_XOR_VALUE
   * @generated
   * @ordered
   */
  BIT_XOR(8, "BIT_XOR", "^="),

  /**
   * The '<em><b>BIT OR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIT_OR_VALUE
   * @generated
   * @ordered
   */
  BIT_OR(9, "BIT_OR", "|=");

  /**
   * The '<em><b>ASSIGN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASSIGN
   * @model literal="="
   * @generated
   * @ordered
   */
  public static final int ASSIGN_VALUE = 0;

  /**
   * The '<em><b>MUL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MUL
   * @model literal="*="
   * @generated
   * @ordered
   */
  public static final int MUL_VALUE = 1;

  /**
   * The '<em><b>DIV</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIV
   * @model literal="/="
   * @generated
   * @ordered
   */
  public static final int DIV_VALUE = 2;

  /**
   * The '<em><b>MOD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOD
   * @model literal="+="
   * @generated
   * @ordered
   */
  public static final int MOD_VALUE = 3;

  /**
   * The '<em><b>SUB</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUB
   * @model literal="-="
   * @generated
   * @ordered
   */
  public static final int SUB_VALUE = 4;

  /**
   * The '<em><b>CIN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CIN
   * @model literal="&lt;&lt;="
   * @generated
   * @ordered
   */
  public static final int CIN_VALUE = 5;

  /**
   * The '<em><b>COUT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COUT
   * @model literal="&gt;&gt;="
   * @generated
   * @ordered
   */
  public static final int COUT_VALUE = 6;

  /**
   * The '<em><b>BIT AND</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIT_AND
   * @model literal="&amp;="
   * @generated
   * @ordered
   */
  public static final int BIT_AND_VALUE = 7;

  /**
   * The '<em><b>BIT XOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIT_XOR
   * @model literal="^="
   * @generated
   * @ordered
   */
  public static final int BIT_XOR_VALUE = 8;

  /**
   * The '<em><b>BIT OR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIT_OR
   * @model literal="|="
   * @generated
   * @ordered
   */
  public static final int BIT_OR_VALUE = 9;

  /**
   * An array of all the '<em><b>Assign Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AssignOperator[] VALUES_ARRAY =
    new AssignOperator[]
    {
      ASSIGN,
      MUL,
      DIV,
      MOD,
      SUB,
      CIN,
      COUT,
      BIT_AND,
      BIT_XOR,
      BIT_OR,
    };

  /**
   * A public read-only list of all the '<em><b>Assign Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AssignOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Assign Operator</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AssignOperator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AssignOperator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Assign Operator</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AssignOperator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AssignOperator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Assign Operator</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AssignOperator get(int value)
  {
    switch (value)
    {
      case ASSIGN_VALUE: return ASSIGN;
      case MUL_VALUE: return MUL;
      case DIV_VALUE: return DIV;
      case MOD_VALUE: return MOD;
      case SUB_VALUE: return SUB;
      case CIN_VALUE: return CIN;
      case COUT_VALUE: return COUT;
      case BIT_AND_VALUE: return BIT_AND;
      case BIT_XOR_VALUE: return BIT_XOR;
      case BIT_OR_VALUE: return BIT_OR;
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
  private AssignOperator(int value, String name, String literal)
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
  
} //AssignOperator
