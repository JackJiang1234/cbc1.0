package net.loveruby.cflat.asm;

/**
 * 表示符号
 * */
public interface Symbol extends Literal {
    public String name();

    public String toString();

    public String dump();
}
