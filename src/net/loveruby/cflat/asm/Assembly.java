package net.loveruby.cflat.asm;

/**
 * 表示汇编元素
 * */
abstract public class Assembly {
    abstract public String toSource(SymbolTable table);

    abstract public String dump();

    /**
     * 汇编指令
     * */
    public boolean isInstruction() {
        return false;
    }

    /**
     * 标签
     * */
    public boolean isLabel() {
        return false;
    }

    /**
     * 汇编伪指令
     * */
    public boolean isDirective() {
        return false;
    }

    /**
     * comment
     * */
    public boolean isComment() {
        return false;
    }

    public void collectStatistics(Statistics stats) {
        // does nothing by default.
    }
}
