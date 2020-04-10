package com.java21days;

public class PrimeThreads {
    public static void main(String[] args) {
        PrimeThreads pt = new PrimeThreads(args);
    }

    public PrimeThreads(String[] args) {
        PrimeFinder[] finders = new PrimeFinder[args.length];
        for (int i = 0; i < args.length; i ++) {
            try {
                long count = Long.parseLong(args[i]);
                finders[i] = new PrimeFinder(count);
                System.out.println("Looking for prime " + count);
            } catch (NumberFormatException nfe) {
                System.out.println("Error: " + nfe.getMessage());
            }
        }
        boolean complete = false;
        while (!complete) {
            complete = true;
            for (int j = 0; j < finders.length; j++) {
                if (finders[j].finished) continue;
                if (!finders[j].finished) {
                    complete = false;
                } else {
                    displayResult(finders[j]);
                    finders[j] = null;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    private void displayResult(PrimeFinder finder) {
        System.out.println("Prime " + finder.target
                + " is " + finder.prime);
    }
}
