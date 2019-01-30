package com.signalmean;

public class SignalMean {
	
	static double MEAN = 0.0;
	
	public static void main (String[]args) {
		SignalData inputSignalCalc = new SignalData();
		MEAN = calcSignalMean(inputSignalCalc.inputSignal, inputSignalCalc.inputSignal.length);
		System.out.println("Mean: " + MEAN);
	}
	
	public static double calcSignalMean(double [] sigArcArr, int sigLength){
		for (int i = 0; i<sigLength;i++) {
			MEAN = MEAN + sigArcArr[i];
		}
		MEAN = MEAN / (double)sigLength;
		return MEAN;
	}
}