package AST;

<<<<<<< HEAD
import model.Scheduler;
import model.io.Tokenizer;

=======
>>>>>>> origin/dev
public class Time implements ASTnode{
    int time;

    @Override
    public void parse() {
        Tokenizer t = Tokenizer.getTokenizer();
        t.getAndCheckNext("at");
        String timeStr = t.getNext();
        time = Validator.validateTime(timeStr, 0,23) * 100;
        t.getAndCheckNext(":");
        timeStr = t.getNext();
        time += Validator.validateTime(timeStr, 0, 59);
    }

    @Override
    public Scheduler evaluate() {

    }

    public int getTime() {
        return time;
    }

    public int getTime() {
        return time;
    }
}