package AST;

import model.io.Tokenizer;

public class Description implements Setting, ASTnode {
    String desc;

    @Override
    public void parse() {
        Tokenizer t = Tokenizer.getTokenizer();
        t.getAndCheckNext("description:");
        desc = Validator.validateString(t.getNext());
        t.getAndCheckNext(";");
    }

    @Override
    public void evaluate() {

    }

    public String getDesc() {
        return desc;
    }
}