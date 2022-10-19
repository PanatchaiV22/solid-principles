package com.example.solidprinciples.calculator

class Calculator {
    fun <T> calculate(operation: Operation<T>): T = operation()

    abstract class Operation<T> {
        abstract operator fun invoke(): T
    }
}

class Addition(private val a: Int, private val b: Int) : Calculator.Operation<Int>() {
    override fun invoke() = a + b
}
