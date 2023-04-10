package baseplate

var arr = [5]int{1, 2, 3, 4, 5}

func getArray() [5]int {
	return arr
}

func getArraylen() int {
	n := len(arr)
	return n
}
