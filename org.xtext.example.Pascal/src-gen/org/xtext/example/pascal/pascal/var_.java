/**
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>var </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.var_#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.var_#getArray <em>Array</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.var_#isAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.var_#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.var_#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.var_#getPointer <em>Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getvar_()
 * @model
 * @generated
 */
public interface var_ extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference.
   * @see #setExpressions(expression_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvar__Expressions()
   * @model containment="true"
   * @generated
   */
  expression_list getExpressions();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.var_#getExpressions <em>Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressions</em>' containment reference.
   * @see #getExpressions()
   * @generated
   */
  void setExpressions(expression_list value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(var_)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvar__Array()
   * @model containment="true"
   * @generated
   */
  var_ getArray();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.var_#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(var_ value);

  /**
   * Returns the value of the '<em><b>Accessor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accessor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accessor</em>' attribute.
   * @see #setAccessor(boolean)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvar__Accessor()
   * @model
   * @generated
   */
  boolean isAccessor();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.var_#isAccessor <em>Accessor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accessor</em>' attribute.
   * @see #isAccessor()
   * @generated
   */
  void setAccessor(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvar__Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.var_#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(var_)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvar__Variable()
   * @model containment="true"
   * @generated
   */
  var_ getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.var_#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(var_ value);

  /**
   * Returns the value of the '<em><b>Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointer</em>' containment reference.
   * @see #setPointer(var_)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getvar__Pointer()
   * @model containment="true"
   * @generated
   */
  var_ getPointer();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.var_#getPointer <em>Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointer</em>' containment reference.
   * @see #getPointer()
   * @generated
   */
  void setPointer(var_ value);

} // var_
