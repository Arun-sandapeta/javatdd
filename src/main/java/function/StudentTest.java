package function;

import java.util.List;

public class StudentTest {

    public static void main(String[] args){
        StudentService studentService = new StudentService();
       String uppercase = studentService.nameUpperCase.apply("neoteric");
        System.out.println("Function "+uppercase);

        String uppercaseFromMethod = studentService.uppercase("neoteric");
        System.out.println("method "+uppercaseFromMethod);

       String concat = studentService.concateBiFunction.apply("neoteric","method");
        System.out.println("BiFunction "+ concat);

      String functionAsParam =  studentService.nameUpperCaseWithFunctionAsParam(studentService.nameUpperCase,"neoteric");

        System.out.println("function passed as a parameter to method " + functionAsParam);


        String supplierOutputFromSingleCode = studentService.supplier.get();
        System.out.println("from supplier "+supplierOutputFromSingleCode);


        String supplierOutput = studentService.getSupplier.get();
        System.out.println("output From supplier "+supplierOutput);


        Car carResult = studentService.carSupplier.get();
        System.out.println(carResult);

       Employe employe = studentService.employeSupplier.get();
        System.out.println(employe);

        List<Car> car =studentService.car.get();
        System.out.println(car);
        System.out.println(car.get(1).getModel());

        Car carResults = studentService.carSupplier.get();
        System.out.println(carResults.getModel());
    }
}
