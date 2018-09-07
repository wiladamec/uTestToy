package com.wiladamec.utesttoy

import utest._


object TestStringMethods extends TestSuite {

  val tests = Tests {
    'reverseString - {
      val str = "ketchup"
      val reversed = StringMethods.reverseString(str)

      assert(reversed == "puhctek")
    }

    'lowercaseString - {
      'allUppercase - {
        val str = "MUSTARD"
        val lowercased = StringMethods.lowercaseString(str)

        assert(lowercased == "mustard")
      }
      'allLowercase - {
        val str = "mayonnaise"
        val lowercased = StringMethods.lowercaseString(str)

        assert(lowercased == str)
      }
      'mixedCase - {
        val str = "sRiRaChA"
        val lowercased = StringMethods.lowercaseString(str)

        assert(lowercased == "sriracha")
      }
    }

    'potatofyString - {
      val str = "BBQSauce"
      val potatofied = StringMethods.potatofyString(str)

      assert(potatofied == s"potato-BBQSauce-potato")
    }
  }
}