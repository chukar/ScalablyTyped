package typings.sjcl.sjclMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sjcl", "prng")
@js.native
class prng protected () extends SjclRandom {
  def this(defaultParanoia: Double) = this()
}

@JSImport("sjcl", "prng")
@js.native
object prng extends TopLevel[SjclRandomStatic]

