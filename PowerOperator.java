public class PowerOperator extends Operator{
  @Override
  public int priority(){
    return 4;
  }
  @Override
  public Operand execute(Operand op1, Operand op2){
    Operand ans = new Operand(op1.getValue() ^ op2.getValue());
    return ans;
  }
}
    
