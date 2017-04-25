import org.scalatest.WordSpec

/**
  * Created by tevyn on 12/10/16.
  */
class RomanNumbersTest extends WordSpec {

  "RomanNumbers Tens" should {
    "find the corresponding number for each string" in {
      assert(RomanNumbers.mapRomanToTens("I") === 1)
      assert(RomanNumbers.mapRomanToTens("II") === 2)
      assert(RomanNumbers.mapRomanToTens("III") === 3)
      assert(RomanNumbers.mapRomanToTens("IV") === 4)
      assert(RomanNumbers.mapRomanToTens("V") === 5)
      assert(RomanNumbers.mapRomanToTens("VI") === 6)
      assert(RomanNumbers.mapRomanToTens("VII") === 7)
      assert(RomanNumbers.mapRomanToTens("VIII") === 8)
      assert(RomanNumbers.mapRomanToTens("IX") === 9)
      assert(RomanNumbers.mapRomanToTens("X") === 10)
    }
  }




}
