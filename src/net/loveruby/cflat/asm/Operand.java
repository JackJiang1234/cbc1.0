package net.loveruby.cflat.asm;

/**
 * 表示指令操作对象
 * */
abstract public class Operand implements OperandPattern {
    abstract public String toSource(SymbolTable table);

    abstract public String dump();

    public boolean isRegister() {
        return false;
    }

    public boolean isMemoryReference() {
        return false;
    }

    public IntegerLiteral integerLiteral() {
        return null;
    }

    abstract public void collectStatistics(Statistics stats);

    // default implementation
    public boolean match(Operand operand) {
        return equals(operand);
    }
}
