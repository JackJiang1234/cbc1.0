package net.loveruby.cflat.asm;

/**
 * 表示寄存器
 * */
abstract public class Register extends Operand {

    @Override
    public boolean isRegister() {
        return true;
    }

    public void collectStatistics(Statistics stats) {
        stats.registerUsed(this);
    }

    abstract public String toSource(SymbolTable syms);

    abstract public String dump();
}
