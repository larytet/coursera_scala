#!/usr/bin/env scala


object MyApp {
	def loop: Boolean = loop
	def and(x : Boolean, y: => Boolean) = if (x) y else false
  	def do_and() {
    	println(and(false, true))
    	println(and(true, false))
    	println(and(true, true))
    	println(and(false, loop))
    	println(and(true, loop))
  	}	
}

MyApp.do_and()

