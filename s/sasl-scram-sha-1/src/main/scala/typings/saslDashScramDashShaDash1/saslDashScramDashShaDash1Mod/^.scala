package typings.saslDashScramDashShaDash1.saslDashScramDashShaDash1Mod

import org.scalablytyped.runtime.StringDictionary
import typings.saslDashScramDashShaDash1.TypeofClassScramSha1Mechanism
import typings.saslDashScramDashShaDash1.saslDashScramDashShaDash1Booleans.`true`
import typings.saslDashScramDashShaDash1.saslDashScramDashShaDash1Strings.`SCRAM-SHA-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sasl-scram-sha-1", JSImport.Namespace)
@js.native
class ^ () extends ScramSha1Mechanism {
  def this(options: Options) = this()
  /* CompleteClass */
  override var clientFirst: `true` = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_ScramSha1Mechanism: `SCRAM-SHA-1` = js.native
  /* CompleteClass */
  override def challenge(chal: String): Unit = js.native
  /* CompleteClass */
  override def response(cred: StringDictionary[js.Any]): String = js.native
  /* CompleteClass */
  override def response(cred: Credentials): String = js.native
}

@JSImport("sasl-scram-sha-1", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Mechanism: TypeofClassScramSha1Mechanism = js.native
}

