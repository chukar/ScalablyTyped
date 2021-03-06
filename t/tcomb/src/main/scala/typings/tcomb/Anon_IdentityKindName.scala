package typings.tcomb

import typings.tcomb.tcombMod.Constructor
import typings.tcomb.tcombMod.TypeGuardPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IdentityKindName[T] extends js.Object {
  var identity: Boolean = js.native
  var kind: String = js.native
  var name: String = js.native
  @JSName("predicate")
  var predicate_Original: TypeGuardPredicate[T] = js.native
  var `type`: Constructor[T] = js.native
  def predicate(x: js.Any): /* is T */ Boolean = js.native
}

