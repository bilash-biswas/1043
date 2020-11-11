package main

import (
	"fmt"
)

func main() {
	var a, b, c, z float64
	fmt.Scan(&a)
	fmt.Scan(&b)
	fmt.Scan(&c)
	if a < b + c && b < a + c && c < a + b {
		fmt.Printf("Perimetro = %.1f\n", a + b + c)
	} else {
		z = 0.5 * (a + b) * c
		fmt.Printf("Area = %.1f\n", z)
	}
}
