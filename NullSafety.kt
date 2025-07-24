package com.example.test

fun nullSafety() {
    
    var neverNull: String = "This can't be null"

    
    var nullable: String? = "You can keep a null here"
    nullable = null

    if (neverNull == null) {
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }