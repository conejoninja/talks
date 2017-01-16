package mygolibrary

func HelloWithError(name string) (string, error) {
	return "Hello " + name + "! (from go)", nil
}
