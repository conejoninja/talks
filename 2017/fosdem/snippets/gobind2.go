package mygolibrary

type Counter struct {
	Value int64
}

func (c *Counter) Inc() {
	c.Value++
}

func NewCounter() *Counter {
	return &Counter{}
}