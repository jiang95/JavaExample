package com.example.designpattern.visitor.computer;

/**
 * @author: lingjun.jlj
 * @Date: 2018/7/20 14:49
 * @Description: 鼠标
 */
public class Mouse implements ComputerPart {


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
