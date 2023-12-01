package thriftserver;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.thrift.TException;
import org.junit.jupiter.api.Test;

public class FizzBuzzServicemplTest {
    
    @Test
    void isFizz() throws TException{
        var impl = new FizzBuzzServiceImp();
        assertTrue(impl.apply(2).isFizz());
    }


    @Test
    void isBuzz()throws TException {
        var impl = new FizzBuzzServiceImp();
        assertTrue(impl.apply(3).isBuzz());
    }
}
