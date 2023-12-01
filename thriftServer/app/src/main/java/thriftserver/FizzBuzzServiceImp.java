package thriftserver;
import org.apache.thrift.TException;

import fizz.shared.FizzBuzzService;
import fizz.shared.FizzDto;
public class FizzBuzzServiceImp implements FizzBuzzService.Iface{


    @Override
    public FizzDto apply(int n1) throws TException {
        boolean isFizz = (n1 % 2 == 0) ;
        boolean isBuzz = (n1 % 3 == 0) ;
        return new FizzDto(isFizz, isBuzz);
    }
    
}
