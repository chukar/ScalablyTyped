package typings.tcomb

import typings.tcomb.tcombMod.StructProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdentityKindNameProps extends js.Object {
  var identity: Boolean
  var kind: String
  var name: String
  var props: StructProps
  var strict: Boolean
}

object Anon_IdentityKindNameProps {
  @scala.inline
  def apply(identity: Boolean, kind: String, name: String, props: StructProps, strict: Boolean): Anon_IdentityKindNameProps = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IdentityKindNameProps]
  }
}

