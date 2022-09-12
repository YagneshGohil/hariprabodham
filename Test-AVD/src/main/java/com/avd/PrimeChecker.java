
package com.avd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Prime {
	public void checkPrime(int... n) {
		for (int j = 0; j < n.length; j++) {
			boolean isPrime = true;
			for (int i = 2; i < n[j]; i++) {
				if (n[j] % i == 0) {
					isPrime= false;
				}
			}
			if (isPrime && n[j] != 1) {
				System.out.print(n[j] + " ");
			}

		}
		System.out.println();
	}
}

public class PrimeChecker {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

/*
 2
 1
 3
 4
 5
 */