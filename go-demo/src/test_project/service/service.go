package service

import "fmt"

func GetNameById(id int8) string {
	var name string
	if id == 1 {
		name = "张三"
	} else if id == 2 {
		name = "李四"
	} else {
		name = "王五"
	}
	fmt.Println(name)
	return name
}

func ForRange(str string) {
	for i, val := range str {
		fmt.Printf("%d,%c\n", i, val)
	}

}
