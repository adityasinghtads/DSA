package main

import "fmt"

func main() {
	rotateArray()
}

func rotateArray() {
	var arr = [5]int{1, 2, 3, 4, 5}
	fmt.Println(arr)
	// rotate of Array by one index
	n := len(arr)
	fmt.Println(n)
	temp := arr[n-1]
	for i := n - 1; i > 0; i-- {
		arr[i] = arr[i-1]
	}
	arr[0] = temp
	fmt.Println(arr)
}
