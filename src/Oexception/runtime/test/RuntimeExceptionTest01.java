package Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    //Runtime é uma exceção do tipo unchecked, que na maioria das vezes é problema no desenvolvimento do programa
    public static void main(String[] args) {
        // Checked e Unchecked:
        // Checked -> filhas da classe exception diretamente, se as exceções não forem tratadas, vão lançar erro em tempo de compilação, nem da pra compilar
        // Unchecked -> exceções quando lançadas pelo programa, e na maioria das vezes é problema no codigo

        int[] nums = {1, 2};
        System.out.println(nums[2]);

    }
}
