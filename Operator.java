import java.util.HashMap;
public abstract class Operator {
  // The Operator class should contain an instance of a HashMap
  // This map will use keys as the tokens we're interested in,
  // and values will be instances of the Operators.
  static final HashMap<String, Operator> operators = new HashMap<>();
  // Example:
  // Where does this declaration go? What should its access level be?
  // Class or instance variable? Is this the right declaration?
  // HashMap operators = new HashMap();
  // operators.put( "+", new AdditionOperator() );
  // operators.put( "-", new SubtractionOperator() );

  public abstract int priority();
  static{
    operators.put( "+", new AdditionOperator() );
    operators.put( "-", new SubtractionOperator() );
    operators.put( "*", new MultiplicationOperator() );
    operators.put( "/", new DivisionOperator() );
    operators.put( "^", new PowerOperator() );
    operators.put( "(", new OpenParenthesisOperator() );
    operators.put( "#", new StartExpressionOperator() );
    //operators.put( ")", new CloseParenthesisOperator() );
  }
  
  public abstract Operand execute( Operand op1, Operand op2 );

  public static boolean check( String token ) {
    return token.equals("^") || token.equals("(") || token.equals("/") || token.equals("#")
    || token.equals("+") || token.equals("-") || token.equals("*");
  }
  public static Operator getOperator(String token){
    return operators.get(token);
  }
}