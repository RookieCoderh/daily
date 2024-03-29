package com.fuhao.java.prc;


public class Prc {
    public static void main(String[] args) {
        Prc prc = new Prc();
        System.out.println(prc.new21Game(21, 17, 10));
    }
    public double new21Game(int n, int k, int maxPts) {
        if (0 == k) {
            return 1.0;
        }
        double[] dp = new double[k + maxPts];
        for (int i = k; i <= n && i < k + maxPts ; i++) {
            dp[i] = 1.0;
        }
        dp[k - 1] = 1.0 * Math.min(n - k + 1, maxPts) / maxPts;
        for (int i = k - 2; i >= 0 ; i--) {
            dp[i] = dp[i + 1] - (dp[i + maxPts + 1]- dp[i + 1]) / maxPts;
        }
        return dp[0];
    }
}


