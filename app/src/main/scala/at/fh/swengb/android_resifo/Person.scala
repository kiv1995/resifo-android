package at.fh.swengb.android_resifo

/**
  * Created by lad on 19/01/2017.
  */
object Person {

  def mkRandom: Person = Person(Gen.Aword, Gen.Aword)

}

case class Person(firstName: String, secondName: String)
