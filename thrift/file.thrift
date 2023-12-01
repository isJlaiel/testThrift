namespace java fizz.shared

struct FizzDto {
  1: bool fizz,
  2: bool buzz,
}

service  FizzBuzzService {
    FizzDto apply(1:i32 n1);
}
