package com.java8.lambdas;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
		Supplier<String> supplierStr = () -> {
			return "supplier string";
		};

		Supplier<Number> supplierNum = () -> {
			return 40;
		};

		System.out.println(supplierStr.get());
		System.out.println(supplierNum.get());
	}
}