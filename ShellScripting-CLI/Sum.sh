#! /bin/bash

func() {
    
    num1= $1
    num2= $2

    let "sum= num1 + num2"
    echo "The sum is: $sum"

}

func 10 20
