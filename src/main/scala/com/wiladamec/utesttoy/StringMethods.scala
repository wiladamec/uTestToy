package com.wiladamec.utesttoy


object StringMethods {

  def reverseString(str: String): String = {
    str.reverse
  }

  def lowercaseString(str: String): String = {
    str.toLowerCase
  }

  def potatofyString(str:String): String = {
    s"potato-$str-potato"
  }
}