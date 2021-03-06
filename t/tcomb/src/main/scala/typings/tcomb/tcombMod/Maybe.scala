package typings.tcomb.tcombMod

import typings.tcomb.Anon_IdentityKindNameType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// maybe combinator
//
@js.native
trait Maybe[T] extends Type[Unit | T] {
  @JSName("meta")
  var meta_Maybe: Anon_IdentityKindNameType[T] = js.native
  @JSName("update")
  var update_Original: Update[Unit | T] = js.native
  def update(instance: T, spec: UpdatePatch): Unit | T = js.native
  def update(instance: Unit, spec: UpdatePatch): Unit | T = js.native
}

@JSImport("tcomb", "maybe")
@js.native
object maybe extends js.Object {
  def apply[T](`type`: Constructor[T]): Maybe[T] = js.native
  def apply[T](`type`: Constructor[T], name: java.lang.String): Maybe[T] = js.native
}

