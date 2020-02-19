public class EvaluatorTester {
  public static void main(String[] args) {
    Evaluator evaluator = new Evaluator();
    String[] evaluate = {
      "(2*7+1+1)",
      "8-2*7",
      "10*10/4",
      "8^9",
      "10^1",
      "8+(12*3)",
      "(9/3)*6",
      "(2+1)+(11*8)/(6*2)^0",
      "(((7+1)+1)+1)"
    };
    for ( String arg : evaluate ) {
      System.out.format( "%s = %d\n", arg, evaluator.eval( arg ) );
    }
  }
}
