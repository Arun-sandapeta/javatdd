package function;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class StudentService {



        Function <String,String> nameUpperCase = (name) ->{
            return  name.toUpperCase();
        };

        public String uppercase(String name){
          return   name.toUpperCase();
        }

        BiFunction<String,String,String> concateBiFunction = (firstName,lastName)->{
            return firstName.concat(lastName);
        };

        public String nameUpperCaseWithFunctionAsParam(Function<String,String> upper,String name){
            return upper.apply(name);
        }

        Supplier<String> supplier = () -> "neoteric";

        Supplier<String> getSupplier = () -> {
            return "neoteric";
        };

        Supplier<Car> carSupplier = () -> {
            Car car = new Car("Tata","Safari");

            return car;
        };


        Supplier<Employe> employeSupplier = () -> {
            Employe employe = new Employe("123","arun");
            return employe;
        };



        Supplier<List<Car>> car =() ->{
            Car car1 =new Car("Tata" ,"nexon");
            Car car2 = new Car("MAhindra","Xuv 700");

            List<Car> carList = new ArrayList<>();
            carList.add(car1);
            carList.add(car2);

            return carList;
        };

}
