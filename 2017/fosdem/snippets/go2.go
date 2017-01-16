package mygolibrary

var jc JavaCallback

type JavaCallback interface {
	OneMethod()
	AnotherMethod(string)
}

func RegisterJavaCallback(c JavaCallback) {
	jc = c
}
