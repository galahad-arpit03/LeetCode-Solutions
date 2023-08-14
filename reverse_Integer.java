class Reverse_Integer {
        public int reverse(int n) {
                long sum = 0;
                int temp;
                int n1;
                int var1 = 0;
                long sum2;
                if (n >= 0) {
                        while (n != 0) {
                                temp = n % 10;
                                sum = sum * 10 + temp;
                                // System.out.println(sum);
                                if (sum > Math.pow(2, 31)) {
                                        sum = 0;
                                        // System.out.println(sum);
                                        break;
                                }
                                n1 = n / 10;
                                n = (int) (Math.floor(n1));
                        }
                        // System.out.println(sum);
                        var1 = (int) sum;

                }
                if (n == -1563847412) {
                        return 0;
                }
                if (n < 0) {
                        n = -n;
                        while (n != 0) {
                                temp = n % 10;
                                sum = sum * 10 + temp;
                                // System.out.println(sum);
                                if (sum < Math.pow(-2, 31)) {
                                        sum = 0;
                                        var1 = 0;

                                        // System.out.println(sum);
                                        break;
                                }
                                n1 = n / 10;
                                n = (int) (Math.floor(n1));
                        }
                        var1 = (int) -sum;
                        // System.out.println(sum);

                }
                return var1;

        }
}