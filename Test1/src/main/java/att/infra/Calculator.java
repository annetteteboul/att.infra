package att.infra;

/**
 * Created by aamsalem on 6/3/2018.
 */
public class Calculator {

    public int x;

    Calculator(){
      x = 10;
    }

    public static void main(String[] args){
        Calculator calc = new Calculator();

        int j = calc.x + 10;
    }
}

