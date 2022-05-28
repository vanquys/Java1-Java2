package Prime;

import java.util.concurrent.ArrayBlockingQueue;

public class Prime extends Thread {
	static ArrayBlockingQueue<Integer> primeList;
	int start, end;
	public int count = 0;

	public Prime(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for (int i = start; i < end; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime && i != 0 && i != 1) {
				count++;
				primeList.add(i);
			}
		}
	}

	public static void main(String[] args) {
		int num = 3000;
		int[] primes = new int[num];

		int nThreads = 2;

		final Prime[] pThead = new Prime[nThreads];

		Prime.primeList = new ArrayBlockingQueue<Integer>(primes.length);
		int step = primes.length / nThreads + 1;

		for (int i = 0; i < nThreads; i++) {
			pThead[i] = new Prime(i * step, Math.min(primes.length, (i + 1) * step - 1));
			pThead[i].start();
		}

		for (int i = 0; i < nThreads; i++) {
			try {
				pThead[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("-----------------------------");
		System.out.println("so luong cac so nguyen to tu 1 - 3000");
		for (int i = 0; i < nThreads; i++) {
			System.out.println("Threads" + i + "start: " + pThead[i].start + " end: " + pThead[i].end + " prime count: "
					+ pThead[i].count);
		}
		System.out.println("Total prime count: " + Prime.primeList.size());
		System.out.println(Prime.primeList);
	}
}
