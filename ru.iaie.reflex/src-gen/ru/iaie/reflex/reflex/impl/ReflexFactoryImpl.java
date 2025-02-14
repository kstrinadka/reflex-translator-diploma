/**
 * generated by Xtext 2.32.0
 */
package ru.iaie.reflex.reflex.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.iaie.reflex.reflex.AdditiveExpression;
import ru.iaie.reflex.reflex.AdditiveOp;
import ru.iaie.reflex.reflex.Annotation;
import ru.iaie.reflex.reflex.AssignOperator;
import ru.iaie.reflex.reflex.AssignmentExpression;
import ru.iaie.reflex.reflex.BitAndExpression;
import ru.iaie.reflex.reflex.BitOrExpression;
import ru.iaie.reflex.reflex.BitXorExpression;
import ru.iaie.reflex.reflex.CaseStat;
import ru.iaie.reflex.reflex.CastExpression;
import ru.iaie.reflex.reflex.CheckStateExpression;
import ru.iaie.reflex.reflex.ClockDefinition;
import ru.iaie.reflex.reflex.CompareEqOp;
import ru.iaie.reflex.reflex.CompareExpression;
import ru.iaie.reflex.reflex.CompareOp;
import ru.iaie.reflex.reflex.CompoundStatement;
import ru.iaie.reflex.reflex.Const;
import ru.iaie.reflex.reflex.DefaultStat;
import ru.iaie.reflex.reflex.EnumMember;
import ru.iaie.reflex.reflex.EqualityExpression;
import ru.iaie.reflex.reflex.ErrorStat;
import ru.iaie.reflex.reflex.Expression;
import ru.iaie.reflex.reflex.Function;
import ru.iaie.reflex.reflex.FunctionCall;
import ru.iaie.reflex.reflex.GlobalVariable;
import ru.iaie.reflex.reflex.IdReference;
import ru.iaie.reflex.reflex.IfElseStat;
import ru.iaie.reflex.reflex.ImportedVariableList;
import ru.iaie.reflex.reflex.InfixOp;
import ru.iaie.reflex.reflex.InfixPostfixOp;
import ru.iaie.reflex.reflex.LogicalAndExpression;
import ru.iaie.reflex.reflex.LogicalOrExpression;
import ru.iaie.reflex.reflex.MultiplicativeExpression;
import ru.iaie.reflex.reflex.MultiplicativeOp;
import ru.iaie.reflex.reflex.PhysicalVariable;
import ru.iaie.reflex.reflex.Port;
import ru.iaie.reflex.reflex.PortMapping;
import ru.iaie.reflex.reflex.PortType;
import ru.iaie.reflex.reflex.PostfixOp;
import ru.iaie.reflex.reflex.PrimaryExpression;
import ru.iaie.reflex.reflex.ProcessVariable;
import ru.iaie.reflex.reflex.Program;
import ru.iaie.reflex.reflex.ProgramVariable;
import ru.iaie.reflex.reflex.ReflexFactory;
import ru.iaie.reflex.reflex.ReflexPackage;
import ru.iaie.reflex.reflex.ResetStat;
import ru.iaie.reflex.reflex.RestartStat;
import ru.iaie.reflex.reflex.SetStateStat;
import ru.iaie.reflex.reflex.ShiftExpression;
import ru.iaie.reflex.reflex.ShiftOp;
import ru.iaie.reflex.reflex.StartProcStat;
import ru.iaie.reflex.reflex.State;
import ru.iaie.reflex.reflex.StateQualifier;
import ru.iaie.reflex.reflex.Statement;
import ru.iaie.reflex.reflex.StatementSequence;
import ru.iaie.reflex.reflex.StopProcStat;
import ru.iaie.reflex.reflex.SwitchOptionStatSequence;
import ru.iaie.reflex.reflex.SwitchStat;
import ru.iaie.reflex.reflex.TimeAmountOrRef;
import ru.iaie.reflex.reflex.TimeoutFunction;
import ru.iaie.reflex.reflex.Type;
import ru.iaie.reflex.reflex.UnaryExpression;
import ru.iaie.reflex.reflex.UnaryOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReflexFactoryImpl extends EFactoryImpl implements ReflexFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ReflexFactory init()
  {
    try
    {
      ReflexFactory theReflexFactory = (ReflexFactory)EPackage.Registry.INSTANCE.getEFactory(ReflexPackage.eNS_URI);
      if (theReflexFactory != null)
      {
        return theReflexFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ReflexFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReflexFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ReflexPackage.PROGRAM: return createProgram();
      case ReflexPackage.CLOCK_DEFINITION: return createClockDefinition();
      case ReflexPackage.PROCESS: return createProcess();
      case ReflexPackage.STATE: return createState();
      case ReflexPackage.ANNOTATION: return createAnnotation();
      case ReflexPackage.IMPORTED_VARIABLE_LIST: return createImportedVariableList();
      case ReflexPackage.PROCESS_VARIABLE: return createProcessVariable();
      case ReflexPackage.GLOBAL_VARIABLE: return createGlobalVariable();
      case ReflexPackage.PHYSICAL_VARIABLE: return createPhysicalVariable();
      case ReflexPackage.PORT_MAPPING: return createPortMapping();
      case ReflexPackage.PROGRAM_VARIABLE: return createProgramVariable();
      case ReflexPackage.TIMEOUT_FUNCTION: return createTimeoutFunction();
      case ReflexPackage.TIME_AMOUNT_OR_REF: return createTimeAmountOrRef();
      case ReflexPackage.FUNCTION: return createFunction();
      case ReflexPackage.PORT: return createPort();
      case ReflexPackage.CONST: return createConst();
      case ReflexPackage.ENUM: return createEnum();
      case ReflexPackage.ENUM_MEMBER: return createEnumMember();
      case ReflexPackage.STATEMENT: return createStatement();
      case ReflexPackage.STATEMENT_SEQUENCE: return createStatementSequence();
      case ReflexPackage.COMPOUND_STATEMENT: return createCompoundStatement();
      case ReflexPackage.IF_ELSE_STAT: return createIfElseStat();
      case ReflexPackage.SWITCH_STAT: return createSwitchStat();
      case ReflexPackage.CASE_STAT: return createCaseStat();
      case ReflexPackage.DEFAULT_STAT: return createDefaultStat();
      case ReflexPackage.SWITCH_OPTION_STAT_SEQUENCE: return createSwitchOptionStatSequence();
      case ReflexPackage.START_PROC_STAT: return createStartProcStat();
      case ReflexPackage.STOP_PROC_STAT: return createStopProcStat();
      case ReflexPackage.ERROR_STAT: return createErrorStat();
      case ReflexPackage.RESTART_STAT: return createRestartStat();
      case ReflexPackage.RESET_STAT: return createResetStat();
      case ReflexPackage.SET_STATE_STAT: return createSetStateStat();
      case ReflexPackage.ID_REFERENCE: return createIdReference();
      case ReflexPackage.INFIX_OP: return createInfixOp();
      case ReflexPackage.POSTFIX_OP: return createPostfixOp();
      case ReflexPackage.FUNCTION_CALL: return createFunctionCall();
      case ReflexPackage.CHECK_STATE_EXPRESSION: return createCheckStateExpression();
      case ReflexPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case ReflexPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case ReflexPackage.CAST_EXPRESSION: return createCastExpression();
      case ReflexPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
      case ReflexPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
      case ReflexPackage.SHIFT_EXPRESSION: return createShiftExpression();
      case ReflexPackage.COMPARE_EXPRESSION: return createCompareExpression();
      case ReflexPackage.EQUALITY_EXPRESSION: return createEqualityExpression();
      case ReflexPackage.BIT_AND_EXPRESSION: return createBitAndExpression();
      case ReflexPackage.BIT_XOR_EXPRESSION: return createBitXorExpression();
      case ReflexPackage.BIT_OR_EXPRESSION: return createBitOrExpression();
      case ReflexPackage.LOGICAL_AND_EXPRESSION: return createLogicalAndExpression();
      case ReflexPackage.LOGICAL_OR_EXPRESSION: return createLogicalOrExpression();
      case ReflexPackage.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
      case ReflexPackage.EXPRESSION: return createExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ReflexPackage.PORT_TYPE:
        return createPortTypeFromString(eDataType, initialValue);
      case ReflexPackage.STATE_QUALIFIER:
        return createStateQualifierFromString(eDataType, initialValue);
      case ReflexPackage.INFIX_POSTFIX_OP:
        return createInfixPostfixOpFromString(eDataType, initialValue);
      case ReflexPackage.ASSIGN_OPERATOR:
        return createAssignOperatorFromString(eDataType, initialValue);
      case ReflexPackage.UNARY_OP:
        return createUnaryOpFromString(eDataType, initialValue);
      case ReflexPackage.COMPARE_OP:
        return createCompareOpFromString(eDataType, initialValue);
      case ReflexPackage.COMPARE_EQ_OP:
        return createCompareEqOpFromString(eDataType, initialValue);
      case ReflexPackage.SHIFT_OP:
        return createShiftOpFromString(eDataType, initialValue);
      case ReflexPackage.ADDITIVE_OP:
        return createAdditiveOpFromString(eDataType, initialValue);
      case ReflexPackage.MULTIPLICATIVE_OP:
        return createMultiplicativeOpFromString(eDataType, initialValue);
      case ReflexPackage.TYPE:
        return createTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ReflexPackage.PORT_TYPE:
        return convertPortTypeToString(eDataType, instanceValue);
      case ReflexPackage.STATE_QUALIFIER:
        return convertStateQualifierToString(eDataType, instanceValue);
      case ReflexPackage.INFIX_POSTFIX_OP:
        return convertInfixPostfixOpToString(eDataType, instanceValue);
      case ReflexPackage.ASSIGN_OPERATOR:
        return convertAssignOperatorToString(eDataType, instanceValue);
      case ReflexPackage.UNARY_OP:
        return convertUnaryOpToString(eDataType, instanceValue);
      case ReflexPackage.COMPARE_OP:
        return convertCompareOpToString(eDataType, instanceValue);
      case ReflexPackage.COMPARE_EQ_OP:
        return convertCompareEqOpToString(eDataType, instanceValue);
      case ReflexPackage.SHIFT_OP:
        return convertShiftOpToString(eDataType, instanceValue);
      case ReflexPackage.ADDITIVE_OP:
        return convertAdditiveOpToString(eDataType, instanceValue);
      case ReflexPackage.MULTIPLICATIVE_OP:
        return convertMultiplicativeOpToString(eDataType, instanceValue);
      case ReflexPackage.TYPE:
        return convertTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClockDefinition createClockDefinition()
  {
    ClockDefinitionImpl clockDefinition = new ClockDefinitionImpl();
    return clockDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ru.iaie.reflex.reflex.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImportedVariableList createImportedVariableList()
  {
    ImportedVariableListImpl importedVariableList = new ImportedVariableListImpl();
    return importedVariableList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcessVariable createProcessVariable()
  {
    ProcessVariableImpl processVariable = new ProcessVariableImpl();
    return processVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalVariable createGlobalVariable()
  {
    GlobalVariableImpl globalVariable = new GlobalVariableImpl();
    return globalVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PhysicalVariable createPhysicalVariable()
  {
    PhysicalVariableImpl physicalVariable = new PhysicalVariableImpl();
    return physicalVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PortMapping createPortMapping()
  {
    PortMappingImpl portMapping = new PortMappingImpl();
    return portMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProgramVariable createProgramVariable()
  {
    ProgramVariableImpl programVariable = new ProgramVariableImpl();
    return programVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeoutFunction createTimeoutFunction()
  {
    TimeoutFunctionImpl timeoutFunction = new TimeoutFunctionImpl();
    return timeoutFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeAmountOrRef createTimeAmountOrRef()
  {
    TimeAmountOrRefImpl timeAmountOrRef = new TimeAmountOrRefImpl();
    return timeAmountOrRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Const createConst()
  {
    ConstImpl const_ = new ConstImpl();
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ru.iaie.reflex.reflex.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumMember createEnumMember()
  {
    EnumMemberImpl enumMember = new EnumMemberImpl();
    return enumMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StatementSequence createStatementSequence()
  {
    StatementSequenceImpl statementSequence = new StatementSequenceImpl();
    return statementSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompoundStatement createCompoundStatement()
  {
    CompoundStatementImpl compoundStatement = new CompoundStatementImpl();
    return compoundStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfElseStat createIfElseStat()
  {
    IfElseStatImpl ifElseStat = new IfElseStatImpl();
    return ifElseStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SwitchStat createSwitchStat()
  {
    SwitchStatImpl switchStat = new SwitchStatImpl();
    return switchStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CaseStat createCaseStat()
  {
    CaseStatImpl caseStat = new CaseStatImpl();
    return caseStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefaultStat createDefaultStat()
  {
    DefaultStatImpl defaultStat = new DefaultStatImpl();
    return defaultStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SwitchOptionStatSequence createSwitchOptionStatSequence()
  {
    SwitchOptionStatSequenceImpl switchOptionStatSequence = new SwitchOptionStatSequenceImpl();
    return switchOptionStatSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StartProcStat createStartProcStat()
  {
    StartProcStatImpl startProcStat = new StartProcStatImpl();
    return startProcStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StopProcStat createStopProcStat()
  {
    StopProcStatImpl stopProcStat = new StopProcStatImpl();
    return stopProcStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ErrorStat createErrorStat()
  {
    ErrorStatImpl errorStat = new ErrorStatImpl();
    return errorStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RestartStat createRestartStat()
  {
    RestartStatImpl restartStat = new RestartStatImpl();
    return restartStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResetStat createResetStat()
  {
    ResetStatImpl resetStat = new ResetStatImpl();
    return resetStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetStateStat createSetStateStat()
  {
    SetStateStatImpl setStateStat = new SetStateStatImpl();
    return setStateStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdReference createIdReference()
  {
    IdReferenceImpl idReference = new IdReferenceImpl();
    return idReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InfixOp createInfixOp()
  {
    InfixOpImpl infixOp = new InfixOpImpl();
    return infixOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PostfixOp createPostfixOp()
  {
    PostfixOpImpl postfixOp = new PostfixOpImpl();
    return postfixOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CheckStateExpression createCheckStateExpression()
  {
    CheckStateExpressionImpl checkStateExpression = new CheckStateExpressionImpl();
    return checkStateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CastExpression createCastExpression()
  {
    CastExpressionImpl castExpression = new CastExpressionImpl();
    return castExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicativeExpression createMultiplicativeExpression()
  {
    MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AdditiveExpression createAdditiveExpression()
  {
    AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ShiftExpression createShiftExpression()
  {
    ShiftExpressionImpl shiftExpression = new ShiftExpressionImpl();
    return shiftExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompareExpression createCompareExpression()
  {
    CompareExpressionImpl compareExpression = new CompareExpressionImpl();
    return compareExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EqualityExpression createEqualityExpression()
  {
    EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
    return equalityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BitAndExpression createBitAndExpression()
  {
    BitAndExpressionImpl bitAndExpression = new BitAndExpressionImpl();
    return bitAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BitXorExpression createBitXorExpression()
  {
    BitXorExpressionImpl bitXorExpression = new BitXorExpressionImpl();
    return bitXorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BitOrExpression createBitOrExpression()
  {
    BitOrExpressionImpl bitOrExpression = new BitOrExpressionImpl();
    return bitOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicalAndExpression createLogicalAndExpression()
  {
    LogicalAndExpressionImpl logicalAndExpression = new LogicalAndExpressionImpl();
    return logicalAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicalOrExpression createLogicalOrExpression()
  {
    LogicalOrExpressionImpl logicalOrExpression = new LogicalOrExpressionImpl();
    return logicalOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssignmentExpression createAssignmentExpression()
  {
    AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
    return assignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortType createPortTypeFromString(EDataType eDataType, String initialValue)
  {
    PortType result = PortType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPortTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateQualifier createStateQualifierFromString(EDataType eDataType, String initialValue)
  {
    StateQualifier result = StateQualifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStateQualifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfixPostfixOp createInfixPostfixOpFromString(EDataType eDataType, String initialValue)
  {
    InfixPostfixOp result = InfixPostfixOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertInfixPostfixOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignOperator createAssignOperatorFromString(EDataType eDataType, String initialValue)
  {
    AssignOperator result = AssignOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAssignOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOp createUnaryOpFromString(EDataType eDataType, String initialValue)
  {
    UnaryOp result = UnaryOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareOp createCompareOpFromString(EDataType eDataType, String initialValue)
  {
    CompareOp result = CompareOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompareOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareEqOp createCompareEqOpFromString(EDataType eDataType, String initialValue)
  {
    CompareEqOp result = CompareEqOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompareEqOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShiftOp createShiftOpFromString(EDataType eDataType, String initialValue)
  {
    ShiftOp result = ShiftOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertShiftOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveOp createAdditiveOpFromString(EDataType eDataType, String initialValue)
  {
    AdditiveOp result = AdditiveOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAdditiveOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeOp createMultiplicativeOpFromString(EDataType eDataType, String initialValue)
  {
    MultiplicativeOp result = MultiplicativeOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMultiplicativeOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createTypeFromString(EDataType eDataType, String initialValue)
  {
    Type result = Type.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReflexPackage getReflexPackage()
  {
    return (ReflexPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ReflexPackage getPackage()
  {
    return ReflexPackage.eINSTANCE;
  }

} //ReflexFactoryImpl
