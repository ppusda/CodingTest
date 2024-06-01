// Algorithm: 소수 찾기 (제곱근 판별, 에라토스테네스의 체)
package Algorithm;

public class PrimeNumber {
    private static boolean[] primeArray;

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(101));

        initPrimeArray(101);
        for (int i = 0; i < primeArray.length; i++) {
            if (primeArray[i]) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrimeNumber(int n) { // 제곱근을 사용해서 소수판별, 해당 수의 제곱근 까지만 확인하여도 소수인지 판별가능
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void initPrimeArray(int n) { // 에라토스테네스의 체를 사용하여 범위 내 모든 소수 찾기
        primeArray = new boolean[n+1];
        for (int i = 2; i < primeArray.length; i++) {
            primeArray[i] = true; // 기본 값 true로 설정, 0과 1은 소수가 아니므로 2부터 시작
        }

        for (int i = 2; i < Math.sqrt(n); i++) { // 가장 작은 수 부터 확인하면서, 해당 수를 약수로 가지고 있는 모든 배수를 지움
            if (primeArray[i]) {
                for(int j = i*i; j<= n; j += i){
                    primeArray[j] = false;
                }
            }
        }
    }
}
