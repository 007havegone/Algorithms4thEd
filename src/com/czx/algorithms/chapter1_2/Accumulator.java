package com.czx.algorithms.chapter1_2;

public class Accumulator {
	private double total;
	private int N;
	private double m;
	private double s;

	public void addDateValue(double x) {
		N++;
		total += x;
		s = s + 1.0 * (N - 1) * (x - m) * (x - m);
		m = m + (x - m) / N;
	}

	public double mean() {
		return total / N;
	}
	public double var() {
		return s/(N-1);
	}
	public double stddev() {
		return Math.sqrt(this.var());
	}
	public String toString() {
		return "Mean (" + N + " values): " + String.format("%7.5f", mean());
	}
}
