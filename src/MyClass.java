//Реализуйте функцию проверки числа на простоту.
// Постарайтесь найти оптимальное решение с асимптотикой O((n)^{1/2})O((n)1/2)


public class MyClass {
    public static void main(String[] args) {
        //System.out.println(isPrime(8)); --> Example
    }
    static boolean isPrime(long n){
        long j = 2;
        int result = 0;
        while (j <= Math.sqrt(n))
        {
            if (n % j == 0)
            {
                result = 1;
            }
            j++;
        }
        if (result == 1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
