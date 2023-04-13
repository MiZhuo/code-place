package main

import "fmt"

//func init() {
//	//a := func(n int, n2 int) int {
//	//	return 1111111
//	//}(1, 2)
//	//
//	//fmt.Println(a)
//	//b := func(n int, n2 int) int {
//	//	return 22222
//	//}
//	//
//	//fmt.Println(b(3, 3))
//	now := time.Now()
//	fmt.Println(now)
//}

func biBao() func(int) int {

	sum := 0
	return func(num int) int {
		sum = sum + num
		return sum
	}
}

func main() {
	//f := biBao()
	//defer fmt.Println(f(1))
	//defer fmt.Println(f(2))
	//fmt.Println(f(3))
	//fmt.Println(f(4))
	//f := getFunc(1)
	//s := f("a")
	//fmt.Println(s)
	//
	//service.GetNameById(1)
	//service.ForRange("Hello Go ")
	i := zero(2, 0)
	fmt.Println(i)
}

func zero(a int, b int) int {
	defer func() {
		err := recover()
		if err != nil {
			fmt.Println(err)
		}
	}()
	return a / b
}
func addNum(a int, b int) (int, string) {
	return a + b, "sss"
}

func getTotal(num int) int {
	total := 0
	for i := 0; i <= num; i++ {
		total += i
	}
	return total
}

func chooseNum(str string) string {

	switch str {
	case "a":
		str = "A"
		fallthrough
	case "b":
		str = "B"
	default:
		str = "NULL"
	}
	return str
}

func getFunc(i any) func(str string) string {
	f := chooseNum
	return f
}

//func main() {
//	//fmt.Println("Hello golang")
//	//var age int = 20
//	//fmt.Println(age)
//	//
//	//var age2 float32 = 202.2
//	//fmt.Println(age2)
//	//
//	//sex := "男"
//	//address := "浙江省"
//	//
//	//fmt.Println(sex)
//	//fmt.Println(address)
//	//
//	//fmt.Println("--------------")
//	//
//	//m1, m2 := "ds", 111.11
//	//fmt.Println(m1)
//	//fmt.Println(m2)
//	//
//	//fmt.Printf("%T", sex)
//	//
//	//fmt.Println(&address)
//	//ptr := &address
//	//fmt.Println(*ptr)
//	//sum, s := addNum(1, 3)
//	//fmt.Println(sum, s)
//	//total := getTotal(100)
//	//fmt.Println(total)
//	//ss := chooseNum("a")
//	//fmt.Println(ss)
//	f := chooseNum
//	fmt.Printf("%T", f)
//}
