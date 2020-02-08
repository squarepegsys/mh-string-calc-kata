import spock.lang.*

class StringCalcSpec extends Specification {

   def "add empty string"() {

      when:
      StringCalc calc = new StringCalc()

      then:
      calc.add("")  == 0
      calc.add("1") == 0
   }

}
